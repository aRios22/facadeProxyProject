/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.domain;

/**
 *
 * @author Andres Rios
 */
class Item {
    
    private Dish dish;
    private int amount;
    
    /**
     * Constructor parametrizado de la clase item
     * @param dish plato
     * @param amount cantidad del plato
     */
    public Item(Dish dish, int amount){
        this.dish = dish;
        this.amount = amount;
    }
    
    /**
     * Accede al Dish privado de la clase Item
     * @return Dish
     */
    public Dish getDish(){
        return this.dish;
    }
    
    /**
     * Accede al amount privado de la clase Item
     * @return amount
     */
    public int getAmount(){
        return this.amount;
    }
    
    /**
     * Refactoriza el Dish de un Objeto Item
     * @param Dish 
     */
    public void setDish(Dish dish){
        this.dish = dish;
    }
    
    /**
     * Refactoriza el amount de un Objeto Item
     * @param amount 
     */
    public void setAmount(int amount){
        this.amount =  amount;
    }
}
