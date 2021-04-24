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

    /**
     * Constructor default de la clase Factory
     */
    private Factory(){
        
    }
    
    /**
     * Accede a la instance privada de la clase Factory
     * @return instance
     */
    public static Factory getInstance() {
        if(instance == null){
            instance = new Factory();
        }
        return instance;

    }
    
    /**
     * Accede al reporitorio default donde se guardan las ordenes.
     * @param type tipo de repositorio
     * @return result
     */
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
