/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.proxy;

import co.unicauca.facadeProxy.domain.OrderFacade;
import co.unicauca.facadeProxy.services.IOrderRepository;

/**
 *
 * @author Andres Rios
 */
public class OrderServiceLogger implements IOrderService{

    private OrderFacade orderFacade;
    
    public OrderServiceLogger(OrderFacade orderFacade){
        this.orderFacade = orderFacade;
    }
    
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(orderFacade.getOrder());
        String message = "Pedido Guardado en la Base de Datos";
        logger.info(message);
    }
    
}
