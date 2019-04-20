package com.hzt.tuntun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages ={"com.hzt.tuntun.dao"})
public class TuntunApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuntunApplication.class, args);
	}

}
