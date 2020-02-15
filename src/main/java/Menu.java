import java.util.Scanner;
public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Menu de problemas con java ----");
        menu();
        int opcion = sc.nextInt();
        switch(opcion){
            case 1: menu_1(); break;
            case 2: menu_2(); break;
            case 3: menu_3(); break;
            case 4: menu_4(); break;
        }
        
    }
    public static void menu(){
        System.out.println("1) Calcular si un numero es para o impar");
        System.out.println("2) Calcular que numero es mayor o menor");
        System.out.println("3) Calculadora");
        System.out.println("4) Comprobar si una letra es mayúscula o no");
        
        
        System.out.print("Ingrese su opcion: ");
    }
    public static void menu_1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println("El numero es par");
        }
        else if(num1 % 2 != 0){
            System.out.println("El numero es impar");
        }
    }
    public static void menu_2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num1 = sc.nextInt();
        if(num > num1){
            System.out.println("El numero " + num + " es mayor");
        }
        else if (num1 > num)
            System.out.println("El numero " + num1 + " es mayor");
        else
            System.out.println("Los numeros son iguales");
    }
    public static void menu_3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--Calculadora--");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) Divisón");
        int opcion;
        do{
        System.out.print("Ingrese su opcion: ");
        opcion =sc.nextInt();
        }while(opcion <= 0 || opcion  >= 4);
        double num1, num2;
        switch(opcion){
            case 1: System.out.print("Ingrese un numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese otro numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                    
            case 2: System.out.print("Ingrese un numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese otro numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                    
            case 3: System.out.print("Ingrese un numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese otro numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                    
            case 4: System.out.print("Ingrese un numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese otro numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("La division es: " + (num1 / num2));
                    break;
        }
        
    }
    public static void menu_4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la letra: ");
        char letra = sc.nextLine().charAt(0);
        if(Character.isUpperCase(letra)){
            System.out.println("La letra es mayúscula!");
        }
        else
            System.out.println("La letra no es masyúscula!");
    }
   
}
