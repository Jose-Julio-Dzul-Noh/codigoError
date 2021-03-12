/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoerror;

import java.util.Scanner;

/**
 *
 * @author jose julio Dzul Noh 4-A sistemas computacionales.
 */
public class CodigoError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valorR, valorA;
        Scanner xd = new Scanner(System.in);
        System.out.print("Ingrese e:l valor real ");
        valorR = xd.nextDouble();
        System.out.print("Ingrese el valor aproximado ");
        valorA = xd.nextDouble();
        Errores E = new Errores(valorR, valorA);
        System.out.println("---------------------------------------------------------------");
        System.out.println("El error absoluto es " + E.ErrorAbsoluto());
        System.out.println("El error relativo es " + E.ErrorRelativo());
        System.out.println("El error relativo porcentual es " + E.ErrorRelativoPorcentual() + "%");
        System.out.println("---------------------------------------------------------------");
    }
        // TODO code application logic here
    }
    

