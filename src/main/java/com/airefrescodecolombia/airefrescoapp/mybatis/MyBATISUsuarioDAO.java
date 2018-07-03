/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airefrescodecolombia.airefrescoapp.mybatis;
import com.airefrescodecolombia.airefrescoapp.dao.PersistenceException;
import com.airefrescodecolombia.airefrescoapp.dao.UsuarioDAO;
import com.airefrescodecolombia.airefrescoapp.entities.Usuario;
import com.airefrescodecolombia.airefrescoapp.mybatis.mappers.UsuarioMapper;
import com.google.inject.Inject;
import java.util.ArrayList;

/**
 *
 * @author airefresco_1
 */
public class MyBATISUsuarioDAO implements UsuarioDAO{
    @Inject
    private UsuarioMapper usermapper;    

    /**
     * return all users consulting the DB through mybatis framework
     * @return list of users
     * @throws com.airefrescodecolombia.airefrescoapp.dao.PersistenceException
     */
    @Override
    public ArrayList<Usuario> getAllUsers() throws PersistenceException {
        return usermapper.getUsers();
    }
    
}
