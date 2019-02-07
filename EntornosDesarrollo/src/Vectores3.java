import java.util.Scanner;

public class Vectores3 {

	public static void main(String[] args) {
		
		int aux, n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introdzca la lumgitud del vector");
		n=sc.nextInt();
		int[] vector=new int[n];
		
		for(int i=0;i<vector.length;i++) {
			System.out.println("Introduzca el valor de la posicion "+i+" del vector: ");
			vector[i]=sc.nextInt();
		}
		for(int i=0;i<vector.length;i++) {
			for(int j=i+1;j<vector.length;j++) {
				if (vector[j]<vector[i]) {
					aux=vector[j];
					vector[j]=vector[i];
					vector[i]=aux;
				}
			}
		}
		for(int k=0;k<vector.length;k++) {
			System.out.println("El valor en la posicion "+k+" es: "+vector[k]);
		}
	}
}


