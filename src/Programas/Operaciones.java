/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author aleca
 */
public class Operaciones {
    public static void main(String[] args){
  String empleado;      
//declarando variables
double compra1,compra2,compra3,tc,pc,desc,tpago;
Scanner lectura=new Scanner(System.in);
//entrada de datos
System.out.print("Nombre de empleado:");
empleado=lectura.next();
System.out.print("Ingresar compra 1:");
compra1=lectura.nextDouble();
System.out.print("Ingresar compra 2:");
compra2=lectura.nextDouble();
System.out.print("Ingresar compra 3:");
compra3=lectura.nextDouble();
//proceso de datos
tc=compra1+compra2+compra3;
desc=tc*0.2;
pc=tc/3;
tpago=tc-desc;
//salida de datos
System.out.println("El total de compras es:"+tc);
System.out.println("El descuento de la compra es:"+desc);
System.out.println("El total a pagar es:"+tpago);
System.out.println("El promedio de compra es:"+pc);
}
}
