package com.learning.algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] arr= insertionSort(new int[]{34,65,2,8,77,1,99});

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] insertionSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int j=i-1;
			while(j>=0) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i--;
				}
				j--;
			}
		}
		return a;
	}

}
