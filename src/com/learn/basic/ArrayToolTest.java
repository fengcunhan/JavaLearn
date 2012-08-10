package com.learn.basic;

import java.util.Arrays;

public class ArrayToolTest {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 45, 5, 265, 58, 64, 53, 78, 548, 25, 36, 12, 2, 3,
				54 };
		System.out.println(ArrayTool.getMax(arr));
		System.out.println(ArrayTool.getMin(arr));

		ArrayTool.selectSort(arr);
		ArrayTool.bubbleSort(arr);
		ArrayTool.printArray(arr);
		
		//使用API内置的排序方法排序
		int[] sortNums=sort(arr);
		System.out.println(Arrays.toString(sortNums));
	}
	
	/**
	 * 首先要使用内置的数组拷贝方法将传入的数组拷贝一个备份出来，坚决不能直接使用int[] nums=array;
	 * 因为昨天在ValuePass中做过讨论，Java对于非基本类型传递的是引用，如果直接如上赋值，那么对nums的操作将改变
	 * 原先传入的数组，这在编程中是不提倡的（不要改变传入方法的参数，因为别人不知道你会改变）.
	 * @param array
	 * @return
	 */
	public static int[] sort(int[] array){
		int[] nums=Arrays.copyOf(array, array.length);
		Arrays.sort(nums);
		return nums;
	}
}
