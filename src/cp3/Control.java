package cp3;
/**
 * 条件语句
 * 循环结构
 * 
 * 块作用域
 * 	块的概念，作用
 *
 */
public class Control {
	public static void main(String[] args) {
		int n = 11;
		{
			int k = 12;
			System.out.println(n);
			System.out.println(k);
		}
	}
}
