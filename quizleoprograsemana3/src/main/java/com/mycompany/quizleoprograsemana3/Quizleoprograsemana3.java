/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizleoprograsemana3;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Quizleoprograsemana3 {

    public static void main(String[] args) {
     String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su Apellido");
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));

        if (salario >= 3000000) {
            double sem = salario * 0.0925;
            double ivm = salario * 0.0508;
            double impuesto = salario - 0.20 * 0.2;
            double EmpleadoASOCIACION = salario * 0.025;
            double salarioTotal= salario-277500-152400-125400-75000;
            JOptionPane.showMessageDialog(null, "Su nombre es "+ nombre);
            JOptionPane.showMessageDialog(null, "Su apellido es "+ apellido);
            JOptionPane.showMessageDialog(null, "Su salario es de "+ salario);
            JOptionPane.showMessageDialog(null, " SEM"+ sem);
            JOptionPane.showMessageDialog(null, " ivm"+ ivm);
            JOptionPane.showMessageDialog(null, "concepto de impuesto de salario"+ impuesto);
            JOptionPane.showMessageDialog(null, "Su salario total es de "+ salarioTotal);
        } 