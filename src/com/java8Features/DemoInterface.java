package com.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface MathOperation {
	
	public void add(int n1, int n2, int n3);
	
	default void multiply(int n1, int n2, int n3) {
		System.out.println(n1*n2*n3);
	}
	static void multiplying(int n1, int n2, int n3) {
		System.out.println("This result is static keyword = "+ n1*n2*n3);
	}
}
//abstract class MathOperationImpl implements MathOperation {
   
// We cannot create a object on this abstract class
// So abstract class is forces for inheritance, we want to use the functionality of abstract class,
// we want to provide the implementation of abstract method.\

   class MathOperationImpl implements MathOperation {
	
	@Override
	public void add(int n1, int n2, int n3) {
		System.out.println("This is addition = "+ (n1+n2+n3));
	}
	@Override
	public void multiply(int n1, int n2, int n3) {
		System.out.println("This result is overriding the default = "+ (n1*n2*n3));
     }
   }
   class MathOperationImpl1 implements MathOperation {

	@Override
	public void add(int n1, int n2, int n3) {
		
	}   
  }
 public class DemoInterface {

	public static void main(String[] args) {
		MathOperationImpl math = new MathOperationImpl();
		math.multiply(2, 2, 2);
		
		math.add(10, 10, 10);
		
		MathOperation.multiplying(3, 3, 3);
	}
 }
 class StreamExample {
//Stream have a two types of operation in stream are: Intermediate and terminal
//Intermediate - It will perform some operation and return to a new stream, it will not terminate our stream
 
//terminal - It will terminate our stream and after that will not be able to perform of our stream, 
//once its terminate it will going access again it will throw exception(forEach, collect, count, reduce etc,.)
 
//	 Intermediate operations in Stream include:
//		* Mapping a Stream to Another Stream
//		* Filtering a Stream
//		* Flatmapping a Stream to Handle 1:p Relations
//		* Using Flatmap and MapMulti to Validate Elements Transformation
//		* Removing Duplicates and Sorting a Stream
	 
	 
	 public static void main(String[] args) {
		 List<Integer> numList = new ArrayList<Integer>(Arrays.asList(92,12,34,67,34,11,30,56,89,9));
//		 Stream<Integer> stream = numList.stream();
//		 stream.filter(n->n%2==0).forEach(System.out::println);
//		 
//		 Stream<Integer> stream2 = numList.stream();
//		 stream2.map(n->n*2).forEach(System.out::println);
		 
		 //Calculate the average of this values
//		 Double collect = numList.stream().collect(Collectors.averagingInt(n->n));
//		 System.out.println(collect);//43.4
		 
		 IntSummaryStatistics sumerize = numList.stream().collect(Collectors.summarizingInt(n->n));
		 System.out.println(sumerize);//IntSummaryStatistics{count=10, sum=434, min=9, average=43.400000, max=92}
	}
 }

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
