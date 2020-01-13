<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>eCommerce - Корзина</title>
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
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <header class="content-title">
                        <h1 class="title">Корзина</h1>
                        <p class="title-desc">Необходимо подтвердить покупку</p>
                    </header>
                    <div class="xs-margin"></div><!-- space -->
                    <div class="row">

                        <div class="col-md-12 table-responsive">

                            <table class="table cart-table">
                                <thead>
                                <tr>
                                    <th class="table-title">Наименование</th>
                                    <th class="table-title">Цена</th>
                                    <th class="table-title">Количество</th>
                                    <th class="table-title">Сумма</th>
                                    <th class="table-title"></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="position" items="${basket.productList}">
                                    <tr>
                                        <td class="item-name-col">
                                            <figure>
                                                <a href="#"><img
                                                        src="<%=request.getContextPath()%>/${position.pathTitlePicture}"
                                                        alt="${position.title}"></a>
                                            </figure>
                                            <c:url value="/catalog/product" var="showProduct">
                                                <c:param name="productId" value="${position.id}"/>
                                            </c:url>
                                            <header class="item-name"><a href="${showProduct}">${position.title}</a>
                                            </header>
                                        </td>
                                        <td class="item-price-col"><span class="item-price-special">${position.price}&#8381;</span>
                                        </td>
                                        <td>
                                            <div class="custom-quantity-input">
                                                <label>
                                                    <input type="text" name="quantity" value="1">
                                                </label>
                                                <a href="#" onclick="return false;"
                                                   class="quantity-btn quantity-input-up"><i class="fa fa-angle-up"></i></a>
                                                <a href="#" onclick="return false;"
                                                   class="quantity-btn quantity-input-down"><i
                                                        class="fa fa-angle-down"></i></a>
                                            </div>
                                        </td>
                                        <td class="item-total-col"><span class="item-price-special">${position.price}&#8381;</span>
                                                <%--                                            <a href="#" class="close-button"></a>--%>
                                        </td>
                                        <td class="item-total-col">
                                            <c:url value="/basket/delete" var="deleteProduct">
                                                <c:param name="productId" value="${position.id}"/>
                                                <c:param name="urlRedirect"
                                                         value="${requestScope['javax.servlet.forward.request_uri']}"/>
                                            </c:url>
                                            <form method="POST" action="${deleteProduct}">
                                                <button type="submit" title="Удалить позицию" value="Удалить позицию"
                                                        class="close-button">
                                                    <i class="fa fa-times"></i>
                                                </button>
                                            </form>
                                        </td>
                                    </tr>
                                </c:forEach>

                                </tbody>
                            </table>

                        </div><!-- End .col-md-12 -->

                    </div><!-- End .row -->
                    <div class="lg-margin"></div><!-- End .space -->

                    <div class="row">

                        <div class="col-md-4 col-sm-12 col-xs-12">

                            <table class="table total-table">
                                <tbody>
                                <tr>
                                    <td class="total-table-title">Итог:</td>
                                    <td>${basket.total}&#8381;</td>
                                </tr>
                                <tr>
                                    <td class="total-table-title">Доставка:</td>
                                    <td>0.00&#8381;</td>
                                </tr>
                                </tbody>
                                <tfoot>
                                <tr>
                                    <td>Всего:</td>
                                    <td>${basket.total}&#8381;</td>
                                </tr>
                                </tfoot>
                            </table>
                            <div class="md-margin"></div><!-- End .space -->
                            <c:url var="continue" value="/catalog/all"/>
                            <c:url var="buy" value="/basket/buy"/>
                             <a href="${continue}" class="btn btn-custom-2">Продолжить покупки</a>
                            <a href="${buy}" class="btn btn-custom">Купить</a>
                        </div><!-- End .col-md-4 -->
                    </div><!-- End .row -->
                    <div class="md-margin2x"></div><!-- Space -->

                </div><!-- End .col-md-12 -->
            </div><!-- End .row -->
        </div><!-- End .container -->

    </section><!-- End #content -->
    <%@include file="jspf/footer.jspf" %>
</div><!-- End #wrapper -->
</body>
</html>
