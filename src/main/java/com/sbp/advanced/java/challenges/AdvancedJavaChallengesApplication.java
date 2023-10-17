package com.sbp.advanced.java.challenges;

import com.sbp.advanced.java.challenges.challenges1.StatementsOperatorsExceptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvancedJavaChallengesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedJavaChallengesApplication.class, args);

		StatementsOperatorsExceptions statementsOperatorsExceptions = new StatementsOperatorsExceptions();
		statementsOperatorsExceptions.statementsOperatorsExceptions();
	}


}
