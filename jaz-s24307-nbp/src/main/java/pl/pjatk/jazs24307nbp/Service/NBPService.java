package pl.pjatk.jazs24307nbp.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs24307nbp.Assets.NBP;
import pl.pjatk.jazs24307nbp.Configuration.RestTemplateConfig;

import java.text.SimpleDateFormat;

@Service
public class NBPService {
    private final RestTemplate restTemplate;


    public NBPService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<NBP> getCurrencyRates(String table, String code, String daysStart, String daysEnd) {
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String url = "http://api.nbp.pl/api/exchangerates/rates/" + table + "/" + code + "/" + DateFormat.format(daysStart) + "/" + DateFormat.format(daysEnd);
        try {
            NBP nbp = restTemplate.getForObject(url, NBP.class);
            if (nbp != null) {
                return ResponseEntity.ok(nbp);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        } catch (HttpClientErrorException.NotFound e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();
        }
    }
}
