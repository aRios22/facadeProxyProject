/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.domain;

import co.unicauca.facadeProxy.services.IOrderRepository;

/**
 *
 * @author Andres Rios
 */
public class OrderFacade {
    
    private Order order;
    
    public void createOrder(Customer customer){
        this.order = new Order(customer);
    }
    
    public void addDish(Dish dish, int amount){
        for (int i=1; i<=amount; i++){
            order.addDish(dish, amount);
        }
    }
    
    public void changeState(State state){
        order.setState(state);
    }
    
    public void cancelOrder(){
        order.setState(State.CANCELED);
    }
    
    public int calculateTotal(){
        return order.calculateTotal();
    }
    
    public Order getOrder(){      
        return this.order;   
    }
    
    public int totalDishes(){  
        return this.order.getDetails().size();   
    }
    
    public void save(IOrderRepository repo){
        repo.createOrder(this.order);
    }
    
    
}
