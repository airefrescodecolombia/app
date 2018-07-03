/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airefrescodecolombia.airefrescoapp.services;

import com.airefrescodecolombia.airefrescoapp.entities.Usuario;
import java.util.ArrayList;

/**
 * interface to apply the methods of the application between the view and persistence side
 * @author airefresco_1
 */
public interface ServiciosAirefrescoApp {
    /**
     * get All users from DB
     * @return list of registered users
     */
    ArrayList<Usuario> getAllUsers();    
}
