package Rough;

import java.util.Scanner;

class BubblesortDemo{
	public static void bubblesort(int[] arr,int numberOfElements) {
		int temp=0;
		for(int i=0;i<numberOfElements;i++) {
			for(int j=0;j<(numberOfElements-i-1);j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numberOfElements=sc.nextInt();
		int[] arr=new int[numberOfElements];
		for(int i=0;i<numberOfElements;i++) {
			arr[i]=sc.nextInt();
		}
		bubblesort(arr,numberOfElements);
		for(int i=0; i <numberOfElements; i++){  
            System.out.print(arr[i] + " ");  
		}
	}
}


