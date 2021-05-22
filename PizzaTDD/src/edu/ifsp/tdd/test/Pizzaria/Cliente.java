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
class Cliente {
    
    String clienteNome;
    String clienteEndereco;
    String clienteTelefone;
    String clienteReferencia;

    void setNome(String nome) {
        clienteNome = nome;
    }

    void setEndereco(String endereco, String numero) {
        clienteEndereco = endereco + ". Numero " + numero;
    }

    void setTelefone(String tel) {
        clienteTelefone = tel;
    }

    void setReferencia(String ref) {
        clienteReferencia = ref;
    }
    
}
