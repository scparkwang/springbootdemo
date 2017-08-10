package com.scpark.hy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication

@MapperScan("com.scpark.hy.mapper")
public class HyApplication {
	public static void main(String[] args) {
		SpringApplication.run(HyApplication.class, args);
		System.out.println("===================================================start");
	}
}
