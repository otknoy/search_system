package feeder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Feeder {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Feeder.class, args)) {
            Feeder f = ctx.getBean(Feeder.class);
            System.out.println(f);
        }
    }
}
