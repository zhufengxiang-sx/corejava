package cp3;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		for(int i=10; i>0; i--)
			System.out.println("Counting down..."+i);
		System.out.println("Blastoff!");
		
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		switch (i) {  //表达式值的类型为整数（char byte int short long ）、枚举类型。
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			break;
		}
	}
}
