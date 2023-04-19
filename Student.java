package practice;

public class Student {

	private static  int rollno;
	private String name;
	private String address;
	private String branch;
	private double marks;
	private static int  count;
	static {
		 
		 count=101;
		
		 
		
	}
	public Student(){
		
	}
	public Student(String name,String address,String branch,double marks) {
		
	
		this.rollno =count++;
		this.name=name;
		this.address=address;
		this.branch=branch;
		this.marks=marks;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public static int getRollno() {
		return rollno;
	}
	
	
	public String toString() {
	return "RollNo="+rollno+" "+"Name="+name+" "+"Address"+address+" "+"Marks="+marks+" "+"Branch="+branch;
}
}