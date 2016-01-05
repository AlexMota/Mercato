/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercato.dao;

import com.mercato.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandre
 */
public class ProdutoDAO {
        private Connection connection = null;
        private Statement statement =  null;
    
        
        public ProdutoDAO() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:mercato.db");
            statement = connection.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        criarBanco();

    }
    
    private void criarBanco(){
            try {
                statement.executeUpdate("CREATE TABLE produto ( descricao varchar(100), id integer AUTO_INCREMENT PRIMARY KEY NOT NULL, preco double, codigo_barras varchar(20) )");
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    public void inserir(){
            try {
                statement.executeUpdate("INSERT INTO PRODUTO");
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void remover(){
    
    }
    
    public void removerTodos(){
    
    }
    
    public void atualizar(Produto produto){
    
    }
    
    public void buscar(){
    
    }
    
    public void buscarTodos(){
            try {
                statement.executeQuery("SELECT * FROM PRODUTO");
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
