/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.tdd.test.Pizzaria;

/**
 *
 * @author maxwe
 */
public class Ingrediente {

    private final double quantidade;
    private final double preco;

    public final String nome;
    
    

    public Ingrediente(String ingrediente, int gramas, double valor) {
        nome = ingrediente;
        preco = valor;
        quantidade = gramas;
    }

    double obterValor() {
        return (quantidade * preco);
    }
}
