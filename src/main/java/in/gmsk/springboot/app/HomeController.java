package in.gmsk.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.gmsk.springboot.app.model.Friends;


@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getHelloworld() {
		return "Hello_World...!";
	}
	
	@RequestMapping("/next")
	public Friends getNextPage() {
		return new Friends("Asus", "Cat");
	}
	
	@GetMapping("/next/friend")
	public List<Friends> getFriends(){
		
		List<Friends> friend = new ArrayList<>(); 
		friend.add(new Friends("S", "Manikandan"));
		friend.add(new Friends("r", "Dhinesh"));
		friend.add(new Friends("a", "abudal"));
		friend.add(new Friends("m", "fahad"));
		friend.add(new Friends("computer", "ASUS"));
		
		return friend;
	}
	
}
