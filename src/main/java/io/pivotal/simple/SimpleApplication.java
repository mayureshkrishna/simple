package io.pivotal.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
	
	@GetMapping("/pcf")
	public String getPcf()
	{
		return "Great Platform to run your Cloud Native Apps";
	}
	
	
	@GetMapping("/kube")
	public String getKube()
	{
		return "Container Platform to run Packaged or Legacy Apps";
	}

}