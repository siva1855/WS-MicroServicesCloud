package siva.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ms07CloudConfigServerNativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms07CloudConfigServerNativeApplication.class, args);
		System.out.println("Config Server Executed");
	}

}
