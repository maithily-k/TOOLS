package com.nt.nb;

public class NetBankingService {
public String transferMoney(long srcAcno,long destAcno,long amt,String str) {
	return amt+" amount is transferred from "+srcAcno+" to "+destAcno+str;
}
}
