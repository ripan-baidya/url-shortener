package org.astrobrains.urlshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class UrlShortnerApplication {

	static void main(String[] args) {
		SpringApplication.run(UrlShortnerApplication.class, args);
	}

}
