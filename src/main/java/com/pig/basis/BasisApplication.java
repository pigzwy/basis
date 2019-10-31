package com.pig.basis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
@SpringBootApplication
public class BasisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasisApplication.class, args);
	}

    /**
     * Hello，World
     */
    @GetMapping("/hello")
    public void sayHello() {
        System.out.println("World");
    }
}
