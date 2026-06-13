//package com.kumarnitin.module1introduction;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Module1introductionApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(Module1introductionApplication.class, args);
//
//		PaymentService paymentServiceObj = new PaymentService();
//		paymentServiceObj.pay();
//	}
//
//}




//package com.kumarnitin.module1introduction;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Module1introductionApplication implements CommandLineRunner {
//
//	@Autowired
//	PaymentService paymentServiceObj;
//	public static void main(String[] args) {
//		SpringApplication.run(Module1introductionApplication.class, args);
//
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		paymentServiceObj.pay();
//	}
//}








package com.kumarnitin.module1introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1introductionApplication implements CommandLineRunner {

//	@Autowired
	final NotificationService notificationServiceObj; // field dependency injection

//	public Module1introductionApplication(@Qualifier("smsNotif") NotificationService notificationServiceObj){
//		this.notificationServiceObj = notificationServiceObj; // Constructor DI -- Preferred
//	}

	public Module1introductionApplication(NotificationService notificationServiceObj){
		this.notificationServiceObj = notificationServiceObj; // Constructor DI -- Preferred
	}



	@Autowired
	PaymentService paymentServiceObj;
	public static void main(String[] args) {
		SpringApplication.run(Module1introductionApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		NotificationService notificationServiceObj = new EmailNotificationService();
		// notificationServiceObj = new SmsNotificationService();
		notificationServiceObj.send("Hello");
	}
}
