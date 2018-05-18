<%@ page import="com.example.model.ShoppingCart" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.NumberFormat" %>
<%@ page import="com.example.model.OrderItem" %><%--
  Created by IntelliJ IDEA.
  User: antonio
  Date: 18-4-8
  Time: 下午9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>模拟检查结算界面</title>
</head>
<body bgcolor="#fef5e6">
    <h1 align="center">结算</h1>
    <%
        ShoppingCart cart = (ShoppingCart)session.getAttribute("shoppingCart") ;//要和之前的对应起来
        if (cart != null){
            ArrayList Ordereditem = cart.getOrderedItems();//
            NumberFormat formatter = NumberFormat.getCurrencyInstance() ;
            double sum = 0 ;
            OrderItem order ;
            for (int i = 0; i < Ordereditem.size(); i++){
                order = (OrderItem) Ordereditem.get(i) ;
                sum += order.getTotalCost() ;
            }
            out.print("总金额: " + formatter.format(sum));
        }
    %>

</body>
</html>
