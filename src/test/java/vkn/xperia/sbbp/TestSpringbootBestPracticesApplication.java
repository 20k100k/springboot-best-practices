package vkn.xperia.sbbp;

import org.springframework.boot.SpringApplication;

public class TestSpringbootBestPracticesApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringbootBestPracticesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
