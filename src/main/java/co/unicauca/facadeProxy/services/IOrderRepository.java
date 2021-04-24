/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.services;

import co.unicauca.facadeProxy.domain.Order;

/**
 *
 * @author Andres Rios
 */
public interface IOrderRepository {
    
    public void createOrder(Order order);
}
