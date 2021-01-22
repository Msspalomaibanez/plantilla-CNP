/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class Vacaciones {
    
    private String periodo;
    private int dias;
    private Funcionario funcionario;
    
    //constructor por defecto
    public Vacaciones() {
    }
    
    // constructor con todos los atributos
    public Vacaciones(String periodo, int dias, Funcionario funcionario) {
        this.periodo = periodo;
        this.dias = dias;
        this.funcionario = funcionario;
    }
    
    // constructor de copia
    public Vacaciones(Vacaciones vac){
        this.periodo = vac.periodo;
        this.dias = vac.dias;
        this.funcionario = vac.funcionario;
        
    }

    //getters y setters
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    





}
