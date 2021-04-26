/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.domain;

import co.unicauca.facadeProxy.proxy.IOrderService;
import co.unicauca.facadeProxy.services.IOrderRepository;

/**
 *
 * @author Andres Rios
 */
public class OrderFacade implements IOrderService{
    
    private Order order;
    
    /**
     * Conecta la fachada Con el constructor de la clase Order
     * @param customer 
     */
    public void createOrder(Customer customer){
        this.order = new Order(customer);
    }
    
    /**
     * Conecta la fachada con el metodo addDish() de la clase Order
     * @param dish
     * @param amount 
     */
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }
    
    /**
     * Conecta la fachada con el metodo setState() de la clase Order 
     * @param state 
     */
    public void changeState(State state){
        order.setState(state);
    }
    
    /**
     * Conecta la fachada con el metodo setState() de la clase Order 
     * Cambia el Estado de la clase Order a CANCELED
     */
    public void cancelOrder(){
        order.setState(State.CANCELED);
    }
    
    /**
     * Conecta la fachada al metodo calculateTotal() de la clase Order
     * @return Precio de la Orden
     */
    public int calculateTotal(){
        return order.calculateTotal();
    }
    
    /**
     * Accede a la Order privada de la clase OrderFacade
     * @return order
     */
    public Order getOrder(){      
        return this.order;   
    }
    
    /**
     * Cuenta los platos que hay en la Orden
     * @return Cantidad de Platos
     */
    public int totalDishes(){  
        return this.order.getDetails().size();   
    }
    
    /**
     * Guarda la Orden actual en un repositorio
     * @param repo Repositorio en el que se quiere guardar
     */
    @Override
    public void save(IOrderRepository repo){
        repo.createOrder(this.order);
    }
    
    
}
