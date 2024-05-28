/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnobecado;

/**
 *
 * @author PC-02_2
 */
import java.util.*;
public class AlumnoBecado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner cap=new Scanner(System.in);
        double promedio,M1,M2,M3,M4;
        String nom;
        
        System.out.print("Ingrese el nombre del alumno=>");
        nom=cap.next();
        System.out.print(nom+"ingresa la calificacion final de tu primera materia=>");
        M1=cap.nextDouble();
        System.out.print(nom+"ingresa la calificacion final de tu segunda materia=>");
        M2=cap.nextDouble();
        System.out.print(nom+"ingresa la calificacion final de tu tercer materia=>");
        M3=cap.nextDouble();
        System.out.print(nom+"ingresa la calificacion final de tu caurta materia=>");
        M4=cap.nextDouble();
        
        promedio=(M1+M2+M3+M4)/4;
        
        if(promedio<9)
        {
            System.out.print(nom+"estas becado");
        }
        else
        {
            System.out.println(nom+"no has sido becado");
        }
    }
    
}
