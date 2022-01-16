package com.mycompany.exerciciointerface;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
class Calculadora implements Operacoes {

    public static void main(String args[]) {
        Calculadora calculadora = new Calculadora();
        calculadora.executa();
    }

    public void executa() {
        double a, b;
        String operacao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a operação (+,-,*,/)");
        operacao = ler.next();
        System.out.println("Digita o primeiro número");
        a = ler.nextDouble();
        System.out.println("Digita o segundo número");
        b = ler.nextDouble();

        switch (operacao) {
            case "+":
                soma(a, b);
                break;
            case "-":
                menos(a, b);
                break;
            case "*":
                multiplica(a, b);
                break;
            case "/":
                divisao(a, b);
                break;
            default:
                System.out.println("Operação não encontrada");
        }
    }

    @Override
    public void soma(double a, double b) {
        System.out.println("a+b = " + (a + b));
    }

    @Override
    public void menos(double a, double b) {
        System.out.println("a-b = " + (a - b));
    }

    @Override
    public void divisao(double a, double b) {
        System.out.println("a/b = " + (a / b));
    }

    @Override
    public void multiplica(double a, double b) {
        System.out.println("a*b = " + (a * b));
    }

}
