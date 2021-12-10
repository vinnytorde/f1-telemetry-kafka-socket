package com.tortilla.f1.telemetry;

import com.tortilla.f1.telemetry.model.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.simp.SimpMessagingTemplate;

@SpringBootApplication
@RequiredArgsConstructor
public class TelemetryProducerApplication {

	private final SimpMessagingTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(TelemetryProducerApplication.class, args);
	}

	@Bean
	public CommandLineRunner emit(){
		return args -> {
			int i = 0;
			while(true){
				String message = "message number " + i++;
				System.out.println(message);
				template.convertAndSend("/topic/greetings", new Greeting(message));
				Thread.sleep(2000);
			}
		};
	}


}
