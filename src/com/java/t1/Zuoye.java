package com.java.t1;

import java.util.Scanner;

public class Zuoye {
	public static void main(String[] args) {
		

//7-9��ҵ
	//��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺
	//153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
	//1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
	
/*	for(int i=100;i<=999;i++){
		int a=i/100;
		int b=i%100/10;
		int c=i%10;
		if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==i){
			System.out.println(i+"��ˮ�ɻ���");
		}
	}
	*/
	//	��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60������
		//		����C��ʾ��

/*	Scanner input=new Scanner (System.in);
	while(true)
	{int a=input.nextInt();
	if(a>=90){
		System.out.println("ͬѧ�ɼ�ΪA");
	}else if(a<=89&&a>=60){
		System.out.println("ͬѧ�ɼ�ΪB");
	}else{
			System.out.println("ͬѧ�ɼ�ΪC");
			}
	}*/

		//��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣� 1.��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��������е����к���ȥ �����������������С�
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
		System.out.println(d+"��������ͬ�����ظ����ֵ���λ��");
		*/
		//����9��
	/*	int j=1;
		for(int a=1;a<=9;a++){
		  j=j*a;
		}
		System.out.println("9��="+j);
		
		*/
	
	}	
}
