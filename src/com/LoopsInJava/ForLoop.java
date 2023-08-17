package com.LoopsInJava;

class ForLoop {
  public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
	}
  }
}
 class ForLoops {
	 public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			System.out.println(i);
		}
	}
 }
 class BreakKeyword {
	 public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
 }
  class ContinueKeyword {
	  public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
			if(i==7 || i==6) {
				continue;
			}
			System.out.println(i);
		}
	}
  }
  class LabelledBreakKeyword1 {
	  public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			lal: if(i==7) {
				break lal;
			}
			System.out.println(i);
		}
	}
  }
  class LabelledBreakKeyword2 {
	  public static void main(String[] args) {
		  lal: for (int i = 0; i < 10; i++) {
			 if(i==7) {
				break lal;
			}
			System.out.println(i);
		}
	}
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  