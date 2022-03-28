package com.verinon;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fos=new FileInputStream("D:\\Programming\\test.txt");
			ObjectInputStream oos=new ObjectInputStream(fos);
			Employee employee=(Employee) oos.readObject();
			System.out.println("Employee Data:"+employee);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
