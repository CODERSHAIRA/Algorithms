package com.learning.algo.binarysearch;

public class App {

	public static void main(String[] args) {
		int[] a= {14,56,89,345};
		System.out.println(binarysearch(a,345));
		
	}
	public static int binarysearch(int[] a,int x) {
		int p=0;
		int r=a.length-1;
       
        while(p<=r) {
        int q=(p+r)/2;
		if(a[q]==x) return q;
		else if(a[q]>x) r=q-1;
		else p=q+1;
        }
        return -1;
	}

}
