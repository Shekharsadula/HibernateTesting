package com.ss.mockito;

public class TestClass {
	TestInterface testInterface;
	public TestClass(TestInterface testInterface) {
		this.testInterface=testInterface;
	}
	public int add(int i,int j) {
		return testInterface.add(i, j);
	}
}
