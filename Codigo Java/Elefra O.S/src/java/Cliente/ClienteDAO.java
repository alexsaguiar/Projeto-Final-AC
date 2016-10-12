/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import cidade.Cidade;
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
public class ClienteDAO {

    //public static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    public static void salvar(int codigo, String nome,String email, String telefone, String celular, String senha) {
      
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto elefra O.S", "postgres", "oifio2016");

            PreparedStatement ps = conexao.prepareStatement("insert into cliente(codigo, nome, email, telefone, celular, senha) values (?, ?, ?, ?, ?, ?)");

            ps.setInt(1, codigo);
            ps.setString(2, nome);
            ps.setString(3, email);
            ps.setString(4, telefone);
            ps.setString(5, celular);
            ps.setString(6, senha);

            ps.executeUpdate();
            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Cliente buscar(int codigo) {

        try {
          

            Class.forName("org.postgresql.Driver");

            try {
                Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto elegra O.S", "postgres", "oifio2016");
                PreparedStatement ps = conexao.prepareStatement("select * from cliente where codigo = ?");

                ps.setInt(1, codigo);
                ResultSet rs = ps.executeQuery();

                rs.next();

                Cliente cliente = new Cliente();
                cliente.codigo = rs.getInt("codigo");
                cliente.nome = rs.getString("nome");
                cliente.email = rs.getString("email");
                cliente.telefone = rs.getString("telefone");
                cliente.celular = rs.getString("celular");

                rs.close();
                ps.close();
                conexao.close();

                return cliente;

            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void atualizar(int codigo, String nome,String email, String telefone, String celular) {
        
        try {
            Class.forName("org.postgresql.Driver");
            try {
                Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto elefra O.S", "postgres", "oifio2016");
                PreparedStatement ps = conexao.prepareStatement("update cliente set nome = ?, email = ?, telefone = ?, celular =?, where codigo = ?");

                ps.setString(1, nome);  
                ps.setString(2, email);
                ps.setString(3, telefone);
                ps.setString(4, celular);
                ps.setInt(5, codigo); 

                ps.executeUpdate();  // utilizado para execultar  a atualizacao
                ps.close();         // feito para fechar a inclusao da pessoa momentaniamente para que possa ser alterado 
                conexao.close();    // feito para fechar a conexao com o banco para atualizar um novo cliente

            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void excluir(int codigo) {
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto elefra O.S", "postgres", "oifio2016");
            PreparedStatement ps = conexao.prepareStatement("delete from cliente where codigo = ?");

            ps.setInt(1, codigo);
            ps.executeUpdate();

            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public static ArrayList<Cliente> listar() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto elefra O.S", "postgres", "oifio2016");

           // PreparedStatement ps = conexao.prepareStatement("select * from cliente");
           
           PreparedStatement ps = conexao.prepareStatement("select cliente .*, Cidade.nome as nomeCidade, cidade.estado as uf from cliente on codigo_cidade = codigo.cidade");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.codigo = rs.getInt("codigo");
                cliente.nome = rs.getString("nome");
                cliente.email = rs.getString("email");
                cliente.telefone = rs.getString("telefone");
                cliente.celular = rs.getString("celular");
                
                Cidade cidade = new Cidade();
                cidade.nome = rs.getString("nomeCidade");
                cidade.estado = rs.getString("uf");
                
                cliente.cidadenatal = cidade;
              
                clientes.add(cliente);
            }
            rs.close();
            ps.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public static Cliente login(String usuario, String senha) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto elefra O.S", "postgres", "oifio2016");

            PreparedStatement ps = conexao.prepareStatement("select * from cliente where ds_nome = ? and senha = ?");
            
            ps.setString(1, usuario);
            ps.setString(2, senha);
                    
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.codigo = rs.getInt("codigo");
                cliente.nome = rs.getString("nome");
                cliente.email = rs.getString("email");

                rs.close();
                ps.close();
                conexao.close();

                return cliente;

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
