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
		logger.info("Great Platform to run your Cloud Native Apps");
		
	/*	String pcf;
		File resource;
		try {
			resource = new ClassPathResource("pcf.txt").getFile();
			
			 pcf = new String(Files.readAllBytes(resource.toPath()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			pcf = "NFS Error";
		}
		
			   
		return pcf;*/
		return "Great Platform to run your Cloud Native Apps";
	}
	
	
	@GetMapping("/pks")
	public String getKube()
	{
		logger.info("Container Platform to run Packaged or Legacy Apps");
		return "Container Platform to run Packaged or Legacy Apps";
	}

}