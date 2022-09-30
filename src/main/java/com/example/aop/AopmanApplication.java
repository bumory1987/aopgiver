package com.example.aop;

import com.example.aop.aops.TraceAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(TraceAspect.class)
public class AopmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopmanApplication.class, args);
	}

}
