package com.nt.main;

import com.nt.service.ArithmeticOperations;
import com.nt.upi.UPIPayment;

public class AppTest {
public static void main(String []args){
	ArithmeticOperations ops= new ArithmeticOperations();
	System.out.println("Result : "+ops.sum(2,3));
	System.out.println("Result : "+ops.sub(2,3));
	
	System.out.println("======================");
	UPIPayment upip= new UPIPayment();
	System.out.println(upip.doUPIPayment(909090909, 5000));
	System.out.println(upip.doUPIPaymentbyaccno(909097779L, 5000F));
	}
}