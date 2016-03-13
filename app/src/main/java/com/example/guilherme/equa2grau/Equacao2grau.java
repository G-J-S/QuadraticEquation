package com.example.guilherme.equa2grau;

public class Equacao2grau {
    // variaveis para o coeficiente
    private double a = 0,
            b = 0,
            c = 0;
    
    public double calcularDelta(){

        return b*b-4*a*c;
    }
    public double calcularX1(){

        return (-b + Math.sqrt(calcularDelta()))/(2*a);
    }
    
    public double calcularX2(){

        return (-b - Math.sqrt(calcularDelta()))/(2*a);
    }

    public double getA() {

        return a;
    }

    public void setA(double a) {

        this.a = a;
    }

    public double getB() {

        return b;
    }

    public void setB(double b) {

        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {

        this.c = c;
    }
}