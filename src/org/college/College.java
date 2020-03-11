package org.college;

public class College {

	public void collegeName()
	{
		System.out.println("collegeName");
	}
	public void collegeCode()
	{
		System.out.println("collegeCode");
	}
	public void collegeRank()
	{
		System.out.println("collegeRank");
	}
	public static void main(String[] args) {
		College name = new College();
		name.collegeName();
		College code =new College();
		code.collegeCode();
		College rank =new College();
		rank.collegeRank();
		Student s=new Student();
		s.studentName();
		Student st=new Student();
		st.studentDept();
		Student stu=new Student();
		stu.studentId();
		Hostel h = new Hostel();
		h.hostelName();
		Dept d =new Dept();
		d.deptName();
	}
}
