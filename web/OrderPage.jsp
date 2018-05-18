<%--
  Created by IntelliJ IDEA.
  User: antonio
  Date: 18-4-8
  Time: 上午10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="com.example.model.ShoppingCart, com.example.model.OrderItem" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.NumberFormat" %>
<html>
<head>
    <title>订单状态页面->这里显示的是在点击添加到购物车后的显示的页面</title>
</head>
<body bgcolor="#fef5e6">
    <%
        ShoppingCart cart = (ShoppingCart) session.getAttribute("shoppingCart") ;
        if (cart == null){
            cart = new ShoppingCart() ;
            session.setAttribute("shoppingCart", cart);
        }
        String itemID = request.getParameter("itemID") ;
        if (itemID != null)
            cart.addItem(itemID);
    %>

    <h1 align="center">订单状态</h1>

    <%
        ArrayList Ordereditem = cart.getOrderedItems() ;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(); //？？？
        out.print("<table align='center' cellspacing='0' cellpadding='4' width='600' border='1'>");
        out.print("<tr>" +
                    "<td>商品编号</td>" +
                    "<td>名称</td>" +
                    "<td>单价</td>" +
                    "<td>数量</td>" +
                    "<td>总额</td>" +
                "</tr>");
        OrderItem order ;
        for (int i =0; i < Ordereditem.size(); i++){
            order = (OrderItem) Ordereditem.get(i) ;//商品在数组里面的编号i
            out.print("<tr>\n<td>" + order.getItemID() + "</td>");//编号
            out.print("<td>" + order.getShortDescription() + "</td>");//简介
            out.print("<td>" + formatter.format(order.getUnitCost()) + "</td>");//单价
            out.print("<td>" + order.getCount() + "</td>");//数量
            out.print("<td>" + formatter.format(order.getTotalCost()) + "</td>");//总价
            out.print("</tr>");//数量
        }

        out.print("</table><br>");
        String checkoutURL = response.encodeURL("checkout.jsp") ;//
        out.print("<center>");
        out.print("<form action=\""+ checkoutURL + "\">");//这里应该是一个链接，点击后进入结算页面checkout.jsp页面
        out.print("<input type=\"submit\" value=\"结算\">");
        out.print("</form>");
        out.print("</center>");
    %>
</body>
</html>

<%--session对象主要用于属性操作和会话管理，常用方法如下：--%>
<%--1、public void setAttribute(String name,String value)设定指定名字的属性的值，并将它添加到session会话范围内，如果这个属性是会话范围内存在，则更改该属性的值。--%>
<%--2、public Object getAttribute(String name)在会话范围内获取指定名字的属性的值，返回值类型为object，如果该属性不存在，则返回null。--%>
<%--3、public void removeAttribute(String name)，删除指定名字的session属性，若该属性不存在，则出现异常。--%>
<%--4、public void invalidate（），使session失效。可以立即使当前会话失效，原来会话中存储的所有对象都不能再被访问。--%>
<%--5、public String getId( )，获取当前的会话ID。每个会话在服务器端都存在一个唯一的标示sessionID，session对象发送到浏览器的唯一数据就是sessionID，它一般存储在cookie中。--%>
<%--6、public void setMaxInactiveInterval(int interval) 设置会话的最大持续时间，单位是秒，负数表明会话永不失效。--%>
<%--7、public int getMaxInActiveInterval（）,获取会话的最大持续时间，使用时候需要一些处理--%>