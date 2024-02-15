package class_;

public class TestClass09 {
	public void test1() {
		for (int i=0 ; i<5 ; i++) {
			System.out.println(i);
			if (i==3)
				//break;
				return ;
//반환되는 값이 void이면 return뒤에 값이 없어도 됨
//break 는 반복문을 빠져나온다
//return은 반복문을 종료 한다
		}
		System.out.println("test1 종료");
	}
	public int test2() {
		int n=10;
		if(n>100)
		return 100;
		else
		return 0;
	}
	public String test3() {
		int num = 100;
		if (num>10)
			return "문자열";
		else	
			return "100";//에러: return 100;
					
	}
	public String test4 () {
		return "aaaa";// "bbbb" , "cccc"
	}
}
