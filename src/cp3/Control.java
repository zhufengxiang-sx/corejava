package cp3;
/**
 * 条件语句
 * 循环结构
 * 
 * 块作用域
 * 	块的概念:由一对花括号括起来的若干条简单的Java语句。
 * 	作用：确定变量的作用域。
 * 
 *
 *
 */
public class Control {
	
	public static void main(String[] args) {  // 一个块可以嵌套在另一个块中。
		int k = 11;
		{
			int n = 12;
			System.out.println(k);
			System.out.println(n);
			//int k = 12;                    但是不能在嵌套的两个块中声明同名的变量。
		}
		System.out.println(k);
		//System.out.println(n);
	}
}
