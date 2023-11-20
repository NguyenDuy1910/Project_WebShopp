package service;

import dtos.OrderDTO;
import models.Order;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
}
