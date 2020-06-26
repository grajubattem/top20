package com.test;

import java.util.Arrays;
import java.util.List;

public class CoffeeChangeProblem {
	
	//driver program
	public static void main(String[] args) {
		
		List transactionArray1 = Arrays.asList(5,5,5,10,20);
		List transactionArray2 = Arrays.asList(5,5,10);
		List transactionArray3 = Arrays.asList(10,10);
		List transactionArray4 = Arrays.asList(5,5,10,10,20);
		
		System.out.println("input1 expect true, but output result==> "+isChangeAvailable(transactionArray1));
		System.out.println("input2 expect true, but output result==> "+isChangeAvailable(transactionArray2));
		System.out.println("input3 expect false, but output result==> "+isChangeAvailable(transactionArray3));
		System.out.println("input4 expect false, but output result==> "+isChangeAvailable(transactionArray4));
	}
	
	private static boolean isChangeAvailable(List<Integer> transactionArray){
		int netAmount = 0;
		int changeRequired = 5;
		for(int i=0; i<transactionArray.size();i++) {
			if(transactionArray.get(i)==changeRequired) {
				netAmount+=changeRequired;
			}else if(transactionArray.get(i)>changeRequired) {
				netAmount-=changeRequired;
			}
		}
		
		if(netAmount>=5 || netAmount==0) {
			return true;
		}
		
		
		return false;
	}
}
