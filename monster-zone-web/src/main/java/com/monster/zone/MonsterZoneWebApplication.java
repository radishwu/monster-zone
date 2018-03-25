package com.monster.zone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.monster.zone.dao.mapper")
public class MonsterZoneWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonsterZoneWebApplication.class, args);
	}
}
