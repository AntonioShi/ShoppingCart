package com.example.model;
//订单类
//订单类包括了在将商品放入购物车时所应包含的信息，种类和数量
//订单类通过商品类提供了获取商品的信息（编号，描述，单价），还有购买数量增加和求总金额的方法

public class OrderItem {
    private CatalogItem item ;//商品
    private int count ;//购买数量

    public OrderItem(CatalogItem item) {
        this.item = item;
        count = 1 ;
    }

    public CatalogItem getItem() {
        return item;
    }

    public void setItem(CatalogItem item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getItemID(){
        return getItem().getItemID() ;//编号
    }

    public String getShortDescription(){
        return getItem().getShortDescription() ;//简短描述
    }

    public String getLongDescription(){
        return getItem().getLongDescription() ;//详细描述
    }

    public double getUnitCost(){
        return getItem().getCost() ;//得到该商品的价格
    }

    public void incrementCount(){
        this.count++ ;//购买数量+1
    }

    public double getTotalCost(){
        return this.count * getUnitCost() ;//计算总金额
    }
}
