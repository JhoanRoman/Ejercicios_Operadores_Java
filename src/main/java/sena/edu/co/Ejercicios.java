package sena.edu.co;

public class Ejercicios {
   
     public double areaTriangulo(double dato1, double dato2) {
        return (dato1*dato2)/2;
     }

     public double sumario(double dato1, double dato2) {
      return (dato1+dato2);
     }

     public double cuadrado(double dato1) {
      return (dato1*dato1);
     }

     public double divisas(double dato1) {
      return (dato1*1.08);
     }

     public double cuadro(double dato1){
      return (dato1*dato1);
  
     }

     public double cuadro1(double dato1){
      return (dato1+dato1+dato1+dato1);
     }

     public double cilindro(double dato1, double dato2){ 
      return (2 * Math.PI * dato1 *(dato1 + dato2 ));
     }

     public double cilindro1(double dato1, double dato2){
        return (Math.PI*(dato1*dato1)*dato2);
     }

     public double circulo(double dato1){
        return (2*Math.PI*dato1);
     }
     public double circulo1(double dato1){
        return (Math.PI*(dato1*dato1));
     }
     public double promedio(double dato1, double dato2, double dato3){
        return (dato1+dato2+dato3)/3;
     }
}