import java.util.Scanner;

public class Nota {
public static void main(String[]args){
    double nota1,nota2,nota3,asistencia,promedio;
    Scanner lectura=new Scanner(System.in);

    System.out.println("ingrese la primera nota");
    nota1=lectura.nextDouble();
    System.out.println("ingrese la segunda nota");
    nota2=lectura.nextDouble();
    System.out.println("ingrese la tercera nota");
    nota3=lectura.nextDouble();
    System.out.println("ingrese el porcentaje de asistencia");
    asistencia=lectura.nextDouble();

    promedio=(nota1+nota2+nota3)/3;
    
if(promedio>=3.5 & asistencia>=70);
}
}