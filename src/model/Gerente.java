/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author 312171030
 */
public class Gerente extends Pessoa {
    private int login; 
    private int senha; 
    private int codigo_sistema = 123; 
    
    public Gerente(){ 
         
    }
    
    public Gerente(int cpf, String nome, int login, int senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    
  
    public int getLogin() { 
        return login; 
    } 
  
    public void setLogin(int login) { 
        this.login = login; 
    } 
    
  
    public int getSenha() { 
        return senha; 
    } 
  
    public void setSenha(int senha) { 
        this.senha = senha; 
    } 
  
    public int getCodigo_sistema() { 
        return codigo_sistema; 
    } 

    @Override
    public String toString() {
        return "Gerente{" +  "cpf=" + getCpf() + "nome=" + getNome() + "login=" + login + ", senha=" + senha + ", codigo_sistema=" + codigo_sistema + '}';
    }
    
    
}