/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.tdd.test.Pizzaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxwe
 */
public class Pedido {
    
    int obterQuantidadePizzas=0;
    
    Cliente clienteAtual;
    double imposto;
    double valorTotal;
    List<Pizza> pizzas = new ArrayList<Pizza>();

    void setCliente(Cliente cliente) {
        clienteAtual = cliente;
    }

    void setImposto(double imp) {
        imposto = imp;
    }
    
    void setValorTotal(double vt) {
        valorTotal = vt;
    }
    
    void adicionaPizza(Pizza pizza) {
        pizzas.add(pizza);
        obterQuantidadePizzas += 1;
    }

    void removePizza(String pizza) {
        List<Pizza> remover = new ArrayList<Pizza>();
        for (Pizza elemento : pizzas) {
            if (elemento.nome == pizza ) {
                remover.add(elemento);
                obterQuantidadePizzas += -1;
            }
        }
        pizzas.removeAll(remover);
    }

    double obterValorTotal() {
        valorTotal = 0;
        double vpizza;       
        for (Pizza elemento : pizzas) {
            vpizza = 0;
            vpizza = elemento.obterValorDaPizza();
            valorTotal += vpizza + (vpizza * (imposto / 100));
        }
        return valorTotal;
    }
    
    double obterImposto() {
        imposto = 0;
        double impostoPercent = 0;
        double vpizza = 0;
        double vt = valorTotal;
        for (Pizza elemento : pizzas) {
            vpizza += elemento.obterValorDaPizza();           
        }
        imposto = vt - vpizza;
        impostoPercent =  (imposto * 100) / vpizza;
        return impostoPercent;
    }
}
