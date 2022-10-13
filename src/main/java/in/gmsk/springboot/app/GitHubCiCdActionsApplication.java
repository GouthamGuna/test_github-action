package in.gmsk.springboot.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
@RestController
public class GitHubCiCdActionsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GitHubCiCdActionsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String sayHelloWorld() {
		return "Hello World ....";
	}
	
	@Scheduled(fixedDelay = 50000)
	public void getStatus() {
		System.out.println("Application Running Status : " + new Date());
	}
}
