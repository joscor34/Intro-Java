import java.util.Scanner;
public class input {

public static void main(String[] args) {
	int planetaF;
	float pesoT;
	float graveU = 7.77f;
	float graveN = 11f;
	float graveS = 9.05f;
	float graveV = 8.87f;
	float graveJu = 22.88f;
	float graveMe = 2.78f;
	float graveT = 9.78f;
	float graveMa = 3.72f;
	float masaP;
	float masaPF;
	System.out.println("Porfavor elige el numero del planeta" );
	System.out.println("1)Mercurio		2)Venus		3)marte");
	System.out.println("4)Jupiter		5)Saturno	6)Urano");
	System.out.println("7)Neptuno");
	Scanner planeta = new Scanner(System.in);
    planetaF = planeta.nextInt();
    if(planetaF == 1) {
     Scanner peso = new Scanner(System.in);
    	System.out.println("Por favor ingresa tu peso");
    	pesoT = peso.nextFloat();
      masaP = pesoT / graveT;
      masaPF = masaP * graveMe;
    System.out.println("Tu peso en mercurio es: "+ masaPF);
    }
    else if(planetaF == 2) {
        Scanner peso = new Scanner(System.in);
       	System.out.println("Por favor ingresa tu peso");
       	pesoT = peso.nextFloat();
         masaP = pesoT / graveT;
         masaPF = masaP * graveV;
       System.out.println("Tu peso en venus es: "+ masaPF);
       }
    else if(planetaF == 3) {
        Scanner peso = new Scanner(System.in);
       	System.out.println("Por favor ingresa tu peso");
       	pesoT = peso.nextFloat();
         masaP = pesoT / graveT;
         masaPF = masaP * graveMa;
       System.out.println("Tu peso en marte es: "+ masaPF);
       }
    else if(planetaF == 4) {
        Scanner peso = new Scanner(System.in);
       	System.out.println("Por favor ingresa tu peso");
       	pesoT = peso.nextFloat();
         masaP = pesoT / graveT;
         masaPF = masaP * graveJu;
       System.out.println("Tu peso en jupiter es: "+ masaPF);
       } 
    else if(planetaF == 5) {
        Scanner peso = new Scanner(System.in);
       	System.out.println("Por favor ingresa tu peso");
       	pesoT = peso.nextFloat();
         masaP = pesoT / graveT;
         masaPF = masaP * graveS;
       System.out.println("Tu peso en saturno es: "+ masaPF);
       }
    else if(planetaF == 6) {
        Scanner peso = new Scanner(System.in);
       	System.out.println("Por favor ingresa tu peso");
       	pesoT = peso.nextFloat();
         masaP = pesoT / graveT;
         masaPF = masaP * graveU;
       System.out.println("Tu peso en urano es: "+ masaPF);
       }
    else if(planetaF == 7) {
        Scanner peso = new Scanner(System.in);
       	System.out.println("Por favor ingresa tu peso");
       	pesoT = peso.nextFloat();
         masaP = pesoT / graveT;
         masaPF = masaP * graveN;
       System.out.println("Tu peso en neptuno es: "+ masaPF);
       }
    else if(planetaF > 7) {
    	System.out.println("Numero de planeta incorrecto");
           
         }   
    
    }

}

