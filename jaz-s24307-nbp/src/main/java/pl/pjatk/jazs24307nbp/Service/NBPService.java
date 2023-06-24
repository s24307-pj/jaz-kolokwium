package pl.pjatk.jazs24307nbp.Service;

import org.springframework.stereotype.Service;
import pl.pjatk.jazs24307nbp.Configuration.RestTemplate;

@Service
public class NBPService {
    private RestTemplate restTemplate;
    private static final String url = "http://api.nbp.pl/api/exchangerates/rates";


}
