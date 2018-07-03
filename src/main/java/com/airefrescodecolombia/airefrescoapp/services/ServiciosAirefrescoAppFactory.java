/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airefrescodecolombia.airefrescoapp.services;
import com.airefrescodecolombia.airefrescoapp.dao.UsuarioDAO;
import com.airefrescodecolombia.airefrescoapp.mybatis.MyBATISUsuarioDAO;
import com.airefrescodecolombia.airefrescoapp.servicesimpl.ServiciosAirefrescoImpl;
import static com.google.inject.Guice.*;
import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

/**
 *
 * @author airefresco_1
 */
public class ServiciosAirefrescoAppFactory {
    
    private static ServiciosAirefrescoAppFactory instance = new ServiciosAirefrescoAppFactory();
    private static Injector injector;
    
    private ServiciosAirefrescoAppFactory(){
        
        injector = createInjector(new XMLMyBatisModule() {
            
            @Override
            protected void initialize() {
                install(JdbcHelper.MySQL);
                setClassPathResource("mybatis-config.xml");
                bind(ServiciosAirefrescoApp.class).to(ServiciosAirefrescoImpl.class);
                bind(UsuarioDAO.class).to(MyBATISUsuarioDAO.class);
            }
        });
    }
    

    public static ServiciosAirefrescoAppFactory getInstance() {
        return instance;
    }
    
    public ServiciosAirefrescoApp getServiciosAirefrescoApp() {
        return injector.getInstance(ServiciosAirefrescoApp.class);
    }
    
    public UsuarioDAO getAsignaturaDAO() {
        return injector.getInstance(UsuarioDAO.class);
    }
    
}
