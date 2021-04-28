package co.unicauca.facadeProxy.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Rios
 */
public class Order {
    
    public int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details = new ArrayList<>();
    
    /**
     * Constructor parametrizado de la clase Order
     * @param customer 
     */
    public Order(Customer customer){
        this.customer=customer;
        this.state=State.NEW;
    }
    
    /**
     * Accede al Customer privado de la clase Order
     * @return customer
     */
    public Customer getCustomer(){
        return this.customer;
    }
    
    /**
     * Accede al date privado de la clase Order
     * @return date
     */
    public LocalDate getDate(){
        return this.date;
    }
    
    /**
     * Accede al state privado de la clase Order
     * @return state
     */
    public State getState(){
        return this.state;
    }
    
    /**
     * Accede a la lista privada details de la clase Order
     * @return details
     */
    public List<Item> getDetails(){
        return this.details;
    }
    
    /**
     * Refactoriza el amount de un Objeto Order
     * @param customer 
     */
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    /**
     * Refactoriza el date de un Objeto Order
     * @param date 
     */
    public void setDate(LocalDate date){
        this.date = date;
    }
    
    /**
     * Refactoriza el state de un Objeto Order
     * @param state 
     */
    public void setState(State state){
        this.state = state;
    }
    
    /**
     * Refactoriza la lista details de un Objeto Order
     * @param details 
     */
    public void setDetails(List<Item> details){
       this.details = details; 
    }
    
    /**
     * Añade un nuevo plato junto con su cantidad a la lista details de la clase Order
     * @param dish
     * @param amount 
     */
    public void addDish(Dish dish, int amount){
        Item item = new Item(dish , amount);
        this.details.add(item);         
    }
    
    /**
     * Calcula el precio total de los platos que se encuentran en la lista details
     * @return vPrice precio de la Orden
     */
    public int calculateTotal(){
        if(this.details.isEmpty()){
            return 0;
        }   
        else{
            int vPrice = 0;
            for(Item vItem : this.details){
                vPrice += (vItem.getDish().getPrice() * vItem.getAmount());
            }
            return vPrice;
        }
    }
    
}
