package com.example.boot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootJpaApplicationTests {

	@Test
	void contextLoads() {
		assertThat(1>3);
		
	}

}
