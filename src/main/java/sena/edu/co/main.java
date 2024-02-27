package sena.edu.co;

import java.util.Scanner;

public class main {
    public static void main(String[] args ) 
    {
        
        double dato1;
        double dato3;
        double dato2;
        double dato4;

         Ejercicios ejercicios = new Ejercicios();
        System.out.println("1.1 calcular el area de un triangulo");
            Scanner src = new Scanner(System.in);
        // Menu y Submenus //
        
        
        System.out.println( "1.Operadores");
        System.out.println( "1.1 Calcular el area de un triangulo");
        System.out.println( "1.2 Ingresar dos numeros por teclado y sumarlos");
        System.out.println( "1.3 Ingresar un número y visualizar el número elevado al cuadrado");
        System.out.println( "1.4. Escribir un algoritmo que convierta de euros a dólares");
        System.out.println( "1.5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perimetro");
        System.out.println( "1.6. Escribir un algoritmo que determine el área y el volúmen de un cilindro");
        System.out.println( "1.7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el area  (pi*r)^2 del círculo inscrito.");
        System.out.println( "1.8. Calcular el promedio de tres (3) números ingresados por teclado");
        // Menu y Submenus//

        //Ejercicios//

        //Area de un triangulo//
        System.out.println( "1.1 Calcular el area de un triangulo" );


        System.out.println( "Ingrese la base de un triangulo" );
        dato1 = src.nextDouble();


        System.out.println( "Ingrese la altura de un triangulo" );
        dato2 = src.nextDouble();

        dato3 = ejercicios.areaTriangulo(dato1, dato2);

        System.out.println( "El area del triangulo es "+ dato3 );
        //Area de un triangulo//
        
        //Suma de dos numeros//
        System.out.println( "1.2 Ingresar dos numeros por teclado y sumarlos" );
        Scanner sum = new Scanner(System.in);


        System.out.println( "Ingrese el primer numero" );
         dato1 = sum.nextDouble();


        System.out.println( "Ingrese el segundo numero" );
         dato2 = sum.nextDouble();


         dato3 = ejercicios.sumario(dato1, dato2);
        System.out.println( "El resultado es:" + dato3);
        //Suma de dos numeros//

        //Un numero y su equivalente al cuadrado//
        System.out.println("1.3 Ingresar un número y visualizar el número elevado al cuadrado");
        Scanner cuad = new Scanner(System.in);


        System.out.println("Ingrese un numero");
         dato1 = cuad.nextDouble();


        dato3 = ejercicios.cuadrado(dato1);
        System.out.println( "El numero elevado al cuadrado es:" + dato3);
        //Un numero y su equivalente al cuadrado//

        //Convertidor de divisas//
        System.out.println("1.4. Escribir un algoritmo que convierta de euros a dólares");
        Scanner money = new Scanner(System.in);


        System.out.println("Ingrese un valor en euros");
        dato1 = money.nextDouble();


        dato3 = ejercicios.divisas(dato1);
        System.out.println("El valor en dolares es:" +dato3);
        //Convertidor de divisas//

        //Cuadrado//
        System.out.println( "1.5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perimetro");
        Scanner cua = new Scanner(System.in);


        System.out.println("Ingrese el valor de un lado de un cuadrado");
        dato1 = cua.nextDouble();


        dato3= ejercicios.cuadro(dato1);
        System.out.println("El area del cuadrado es" +dato3);


        dato4= ejercicios.cuadro1(dato1);
        System.out.println("El perimetro del cuadrado es" +dato4);
        //Cuadrado//

         //Cilindro//
         System.out.println("1.6. Escribir un algoritmo que determine el área y el volúmen de un cilindro");         
         Scanner cilindro = new Scanner(System.in);           
         System.out.println("Ingrese el radio del cilindro");         
         dato1 = cilindro.nextDouble();           
         System.out.println("Ingrese la altura del cilindro");         
         dato2 = cilindro.nextDouble();                  
         dato3= ejercicios.cilindro(dato1, dato2);
         dato4= ejercicios.cilindro1(dato1,dato2);
         System.out.println("El area del cilindro es " +dato3);
         System.out.println("El volumen del cilindro es" +dato4);
         
        //Cilindro//

        //Circulo//
        System.out.println("1.7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el area  (pi*r)^2 del círculo inscrito.");
        System.out.println("Ingrese el radio");
        Scanner rc= new Scanner (System.in);
        dato1 = src.nextDouble();
        dato2= ejercicios.circulo(dato1);
        dato3= ejercicios.circulo1(dato1);
        System.out.println("La longitud de circunferencia es de: " + dato2);
        System.out.println("El area de la circunferencia es de: " + dato3);

        //Circulo//

        //promedio//
        System.out.println("1.8. Calcular el promedio de tres (3) números ingresados por teclado");
        Scanner npc= new Scanner (System.in);
        System.out.println("Ingrese el primer número");
        dato1 = npc.nextDouble();
        System.out.println("Ingrese el segundo número");
        dato2 = npc.nextDouble();
        System.out.println("Ingrese el tercer número");
        dato3 = npc.nextDouble();
        dato4 = ejercicios.promedio(dato1, dato2, dato3);
        System.out.println("El promedio de los numeros ingresados es : "+ dato4);
        //promedio//
}
}
