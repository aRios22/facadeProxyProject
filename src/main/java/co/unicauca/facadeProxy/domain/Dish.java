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
public class Dish {
    
    private int id;
    private String name;
    private int price;

    /**
     * Constructor parametrizado de la clase Dish
     * @param id
     * @param name
     * @param price 
     */
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Accede al id privado de la clase Dish
     * @return id
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Accede al name privado de la clase Dish
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accede al price privado de la clase Dish
     * @return price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Refactoriza el Id de un Objeto Dish
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Refactoriza el name de un Objeto Dish
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Refactoriza el price de un Objeto Dish
     * @param price 
     */
    public void setPrice(int price) {
        this.price = price;
    }
        
}
