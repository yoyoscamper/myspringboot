package com.ydy.scamper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ydy.scamper.mapper")
public class ScamperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScamperApplication.class, args);
	}

}
