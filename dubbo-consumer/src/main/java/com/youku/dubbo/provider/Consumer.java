package com.youku.dubbo.provider;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext-dubbo-consumer.xml" });
		context.start();
		
		DemoService demoService = (DemoService) context.getBean("demoService");
		String hello = demoService.sayHello("dubbo");
		System.out.println(hello);
		List<Integer> l = demoService.getUsers();
		for (Integer i : l) {
			System.out.println(i);
		}
	}
}
