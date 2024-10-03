package com.mycompany.gpruebas2425;

public class Calculadora {
    public static double suma(double a, double b){
        return a+b;
    }
    
    public static double resta(double a, double b){
        return a-b;
    }
    
    public static double multiplicacion(double a, double b){
        return a*b;
    }
    
    public static double division(double a, double b){
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
    
}
