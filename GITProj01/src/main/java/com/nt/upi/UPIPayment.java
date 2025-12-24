package com.nt.upi;

public class UPIPayment {
 public String doUPIPayment(long mobileno,float amount) {
	 return amount+" amount is transferred to mobile number : "+mobileno+" Using Bharatpay";
 }
 public String doUPIPaymentbyaccno(long accno,float amount) {
	 return amount+" amount is transferred to accno number : "+accno+" Using Bharatpay";
 }
}
