package com.singleton;

import com.singleton.Student;

public class Main {

	public static void main(String[] args) {
		System.out.println("------ SINGLETON-----------");
		Student st = Student.getInstance();
		st.show();

	}

}
