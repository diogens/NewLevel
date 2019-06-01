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
public abstract class Pessoa {
    protected int cpf; 
    protected String nome; 

    public int getCpf() { 
        return cpf; 
    }
  
    public void setCpf(int cpf) { 
        this.cpf = cpf; 
    } 
  
    public String getNome() { 
        return nome; 
    } 
  
    public void setNome(String nome) { 
        this.nome = nome; 
    } 
}