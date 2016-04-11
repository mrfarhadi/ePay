package epay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.base.rest.PayPalRESTException;

import epay.client.PaypalClient;
import epay.domain.User;

@Service
public class PurchaseService {

  @Autowired
  private PaypalClient paypalClient;

  public String purchaseItems(User user, String amount) throws PayPalRESTException {
    return paypalClient.makePayment(user, amount);
  }

}
