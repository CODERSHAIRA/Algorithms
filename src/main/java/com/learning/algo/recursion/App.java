package com.learning.algo.recursion;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reduceByOne(10);
	}
	public static void reduceByOne(int n) {
		if(n>=0) {
			reduceByOne(n-1);
		}
		System.out.println("Completed Call:"+n);
	}
   
	}


