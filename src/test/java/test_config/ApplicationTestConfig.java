package test_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Amine Jendoubi on 26/09/2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"tuto"})
public class ApplicationTestConfig {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationTestConfig.class)
                .properties("application.properties")
                .build()
                .run(args);
    }
}
