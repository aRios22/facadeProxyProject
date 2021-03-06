/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.proxy;

import co.unicauca.facadeProxy.domain.OrderFacade;
import co.unicauca.facadeProxy.services.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Andres Rios
 */
public class OrderServiceLogger implements IOrderService {

    private OrderFacade orderFacade;
    private Logger logger;

    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @Override
    public void save(IOrderRepository repo) {
        Logger logger= LoggerFactory.getLogger(OrderServiceLogger.class);
        orderFacade.save(repo);
        
        //se hace el log
        String message = "Pedido guardado en la base de datos";
        logger.info(message);
    }

}
