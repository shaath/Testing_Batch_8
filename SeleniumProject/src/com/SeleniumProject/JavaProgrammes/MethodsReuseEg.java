package com.SeleniumProject.JavaProgrammes;

public class MethodsReuseEg extends MethodsEg {

	public static void main(String[] args) {
		
		MethodsEg me = new MethodsEg();
		
//		me.function1();
		
//		String res = me.function2();
//		System.out.println(res);
		
		int res_sum = me.sum(600 , 400);
		System.out.println(res_sum);
		
		res_sum = me.sum(20, 30, 50);
		System.out.println(res_sum);		

	}

}
