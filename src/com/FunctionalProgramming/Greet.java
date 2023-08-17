package com.FunctionalProgramming;

import java.time.LocalDateTime;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
 interface Greet {
//	 void sayHello(String name, String mssage);
	 String sayHello(String name, String mssage);
}
@FunctionalInterface
 interface Addition {
	int add(int n1, int n2);
}
@FunctionalInterface
 interface Substraction {
	 int sub(int a1, int a2);
 }
 interface Multiplication {
	 int multiply(int m1, int m2);
 }
   class Demo {
	  public static void main(String[] args) {
//		  Greet greet = new Greet() {
//
//			@Override
//			public void sayHello() {
//				System.out.println("Hello from java");
//			}
//		  };
		  
//		  Greet greet1 = ()->System.out.println("Java is a programming language");
//		  greet1.sayHello();
		  
//		  Greet greet1 = (name, message)->System.out.println(name + "" + message);
//		  greet1.sayHello("Varun ", "improving a functional programming");
		  
//		  Greet greet1 = (name, message)->{return(name+ ""+message);};
//		  System.out.println(greet1.sayHello("Varun ", "improving a functional programming"));
		  
//		  Addition addition = (n1, n2)->(n1+n2);
//		  System.out.println(addition.add(90, 78));
		  
//		  Substraction substract = (a1,a2)-> (a1-a2);
//			  System.out.println(substract.sub(45, 15));
//		  Multiplication multiplay = (m1, m2)-> (m1 * m2);
//		  System.out.println(multiplay.multiply(34, 2));
		  
//		  Supplier<LocalDateTime> suplier = () -> LocalDateTime.now();
//		  System.out.println(suplier.get());
		  
		  Supplier<LocalDateTime> suplier = () -> LocalDateTime.now();
		  System.out.println(suplier.get());
		  
		  Supplier<String> supllier = ()-> "varun";
		  System.out.println(supllier.get());
		  
		  Predicate<Integer> lessThan = i -> i<10;
		  System.out.println(lessThan.test(7));
		  
		  Predicate<Integer> greaterThan = n1 -> n1 > 18;
		  System.out.println(greaterThan.test(20));
		  
	}
 }
   
   
 
 
 
 
 
 
 
 
 
 
 