package class_;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, sum;
		System.out.println("수 입력");
		num = input.nextInt();
		
		TestClass06 t = new TestClass06();
		sum = t.sumFunc(num);
		
		System.out.println(sum);
	}

}
