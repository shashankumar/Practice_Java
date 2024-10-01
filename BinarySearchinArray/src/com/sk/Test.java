package com.sk;

public class Test {
	
	public static int search(int arr[],int low,int high,int key) {
		try {
			int mid=(low+high)/2;
			if(key<=0) {
				return -1;
			}
			if(key==arr[mid]) {
				return mid;
			}
			if(key>arr[mid]) {
				return search(arr,mid+1, high, key);
			}else if(key<arr[mid]){
				return search(arr,low, mid-1, key);
			}else {
				System.out.println("Not Found");
				return -1;
				
			}
		} catch (Exception e) {
			 new RuntimeException("Not Fond");
		}
		return key;
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {0,2,3,4,5};
		int low=0,high=arr.length;
		int key=-1;
		int search = search(arr, low, high, key);
		System.out.println(search);

	}

}
