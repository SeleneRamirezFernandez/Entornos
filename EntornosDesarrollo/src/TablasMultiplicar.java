
public class TablasMultiplicar {

	public static void main(String[] args) {
		
		System.out.println("Las tablas de multiplicar del 1 al 10");
		
		/*for (int i = 1; i <= 10; i++) {
			System.out.print("\n");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}*/
		
		//CORRECCION PROFESOR
		int m=0;
		for(int k=1; k<=10; k++) {
			for(int l=1;l<=10;l++) {
				m=k*l;
				System.out.println(k+"x"+l+"="+m);
			}
			System.out.println();
		}

	}

}
