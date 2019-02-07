import java.util.Scanner;

public class Vectores2 {

	public static void main(String[] args) {

		int[] vector = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un valor al vector");
			vector[i] = sc.nextInt();
		}
		
		for(int j = 0; j<5; j++) {
			System.out.println("En la posición "+j+" del vector el valor es: "+vector[j]);
		}
		
		sc.close();

	}

}
