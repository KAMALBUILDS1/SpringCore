package in.coderArmy.demoApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    private PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public String getType() {
        return paymentProperties.getType();
    }

    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }

    public boolean isEnabled() {
        return paymentProperties.isEnabled();
    }

    public int getTimeOut() {
        return paymentProperties.getTimeOut();
    }

    public void print() {
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnabled());
        System.out.println(getTimeOut());
    }
}
//we can do property injection also
//if application.properties doesn't have PaymentGateway then it will pick default value
//and if given than will pick given values
    /*@Value("${PaymentGateway.type:RazorPay}")
    private String type;

    @Value("${PaymentGateway.retry-count:5}")
    private int retryCount;*/

    /*public PaymentGateway(@Value("${PaymentGateway.type}") String type,
                          @Value("${PaymentGateway.retry-count}")int retryCount) {
        this.type = type;
        this.retryCount = retryCount;
    }*/

    /*public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getRetryCount() {
        return retryCount;
    }
    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }*/