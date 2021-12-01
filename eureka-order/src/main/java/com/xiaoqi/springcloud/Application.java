package com.xiaoqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {
	@RequestMapping("/hello")
	public String home(){
		return "hello world!";
	}
	public static void main(String [] args){
		SpringApplication.run(Application.class, args);
	}
}
