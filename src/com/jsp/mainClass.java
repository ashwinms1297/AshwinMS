  package com.jsp;
class Father
{
	int age =50;

}

class Son extends Father
{
	int age =30;
	void display()
	{
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}
	
}

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son S =new Son();
		S.display();
		
		
	}		

	

}
