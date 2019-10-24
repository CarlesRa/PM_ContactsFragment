package com.carlesramos.contactsfragment.modelo;

import java.time.LocalDate;

public class Contacte {
    private String nombre;
    private String apellido;
    private String direccion;
    private String empresa;
    private String fechaNac;
    private String telefono1;
    private String telefono2;
    private String email;

    public Contacte(String nombre, String apellido, String direccion, String empresa, String fechaNac, String telefono1, String telefono2, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.empresa = empresa;
        this.fechaNac = fechaNac;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public String getEmail() {
        return email;
    }
}
