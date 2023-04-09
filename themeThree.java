public class themeThree {
	public static void main(String[] args) {
		suma(3, 5 ,7);
		coche miCoche = new coche();
		miCoche.puertas();
		System.out.println("Puertas: " + miCoche.numPuertas);
	}

	public static int suma (int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
}

class coche {
	int numPuertas;
	public void puertas(){
		++numPuertas;
	}
}
