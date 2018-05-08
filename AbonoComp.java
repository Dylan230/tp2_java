
import java.util.Scanner;

public class AbonoComp {

	public static void main(String ar[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cantidad;
		
		float precio;
		
		System.out.print("Ingrese precio");
		
		precio = teclado.nextFloat();
		
		System.out.print("Ingrese cantidad");
		
		cantidad = teclado.nextInt();
		
		float resultado = precio * cantidad; 
		
		System.out.print(resultado);
		
	}
}
