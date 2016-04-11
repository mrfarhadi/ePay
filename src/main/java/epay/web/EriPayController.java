package epay.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.base.rest.PayPalRESTException;

import epay.domain.Item;
import epay.domain.Purchase;
import epay.service.ItemService;
import epay.service.PriceService;

@RestController
public class EriPayController {

  public static final String FRONTEND_ENDPOINT = "http://localhost:3000";

  @Autowired
  private ItemService itemService;

  @Autowired
  private PriceService priceService;

  @CrossOrigin(origins = FRONTEND_ENDPOINT)
  @RequestMapping(value = "/items", method = RequestMethod.GET)
  public List<Item> getItems() {
    return itemService.getItems();
  }

  @CrossOrigin(origins = FRONTEND_ENDPOINT)
  @RequestMapping(value = "/price", method = RequestMethod.POST)
  public String postPurchase(@RequestBody final Purchase purchase) throws PayPalRESTException {
    return priceService.postPur(purchase);
  }

}
