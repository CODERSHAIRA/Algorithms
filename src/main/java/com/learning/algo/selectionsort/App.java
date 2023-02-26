package com.learning.algo.selectionsort;

public class App {

	public static void main(String[] args) {

		int[] arr=selectionSort(new int[]{46,2,78,61,5,99,1});
		for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		}

	}
	public static int[] selectionSort(int[] a) {
		
	for(int i=0; i<a.length; i++) {
		int min=i;
		for(int j=i+1; j<a.length; j++) {
			if(a[min]>a[j]) {
				int temp=a[min];
				a[min]=a[j];
				a[j]=temp;
			}
		}
	}
	return a;
	}

}
