/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airefrescodecolombia.airefrescoapp.dao;

/**
 *
 * @author airefresco_1
 */
public class PersistenceException extends Exception{
    /**
     * Constructor de una nueva excepcion con un mensaje
     * @param message mensaje de la excepcion
     */
    public PersistenceException(String message) {
        super(message);
    }
    
    /**
     * Constructor de una nueva excepcion con un mensaje y su causa
     * @param message mensaje de la excepcion
     * @param cause causa de la excepcion
     */
    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
