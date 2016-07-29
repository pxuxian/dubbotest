package com.youku.dubbo.provider;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello Dubbo!";
	}

	@Override
	public List<Integer> getUsers() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		return l;
	}

}
