package com.example.model;
//1、展示商品：商品（java类表示商品，数组表示商品集合），
// 将商品保存在servlet的配置中，
// 然后在servlet的init方法中去读取到数组（可以保存在servletContext中间，也可保存成servlet的一个属性）。
// 展示商品的功能放在一个servlet（循环遍历商品数组，out出来），
// 每一个商品后面加一个超链接（功能是将该商品添加到购物车，
// 超链接网址上要用查询字符串的方式加上商品信息（商品名称））
//2、将商品放入购物车：用户点击超链接后，访问servlet，
// 在购物车中添加信息（购物车也用一个java类表示，它有一个属性是：
// 购买的商品的数组（商品名，购买数量），有一个添加商品的方法）。
//3、展示购物车（把购物车对象的数据out一下）


////这里则是你进入商店后，真正想要购买的商品的详细信息
public class CatalogItem {

    public CatalogItem(String itemID, String shortDescription, String longDescription, double cost) {
        this.itemID = itemID;//编号
        this.shortDescription = shortDescription;//简介
        this.longDescription = longDescription;//详解
        this.cost = cost;//单价
    }

    private String itemID ;
    private String shortDescription ;
    private String longDescription ;
    private double cost ;

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

//感觉不需要设置set的方法，因为在我们的商店中，一切都已经是定值，我们只需要能够得到并展示给消费者即可。

}
