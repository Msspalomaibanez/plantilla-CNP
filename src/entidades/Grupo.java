/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Grupo {
    
    private char num_grupo;
    public ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    // constructor por defecto
    public Grupo() {
    }
    
    // contructor con todos los atributos
    public Grupo(char num_grupo, ArrayList<Funcionario> funcionarios){
        
        this.num_grupo = num_grupo;
        this.listaFuncionarios = listaFuncionarios;
        
    }
    
    // constructor de copia
    public Grupo(Grupo grupo){
        
        this.num_grupo = grupo.num_grupo;
        this.listaFuncionarios = grupo.listaFuncionarios;
    }

    // getters y setters
    public char getNum_grupo() {
        return num_grupo;
    }

    public void setNum_grupo(char num_grupo) {
        this.num_grupo = num_grupo;
    }

    public ArrayList<Funcionario> getFuncionario() {
        return listaFuncionarios;
    }

    public void setFuncionario(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    
    
}
