package com.hangzhou.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableHystrix
public class ServiceRibbonApplication {
   @Autowired
   RestTemplate restTemplate;
   public static void main(String[] args) {
      SpringApplication.run(ServiceRibbonApplication.class, args);
   }
   @Bean
   @LoadBalanced
   RestTemplate restTemplate() {
      return new RestTemplate();
   }

   @HystrixCommand(fallbackMethod = "hiError")
   @GetMapping(value = "/hi")
   public String hi(@RequestParam String name) {
      return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
   }

   public String hiError(String name) {
      return "hi,"+name+",sorry,error!";
   }

}
