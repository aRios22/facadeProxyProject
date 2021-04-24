/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.services;

/**
 *
 * @author Andres Rios
 */
public class Factory {
    
    private static Factory instance;

    private Factory(){
        
    }
    
    public static Factory getInstance() {
        if(instance == null){
            instance = new Factory();
        }
        return instance;

    }
    
    public IOrderRepository getRepository(String type){
        IOrderRepository result = null;
        switch (type){
            case "default":
                result = new OrderRepository();
                break;
        }
        return result;
    }
    
}
