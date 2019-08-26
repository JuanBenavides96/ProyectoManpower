/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase: Empleado
 * 
 * @version: 0.1
 *  
 * @since: 12/08/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Vincenzo Angelone Salgado
 * 
 * Copyrigth: CECAR
 */

package edu.cecar.modelos;

import java.util.Date;

/**
 *
 * Clase que modela la estructura empleados.
 */
public class Empleado {
    
    private String codigo;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;

    public Empleado(String codigo, String nombres, String apellidos, Date fechaNacimiento) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado() {
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

}
