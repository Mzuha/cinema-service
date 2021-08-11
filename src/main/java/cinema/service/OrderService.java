package cinema.service;

import cinema.model.Order;
import cinema.model.ShoppingCart;
import cinema.model.User;
import java.util.List;

public interface OrderService {
    Order completeOder(ShoppingCart shoppingCart);

    List<Order> getByUser(User user);
}
