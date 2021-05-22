/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.tdd.test.Pizzaria;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author maxwe
 */
public class Pizza {

    String nome;
    List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    double valorLucro=0;
    double valorIngredientes=0;
    double valorPizza = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    int obterQuantidadeIngredientes=0;

    Pizza(String sabor) {
        nome = sabor;
    }

    void adicionaIngrediente(Ingrediente ingre) {
        ingredientes.add(ingre);
        obterQuantidadeIngredientes += 1;
    }

    void adicionaLucro(double lucro) {
        valorLucro = lucro;
    }

    void removeIngrediente(String ingre) {
        List<Ingrediente> remover = new ArrayList<Ingrediente>();
        for (Ingrediente elemento : ingredientes) {
            if (elemento.nome == ingre ) {
                remover.add(elemento);
                obterQuantidadeIngredientes += -1;
            }
        }
        ingredientes.removeAll(remover);
    }

    double obterValorDosIngredientes() {
        valorIngredientes=0;
        for (Ingrediente elemento : ingredientes) {
            valorIngredientes += elemento.obterValor();
        }
        return valorIngredientes;
    }

    public double obterValorDaPizza() {
        valorPizza = 0;
        obterValorDosIngredientes();
        double i = valorIngredientes;
        valorPizza = i + (i * (valorLucro / 100));
        return valorPizza;
    }
    
}
