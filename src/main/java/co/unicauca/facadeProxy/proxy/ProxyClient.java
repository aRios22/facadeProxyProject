/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.proxy;

import co.unicauca.facadeProxy.services.Factory;
import co.unicauca.facadeProxy.services.IOrderRepository;

/**
 *
 * @author Andres Rios
 */
public class ProxyClient {
    
    private IOrderService orderService;
    
    public ProxyClient(IOrderService orderService){
        this.orderService = orderService;
    }
    
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    } 
}
