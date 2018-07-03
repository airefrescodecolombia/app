/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airefrescodecolombia.airefrescoapp.entities;
import java.io.Serializable;

/**
 *
 * @author airefresco_1
 */
public class Usuario implements Serializable{
    private String nombre;
    private String correo;
    private String rol;
    private String username;
    private String salt;
    private String encryptedpass;
    private String lastlogin;
    
    public Usuario(){
    }
    
    public Usuario(String n, String em, String r, String un, String sa, String ep, String ll){
        nombre = n;
        username = un;
        salt=sa;
        encryptedpass = ep;
        lastlogin = ll;
        correo = em;
        rol = r;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEncryptedpass() {
        return encryptedpass;
    }

    public void setEncryptedpass(String encryptedpass) {
        this.encryptedpass = encryptedpass;
    }

    public String getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(String lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }   

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }    
}
