package com.nmspirngcloud.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableEurekaServer
public class SpringCloudHighAvailablityApplicatopn {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHighAvailablityApplicatopn.class, args);
	}
}



