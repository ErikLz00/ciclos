import java.util.Scanner;

public class condicional_y_bucle {

    public static void numero(int numero){

        if (numero>0){
            
            System.out.println("El numero es positivo ");
        }
        else if (numero<0){
            
            System.out.println("El numero es negativo ");
        }
        else{
            System.out.println("El numero es cero ");
        }
    }

    public static void conWhile(int numero){
        
        while(numero <3){
            System.out.println(numero);
            numero++;
        }
    }
    public static void conDowhile(int numero){
        
        do{
            System.out.println(numero);
            numero++;
        }while(numero <3);
    }
    public static void conFor(int numero){
  
        for (int i =0; i<3;i++){
            
            System.out.println(i);
        }
    }
    public static void conSwitch(String estacion){
        

        switch(estacion){

            case "verano": 
                    
            case "otoño": 
                    
            case "invierno": 
                    System.out.println("No, estamos en Primavera ");
                    break;
            case "primavera": 
                    System.out.println("Correcto, estamos en Primavera ");
                    break;
            default: 
                    System.out.println("No es una estacion ");
                    break;
        }

        
    }

    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);

        System.out.print("Ingrese un numero : ");
        int numero1=teclado.nextInt();
        numero(numero1);

        System.out.print("Ingrese un numero : ");
        int numero2=teclado.nextInt();
        conWhile(numero2);

        System.out.print("Ingrese la numero : ");
        int numero3=teclado.nextInt();
        conDowhile(numero3);

        System.out.print("Ingrese un numero : ");
        int numero4=teclado.nextInt();
        conFor(numero4);

        System.out.print("Ingrese la estacion : ");
        String estacion=teclado.next();
        conSwitch(estacion);
    }
}
