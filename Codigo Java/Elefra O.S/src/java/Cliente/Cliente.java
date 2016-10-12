/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import cidade.Cidade;

/**
 *
 * @author ADM
 */
public class Cliente {
    
    public int codigo;
    public String nome;
    public String endereço;
    public String telefone;
    public String email;
    public String senha;
    public String usuario;
    public String num_casa;
    public String celular;
    public String cidade;
    public int codigoCidade;
       
    public Cidade cidadenatal;
    
    public String getNome(){
    return nome;  
    }
}
