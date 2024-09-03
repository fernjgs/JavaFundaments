
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {



//    int n = 40;
//
//    String name = Fernando;
//
//    float p = 3.4f;
//
//    int a;
//    a = 7;
//    int b = a; // Sólo hay que modificar esta línea
//    System.out.println(b); // debería mostrar 7
//
//
//    String tituloDeLaPelicula;
//    String  camelCaseBienPuesto;
//    int edadDelMonstruo;
//
//    int i = 7;
//    i = 5;
//    i = 3;
//    System.out.println(i); // ¿Cuánto valdrá i? // Valdra 3


    public static void main(String[] args) throws IOException {

//    int i = 5;
//    double d = 600;
//    char c = 'l';
//
//    System.out.println(i);
//    System.out.println(d);
//    System.out.println(c);

//    int a = 5;
//    int b = 7;
//
//    int k = a;
//    a = b;
//    b = k;
//
//    System.out.println(a); //Debería mostrar 7
//
//        String name = "Jose";
//
//    System.out.println("Buenas tardes " + name);


//        System.out.println("Este es el principio " + " Este es el fin");

//        int euros = 7;
//        int dolares = 7*2;
//                System.out.println(dolares);
//
//        float precio = 100;
//        float precioConIva = precio*1.21f;
//                System.out.println(precioConIva);

//        int ancho = 4;
//        int alto = 7;
//        int areaRect = ancho * alto / 2;
//
//        System.out.println(areaRect);


//        float centigrados= 20f;
//        float fahrenheit= centigrados * 9/5 + 32; // Hay que modificar esta línea
//        System.out.println(fahrenheit); // Debería mostrar 68
//
//        String nombre = "Juan";
//        String material = "madera";
//        String dimensiones = "diminutas";
//        String comentario = "Que sea bonita, pero de una belleza estraña, indómita";
//
//        System.out.println(nombre + " ha pedido una caja de " + material + " con unas dimensiones " + dimensiones+". " + comentario);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Introduzca euros, por favor: ");
//        int euros = Integer.parseInt(br.readLine());
//        int dolares = euros * 2;
//        System.out.println(dolares);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Introduzca un precio a calcular, por favor: ");
//        float precio = Integer.parseInt(br.readLine());
//        float preciocalculado = precio * 1.21f;
//
//        System.out.println(preciocalculado);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Introduce un numero entero por favor: ");
//        int numeroEntero = Integer.parseInt(br.readLine());
//        int numeroDoble = numeroEntero * 2;
//        int numeroTriple = numeroEntero * 3;
//
//        System.out.println("el doble de tu numero es " + numeroDoble);
//        System.out.println("el triple de tu numero es " + numeroTriple);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Introduce el ancho: ");
//        int ancho = Integer.parseInt(br.readLine());
//        System.out.println("Introduce el alto: ");
//        int alto = Integer.parseInt(br.readLine());
//
//        int p = 2 * ancho + 2 * alto;
//        int a = ancho * alto;
//
//        System.out.println("el perimetro del rectangulo es " + p);
//        System.out.println("el area del rectangulo es " + a);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Introduzca grados celsius, por favor: ");
//        int celsius = Integer.parseInt(br.readLine());
//        int farenheit = celsius * 9/5 + 32;
//
//
//        System.out.println("grados celsius en farenheit son: " + farenheit);


//        int notas = 6;
//
//        if(notas > 5){
//            System.out.println("aprobado!");
//        }else if(notas == 5){
//            System.out.println("aprobado por los pelos");
//        }else{
//            System.out.println("suspendido");
//        }

//        int i = 5;
//
//        if(i >= 0){
//            System.out.println("El número es positivo");
//        }else{
//            System.out.println("El número es negativo");
//        }
//        if (i%2 == 0){
//            System.out.println("El número es par");
//        }else{
//            System.out.println("El número es impar");
//        }
//        if (i%5 == 0){
//            System.out.println("El número es multiplo de 5");
//        }else{
//            System.out.println("el número no es multiplo de 5");
//        }
//        if (i%10 == 0){
//            System.out.println("El número es multiplo de 10");
//        }else{
//            System.out.println("el número no es multiplo de 10");
//        }
//        if (i >= 100){
//            System.out.println("El número es mayor que 100");
//        }else{
//            System.out.println("el número es menor que 100");


//        int b = 3;
//
//        String resultado = (b>0)?"b es positivo":"b es negativo";
//        System.out.println(resultado);


//        int i = 4;
//
//        String resultado = (i%2 == 0)?"i es par":"i es impar";
//        System.out.println(resultado);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Introduzca el primer numero : ");
//        float num1 = Integer.parseInt(br.readLine());
//
//        System.out.println("Introduce el segundo numero : ");
//        float num2 = Integer.parseInt(br.readLine());
//
//        System.out.println("Introduce el operador de calculo (+, -, *, /): ");
//        String op = br.readLine();
//
//        float respuesta = 0f;
//
//        switch (op) {
//            case "+":
//                respuesta = num1 + num2;
//                break;
//            case "-":
//                respuesta = num1 - num2;
//                break;
//            case "*":
//                respuesta = num1 * num2;
//                break;
//            case "/":
//                if (num2 != 0) {
//                    respuesta = num1 / num2;
//                } else {
//                    System.out.println("Error: División por cero.");
//                    return;
//                }
//                break;
//            default:
//                System.out.println("Operador no válido.");
//                return;
//        }
//
//        System.out.println("El resultado de la operación es " + respuesta);


//        for(int i = 0; i <= 100; i = i+2) {
//            System.out.println(i); // 0 1 2
//        }

//        for(int i = 0; i <= 100; i++) {
//            if (i%2 == 0){
//                System.out.println(i);
//            }

//        for(int i = 1; i<= 20; i++) {
//            if (i%3 == 0){
//                System.out.println("Fizz");
//            }else if (i%5 == 0){
//                System.out.println("Buzz");
//            }else if (i%3 == 0 || i%5 == 0){
//                System.out.println("FizzBuzz");
//            }else{
//                System.out.println(i);
//            }
//        }

//        for (int p = 1; p <= 20; p++){
//            if(p%3== 0){
//                System.out.println("Fizz");
//            }else if (p%5 == 0){
//                System.out.println("Buzz");
//            }else if(p%3 == 0 && p%5 == 0){
//                System.out.println("FizzBuzz");
//            }else{
//                System.out.println(p);
//            }
//        }

//        int numero = 7;
//        for (int i = 0; i <= 10; i++){
//
//
//            int respuesta = numero * i;
//            System.out.println(numero + " x " + i + " = " + respuesta);
//        }

    for (int i = 1; i<= 10; i++){
        for(int j = 1; j<=10; j++){
            int r = i*j;
            System.out.println(i+ "*" +j+ "=" + r);
        }

    }


        }


    }


