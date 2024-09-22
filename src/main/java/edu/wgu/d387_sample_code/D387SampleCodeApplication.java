package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.translations.DisplayWelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.util.Locale;
import java.util.Properties;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		Properties properties = new Properties();
		
		// Create threads for each welcome message.
		//English message
		DisplayWelcomeMessage displayWelcomeMessageEnglish = new DisplayWelcomeMessage(Locale.US);
		Thread englishMessage = new Thread(displayWelcomeMessageEnglish);
		englishMessage.start();
		//French message
		DisplayWelcomeMessage displayWelcomeMessageFrench = new DisplayWelcomeMessage((Locale.CANADA_FRENCH));
		Thread frenchMessage = new Thread(displayWelcomeMessageFrench);
		frenchMessage.start();
	}
}
