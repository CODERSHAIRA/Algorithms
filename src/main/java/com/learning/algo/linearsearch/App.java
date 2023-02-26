package com.learning.algo.linearsearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,2435,3};
        System.out.println(linearsearch(a,3));
	}
//	public static int linearsearch(int[] a, int x) {
//		int answer=-1;
//		for(int i=0; i<a.length; i++) {
//			if(a[i]==x) {
//				answer=i;
//			}
//		}
//		return answer;
//	}
	// Another Method
	public static int linearsearch(int[] a, int x) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1;
	}
}
