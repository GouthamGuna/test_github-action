package in.gmsk.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubCiCdActionsApplication {
	
	@RequestMapping("/")
	public String showWelcome() {
		return "Hello World Docker...! by GMSK";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubCiCdActionsApplication.class, args);
	}

}
