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
public class Funcionario extends Pessoa {
    //Atributos do funcionário: 
    private int id_funcionario;
    
    private int titulacao;//Avaliados de 1 a 5 estrelas
    private int experiencia; 
     
    public Funcionario(){ 
         
    } 

    public Funcionario(int cpf, String nome, int id_funcionario, int titulacao, int experiencia){
        this.cpf = cpf;
        this.nome = nome;
        this.id_funcionario = id_funcionario;
        this.titulacao = titulacao;
        this.experiencia = experiencia;
    }
    
    public Funcionario(int titulacao, int experiencia){
        this.titulacao = titulacao;
        this.experiencia = experiencia;
    }
    
    public int getTitulacao() { 
        return titulacao; 
    } 
  
    public void setTitulacao(int titulacao) { 
        this.titulacao = titulacao; 
    } 
  
    public int getExperiencia() { 
        return experiencia; 
    } 
  
    public void setExperiencia(int experiencia) { 
        this.experiencia = experiencia; 
    } 

    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + getCpf() + "nome=" + getNome() + "id_funcionario=" + id_funcionario + ", titulacao=" + titulacao + ", experiencia=" + experiencia + '}';
    }
    
    
}