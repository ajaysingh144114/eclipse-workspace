package com5;
import java.util.*;
public class BinarySearch {
	static Scanner sc = new Scanner(System.in);
int arr[];
int n ;
BinarySearch(int nn){

	 n = nn;
	 
	 arr = new int[n];
}

void fillArray() {
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]= sc.nextInt();
	
	
}
}
void sort() {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
			}
		}
		System.out.print(arr[i] + " ");
	}
}

int binSearch(int l,int u,int v)
{
    int m=(l+u)/2;
    if(arr[m]==v)
    {
        return 1;
    }
    else if(l> u)
    {
        return -1;
    }
    else if(v>arr[m])
    {
        return binSearch(m+1,u,v);

    }
    else
    {
        return binSearch(l,m-1,v);
    }
}
	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("size of array");
		int k = sc.nextInt();
        BinarySearch ob1=new BinarySearch(k);
        
        ob1.fillArray();
        System.out.println("Enter value to be searched");
        int v=sc1.nextInt();
        int p=ob1.binSearch(0,ob1.arr.length-1,v);

        if(p==-1)
        {
            System.out.println(v+" not found in the array");
        }
        else
        {
            System.out.println(v+" is found in the array");
        }
    }
}
