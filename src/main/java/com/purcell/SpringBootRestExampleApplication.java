package com.purcell;

import com.purcell.entity.Article;
import com.purcell.respository.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ArticleRepository articleService) {
		return (args) -> {
			// save a couple of customers
			articleService.save(new Article(1L, "Jack", "Bauer"));
			articleService.save(new Article(2L, "Chloe", "O'Brian"));
			articleService.save(new Article(3L, "Kim", "Bauer"));
		};
	}
}
