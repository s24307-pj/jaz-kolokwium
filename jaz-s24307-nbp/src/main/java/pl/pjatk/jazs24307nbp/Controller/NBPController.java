package pl.pjatk.jazs24307nbp.Controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.jazs24307nbp.Assets.NBP;
import pl.pjatk.jazs24307nbp.Service.NBPService;

import java.util.List;

@OpenAPIDefinition()
@RestController
@RequestMapping("/nbp")
public class NBPController {
    private final NBPService nbpService;

    public NBPController(NBPService nbpService) {
        this.nbpService = nbpService;
    }

    @Operation(summary = "Get currency rates for provided days", tags = {"CurrencyRates"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the currency rate",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = NBP.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Currency not found",
                    content = @Content) })
    @GetMapping("/currency")
    public ResponseEntity<NBP> getAllMovies(@PathVariable String currency, @RequestParam(defaultValue = "1") String daysStart, String daysEnd) {
        return nbpService.getCurrencyRates("A", currency, daysStart, daysEnd);
    }

}
