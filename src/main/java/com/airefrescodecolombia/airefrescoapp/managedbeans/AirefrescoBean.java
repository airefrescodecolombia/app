/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airefrescodecolombia.airefrescoapp.managedbeans;

import com.airefrescodecolombia.airefrescoapp.entities.Usuario;
import com.airefrescodecolombia.airefrescoapp.services.ServiciosAirefrescoApp;
import com.airefrescodecolombia.airefrescoapp.services.ServiciosAirefrescoAppFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author airefresco_1
 */
@ManagedBean(name = "AirefrescoBean")
@SessionScoped
public class AirefrescoBean implements Serializable{
    ServiciosAirefrescoApp controlador = ServiciosAirefrescoAppFactory.getInstance().getServiciosAirefrescoApp();
    
    /**public HashMap<String,String> usuariosActuales(){
        HashMap<String,String> ans = new HashMap<>(); 
        ArrayList<Usuario> users = controlador.getAllUsers();
        if (!users.isEmpty()){
            for (Usuario us:users){
                ans.put(us.getUsername(),us.getNombre());
            }
        }
        return ans;
    }*/
}
