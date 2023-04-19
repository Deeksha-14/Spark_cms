package practice;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int n=sc.nextInt();
	
	Student[] arr=new Student[n];
	int i;
	
	for(i=0;i<arr.length;i++) {
		System.out.println("Enter the Student Details");
		System.out.println("Name,Address,Branch,Marks");
	Student s=new Student(sc.next(),sc.next(),sc.next(),sc.nextDouble());
arr[i]=s;
	
	}
	System.out.println("Student Details...");

	for(i=0;i<arr.length;i++) {
		
System.out.println(arr[i].toString());
	}
	
	

	}

}
