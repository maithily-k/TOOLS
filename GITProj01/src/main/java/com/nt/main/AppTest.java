package com.nt.main;

import com.nt.service.ArithmeticOperations;

public class AppTest {
public static void main(String []args){
	ArithmeticOperations ops= new ArithmeticOperations();
	System.out.println("Result : "+ops.sum(2,3));
}
}