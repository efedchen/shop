package com.onlineShop.main.java.dao;

import com.onlineShop.main.java.model.CartInfo;
import com.onlineShop.main.java.model.OrderDetailInfo;
import com.onlineShop.main.java.model.OrderInfo;
import com.onlineShop.main.java.model.PaginationResult;

import java.util.List;

public interface OrderDAO {
    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
