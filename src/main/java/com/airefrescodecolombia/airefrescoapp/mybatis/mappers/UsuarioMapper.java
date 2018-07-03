/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airefrescodecolombia.airefrescoapp.mybatis.mappers;

import com.airefrescodecolombia.airefrescoapp.entities.Usuario;
import java.util.ArrayList;

/**
 *
 * @author airefresco_1
 */
public interface UsuarioMapper {
    
    /**
     * returns all of the registered users
     * @return list of users object
     */
    ArrayList<Usuario> getUsers();
    
}
