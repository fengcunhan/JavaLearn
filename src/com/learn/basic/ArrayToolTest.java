package com.learn.basic;

public class ArrayToolTest {
    public static void main(String[] args)
    {
	   int[] arr={2,3,45,5,265,58,64,53,78,548,25,36,12,2,3,54};
	   
	 System.out.println(  ArrayTool.getMax(arr));
     System.out.println(ArrayTool.getMin(arr));
     
     ArrayTool.selectSort(arr);
     ArrayTool.bubbleSort(arr);
     ArrayTool.printArray(arr);
     
	}
}
