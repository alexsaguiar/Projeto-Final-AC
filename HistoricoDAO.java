/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historico;

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
public class HistoricoDAO {

    public static void salvar_historico(int codigo_historico, String pendente, String observacao, String tb_concluido) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement hist = conexao.prepareStatement("insert into historicos(codigo_historico, pendente, observacao, tb_concluido) values (?, ?, ?, ?);");

            hist.setInt(1, codigo_historico);
            hist.setString(2, pendente);
            hist.setString(3, observacao);
            hist.setString(4, tb_concluido);

            hist.executeUpdate();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Historico> listar_historico() {
        ArrayList<Historico> historicos = new ArrayList<Historico>();

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement hist = conexao.prepareStatement("select * from historicos");

            ResultSet rs = hist.executeQuery();

            while (rs.next()) {
                Historico historico = new Historico();
                historico.codigo_historico = rs.getInt("codigo_historico");
                historico.pendente = rs.getString("pendente");
                historico.observacao =rs.getString("observacao");
                historico.tb_concluido = rs.getString("tb_concluido");

                historicos.add(historico);
            }

            rs.close();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historicos;
    }

    public static Historico buscar(int codigo_historico) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement hist = conexao.prepareStatement ("select * from historicos where codigo_historico = ?");
            
            hist.setInt (1, codigo_historico);
            ResultSet rs = hist.executeQuery();
            
            rs.next();
            
            Historico historico = new Historico();
           
            historico.codigo_historico = rs.getInt ("codigo_historico");
            historico.pendente = rs.getString ("pendente");
            historico.observacao = rs.getString ("observacao");
            historico.tb_concluido = rs.getString("tb_concluido");
            
            rs.close();
            hist.close();
            conexao.close();
            
            return historico;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static void atualizar(int codigo_historico, String pendente, String observacao, String tb_concluido){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
            
            PreparedStatement hist = conexao.prepareStatement ("update historicos set pendente = ?, observacao = ?, tb_concluido = ? where codigo_historico = ?");
            
            hist.setString (1, pendente);
            hist.setString (2, observacao);
            hist.setString (3, tb_concluido);
            hist.setInt    (4, codigo_historico);
            
            hist.executeUpdate();
            hist.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void excluir (int codigo_historico){
        
        try {
            Class.forName("org.postgresql.Driver");
            
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
            
            PreparedStatement hist = conexao.prepareStatement ("delete from historicos where codigo_historico = ?");
            
            hist.setInt (1, codigo_historico);
            hist.executeUpdate();
            
            hist.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
