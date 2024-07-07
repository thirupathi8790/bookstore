import java.util.ArrayList;
import java.util.List;

public class OrderService {
  private List<Order> orders = new ArrayList<>();

  public List<Order> getOrders() {
    return orders;
  }

  public Order createOrder(Order order) {
    orders.add(order);
    return order;
  }

  public Order getOrderById(int id) {
    // implementation
  }

  public void updateOrder(int id, Order order) {
    // implementation
  }

  public void deleteOrder(int id) {
    // implementation
  }
}
