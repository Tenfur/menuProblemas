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
            case 5: menu_5(); break;
            case 6: menu_6(); break;
            case 7: menu_7(); break;
            case 8: menu_8(); break;
            case 9: menu_9(); break;
            case 10: menu_10(); break;
            case 11: menu_11(); break;
            case 12: menu_12(); break;
            case 13: menu_13(); break;
            case 13: menu_14(); break;
            
            
        }
        
    }
    public static void menu(){
        System.out.println("1) Calcular si un numero es para o impar");
        System.out.println("2) Calcular que numero es mayor o menor");
        System.out.println("3) Calculadora");
        System.out.println("4) Comprobar si una letra es mayúscula o no");
        System.out.println("5) Adivinar un numero random");
        System.out.println("6) Imprimir un texto n veces");
        System.out.println("7) Calcular si un numero es primo o no");
        System.out.println("8) Calcular N numeros primos");
        System.out.println("9) Pedir una tabla de multiplicar");
        System.out.println("10) Calcular N tablas de multiplicar");
        System.out.println("11) Cajero");
        System.out.println("12) Figuras");
        System.out.println("13) Registro de notas");
        System.out.println("14) Comprobar si un arreglo es creciente, decreciente o desordenado");
        
        
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
    public static void menu_5(){
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random() * 100), numero, cont = 0;
        do{
            System.out.print("Ingrese un numero: ");
            numero =sc.nextInt();
            if(numero > random){
                System.out.println("El numero es menor");
            }
            else
                System.out.println("El numero es mayor");
            
            cont++;
        }while(numero != random);
        System.out.println("Ganaste en " + cont + " intentos");
    }
   public static void menu_6(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese la cantidad de veces que se va a imprimir el texto: ");
       int num = sc.nextInt();
       System.out.println("Ingrese el texto: ");
       String text = "Hola mundo";
       for(int i = 1; i <= num; i++){
           System.out.println(text);
       }
   }
   public static void menu_7(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese un numero y te diremos si es primo o no: ");
       int num = sc.nextInt();
       int cont = 0;
       for(int i = 1; i <= num; i++){
           if(num % i == 0){
               cont++;
           }
       }
       if(cont == 2){
           System.out.println("El numero es primo"); 
       }
       else{
           System.out.println("El numero no es primo");
           System.out.println("Tiene " + cont + " divisores");
       }
   }
   public static void menu_8(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Te diremos la cantidad de numeros primos que hay hasta un numero: ");
       int num =sc.nextInt();
       int cont = 0;
        System.out.println("Numeros primos: ");
       for(int i = 1; i <= num ; i++){
           for(int j = i; j >= 1; j--){
              if(i % j == 0){
                  cont++;
              }
           }
           if(cont == 2)
               System.out.println(i);
           
           cont = 0;
       }   
   }
   public static void menu_9(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Pide un numero y te daremos su tabla de multiplicar: ");
       int num = sc.nextInt();
       for(int i = 0; i <= 12; i++){
           System.out.println(num + " x " + i + " = " + (i * num));
       }
   }
   public static void menu_10(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el numero de tablas que quiere: ");
       int num = sc.nextInt();
       for(int i = 0; i <= num; i++){
           System.out.println("Tabla numero " + i + ": ");
           for(int j = 1; j <=12; j++){
               System.out.println(i + " x " + j + " = " + (j * i));
           }
       }
   }
   public static void menu_11(){
       Scanner sc = new Scanner(System.in);
       int opcion, opcion_soles, opcion_dolares;
       double dinero, cuenta_soles = 0, cuenta_dolares = 0;
       do{
       System.out.println("Bievenido al cajero!");
       System.out.println("1) Cuenta en soles");
       System.out.println("2) Cuenta en dolares");
       System.out.println("3) Salir");
       System.out.print("Ingrese la opcion: ");
       opcion =sc.nextInt();
       switch(opcion){
           case 1: do{
                   System.out.println("Cuenta en soles");
                   System.out.println("1) Ingresar dinero");
                   System.out.println("2) Retirar dinero");
                   System.out.println("3) Ver saldo");
                   System.out.println("4) Salir");
                   System.out.print("Ingrese la opcion: ");
                   opcion_soles = sc.nextInt();
                   if(opcion_soles == 1){
                       System.out.println("Ingrese su dinero: ");
                       dinero = sc.nextDouble();
                       cuenta_soles +=dinero;
                   }
                   else if(opcion_soles == 2){
                       System.out.println("Ingrese la cantidad que quiere retirar");
                       dinero = sc.nextDouble();
                       if(dinero > cuenta_soles){
                           System.out.println("No tiene ese dinero");
                       }
                       else
                           cuenta_soles -=dinero;
                     }
                   else if(opcion_soles == 3){
                       System.out.println("Tiene: " + cuenta_soles + " soles");
                   }
                   }while(opcion_soles != 4);
                   break;
                   
           case 2: do{
                   System.out.println("Cuenta en dolares");
                   System.out.println("1) Ingresar dinero");
                   System.out.println("2) Retirar dinero");
                   System.out.println("3) Ver saldo");
                   System.out.println("4) Salir");
                   System.out.print("Ingrese la opcion: ");
                   opcion_dolares = sc.nextInt();
                   if(opcion_dolares == 1){
                       System.out.print("Ingrese su dinero: ");
                       dinero = sc.nextDouble();
                       cuenta_dolares +=dinero;
                   }
                   else if(opcion_dolares == 2){
                       System.out.print("Ingrese la cantidad que quiere retirar: ");
                       dinero = sc.nextDouble();
                       if(dinero > cuenta_dolares){
                           System.out.println("No tiene esa cantidad");
                       }
                       else
                           cuenta_dolares -=dinero;
                   }
                   else if(opcion_dolares == 3)
                       System.out.println("Tiene: " + cuenta_dolares + " dolares");
                   
                  }while(opcion_dolares != 4);
       }
       
       }while(opcion != 3);
       System.out.println("Gracias por usar el cajero!");
       System.out.println("Su saldo final en soles es: " + cuenta_soles);
       System.out.println("Su saldo final en dolares es: " + cuenta_dolares);
   }
   public static void menu_12(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Menu de figuras");
       System.out.println("1) Cuadrado");
       System.out.print("Ingrese opcion: ");
       int opcion = sc.nextInt();
       switch(opcion){
           case 1: for(int i = 0; i <= 5; i++){
                    for(int j = 0; j <= 5; j++){
                        if(i == 0 || j == 0 || i == 5 || j == i){
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                  }
       }
   }
   public static void menu_13(){
       Scanner sc = new Scanner(System.in);
       int opcion, alumnos, aprobados = 0, desaprobados = 0, posicion;
       double suma = 0, promedio, mayor_nota = 0, menor_nota = 0;
       boolean encontrado = false;
          System.out.print("Ingrese cantidad de alumnos: ");
          alumnos = sc.nextInt();
          double notas[] = new double[alumnos];
       do{
       System.out.println("Registro de alumnos");
       System.out.println("1) Ingresar notas");
       System.out.println("2) Ver notas");
       System.out.println("3) Ver aprobados");
       System.out.println("4) Ver desaprobados");
       System.out.println("5) Ver la mayor nota");
       System.out.println("6) Ver la menor nota");
       System.out.println("7) Ver el promedio de notas");
       System.out.println("8) Buscar una nota");
       System.out.println("9) Reemplezar nota en otra posicion");
       System.out.println("10) Salir");
       System.out.print("Ingrese opcion: ");
       opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    for(int i = 0; i < alumnos; i++){
                        System.out.print("Alumno " + (i + 1) + ": ");
                        notas[i] = sc.nextDouble();
                    }
                    break;
                case 2: 
                    System.out.println("Las notas de los alumnos son: ");
                    for(int i = 0; i < alumnos; i++){
                        System.out.println("Nota " + (i +1) + ": " + notas[i]);
                    }
                    break;
                case 3: 
                    System.out.println("Notas aprobadas: ");
                    for(int i = 0; i < alumnos; i++){
                    if(notas[i] >= 12.5){
                        System.out.println("Nota " + (i +1) + ": " + notas[i]);
                        aprobados++;
                    }
                    else
                        desaprobados++;
                    }
                    break;
                case 4: 
                    System.out.println("Notas desaprobadas: ");
                    for(int i = 0; i < alumnos; i++){
                        if(notas[i] < 12.5){
                            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
                            desaprobados++;
                        }
                        else
                            aprobados++;
                    }
                    break;
                case 5: 
                    System.out.println("La mayor nota");
                    for(int i = 0; i < alumnos; i++){
                        if(notas[i] > mayor_nota){
                            mayor_nota = notas[i];
                        }
                    }
                    System.out.println("La nota más alta de los alumnos registrados es: " + mayor_nota);
                    break;
                case 6: 
                    System.out.println("La menor nota");
                    menor_nota = notas[0];
                    for(int i = 1; i < alumnos; i++){
                        if(notas[i] < menor_nota){
                            menor_nota = notas[i];
                        }
                    }
                    System.out.println("La nota más baja de los alumnos registrados es: " + menor_nota);
                    break;
                case 7: 
                    System.out.println("Promedio de las notas: ");
                    for(int i = 0; i < alumnos; i++){
                        suma += notas[i];
                    }
                    promedio = (suma / alumnos);
                    System.out.println("El promedio de las notas es: " + promedio);
                    break;
                case 8:
                    System.out.print("Buscar una nota con una posicion: ");
                    posicion = sc.nextInt();
                    for(int i = 0; i < alumnos; i++){
                        if(i == posicion){
                            System.out.println("La nota en la posicion " + (i + 1) + " es: " + notas[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if(encontrado == false)
                        System.out.println("No hay ninguna nota en esa posicion");
                    break;
                case 9:
                    System.out.println("Reemplezar nota");
                    System.out.print("Ingrese nuevo valor: ");
                    int valor = sc.nextInt();
                    System.out.print("Ingrese nueva posicion: ");
                    int nueva_posicion = sc.nextInt();
                    for(int i = 0; i < alumnos; i++){
                        if(nueva_posicion == i){
                            notas[i] = valor;
                            break;
                        }
                    }
            }
      }while(opcion != 10);
   }
   public static void menu_14(){
       Scanner sc = new Scanner(System.in);
       int tamaño;
       boolean creciente = false, decreciente = false;
       System.out.println("Comprobaremos si un arreglo es creciente, decreciente o desordenado");
       System.out.print("Ingrese el tamaño del arreglo: ");
       tamaño = sc.nextInt();
       double arreglo[] = new double[tamaño];
       for(int i = 0; i < tamaño; i++){
           System.out.print("Numero " + i + ": ");
           arreglo[i] = sc.nextDouble();
       }
       for(int i = 0; i < tamaño; i++){
           
       }
       
       
       
   }
}
