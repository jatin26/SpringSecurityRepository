package WebController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SecureUrl")
public class HTTPController {

	@GetMapping("/privateUser")
	public ResponseEntity<String> privateUser() {
		return ResponseEntity.ok("Enabled Security for Private-User");
	}
	
	@GetMapping("/publicUser")
	public ResponseEntity<String> publicUser() {
		return ResponseEntity.ok("Disabled Security for Public-User");
	}

}
