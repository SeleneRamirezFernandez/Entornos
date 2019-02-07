import java.util.Scanner;

public class VectoresAlturas {

	public static void main(String[] args) {
		
		double mayor=1, menor=1;
		Scanner sc = new Scanner(System.in);

		double[] vector = new double[10];

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introducir la altura de la persona número " + (i + 1) + " :");
			vector[i] = sc.nextDouble();
		}
		for (int j = 0; j < vector.length; j++) {
				for(int k=j+1;k<vector.length;k++) {
					if (vector[k]<vector[j]) {
						mayor=vector[j];
						menor=vector[k];
					}
					else 
						if(vector[k]>vector[j]) {
							mayor=vector[k];
							menor=vector[j];
						}	
		}
	}
		System.out.println("la altura mayor es: "+mayor);
		System.out.println("la altura menor es: "+menor);	
 }
}
