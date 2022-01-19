package com.lijen.object_oriented;

public class StudenTest {
	public static void main(String[] args) {
		Student[] students = new Student[20];
		
		for(int i = 0;i < students.length;i++) {
			students[i] = new Student();
			//賦值學號
			students[i].number = i + 1;
			//賦值年級[1-6]
			students[i].state = (int)(Math.random()*(6 - 1 + 1) + 1);
			//賦值成績[1-100]
			students[i].score = (int)(Math.random()*(100 - 0 + 1));
		}
		
	}
}

class Student{
	int number; //學號
	int state;	//年級
	int score;	//成績
}
