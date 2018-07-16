package com.java.t1;

import java.util.Scanner;

public class Zuoye {
	public static void main(String[] args) {
		

//7-9作业
	//题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
	//153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
	//1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
	
/*	for(int i=100;i<=999;i++){
		int a=i/100;
		int b=i%100/10;
		int c=i%10;
		if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==i){
			System.out.println(i+"是水仙花数");
		}
	}
	*/
	//	题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下
		//		的用C表示。

/*	Scanner input=new Scanner (System.in);
	while(true)
	{int a=input.nextInt();
	if(a>=90){
		System.out.println("同学成绩为A");
	}else if(a<=89&&a>=60){
		System.out.println("同学成绩为B");
	}else{
			System.out.println("同学成绩为C");
			}
	}*/

		//题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
	/*int d=0;
		for(int a=1;a<=4;a++){
		for(int b=1;b<=4;b++){
			for(int c=1;c<=4;c++){
				if(a!=b&&a!=c&&b!=c){
					System.out.println(a*100+b*10+c);
					d++;
				}
			}
		}
	}
		System.out.println(d+"个互不相同且无重复数字的三位数");
		*/
		//计算9！
	/*	int j=1;
		for(int a=1;a<=9;a++){
		  j=j*a;
		}
		System.out.println("9！="+j);
		
		*/
	
	}	
}
