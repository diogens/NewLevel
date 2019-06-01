/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;
import java.util.ArrayList;
/**
 *
 * @author 312171030
 */
public class Gerente_Controller {
    //ArrayList <Gerente> arrayGerente = new ArrayList <Gerente>();
    ArrayList <Funcionario> arrayFuncionario = new ArrayList <Funcionario>();
    
    public boolean cadastrarFuncionario(Funcionario f){ 
        return arrayFuncionario.add(f); 
    }
    
    public ArrayList <Funcionario> listarFuncionario(){ 
        return arrayFuncionario; 
    } 
     
    public Funcionario buscarFuncionario(String s){ 
        for (int i = 0; i < arrayFuncionario.size(); i++){ 
            if (arrayFuncionario.get(i).getNome() == s) 
                return arrayFuncionario.get(i); 
        } 
    return null; 
    }
    
    public boolean excluirFuncionario(Funcionario f){ 
         
        for (int i = 0; i < arrayFuncionario.size(); i++){ 
            if (arrayFuncionario.get(i).getNome() == f.getNome()) { 
                arrayFuncionario.remove(i);
                return true; 
            } 
        } 
    return false; 
    } 
     
    public boolean alterarFuncionario(Funcionario f){ 
         
        for (int i = 0; i < arrayFuncionario.size(); i++){ 
            if (arrayFuncionario.get(i).getNome() == f.getNome()) { 
                arrayFuncionario.set(i,f); 
                return true; 
            } 
        } 
    return false;
    }

    public boolean isEmpty(){ 
        if(arrayFuncionario.isEmpty()){ 
            return true; 
        } 
        else 
            return false; 
    } 
     
    public boolean isFull(int i){ 
        int tam; 
         
        tam = arrayFuncionario.size(); 
         
        if(tam == i){ 
            return true; 
        } 
        else 
            return false; 
    } 
     
}