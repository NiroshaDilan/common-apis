package lk.icoder.commonapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CommonApisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApisApplication.class, args);
    }

}
