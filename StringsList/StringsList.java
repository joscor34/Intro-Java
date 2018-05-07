import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class StringsList {

	public static void main(String[] args) {
   
	String b;	
    Scanner salida = new Scanner(System.in);	
    System.out.println("Ingresa tus generos de peliculas favoritas: ");
	String p = salida.nextLine();
    p = (p.toLowerCase());
	System.out.println(p);
    p= p.replaceAll("\\s","");
    System.out.println(p);
    p= p.replace(","," ");
    p= p.replace("."," ");  
    System.out.println(p);
    List<String> myList = new ArrayList<String>(Arrays.asList(p.split(" ")));
    //myList= myList.replace(",","");
    System.out.println(myList + " " );
	
	}

}
