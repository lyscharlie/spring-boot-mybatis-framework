package com.lyscharlie.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

	@Test
	public void test1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
