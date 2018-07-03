/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airefrescodecolombia.airefrescoapp.servicesimpl;

import com.airefrescodecolombia.airefrescoapp.dao.PersistenceException;
import com.airefrescodecolombia.airefrescoapp.dao.UsuarioDAO;
import com.airefrescodecolombia.airefrescoapp.entities.Usuario;
import com.airefrescodecolombia.airefrescoapp.services.ServiciosAirefrescoApp;
import com.google.inject.Inject;
import java.util.ArrayList;

/**
 *
 * @author airefresco_1
 */
public class ServiciosAirefrescoImpl implements ServiciosAirefrescoApp {
    @Inject
    private UsuarioDAO daoUsuario;

    @Override
    public ArrayList<Usuario> getAllUsers() {
        ArrayList<Usuario> ans = new ArrayList<>();
        try {
            ans = daoUsuario.getAllUsers();
        }catch (PersistenceException ex){}
        return ans;
    }
    
}
