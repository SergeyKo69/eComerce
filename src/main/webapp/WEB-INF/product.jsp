<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>eCommerce - Товар</title>

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
    <%@include file="jspf/header.jspf"%>
    <br>
    <section id="content">
        <div class="container">
            <div class="row">
                <div class="col-md-12">

                    <div class="row">

                        <div class="col-md-6 col-sm-12 col-xs-12 product-viewer clearfix">
                            <div id="product-image-container">
                                <figure><img src="<%=request.getContextPath()%>/${product.pathTitlePicture}" data-zoom-image="<%=request.getContextPath()%>/${product.pathTitlePicture}"
                                             id="product-image">
                                    <figcaption class="item-price-container">
                                        <span class="item-price">${product.price}&#8381;</span>
                                    </figcaption>
                                </figure>
                            </div><!-- product-image-container -->
                        </div><!-- End .col-md-6 -->

                        <div class="col-md-6 col-sm-12 col-xs-12 product">
                            <div class="lg-margin visible-sm visible-xs"></div><!-- Space -->
                            <h1 class="product-name">${product.title}</h1>
                            <ul class="product-list">
                                <li><span>Доступность:</span>На складе</li>
                            </ul>
                            <hr>
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
                            <div class="md-margin"></div><!-- Space -->
                        </div><!-- End .col-md-6 -->


                    </div><!-- End .row -->

                    <div class="lg-margin2x"></div><!-- End .space -->

                    <div class="row">
                        <div class="col-md-9 col-sm-12 col-xs-12">

                            <div class="tab-container left product-detail-tab clearfix">
                                <ul class="nav-tabs">
                                    <li class="active"><a href="#description" data-toggle="tab">Описание</a></li>
                                </ul>
                                <div class="tab-content clearfix">
                                    <div class="tab-pane active" id="description">
                                        <p>Харатеристики:</p>
                                        <ul class="product-details-list">
                                            ${product.fullDescription}
                                        </ul>
                                    </div><!-- End .tab-pane -->
                               </div><!-- End .tab-content -->
                            </div><!-- End .tab-container -->
                            <div class="lg-margin visible-xs"></div>
                        </div><!-- End .col-md-9 -->
                        <div class="lg-margin2x visible-sm visible-xs"></div><!-- Space -->
                    </div><!-- End .row -->
                    <div class="lg-margin2x"></div><!-- Space -->
                </div><!-- End .col-md-12 -->
            </div><!-- End .row -->
        </div><!-- End .container -->

    </section><!-- End #content -->

    <%@include file="jspf/footer.jspf"%>
</div>
</body>
</html>
