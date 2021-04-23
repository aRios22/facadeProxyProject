/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.facade;

import co.unicauca.facadeProxy.access.IOrderRepository;
import co.unicauca.facadeProxy.domain.Customer;
import co.unicauca.facadeProxy.domain.Dish;
import co.unicauca.facadeProxy.domain.Order;
import co.unicauca.facadeProxy.domain.State;

/**
 *
 * @author Andres Rios
 */
public class OrderFacade {
    
    private Order order;
    
    public void createOrder(Customer customer){
        
    }
    
    public void addDish(Dish dish, int amount){
        
    }
    
    public void changeState(State state){
        
    }
    
    public void cancelOrder(){
        
    }
    
    public int calculateTotal(){
        return 1;
    }
    
    public Order getOrder(){      
        return null;   
    }
    
    public int totalDishes(){  
        return 0;   
    }
    
    public void save(IOrderRepository repo){
        
    }
    
    
}
