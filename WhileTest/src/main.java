import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=========== 구구단 프로그램 ========== : ");
		System.out.println("원하시는 구구단을 입력하세요. (입력 범위 : 2 ~ 9)");
		System.out.print("원하는 구구단 : ");
		int x = input.nextInt();
		
		System.out.println("==================================");
		System.out.println("구구단 " + x +"단을 출력합니다.");
		int i=1;
		while(i<10)
		{
			System.out.println(x + " X " + i + " = " + x*i);
			i++;
		}
	}
}
