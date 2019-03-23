package dineout.ultron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class UltronApplication {

	public static void main(String[] args) {
		SpringApplication.run(UltronApplication.class, args);
	}

}
