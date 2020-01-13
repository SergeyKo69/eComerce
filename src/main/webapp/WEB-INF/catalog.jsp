<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>eCommerce - Каталог товаров</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='//fonts.googleapis.com/css?family=PT+Sans:400,700,400italic,700italic%7CPT+Gudea:400,700,400italic%7CPT+Oswald:400,700,300'
          rel='stylesheet' id="googlefont">

    <link rel="stylesheet" type="text/css" href="<c:url value="/css/bootstrap.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/font-awesome.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/revslider.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/responsive.css"/>">

    <style id="custom-style">

    </style>
</head>
<body>
<div id="wrapper">
    <%@include file="jspf/header.jspf" %>
    <section id="content">
        <div id="category-header">
            <div class="row">
                <div class="container">
                    <div class="col-2">
                        <div class="category-image">
                            <img src="<%=request.getContextPath()%>/images/products/cellular.png" alt="Телефоны"
                                 class="img-responsive">
                        </div><!-- End .category-image -->

                    </div><!-- End .col-2 -->

                    <div class="col-2 last">
                        <div class="category-title">
                            <h2>Мобильные телефоны</h2>
                            <p>В данном разделе представлены мобильные телефоны</p>
                        </div><!-- End .category-title -->
                    </div><!-- End .col-2 -->
                </div><!-- End .container -->
            </div><!-- End .row -->
        </div><!-- End #category-header -->
        <div class="container">
            <div class="row">
                <div class="col-md-12">

                    <div class="row">

                        <div class="col-md-9 col-sm-8 col-xs-12 main-content">

                            <div class="md-margin"></div><!-- .space -->
                            <div class="category-item-container category-list-container">

                                <%--                                <jsp:useBean id="productListMobile" class="ru.kogut.view.ProductView" scope="request"/>--%>
                                <c:forEach items="${products}" var="product">
                                    <div class="item item-list clearfix">
                                        <div class="item-image-container">
                                            <figure>
                                                <c:url value="/catalog/product" var="showProduct">
                                                    <c:param name="productId" value="${product.id}"/>
                                                </c:url>
                                                <a href="${showProduct}">
                                                    <img src="<%=request.getContextPath()%>/${product.pathTitlePicture}"
                                                         alt="${product.title}" class="item-image">
                                                    <img src="<%=request.getContextPath()%>/${product.pathTitlePicture}"
                                                         alt="${product.title}" class="item-image-hover">
                                                </a>
                                            </figure>
                                            <div class="item-price-container">
                                                <span class="item-price">${product.price}&#8381;</span>
                                            </div>
                                        </div><!-- End .item-image -->
                                        <div class="item-meta-container">
                                            <h3 class="item-name"><a href="${showProduct}">${product.title}</a></h3>
                                            <p>${product.shortDescription}...</p>
                                            <div class="item-action">
                                                <c:url value="/basket/add" var="addProduct">
                                                    <c:param name="productId" value="${product.id}"/>
                                                    <c:param name="urlRedirect" value="${requestScope['javax.servlet.forward.request_uri']}"/>
                                                </c:url>
                                                <form method="POST" action="${addProduct}">
                                                    <button type="submit" title="Добавить в корзину" value="Добавить в корзину"
                                                            class="item-add-btn item-add-btn">
                                                        <span class="icon-cart-text">Добавить в корзину</span>
                                                    </button>
                                                 </form>
                                            </div><!-- End .item-action -->
                                        </div><!-- End .item-meta-container -->
                                    </div>
                                    <!-- End .item -->
                                </c:forEach>
                            </div><!-- End .category-item-container -->

                        </div><!-- End .col-md-9 -->

                    </div><!-- End .row -->

                </div><!-- End .col-md-12 -->
            </div><!-- End .row -->
        </div><!-- End .container -->

    </section><!-- End #content -->
    <%@include file="jspf/footer.jspf" %>
</div>
</body>
</html>
