package com.xin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MybatisSpringBootLogbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringBootLogbackApplication.class, args);
	}
}
