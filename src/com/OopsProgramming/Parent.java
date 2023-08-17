package com.OopsProgramming;

class Parent {

//	void display() throws IOException{
	void display() {
		System.out.println("Parent class");
	}
}
 class Child extends Parent{
	 
	 @Override
//	 void display() throws FileNotFoundException{
	 void display() {
		 System.out.println("Child class");
	 }
 }
 class Demo {
	 public static void main(String[] args) {
		Parent parent = new Parent();
		parent.display();
		
		Child child = new Child();
		child.display();
		
		Parent p = new Child();
		p.display();
	}
 }
 

 
 
 
 
 
 
 
 
 