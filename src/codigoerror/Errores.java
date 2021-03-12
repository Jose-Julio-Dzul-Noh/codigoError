/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoerror;

/**
 *
 * @author Jose Julio Dzul Noh
 */
public class Errores {
    private double valorReal;
    private double valorAproximado;
      public Errores(double vaRe, double vaApro) {
        valorReal = vaRe;
        valorAproximado = vaApro;
    }

 double ErrorAbsoluto() {
        double ErrorR = Math.abs(valorReal-valorAproximado);
        return ErrorR;
    }
 double ErrorRelativo() {
        double ErrorA = (ErrorAbsoluto()) / valorReal;
        return ErrorA;
    }
    double ErrorRelativoPorcentual() {
        double ErrorRP = (ErrorRelativo()) * 100;
        return ErrorRP;
    }
}
