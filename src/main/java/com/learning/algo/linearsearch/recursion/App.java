package com.learning.algo.linearsearch.recursion;

public class App {

	public static void main(String[] args) {
		
		System.out.println(linearSearchRecursion( new int[]{34,2,678,14,86,568,5}, 0, 86));
	}
	public static int linearSearchRecursion(int[] A, int i, int x) {
		if(i>A.length-1) {
			return -1;
		}
		else if(A[i]==x) {
			return i;
		}
		else {
			return linearSearchRecursion(A, i+1, x);
		}
	}  
}
//if(i<A.length) {
//
//linearSearchRecursion(A, i+1, 86);
//
//}
