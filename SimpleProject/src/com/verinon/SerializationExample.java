package com.verinon;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setEmployeeId("23");
		employee.setEmployeeName("Rajkumar");
		try {
			FileOutputStream fos=new FileOutputStream("D:\\Programming\\test.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(employee);
			oos.flush();
			System.out.println("Employee Data: "+employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
