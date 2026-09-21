package in.coderarmy;

import in.coderarmy.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    //@Autowired
    private final PaymentService paymentService;

    //constructor injection
    //if the class have only one constructor then @Autowired annotation is not required , spring will make it by default
    //@Autowired
    public OrderService (@Qualifier("cp") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}

//why constructor injection is recommended ?
//->Dependency get wired at the time of object creation.
//->final can be used
//->Easy to test the class

//setter injection
    /*@Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }*/