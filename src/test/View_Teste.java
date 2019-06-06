/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import model.*;
import controller.Gerente_Controller;
/**
 *
 * @author 312171030
 */
public class View_Teste {
    public static void main (String[] args){
        Gerente_Controller gc = new Gerente_Controller();
        
        Funcionario f1 = new Funcionario(123, "João 1", 1, 0, 0);
        gc.cadastrarFuncionario(f1);
        
        Funcionario f2 = new Funcionario(1234, "João 2", 2, 0, 0);
        gc.cadastrarFuncionario(f2);
        
        Gerente g = new Gerente(12345, "José", 12345, 12345);
        
        System.out.println("Gerente: " + g.toString() + "\nFuncionários: " + gc.listarFuncionario());
    }
}