import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
	int num;
	int x;	
	List<Integer> divisores = new ArrayList<Integer>();  
	
	Scanner numero = new Scanner(System.in);
	  num = numero.nextInt();
	  for(x=1;x<=num;x++) {
		if (num%x==0) {
			divisores.add(x);
		//System.out.println(divisores);
	     	}
		 
	   }
   		System.out.println(divisores);
	}

}
