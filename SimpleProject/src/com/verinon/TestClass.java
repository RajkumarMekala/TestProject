package com.verinon;

public class TestClass {
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println("The value of c:"+c);
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello....");
		try {
			TestClass testClass=(TestClass)Class.forName("TestClass").newInstance();
			testClass.add();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestClass test=new TestClass();
		test.add();
		//TestClass test1=(TestClass) test.clone();

	}

}
