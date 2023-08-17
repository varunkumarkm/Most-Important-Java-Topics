package com.UncheckedExceptions;

  class ArithmeticExcp {
	 public static void main(String[] args) {
		try {
		 int x = 10/0;
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
			System.out.println(600);
		} 
	}
  class NullPointerExcp {
	  int x = 10;
	  public static void main(String[] args) {
		  NullPointerExcp nullpoint = null;
		  try {
		  System.out.println(nullpoint.x);
		  }catch (NullPointerException n) {
			  n.printStackTrace();
		  }
		  System.out.println(100);
	}
  }
    class NumberFromatExcp {
    	public static void main(String[] args) {
			String str = "varuin";
			try {
		int value = Integer.parseInt(str);
			System.out.println(value);
			}catch (NumberFormatException num) {
				num.printStackTrace();
			}
			System.out.println(200);
		}
    }
   class ArrayIndexOutOfBoundExcp {
    	public static void main(String[] args) {
    		try {
    	int [] arr = new int [3];
	    	arr[0] = 10;
	    	arr[1] = 20;
	    	arr[2] = 30;
	    	arr[3] = 40;
	    	   System.out.println(arr[0]);
	    	   System.out.println(arr[1]);
	    	   System.out.println(arr[2]);
	    	   System.out.println(arr[3]);
    		}catch (ArrayIndexOutOfBoundsException array) {
    			array.printStackTrace();
    		}
    		System.out.println(300);
    	}
    }
   class Animal {  
	   String color;  
	   Animal(String color){  
	   this.color = color;  
	   }  
	   void eat(String name) {  
	   System.out.println(name + " is eating .....");  
	   }  
	   void show(String name) {  
	   System.out.println(name + " is of " + color + " Color");  
	   }  
	}  
   class Dog extends Animal{  
	   Dog(String color) {  
	   super(color);  
	   }  
	   void eat(String name) {  
	   System.out.println(name + " is eating ....");  
	   }  
    }       
   class ClassCastExcept {  
	   public static void main(String[] args) {  
	   Dog dog = new Dog("black");  
	   Animal animal = new Animal("White");  
	   animal = dog;  
	   animal.show("My dog");  
	     
	   Animal animal1 = new Animal("White");  
	   Dog d = (Dog)animal1;  
	   }  
	}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    