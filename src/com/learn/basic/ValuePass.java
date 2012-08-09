package com.learn.basic;

/**
 * 彻底搞清楚在Java里面到底是传值还是传引用
 * 结论：对于基本数据类型，是传值（String除外，因为String对象是不可变的），除此之外的都是传递引用
 * @author feng
 *
 */
public class ValuePass {
public static void main(String[] args) {
	//首先定义两个基本数据类型对象
	int a=9;
	Float  f=10.09f;
	
	float addValue=add(a,a);
	
	//如果传递的是引用，那么在做完加法后，a的值应该是19
	System.out.println("value of a:"+a);
	System.out.println("value of addValue:"+addValue);
	if(a==18){
		System.out.println(true);
	}else{
		System.out.println(false);
	}
	
	
}


public static float add(float a,float b){
	a=a+b;
	return a;
}
}
