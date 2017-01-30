/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.t01;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mat,cal1, cal2, cal3, cal4, cal5, pro;
        
        String res;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduzca su matrícula");
        mat=kb.nextDouble();
        System.out.println("Introdusca su primera calificacion");
        cal1=kb.nextDouble();
        System.out.println("Introdusca su segunda calificacion");
        cal2=kb.nextDouble();
        System.out.println("Introdusca su tercera calificacion");
        cal3=kb.nextDouble();
        System.out.println("Introdusca su cuarta calificacion");
        cal4=kb.nextDouble();
        System.out.println("Introdusca su quinta calificacion");
        cal5=kb.nextDouble();
        pro= (cal1+cal2+cal3+cal4+cal5)/5;
        if (pro<7){
        res="REPROBADO";
        }else {
        res="APROBADO";   
    }       
        System.out.println("Usuario "+mat);
        System.out.println("Usted cuenta con un promedio de "+pro); 
        System.out.println("Usted ha "+res);
    }
    
}
