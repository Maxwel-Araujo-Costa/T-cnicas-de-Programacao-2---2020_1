/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.tdd.test.Pizzaria;

import edu.ifsp.tdd.test.Pizzaria.Pizza;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felip
 */
public class PizzaTest {
    
    public PizzaTest() {
    }

    @Test
    public void verificaPizzaSemIngredientes() {
        Pizza pizza=new Pizza("Queijo");
        assertTrue(pizza.obterQuantidadeIngredientes==0);
    }
    
    @Test
    public void verificaPizzaComIngredientes() {
        Pizza pizza=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",350,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 150, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 150, 0.50);
        
        pizza.adicionaIngrediente(massa);
        pizza.adicionaIngrediente(queijo);
        pizza.adicionaIngrediente(tomate);
        
        assertTrue(pizza.obterQuantidadeIngredientes==3);
    }
    
    @Test
    public void verificaPizzaComIngredientesRemovidos() {
        Pizza pizza=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",350,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 150, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 150, 0.50);
        
        pizza.adicionaIngrediente(massa);
        pizza.adicionaIngrediente(queijo); //adicionar
        pizza.adicionaIngrediente(tomate);
        
        pizza.removeIngrediente("Tomate");//remover
        
        assertTrue(pizza.obterQuantidadeIngredientes==2);
    }
    
    @Test
    public void verificaValordosIngredientesDaPizza() {
        Pizza pizza=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 0.50);
        
        pizza.adicionaIngrediente(massa);
        pizza.adicionaIngrediente(queijo);
        pizza.adicionaIngrediente(tomate);
        
        assertEquals(57.5,pizza.obterValorDosIngredientes(),0.00001);
    }
    
    
    @Test
    public void verificaValorDaPizzaLucro25() {
        Pizza pizza=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 0.50);
        
        pizza.adicionaIngrediente(massa);
        pizza.adicionaIngrediente(queijo);
        pizza.adicionaIngrediente(tomate);
        
        //você colocar a porcentagem de lucro sobre os ingredientes
        pizza.adicionaLucro(25);
        
        assertEquals(71.875,pizza.obterValorDaPizza(),0.00001);
    }
    
     @Test
    public void verificaValorDaPizzaLucro100() {
        Pizza pizza=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 0.50);
        
        pizza.adicionaIngrediente(massa);
        pizza.adicionaIngrediente(queijo); //usar collections para resolver
        pizza.adicionaIngrediente(tomate);
        
        //você colocar a porcentagem de lucro sobre os ingredientes
        pizza.adicionaLucro(100);
        
        assertEquals(115,pizza.obterValorDaPizza(),0.00001);
    }
    @Test
    public void verificaValorDaPizzaLucro100B() {
        Pizza pizza=new Pizza("Tomate");
        Ingrediente tomate=new Ingrediente("Tomate", 15, 0.1);
        Ingrediente massa=new Ingrediente("Massa", 15, 0.1);

        pizza.adicionaIngrediente(tomate);
        pizza.adicionaIngrediente(massa);
        
        //você colocar a porcentagem de lucro sobre os ingredientes
        pizza.adicionaLucro(200);
        
        assertEquals(9,pizza.obterValorDaPizza(),0.00001);
    }
    

    
}
