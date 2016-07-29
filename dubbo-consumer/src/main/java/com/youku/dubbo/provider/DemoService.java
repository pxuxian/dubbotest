package com.youku.dubbo.provider;

import java.util.List;

public interface DemoService {

	String sayHello(String name);

	public List<Integer> getUsers();
}
