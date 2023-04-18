package com.practice;

public class SimpleQuestion {
//     int a=10;
//	public static void main(String[] args) {
//		SimpleQuestion s=new SimpleQuestion();
//		int b = s.a;
//		System.out.println(b);
//}
	String name;
	String empid;
	int salary;
	public SimpleQuestion(String name,String empid,int salary)
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}
//	public SimpleQuestion(String empid,int salary)
//	{
//	
//		this.empid=empid;
//		this.salary=salary;
//	}
	public void kiran()
	{
		System.out.println(name+    "   ");
		System.out.println(empid+    "   ");
		System.out.println(salary+     "   ");
	}
	public static void main(String[] args) {
		SimpleQuestion s=new SimpleQuestion("kirann","askjn12",12344);
		//SimpleQuestion s1=new SimpleQuestion("askjn12",12344);
		s.kiran();
		//s1.kiran();
	}
	

}
