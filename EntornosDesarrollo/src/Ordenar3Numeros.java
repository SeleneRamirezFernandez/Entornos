import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, num2, num3;

		System.out.println("Introduce tre numeros");
		num = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if (num < num2 && num < num3 && num2 < num3)
			System.out.println(num + " " + num2 + " " + num3);
		else if (num < num2 && num < num3 && num2 > num3)
			System.out.println(num + " " + num3 + " " + num2);
		else if (num > num2 && num2 < num3 && num3 < num)
			System.out.println(num2 + " " + num3 + " " + num);
		else if (num2 < num && num2 < num3 && num < num3)
			System.out.println(num2 + " " + num + " " + num3);
		else if (num3 < num && num3 < num2 && num < num2)
			System.out.println(num3 + " " + num + " " + num2);
		else if (num3 < num && num3 < num2 && num2 < num)
			System.out.println(num3 + " " + num2 + " " + num);

		//CORRECCION PROFESOR
		
		int a, b, c, p1, p2, p3;
		// Scanner
		p1 = 0;
		p2 = 0;
		p3 = 0;

		System.out.println("Introduzca tres valores");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a < b && a < c) {
			p1 = a;
			if (b < c) {
				p2 = b;
				p3 = c;
			} else {
				p2 = c;
				p3 = b;
			}
		}

		if (b < a && b < c) {
			p1 = b;
			if (a < c) {
				p2 = a;
				p3 = c;
			} else {
				p2 = c;
				p3 = a;
			}
		}

		if (c < b && c < a) {
			p1 = c;
			if (a < b) {
				p2 = a;
				p3 = b;
			} else {
				p2 = b;
				p3 = a;
			}
		}
		
		System.out.println("El orden de menor a mayor es: "+p1+" "+p2+" "+p3);
		sc.close();
	}

}
