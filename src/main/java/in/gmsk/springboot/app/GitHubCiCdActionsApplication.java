package in.gmsk.springboot.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class GitHubCiCdActionsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GitHubCiCdActionsApplication.class, args);
	}
	
	@Scheduled(fixedDelay = 5000)
	public void getStatus() {
		System.out.println("Application Running Status : " + new Date());
	}
}
