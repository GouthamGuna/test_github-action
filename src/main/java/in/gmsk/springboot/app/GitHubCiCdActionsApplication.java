package in.gmsk.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class GitHubCiCdActionsApplication {
	
	@RequestMapping
	public String showWelcome() {
		return "Hello World Docker...! by GMSK";
	}
	
	@RequestMapping("/index")
	public String chgFunction() {
		return showHey();
	}
	
	public String showHey() {
		return "Hello World Docker with 2nd week...! by GMSK :-) ";
	}
	
	@RequestMapping("/{name}")
	public List<String> getFriends(@PathVariable ("name") String name){
		
		List<String> friend=new ArrayList<>();
		
		friend.add("S.ManiKandan");
		friend.add("Abudal");
		friend.add("Dinesh");
		friend.add("Jay Kumar");
		friend.add("manoj");
		
		return friend;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GitHubCiCdActionsApplication.class, args);
	}

}
