/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADM
 */
public class CidadeDAO {
    
     public static ArrayList<Cidade> cidades = new ArrayList<Cidade>();

    public static void salvar(int codigo, String nome, String estado) {

        Cidade cidade = new Cidade();
        cidade.codigo = codigo;
        cidade.nome = nome;
        cidade.estado = estado;
        cidades.add(cidade);

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pessoas", "postgres", "oifio2016");
            
            PreparedStatement cd = conexao.prepareStatement("insert into cidades(id_cidade, ds_nome, ds_estado) values (?, ?, ?)");
            
            cd.setInt(1, codigo);
            cd.setString(2, nome);
            cd.setString(3, estado);
            
            cd.close();
            conexao.close();        
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static ArrayList<Cidade> listar(){
                // selecionar no banco de dados o nome do banco para que possa funcionar corretamente o nome do projeto que será criado 
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pessoas", "postgres", "oifio2016");
             PreparedStatement cd = conexao.prepareStatement ("select * from cidades");
             
             ResultSet rs = cd.executeQuery();
             
             while(rs.next()){
            
            Cidade cidade = new Cidade ();
            cidade.codigo = rs.getInt("id_cidade");
            cidade.nome = rs.getString("ds_nome");
            cidade.estado = rs.getString("ds_estado");
            cidades.add(cidade);
        }
            rs.close();
            cd.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cidades;
    
    }
    
}
    

