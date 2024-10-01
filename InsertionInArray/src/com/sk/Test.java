package com.sk;

public class Test {
	
	public static int insertinmiddle(int arr[],int key,int position,int size) {
		if(size>=arr.length) {
			return arr.length;
		}
		for (int i = size-1; i >=position ; --i) {
			arr[size]=arr[i];
		}
		return arr[position]=key;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		int size=6;
		int key=50;
		int position=3;
		System.out.println(arr.length); 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//Test t=new Test();
		insertinmiddle(arr, key, position, size);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
