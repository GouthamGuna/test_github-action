package in.gmsk.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.gmsk.springboot.app.model.Friends;


@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getHelloworld() {
		return "Hello_World...!";
	}
	
	@RequestMapping("/my")
	public Friends getNextPage() {
		return new Friends("Lap_For","_Asus");
	}
	
	@GetMapping("/my/friends")
	public List<Friends> getLocalFriends(){
		
		List<Friends> friend = new ArrayList<>(); 
		friend.add(new Friends("s", "Manikandan"));
		friend.add(new Friends("r", "Dhinesh"));
		friend.add(new Friends("a", "abudal"));
		friend.add(new Friends("m", "fahad"));
		
		return friend;
	}
	
	@GetMapping("/my/friends/{fn}/{ln}")
	public Friends tellMECFriend(@PathVariable("fn") String first_name,
		@PathVariable("ln")	String last_name) {
		return new Friends(first_name, last_name);
	}
	
	@GetMapping("/my/friends/query")
	public Friends tellMPTfriend(@RequestParam(name = "fn") String firstname,
		@RequestParam(name = "ln")	String lastname) {
		return new Friends(firstname, lastname);
	}
	
	@GetMapping("/my/test")
	public Friends test() {
		return new Friends(getHelloworld(), getHelloworld());
	}
	
}
