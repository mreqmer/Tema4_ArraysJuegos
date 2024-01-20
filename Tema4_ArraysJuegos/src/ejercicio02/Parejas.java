package ejercicio02;

public class Parejas {
	
	//se encarga de guardar el movimiento 1 del jugador
	int mov1 = -1;
	//se encarga de guardar el movimiento 2 del jugador
	int mov2 = -1;
	//array que va a contener los números del tablero
	

	// pinta una tablero de un tamaño elegido por el jugador
	void pintaTablero(int tamaño) {
		// array que servirá de tablero para el juego
		int[] tablero = new int[tamaño];

		// encargado de pintar la parte superior del tablero, en el cual aparecen
		// números para que el jugador sepa a dónde se mueve
		for (int i = 1; i <= tamaño; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println("");
		//encargado de pintar las casillas de juego
		for(int j = 0; j<tablero.length; j++) {
			if(mov1 == j+1) {
			//esto está mal no debe mostrar j debe mostrar el número que se encuentra en esa posición
			System.out.print("[" + j + "]");
			}else {
				System.out.print("[ ]");
			}
		}
		
	}
	
	//genera los números de juego
	void genNum(int tamaño) {
		
	}
}
