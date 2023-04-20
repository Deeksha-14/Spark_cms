package College;

import java.util.Scanner;

public class DepartmentTester {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of Array...");
Department[]  arr=new Department[4];
int i;

for(i=0;i<arr.length;i++) {
System.out.println("Enter the Department Details=deptno,name");
Department d=new Department(sc.nextInt(),sc.next());
arr[i]=d;


}
for(i=0;i<arr.length;i++) {
	System.out.println("Show the Department Details..");
	System.out.println(arr[i].toString());
}

	}

}
