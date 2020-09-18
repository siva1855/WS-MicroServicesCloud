package siva.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ms08CloudConfigServerExternalGitHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms08CloudConfigServerExternalGitHubApplication.class, args);
		System.out.println("Executed Config Server");
	}

}
