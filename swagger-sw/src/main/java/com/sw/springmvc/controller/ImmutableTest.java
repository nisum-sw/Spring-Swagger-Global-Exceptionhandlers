package com.sw.springmvc.controller;

//Prove that String is Immutable
//Mutable Objects: When you have a reference to an instance 
//of an object, the contents of that instance can be altered
//Immutable Objects: When you have a reference to an instance 
//of an object, the contents of that instance cannot be altered
public class ImmutableTest {
	 public static void main(String ags[]){
//	  String initial = "ABCDEFG";  
//	  String after = initial.replace('A', 'Z');  
//	  System.out.println("initial = " + initial);  
//	  System.out.println("after= " + after);
		 
		 String myString = new String( "old String" );
			System.out.println("Before :"+ myString );
			myString.replaceAll( "old", "new" );
			System.out.println("After :" +myString );
	 }
	} 
