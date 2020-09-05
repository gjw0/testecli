package ch1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Ch1App {

	public static void main(String[] args) {
		
		SpringApplication.run(Ch1App.class, args);
		
		
	}

}
