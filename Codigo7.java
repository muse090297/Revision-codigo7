/* Este programa nos permite leer la información que tenemos almacenada en un HashMap
 * Contiene información de nombres de países con su respectiva capital.
 * Mediante la consola se pide el nombre del país; es importante escribirlo con la primera letra en MAYÚSCULA
 * y los acentos correspondientes, ya que si escribimos "Mexico" en vez de "México" nos indicará que no se encuentra.
 * En caso de que el país consultado no se encuentre, debemos registrar su capital; así, la próxima vez que lo
 * consultemos, ya estará registrado en el HashMap.
 */

import java.util.HashMap; //Importamos la libreria de HashMap
import java.util.Scanner; //Importamos la libreria de Scanner

public class Codigo7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Agregamos System.in

		// Redefinimos el HashMap colocandole el nombre capitales y que acepte como entradas Strings
	    //HashMap<Byte, Double> ca = new HashMap<>();
	    HashMap<String, String> capitales = new HashMap<String, String>();

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador"); //Agregamos la capital de El Salvador
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = ""; //Cambiamos Sting por String
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: "); //Cambiamos in por out
	      c = s.nextLine(); //Cambiamos s.nextDouble(); por  s.nextLine(); ya que c corresponde a una variable String
	      
	      if (!c.equals("salir")) { //Agregamos la s al final de la palabra equal
	        if (capitales.get(c) != null) { //Cambiamos ca por capitales y cambiamos el containsValue por un .get y validamos que no este vacio
	          System.out.print("La capital de " + c); //Agregamos el .out
	          System.out.println(" es " + capitales.get(c)); // Cambiamos ca.put por capitales.get
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    }//do
	    while (!c.equals("salir")); //Agregamos el ) que falta
	    
	    s.close(); //Cerramos la funciona Scanner
	  }//main
}// Codigo7
