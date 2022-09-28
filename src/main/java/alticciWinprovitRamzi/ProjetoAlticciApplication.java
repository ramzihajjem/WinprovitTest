package alticciWinprovitRamzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProjetoAlticciApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoAlticciApplication.class, args);
	}

}
