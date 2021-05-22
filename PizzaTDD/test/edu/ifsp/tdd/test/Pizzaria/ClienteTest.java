/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.tdd.test.Pizzaria;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maxwe
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    /**
     * Test of setNome method, of class Cliente.
     */
    @Test
    public void testSetNome() {
        Cliente cliente=new Cliente();
        cliente.setNome("Carlos");
        assertEquals("Carlos", cliente.clienteNome);
    }

    /**
     * Test of setEndereco method, of class Cliente.
     */
    @Test
    public void testSetEndereco() {
        Cliente cliente=new Cliente();
        cliente.setEndereco("Rua A","322");
        assertEquals("Rua A"+ ". Numero " +"322", cliente.clienteEndereco);
    }

    /**
     * Test of setTelefone method, of class Cliente.
     */
    @Test
    public void testSetTelefone() {
        Cliente cliente=new Cliente();
        cliente.setTelefone("33223322");
        assertEquals("33223322", cliente.clienteTelefone);
    }

    /**
     * Test of setReferencia method, of class Cliente.
     */
    @Test
    public void testSetReferencia() {
        Cliente cliente=new Cliente();
        cliente.setReferencia("Perto da Padaria");
        assertEquals("Perto da Padaria", cliente.clienteReferencia);
    }
}
