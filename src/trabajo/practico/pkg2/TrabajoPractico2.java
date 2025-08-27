/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg2;

import java.util.Scanner;

/**
 *
 * @author Faby
 */
public class TrabajoPractico2 {
   static double descuentoEspecial=0.10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //llamo a las funciones desde el main

        //anioBisiesto();
        //mayorDeTres();
        //etapasDeLaVida();
        //calculadoraDescuento();
        
        //sumaPares();
        //contadorPosNeg();
        //validacionNota();
        
        //ejercicio 8
//        System.out.println("Ingrese el precio Base del producto");
//        double precioBase= scan.nextDouble();
//        System.out.println("Ingrese el impuesto del producto en porcentaje");
//        double impuesto= scan.nextDouble();
//        System.out.println("Ingrese el descuento del producto en porcentaje");
//        double descuento= scan.nextDouble();
//        
//        calcularPrecioFinal(precioBase, impuesto, descuento);

         //ejercicio 9
//        System.out.println("Ingrese la zona de envio(nacional o internacional)");
//        String zona= scan.nextLine();
//        System.out.println("Ingrese el peso del paquete (en kilos)");
//        double peso= scan.nextDouble();
//        System.out.println("Ingrese el precio del producto");
//        double precio= scan.nextDouble();
//
//        calcularTotalCompra(precio, peso, zona);

         //ejercicio 10
//          System.out.println("Ingrese el stock actual del producto");
//        int stockActual= scan.nextInt();
//        System.out.println("Ingrese la cantidad vendida");
//        int cantidadVendida= scan.nextInt();
//        System.out.println("Ingrese la cantidad recibida");
//        int cantidadRecibida= scan.nextInt();
//        actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

         //ejercicio 11
//          System.out.println("Ingrese el precio del producto");
//          double precio= scan.nextDouble();
//          
//          calcularDescuentoEspecial(precio);
          
          //ejercicio 12
          //mostrarArray();
          
          //ejercicio 13
          double[] precios = {5.6,8.7,6,3.2,4,9};
          System.out.println("Precios originales:");
          imprimirOriginales(precios, 0);
          precios[2] = 7.10;
          System.out.println("\nPrecios modificados:");
          imprimirModificados(precios, 0);
    


        
         
       
         
    }
//Estructuras Condicionales
//1) Escribe un programa en Java que solicite al usuario un año y determine si es 
//bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea 
//divisible por 400. 

    public static void anioBisiesto() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Ingrese un año por favor");
        int anio = scan.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(" El año es bisiesto");

        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    //2)Escribe un programa en Java que pida al usuario tres números enteros y 
    //determine cuál es el mayor. 
    public static void mayorDeTres() {
        int numMayor;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Ingrese tres numeros enteros por favor");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2) {
            numMayor = num1;
        } else if (num3 > num2) {
            numMayor = num3;
        } else {
            numMayor = num2;
        }

        System.out.println(" El numero mayor es: " + numMayor);
    }

    //3)Escribe un programa en Java que solicite al usuario su edad y clasifique su 
//etapa de vida según la siguiente tabla: 
//Menor de 12 años: "Niño" 
//Entre 12 y 17 años: "Adolescente" 
//Entre 18 y 59 años: "Adulto" 
//60 años o más: "Adulto mayor" 
    public static void etapasDeLaVida() {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Ingrese su edad por favor");
        int edad = scan.nextInt();

        if (edad < 12) {
            System.out.println("Usted es un niño");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Usted es un adolescente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Usted es un adulto");
        } else {
            System.out.println("Usted es un adulto mayor");
        }

    }

    //4)Escribe un programa que solicite al usuario el precio de un producto y 
//su categoría (A, B o C). 
//Luego, aplique los siguientes descuentos: 
//Categoría A: 10% de descuento 
//Categoría B: 15% de descuento  
//Categoría C: 20% de descuento 
//El programa debe mostrar el precio original, el descuento aplicado y el 
//precio final 
    public static void calculadoraDescuento() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Ingrese el precio del producto");
        double precioOriginal = scan.nextDouble();
        System.out.println(" Ingrese la categoria");
        String categoria = scan.next();
        double precioFinal;
        double descuento;
        int porcentaje;
        if (categoria.equalsIgnoreCase("A")) {
            porcentaje = 10;
            descuento = precioOriginal * 0.10;
            precioFinal = precioOriginal - descuento;
        } else if (categoria.equalsIgnoreCase("B")) {
            porcentaje = 15;
            descuento = precioOriginal * 0.15;
            precioFinal = precioOriginal - descuento;

        } else if (categoria.equalsIgnoreCase("C")) {
            porcentaje = 20;
            descuento = precioOriginal * 0.20;
            precioFinal = precioOriginal - descuento;
        } else {
            System.out.println("Categoria invalida");
            return;
        }

        System.out.println("El precio original del producto es: $" + precioOriginal
                + "\nSe le aplicó un descuento de: $ " + descuento + ", correspondiente al " + porcentaje + "%"
                + "\nEl precio final del producto es: $" + precioFinal);
    }

//Estructuras de Repetición
//5)Escribe un programa que solicite números al usuario y sume solo los 
//números pares. El ciclo debe continuar hasta que el usuario ingrese el número 
//0, momento en el que se debe mostrar la suma total de los pares ingresados.
    public static void sumaPares() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Ingrese un numero (0 para terminar)");
        int num = scan.nextInt();
        int acumulador = 0;
        while (num != 0) {
            System.out.println(" Ingrese un numero (0 para terminar)");
            num = scan.nextInt();

            if (num % 2 == 0) {
                acumulador = acumulador + num;
            }
        }
        System.out.println("La suma de los numeros pares es: " + acumulador);

    }

    //6)Escribe un programa que pida al usuario ingresar 10 números enteros y 
    //cuente cuántos son positivos, negativos y cuántos son ceros. 
    public static void contadorPosNeg() {
        Scanner scan = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(" Ingrese el numero " + (i + 1) + ": ");
            int num = scan.nextInt();
            if (num > 0) {
                contadorPositivos = contadorPositivos + 1;
            } else if (num == 0) {
                contadorCeros = contadorCeros + 1;
            } else {
                contadorNegativos = contadorNegativos + 1;
            }
        }

        System.out.println("Positivos: " + contadorPositivos + "\nNegativos: " + contadorNegativos + "\nCeros: " + contadorCeros);
    }

    //7)Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el 
   //usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota 
  //hasta que ingrese un valor válido. 
    
    public static void validacionNota(){
        Scanner scan = new Scanner(System.in);
        int nota;
        do{
         System.out.println(" Ingrese una nota entre 0 y 10 ");
         nota = scan.nextInt();
        if (nota<0 || nota>10){
            System.out.println("NOTA INVÁLIDA");
        }else{
            System.out.println("Nota guardada correctamente");
        }
        
        }while(nota<0 || nota>10);
        
    }
    
    //Funciones
    
   //8)Crea un método calcularPrecioFinal(double impuesto, double 
  //descuento) que calcule el precio final de un producto en un e-commerce
    public static double calcularPrecioFinal(double precioBase, double impuesto,double descuento){
        descuento= descuento*0.01;
        impuesto=impuesto*0.01;
       
         double precioFinal = precioBase + (precioBase*impuesto) - (precioBase*descuento);
        System.out.println("El precio final es : $ " + precioFinal);
        return precioFinal;
    }
    
 //9) a)calcularCostoEnvio(double peso, String zona): Calcula el costo de 
//envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete. 
//Nacional: $5 por kg  
//Internacional: $10 por kg 
//b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con 
//el costo de envío. 
//Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar. 
    
    public static double costoDeEnvio(double peso, String zona){
        double costo;
        if (zona.equalsIgnoreCase("nacional")){
            costo= peso*5;
        }else if(zona.equalsIgnoreCase("internacional"))  {
            costo=peso*10;
        } else{
           System.out.println(" La zona es invalida");
          return 0;
        }
         return costo;
        
    }
    
    public static void calcularTotalCompra(double precioProducto, double peso, String zona) {
        double costoEnvio = costoDeEnvio(peso, zona);
        double precioTotal = precioProducto + costoEnvio;
        System.out.println("El precio total del producto más envío es: $" + precioTotal);
    }
    
   //10) Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo stock después de una venta y 
  //recepción de productos
    
    public static void actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    //11) Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un 
    //método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%. 
   //Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado= precio * descuentoEspecial;
        System.out.println(" El precio final del producto es : $ " + ( precio - descuentoAplicado));
    }
    
    //Arrays y Recursividad
    
    //12)Crea un programa que: 
//a. Declare e inicialice un array con los precios de algunos productos. 
//b. Muestre los valores originales de los precios. 
//c. Modifique el precio de un producto específico. 
//d. Muestre los valores modificados.
    public static void mostrarArray(){
    double [] precios= {2.00,6.5,8.9,5};
    System.out.println("Precios originales:");
    for (double valor : precios){
            System.out.println("Precio: $" + valor);
    }
    precios[3]=9.5;
    System.out.println("Precios modificados:");
    for (double valor : precios){
            System.out.println("Precio: $" + valor);
    }
    }

    //13)Crea un programa que: 
//a. Declare e inicialice un array con los precios de algunos productos. 
//b. Use una función recursiva para mostrar los precios originales. 
//c. Modifique el precio de un producto específico. 
//d. Use otra función recursiva para mostrar los valores modificados.

    public static void imprimirOriginales(double[] array, int indice) {
        if (indice >= array.length) {
            return; // caso base
        }
        System.out.println("Precio: $" + array[indice]);
        imprimirOriginales(array, indice + 1); 
}

    
    public static void imprimirModificados(double[] array, int indice) {
        if (indice >= array.length) {
            return; // caso base
        }
        System.out.println("Precio: $" + array[indice]);
        imprimirModificados(array, indice + 1); 
}
}

