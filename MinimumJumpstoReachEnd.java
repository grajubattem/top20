package com.algos;

public class MinimumJumpstoReachEnd {

	public static void main(String[] args) {
		int[] input = {1,3,5,8,9,2,6,7,6,8,9};
		
		int minJumps = 1;
		int value1=0;
		int tempMax = 0;
		int previousCursor = 0;
		int jumpsLength=0;
		while(jumpsLength<input.length) {
			for(int i=0; i<input.length; i++) {
				value1 = input[previousCursor]+previousCursor;
				tempMax=0;
				previousCursor++;
				minJumps++;
				//iter 0,1
					//max=3
				//iter 1+3=4==>2,3,4(5,8,9)
					//max=9
				//iter 4+9=13==>5,6,7,8,9,10,11(stop),12,13(2,6,7,6,8,9)
				
				for(int j=previousCursor; j<=value1;j++) {
					if(j<input.length && tempMax<input[j]) {
						tempMax =input[j];
					}
				}
				
				jumpsLength=jumpsLength+tempMax;
				previousCursor=value1;
				if(jumpsLength>input.length) {
					break;
				}
			}	
		}
		System.out.println(minJumps);
	}
}
