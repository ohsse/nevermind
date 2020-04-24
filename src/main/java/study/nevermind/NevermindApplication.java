package study.nevermind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NevermindApplication {

	public static void main(String[] args) {
		Sample msg = new Sample();
		msg.setMessage("Welcome to Nevermind");
		String result = msg.getMessage();

		System.out.println(msg.getMessage());

		SpringApplication.run(NevermindApplication.class, args);
	}

}
