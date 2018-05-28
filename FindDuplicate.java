package com.raju.algorithms.basic;

import java.util.Arrays;
import java.util.BitSet;

public class FindDuplicate {

	//Scan. 
	//Time=O(n2). Space=C
	public static int duplicate1(int[] in) {
		int length = in.length;
		for(int i=0; i<length; i++)
			for(int j=0; j<length; j++)
				if(in[i]==in[j])return in[i];
		return -1;
	}
	
	//Sort and Scan.
	//Time=O(logn+n). Space=C
	public static int duplicate2(int[] in) {
		int length = in.length;
		Arrays.sort(in);
		for(int i=0; i<length; ++i) {
			if(in[i]==in[i+1])return in[i];
		}
		return -1;
	}
	
	//lookup array and scan
	//Time=O(logn+logn)=2logn. Space=C
	public static int duplicate3(int[] in) {
		int length = in.length;
		BitSet bistset = new BitSet(length);
		for(int i=0; i<length; i++) {
		if(bistset.get(in[i])) return in[i];
		bistset.set(in[i]);
		}
		return -1;
	}
	
	//same input array and one scan 
	//Time=O()
	public static int duplicate4(int[] in) {
		int length = in.length;
		for(int i=0; i<length; i++) {
			int value = Math.abs(in[i]);
			System.out.println("value"+value);
			if(in[value]<0)return value;
			in[value]*=-1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		/*int n = Integer.parseInt(args[0]);
		int in[] = new int[n]; 
		for(int i=0; i<n-1; ++i)in[i]=n-i-1;
		in[n-1]=n-1;*/
		boolean debug = Boolean.parseBoolean(args[1]);
		//if(debug==true)System.out.println("input: "+Arrays.toString(in));
		double before = System.currentTimeMillis()/1000.0;
		int[] in= {1,2,3,4,5,7,8,6,7 };
		System.out.println("duplicate is: "+duplicate4(in));
		double after = System.currentTimeMillis()/1000.0;
		 before = after-before;
		System.out.println("execution time: "+before);
	}
}
