package co.unicauca.facadeProxy.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Rios
 */
public class Customer {
    
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city;
  
    /**
     * Constructor parametrizado para la clase Customer
     * @param id 
     * @param name
     * @param address
     * @param mobile
     * @param city 
     */
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }
    
    /**
     * Accede al Id privado de la clase Customer
     * @return Id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Accede al name privado de la clase Customer
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accede al Address privado de la clase Customer
     * @return Address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accede al Mobile privado de la clase Customer
     * @return Mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Accede al City privado de la clase Customer
     * @return City
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Refactoriza el Id de un Objeto Customer
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Refactoriza el name de un Objeto Customer
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Refactoriza el Id de un Objeto Customer
     * @param id 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Refactoriza el mobile de un Objeto Customer
     * @param mobile 
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Refactoriza city de un Objeto Customer
     * @param city 
     */
    public void setCity(String city) {
        this.city = city;
    }

    
}
