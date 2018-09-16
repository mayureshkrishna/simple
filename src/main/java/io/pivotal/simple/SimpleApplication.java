package io.pivotal.simple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleApplication {

	private static final Logger logger = LogManager.getLogger(SimpleApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
	
	@GetMapping("/pcf")
	public String getPcf()
	{
		logger.debug("Great Platform to run your Cloud Native Apps");
		return "Great Platform to run your Cloud Native Apps";
	}
	
	
	@GetMapping("/pks")
	public String getKube()
	{
		logger.info("Container Platform to run Packaged or Legacy Apps");
		return "Container Platform to run Packaged or Legacy Apps";
	}

}