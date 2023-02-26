package com.learning.algo.binarysearch.recursion;

public class App {

	public static void main(String[] args) {
		int[] A={23,45,67,567};
		
		System.out.println(binarySearchRecursion(A, 0, A.length-1, 67));
	}
	public static int binarySearchRecursion(int[] A, int p, int r, int x) {
		System.out.println(p+ "..." +r);
		if(p>r) {
			return -1;
		}
		else {
		   int q=(p+r)/2;
		    if(A[q]==x) {
		    	return q;
		    }
		    else if(A[q]>x){
		    	return binarySearchRecursion(A, p, q-1, x);
		    }
		    else {
		    	return binarySearchRecursion(A, q+1, r, x);
		    }
		}
	}

}
