/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Marcelo
 */
public class hibernateUtil {
    private static final SessionFactory sessionFactory;
    
    static{
        try{
            Configuration cfg=new Configuration();
            cfg.configure("hibernate/hibernate.xml");
            sessionFactory=cfg.buildSessionFactory();
            
        }catch (Throwable e){
            System.out.println("Erro: "+e);
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
