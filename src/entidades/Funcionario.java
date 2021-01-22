/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Funcionario {
    private String nombre;
    private String apellido;
    private String DNI;
    private String nº_placa;

    // constructor por defecto
    public Funcionario() {
    }
    
    // constructor de copia
    public Funcionario (Funcionario fun){
        
        this.nombre = fun.nombre;
        this.apellido = fun.apellido;
        this.DNI = fun.DNI;
        this.nº_placa = fun.nº_placa;
    }

    // constructor con todos los atributos
    public Funcionario(String nombre, String apellido, String DNI, String nº_placa) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nº_placa = nº_placa;
    }
    
    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNº_placa() {
        return nº_placa;
    }

    public void setNº_placa(String nº_placa) {
        this.nº_placa = nº_placa;
    }

    // haremos un scanner pidiendo 
    public static Funcionario nuevoFuncionario(){
        Funcionario ret = new Funcionario();
        Scanner sc = new Scanner(System.in);
        String nombre;
        
        do{
            System.out.println("Introduzca su nombre: ");
            nombre = sc.nextLine();
            
        } while(nombre = " ");
    }
    
    
    
    @Override
    public String toString() {
        return "Funcionario{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", n\u00ba_placa=" + nº_placa + '}';
    }
    
   
}
    
    
    

