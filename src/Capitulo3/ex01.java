package Capitulo3;

// Questão 01 - Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre,
// precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e,
// em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.

public class ex01 {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int soma = janeiro + fevereiro + marco;
        double media_mensal = soma / 3;

        System.out.println("Despesas totais: R$ " + soma);
        System.out.println("Média mensal de gastos: R$ " + media_mensal);
    }
}
