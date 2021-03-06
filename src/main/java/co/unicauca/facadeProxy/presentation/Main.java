/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facadeProxy.presentation;

import co.unicauca.facadeProxy.proxy.ProxyClient;
import co.unicauca.facadeProxy.services.Factory;
import co.unicauca.facadeProxy.services.IOrderRepository;
import co.unicauca.facadeProxy.domain.Customer;
import co.unicauca.facadeProxy.domain.Dish;
import co.unicauca.facadeProxy.domain.State;
import co.unicauca.facadeProxy.domain.OrderFacade;
import co.unicauca.facadeProxy.proxy.IOrderService;
import co.unicauca.facadeProxy.proxy.OrderServiceLogger;

/**
 *
 * @author Andres Rios
 */
public class Main {
    
    public static void main(String[] args) {        
        
        System.out.println("------------------SALIDA FACADE------------------");
        OrderFacade facade = new OrderFacade();        
        facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 Barrio Caldas", "3115677899", "Popayán"));        
        facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);        
        facade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);        
        facade.addDish(new Dish(3, "Jugo hit", 1000), 2);        
        System.out.println("Pedido creado");        
        facade.changeState(State.CONFIRMED);        
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());        
        facade.changeState(State.DISPACHED);        
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());        
        facade.changeState(State.FINALIZED);        
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());        
        System.out.println("El valor total del pedido es: " + facade.calculateTotal());        
        System.out.println("Total de platos pedidos: " + facade.totalDishes());        
        IOrderRepository repo = Factory.getInstance().getRepository("default");        
        facade.save(repo);        
        System.out.println("Pedido grabado con éxito en la base de datos");    
        
                     
        System.out.println("------------------SALIDA PROXY------------------");
        // PROXY MAIN
        //El sujeto real.
        OrderFacade orderFacade = new OrderFacade();
        //El objeto proxy. Se le pasa el objeto real por el constructor (inyección)
        IOrderService orderProxy = new OrderServiceLogger(orderFacade);
        //Se opera normal el sujeto real
        orderFacade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 BarrioCaldas", "3115677899", "Popayán"));
        orderFacade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        orderFacade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        orderFacade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        orderFacade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + orderFacade.calculateTotal());
        System.out.println("Total de platos pedidos: " + orderFacade.totalDishes());
        //Ahora ejecutamos el cliente proxy, y le pasamos el sujeto que debe utilizar.
        ProxyClient client = new ProxyClient(orderProxy);
        client.createOrder();    
        
    
    }
}
