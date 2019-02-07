import java.util.Scanner;

public class IntercambioNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, num2, aux;
		
		System.out.println("Introduce dos numeros");
		
		num=sc.nextInt();
		num2=sc.nextInt();
		
		aux=num;
		num=num2;
		num2=aux;
		
		System.out.println(num+" "+num2);
		sc.close();
	}

}
