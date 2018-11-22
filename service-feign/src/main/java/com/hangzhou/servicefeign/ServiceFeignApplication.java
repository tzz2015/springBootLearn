package com.hangzhou.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class ServiceFeignApplication {
   @Autowired
   SchedualServiceHi schedualServiceHi;
   public static void main(String[] args) {
      SpringApplication.run(ServiceFeignApplication.class, args);
   }
   @GetMapping(value = "/hi")
   public String sayHi(@RequestParam String name) {
      return schedualServiceHi.sayHiFromClientOne( name );
   }
}
