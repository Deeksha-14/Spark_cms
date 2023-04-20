package College;

public class Department {
private int deptno;
private String deptname;
public Department() {
	
}
public Department(int deptno,String deptname) {
	this.deptno=deptno;
	this.deptname=deptname;
	
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
@Override
public String toString() {
	return "Department [deptno=" + deptno + ", deptname=" + deptname + "]";
}

}


