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
public class Jornada {
    
    private char turno;
    private Grupo grupo;
    private Funcionario funcionario;

    // constructor por defecto
    public Jornada() {
    }

    // constructor con todos los atributos
    public Jornada(char turno, Grupo grupo, Funcionario funcionario) {
        this.turno = turno;
        this.grupo = grupo;
        this.funcionario = funcionario;
    }
    
    // constructor de copia
    public Jornada(Jornada jor){
        this.turno = jor.turno;
        this.grupo = jor.grupo;
        this.funcionario = jor.funcionario;
    }
 
    // getters y setters
    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
