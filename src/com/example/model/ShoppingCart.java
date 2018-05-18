package com.example.model;

import java.util.ArrayList;
//购物车类利用arraylist集合保存订单对象
public class ShoppingCart {
    private ArrayList OrderedItems;

    public ShoppingCart() {
        OrderedItems = new ArrayList() ;//初始化购物车
    }

    public ArrayList getOrderedItems() {
        return OrderedItems;
    }

    //同步锁：下单的操作：为什么下单的这个方法不在OrderItem里面而在购物车的里面呢？
    //因为，在实际网购中，我们发现一般在购物车的里面会有一个按钮叫：添加商品（下单）
    //当然，这个下单的操作也可以放在每一个商品的展示后面
    public synchronized void addItem(String itemID){//添加订单方法，参数为商品编号
        OrderItem order;//分离目标商品
        for (int i = 0; i < OrderedItems.size(); i++){//遍历购物车，从中找找看看有没有同类型的商品，有，num+1.没有，包含进数组
            order = (OrderItem) OrderedItems.get(i) ;//
            if (order.getItemID().equals(itemID)){//是否已存在同类型商品
                order.incrementCount();//+1
                return;
            }
        }

        //如果在购物车里面没有存在要添加的商品，添加到集合里面去。
        OrderItem newOrder = new OrderItem(Catalog.getItem(itemID)) ;//下单
        OrderedItems.add(newOrder) ;//假如购物车，下单完成

    }

}