package pl.pjatk.jazs24307nbp.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Swagger {
    @Bean
    public OpenAPI openAPI() {
        Contact contact = new Contact();
        contact.setEmail("s24307@gmail.com");
        contact.setName("s24307");
        contact.setUrl("https://www.s24307.com");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Movie Service API")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage movie services.").termsOfService("https://www.s24307.com/terms")
                .license(mitLicense);

        return new OpenAPI().info(info);
    }
}
