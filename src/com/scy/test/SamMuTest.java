
/**
 * Date:2018年4月26日上午8:46:54
 * Copyright (c) 2018, www.bwbroad.com All Rights Reserved.
 *
*/

package com.scy.test;
/**
 * Description: 三目运算符展示 <br/>
 * Date:     2018年4月26日 上午8:46:54 <br/>
 * @author   scy	 
 */
public class SamMuTest {
	
	/**
	 * 
	 * Description:TODO<br/>
	 * Date: 2018年4月26日 上午8:47:28 <br/>
	
	 * @author scy
	 * @param args
	 */
	
	public static void main(String[] args) {
		/**
		 * 三目运算符 boolean?表达式1:表达式2
		 * 规则：
		 *   1.如果表达式1和2类型相同，则正常展示
		 *   2.如果表达式类型 T，T（byte,short,char）时，并且另一个表达式为常量表达式。则
		 *   展示的数据类型为T。
		 *   3.如果以上都不是，则向上类型转化，展示转化后的类型。
		 */
		char c = 'X';
		int j = 1;
		//1.
		System.out.println(true?1:0);
		//2.
		System.out.println(true?1:c);
		//3
		System.out.println(true?j:c);
	}
}

