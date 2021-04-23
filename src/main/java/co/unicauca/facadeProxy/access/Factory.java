/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.access;

/**
 *
 * @author Andres Rios
 */
public class Factory {
    
    private static Factory factory;

    public static Object getInstance() {
        return Factory.factory;
    }
    
    public void getRepository(String type){
        
    }
    
}
