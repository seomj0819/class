package class_;

import java.util.Scanner;

public class P_MainClass01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1=0 , num2=0;
		System.out.println("두 수를 입력하세요");
		num1 = input.nextInt();
		num2 = input.nextInt();
		P_TestClass01 t = new P_TestClass01();
		t.test(num1, num2);
}
}

