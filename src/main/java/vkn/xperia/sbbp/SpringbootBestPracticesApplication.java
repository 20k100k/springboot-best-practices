package vkn.xperia.sbbp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.info.BuildProperties;
import org.springframework.boot.info.GitProperties;
import vkn.xperia.sbbp.config.GitConfig;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringbootBestPracticesApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootBestPracticesApplication.class);
        app.run(args);
    }

}
