
public class VectoresMN {

	public static void main(String[] args) {
		int aux;
		int[] vector= {3,7,1,9,5,1,4,6,1,2,8,7,9,2};
		
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
