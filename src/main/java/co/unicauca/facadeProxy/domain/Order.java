package co.unicauca.facadeProxy.domain;


import java.time.LocalDate;
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
    private List<Item> details;
    
    public Order(Customer customer){
        
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public LocalDate getDate(){
        return this.date;
    }
    
    public State getState(){
        return this.state;
    }
    
    public List<Item> getDetails(){
        return this.details;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void setDate(LocalDate date){
        this.date = date;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public void setDetails(List<Item> details){
       this.details = details; 
    }
    
    public void addDish(Dish dish, int amount){
        
    }
    
    public int calculateTotal(){
        return 1;
    }
}
