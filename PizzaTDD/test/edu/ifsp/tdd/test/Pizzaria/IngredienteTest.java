/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.tdd.test.Pizzaria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felip
 */
public class IngredienteTest {
    
    public IngredienteTest() {
    }
    
     @Test
     public void ingredienteCreator() {
         //o objeto ingrediente terá 3 parâmetros na instanciação(Nome, Quantidade/gramas, Valor/Grama)
         assertNotNull("Ok", new Ingrediente("Tomate",15,0.1));
     }
     
     @Test
     public void valorDoIngrediente() {
         //o objeto ingrediente terá 3 parâmetros na instanciação(Nome, Quantidade, Valor/Grama)
         assertEquals(1.50, new Ingrediente("Tomate",15,0.1).obterValor(), 0.001);
     }
     
     @Test
     public void valorDoIngrediente2() {
         assertEquals(25, new Ingrediente("Massa",50,0.5).obterValor(), 0.001);
     }
}
