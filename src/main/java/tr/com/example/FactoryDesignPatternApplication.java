package tr.com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("tr.com.example")
public class FactoryDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryDesignPatternApplication.class, args);
	}

}
