package web.SpringRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringRestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringRestApiApplication.class, args);

		Communication communication = context.getBean("communication", Communication.class);
		// System.out.println(communication.getAllUsers());
		System.out.println("Answer: " + communication.getAnswer());
	}

}
