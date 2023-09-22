package ime.basicmicroservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/main")
@RefreshScope
public class MainController {

	
	@GetMapping
	public ResponseEntity<String> fnHello() {
		return ResponseEntity.ok("Hello, it's me");
	}
	
	
}
