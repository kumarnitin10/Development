//package com.kumarnitin.module1introduction;
//
//public class PaymentService {
//
//    public void pay(){
//        System.out.println("Paying...");
//    }
//}


package com.kumarnitin.module1introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay(){
        System.out.println("Paying...");
    }
    @PostConstruct
    public void afterInitaaaa(){
        System.out.println("Before paying.");
    }

    @PreDestroy
    public void beforeDestroyaaaa(){
        System.out.println("After payment is done");
    }
}
