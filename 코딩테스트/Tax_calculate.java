import java.util.Scanner;
public class Tax_calculate {
	public static void main(String[] args){
		
		double num;
		System.out.print("���� �ٷμҵ� �Է�(���� : ��) : ");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();

		if(salary <= 2000)
			num = salary * 5.0 / 100;
		else if(salary <= 4000)
			num = salary * 15.0 / 100;
		else if(salary <= 8000)
			num = salary * 25.0 / 100;
		else
			num = salary * 40.0 / 100;
		System.out.println("�ҵ漼 : " + num + "(�� ��)");
		
	}
}