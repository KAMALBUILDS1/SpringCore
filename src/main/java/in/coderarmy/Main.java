package in.coderarmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

        CartService cs = new CartService();
        cs.addToCart();

        User user = context.getBean(User.class);
        System.out.println(user.getName());

        CartService cart = context.getBean(CartService.class);
        cart.addToCart();
    }
}

/*
steps for ApplicationContext (IOC container) :-
step 1 :- Spring start the Application
step 2 :- Spring reads AppConfig.java
step 3 :- Spring processes @ComponentScan.
step 4 :- Spring finds @Component classes
step 5 :- Spring creates Bean defination

Bean defination :-
Bean name
Bean class
bean dependency
bean scope

step 6 :- spring starts creating objects
step 7 :- our application uses these beans
*/