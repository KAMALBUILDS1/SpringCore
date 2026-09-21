package in.coderArmy.demoApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner/*ApplicationRunner*/ {

    private PaymentGateway paymentGateway;

    public DemoRunner(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void run(String... args) throws Exception {
        paymentGateway.print();
    }
}
