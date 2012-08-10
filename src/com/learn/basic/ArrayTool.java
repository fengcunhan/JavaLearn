package com.learn.basic;
/**
 * 这是一个对数组操作的工具类
 * 该类提供了获取最值，排序等功能，练习对此类中的方法进行静态化。
 * 然后在其他对象中直接使用。
 * @author JaryLi
 * @version V1.0
 */
public class ArrayTool {
	
	private ArrayTool() {}//将对象私有化，将不能实例化此对象。
	/**
	 * 获取一个整形数组中的最大值
	 * @param arr 接收一个int类型的数组
	 * @param return 会返回一个数组中的最大值
	 * */
	public static int getMax(int[] arr)
	{
		int max=0;
	    for(int x=0;x<arr.length;x++)
	    {
	    	if(arr[x]>arr[max])
	    	{
	    		max=x;
	    	}
	    }
	    return arr[max];
	}
	
	/**
	 * 获取一个整形数组中的最小值
	 * @param arr 接收一个int类型的数组
	 * @param return 会返回一个数组中的最小值
	 * */
	public static int getMin(int[] arr)
	{
		int min=0;
	    for(int x=0;x<arr.length;x++)
	    {
	    	if(arr[x]<arr[min])
	    	{
	    		min=x;
	    	}
	    }
	    return arr[min];
	}
	/**
	 * 接收int数组，然后进行选择排序
	 * @param int数组
	 * */
	public static  void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
	}
	/**
	 * 接收int数组，并进行冒泡排序
	 * @param int数组
	 * */
	public static  void bubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=0;y<arr.length-x-1;y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
	
	/**
	 * 置换方法
	 * @param 接收一个数组
	 * @param a 要置换的位置
	 * @param b 要置换的位置
	 * */
	public static void swap(int[] arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	 * 打印数组中的元素。形式如：[element1,element2,.....]
	 * */
	public static void printArray(int[] arr)
    {
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else
				System.out.println(arr[i]+"]");
		}
		
    }
}
