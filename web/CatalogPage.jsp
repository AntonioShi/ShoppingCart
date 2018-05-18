        <%--
  Created by IntelliJ IDEA.
  User: antonio
  Date: 18-4-7
  Time: 下午4:33
  To change this template use File | Settings | File Templates.
--%>

        <%--商品显示页面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="com.example.model.Catalog, com.example.model.CatalogItem" %>

<html>
<head>
    <title>shooping cart</title>
</head>
<body bgcolor="#fef5e6">
    <%!
        //声明
        int i;//很重要
        private String heading = "文学";
        private String[] itemIDs = {"yupingbo", "nalanxingde"};
        private CatalogItem[] items = new CatalogItem[itemIDs.length];//迷你商店生成
    %>
    <h1 align="center"><%=heading%></h1>
    <%
        //脚本小程序
        String formore = response.encodeURL("OrderPage.jsp");//重要语句，为了在商品后面可以添加到购物车，所以调用orderPage文件

        for (i = 0; i < items.length; i++) {
            items[i] = Catalog.getItem(itemIDs[i]);//商品赋值
            //至此，商店算完成了

    %>
    <hr>

    <form action="<%=formore%>" method="post">
        <%--<%=formore%>是java表达式，<form action="<%=formore%>"></form>这是表达式的嵌套哦--%>
<%--对于商店里面的i变量还是有点小问题的--%>
        <input type="hidden" name="itemID" value="<%=items[i].getItemID()%>">
        <h2><%=items[i].getShortDescription()%> (￥<%=items[i].getCost()%>)</h2>
            <%--($ <%=items[i].getCost()%>)不知道哦--%>
        <p><%=items[i].getLongDescription()%></p>
        <p align="center">
            <input type="submit" value="添加到购物车">
        </p>
    </form>
        <%
            }
        %>
</body>
</html>
