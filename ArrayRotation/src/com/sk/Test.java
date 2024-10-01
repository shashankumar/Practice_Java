package com.sk;

public class Test {
	
	public void rotate(int[] arr,int d) {
		inverse(arr,0,d-1);
		inverse(arr, d, arr.length-1);
		inverse(arr, 0, arr.length-1);
	}
	
	public  void inverse(int[] arr,int start,int end) {
		int temp;
		//start=0;end=arr.length-1;
		while(start<end) {
	//	for (int i = 0; i < arr.length; i++) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		}
	//}
		void printArray(int arr[])
	    {
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	    }
		
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		
		Test t =new Test();
		t.rotate(arr,2);
		
		t.printArray(arr);
		

	}

}
