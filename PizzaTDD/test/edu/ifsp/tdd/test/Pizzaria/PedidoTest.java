package edu.ifsp.tdd.test.Pizzaria;



import edu.ifsp.tdd.test.Pizzaria.Pizza;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PedidoTest {
    
    public PedidoTest() {
    }
    

    @Test
    public void abrePedidoCom1PizzaEVerificaValor() {
        Pedido pedido=new Pedido();
        
        Pizza pizza=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 0.50);
        
        pizza.adicionaIngrediente(massa);
        pizza.adicionaIngrediente(queijo); //usar collections para resolver
        pizza.adicionaIngrediente(tomate);
        
        pizza.adicionaLucro(25);
        
        Cliente cliente=new Cliente();
        cliente.setNome("Joao da Silva");
        cliente.setEndereco("Rua A","322");
        cliente.setTelefone("33223322");
        cliente.setReferencia("Perto da Padaria");
        
        pedido.setCliente(cliente);
        
        //imposto calculado sobre o valor total da pizza, em %
        pedido.setImposto(5);
        
        pedido.adicionaPizza(pizza);
        
        assertEquals(75.46875, pedido.obterValorTotal(),0.0001);
    }
    
    //Escrever os testes abaixo
    @Test
    public void abrePedidoCom2PizzaEVerificaValor() {
        Pedido pedido=new Pedido();
        
        Pizza pizza1=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 0.50);
        
        pizza1.adicionaIngrediente(massa);
        pizza1.adicionaIngrediente(queijo); //usar collections para resolver
        pizza1.adicionaIngrediente(tomate);
        
        pizza1.adicionaLucro(25);
        
        pedido.adicionaPizza(pizza1);
        
        Pizza pizza2=new Pizza("Presunto");
        
        Ingrediente presunto=new Ingrediente("Presunto", 50, 0.50);
        
        pizza2.adicionaIngrediente(massa);
        pizza2.adicionaIngrediente(presunto);
        pizza2.adicionaIngrediente(tomate);
        
        pizza2.adicionaLucro(50);
        
        pedido.adicionaPizza(pizza2);
        
        Cliente cliente=new Cliente();
        cliente.setNome("Joao da Silva");
        cliente.setEndereco("Rua A","322");
        cliente.setTelefone("33223322");
        cliente.setReferencia("Perto da Padaria");
        
        pedido.setCliente(cliente);
        
        pedido.setImposto(5);
        
        
        assertEquals(166.03125, pedido.obterValorTotal(),0.0001);
    }
    
    @Test
    public void abrePedidoCom3PizzaEVerificaValor() {
        Pedido pedido=new Pedido();
        
        Pizza pizza1=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 0.50);
        
        pizza1.adicionaIngrediente(massa);
        pizza1.adicionaIngrediente(queijo); //usar collections para resolver
        pizza1.adicionaIngrediente(tomate);
        
        pizza1.adicionaLucro(25);
        
        pedido.adicionaPizza(pizza1);
        
        Pizza pizza2=new Pizza("Presunto");
        
        Ingrediente presunto=new Ingrediente("Presunto", 50, 0.50);
        
        pizza2.adicionaIngrediente(massa);
        pizza2.adicionaIngrediente(presunto);
        pizza2.adicionaIngrediente(tomate);
        
        pizza2.adicionaLucro(50);
        
        pedido.adicionaPizza(pizza2);
        
        Pizza pizza3=new Pizza("Calabresa");
        
        Ingrediente calabresa=new Ingrediente("Calabresa", 50, 0.75);
        
        pizza3.adicionaIngrediente(massa);
        pizza3.adicionaIngrediente(calabresa);
        pizza3.adicionaIngrediente(queijo);
        
        pizza3.adicionaLucro(50);
        
        pedido.adicionaPizza(pizza3);
        
        Cliente cliente=new Cliente();
        cliente.setNome("Joao da Silva");
        cliente.setEndereco("Rua A","322");
        cliente.setTelefone("33223322");
        cliente.setReferencia("Perto da Padaria");
        
        pedido.setCliente(cliente);
        
        pedido.setImposto(10);
        
        
        assertEquals(301.8125, pedido.obterValorTotal(),0.0001);
    }
    

    @Test
    public void abrePedidoCom1PizzaEVerificaImposto() {
        Pedido pedido=new Pedido();
        
        Pizza pizza=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",100,1);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 1);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 1);
        
        pizza.adicionaIngrediente(massa);
        pizza.adicionaIngrediente(queijo); //usar collections para resolver
        pizza.adicionaIngrediente(tomate);
        
        pizza.adicionaLucro(0);
        
        Cliente cliente=new Cliente();
        cliente.setNome("Joao da Silva");
        cliente.setEndereco("Rua A","322");
        cliente.setTelefone("33223322");
        cliente.setReferencia("Perto da Padaria");
        
        pedido.setCliente(cliente);
        
        pedido.setValorTotal(400);
        
        pedido.adicionaPizza(pizza);
        
        assertEquals(100, pedido.obterImposto(),0.0001);
    }
    
    @Test
    public void abrePedidoCom2PizzaEVerificaImposto() {
        Pedido pedido=new Pedido();
        
        Pizza pizza1=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 0.50);
        
        pizza1.adicionaIngrediente(massa);
        pizza1.adicionaIngrediente(queijo); //usar collections para resolver
        pizza1.adicionaIngrediente(tomate);
        
        pizza1.adicionaLucro(25);
        
        pedido.adicionaPizza(pizza1);
        
        Pizza pizza2=new Pizza("Presunto");
        
        Ingrediente presunto=new Ingrediente("Presunto", 50, 0.50);
        
        pizza2.adicionaIngrediente(massa);
        pizza2.adicionaIngrediente(presunto);
        pizza2.adicionaIngrediente(tomate);
        
        pizza2.adicionaLucro(50);
        
        pedido.adicionaPizza(pizza2);
        
        Cliente cliente=new Cliente();
        cliente.setNome("Joao da Silva");
        cliente.setEndereco("Rua A","322");
        cliente.setTelefone("33223322");
        cliente.setReferencia("Perto da Padaria");
        
        pedido.setCliente(cliente);
        
        pedido.setValorTotal(166.03125);
        
        assertEquals(5, pedido.obterImposto(),0.0001);
    }
    
    @Test
    public void abrePedidoCom3PizzaEVerificaImposto() {
        Pedido pedido=new Pedido();
        
        Pizza pizza1=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,0.30);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 0.35);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 0.50);
        
        pizza1.adicionaIngrediente(massa);
        pizza1.adicionaIngrediente(queijo); //usar collections para resolver
        pizza1.adicionaIngrediente(tomate);
        
        pizza1.adicionaLucro(25);
        
        pedido.adicionaPizza(pizza1);
        
        Pizza pizza2=new Pizza("Presunto");
        
        Ingrediente presunto=new Ingrediente("Presunto", 50, 0.50);
        
        pizza2.adicionaIngrediente(massa);
        pizza2.adicionaIngrediente(presunto);
        pizza2.adicionaIngrediente(tomate);
        
        pizza2.adicionaLucro(50);
        
        pedido.adicionaPizza(pizza2);
        
        Pizza pizza3=new Pizza("Calabresa");
        
        Ingrediente calabresa=new Ingrediente("Calabresa", 50, 0.75);
        
        pizza3.adicionaIngrediente(massa);
        pizza3.adicionaIngrediente(calabresa);
        pizza3.adicionaIngrediente(queijo);
        
        pizza3.adicionaLucro(50);
        
        pedido.adicionaPizza(pizza3);
        
        Cliente cliente=new Cliente();
        cliente.setNome("Joao da Silva");
        cliente.setEndereco("Rua A","322");
        cliente.setTelefone("33223322");
        cliente.setReferencia("Perto da Padaria");
        
        pedido.setCliente(cliente);
        
        pedido.setValorTotal(301.8125);
        
        assertEquals(10, pedido.obterImposto(),0.0001);
    }
    
    @Test
    public void abrePedidoCom3PizzaEVerificaValorSemImposto() {
        Pedido pedido=new Pedido();
        
        Pizza pizza1=new Pizza("Queijo");
        Ingrediente massa=new Ingrediente("Massa",50,1);
        Ingrediente tomate=new Ingrediente("Tomate", 50, 1);
        Ingrediente queijo=new Ingrediente("Queijo", 50, 1);
        
        pizza1.adicionaIngrediente(massa);
        pizza1.adicionaIngrediente(queijo); //usar collections para resolver
        pizza1.adicionaIngrediente(tomate);
        
        pizza1.adicionaLucro(100);
        
        pedido.adicionaPizza(pizza1);
        
        Pizza pizza2=new Pizza("Presunto");
        
        Ingrediente presunto=new Ingrediente("Presunto", 50, 1);
        
        pizza2.adicionaIngrediente(massa);
        pizza2.adicionaIngrediente(presunto);
        pizza2.adicionaIngrediente(tomate);
        
        pizza2.adicionaLucro(100);
        
        pedido.adicionaPizza(pizza2);
        
        Pizza pizza3=new Pizza("Calabresa");
        
        Ingrediente calabresa=new Ingrediente("Calabresa", 50, 1);
        
        pizza3.adicionaIngrediente(massa);
        pizza3.adicionaIngrediente(calabresa);
        pizza3.adicionaIngrediente(queijo);
        
        pizza3.adicionaLucro(100);
        
        pedido.adicionaPizza(pizza3);
        
        Cliente cliente=new Cliente();
        cliente.setNome("Joao da Silva");
        cliente.setEndereco("Rua A","322");
        cliente.setTelefone("33223322");
        cliente.setReferencia("Perto da Padaria");
        
        pedido.setCliente(cliente);
        
        
        assertEquals(900, pedido.obterValorTotal(),0.0001);
    }
    
    
}
