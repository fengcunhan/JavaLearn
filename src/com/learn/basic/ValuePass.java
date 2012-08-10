package com.learn.basic;

import com.learn.basic.model.Person;

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
	Float  f=10.09f;//测试一个注释
	
	float addValue=add(a,a);
	
	//如果传递的是引用，那么在做完加法后，a的值应该是18
	System.out.println("value of a:"+a);
	System.out.println("value of addValue:"+addValue);
	if(a==18){
		System.out.println(true);
	}else{
		System.out.println(false);
	}
	//测试传递引用
	Person person=new Person();
	person.setAge(20);
	person.setName("jary li");
	
	Person p=changeAge(person, 40);
	if((p.toString().equals(person.toString()))){
		System.out.println(true);
	}else{
		System.out.println(false);
	}
	
}


public static float add(float a,float b){
	a=a+b;
	return a;
}

public static Person changeAge(Person p,int newAge){
	Person person=p;
	person.setAge(newAge);
	return person;
}
}
