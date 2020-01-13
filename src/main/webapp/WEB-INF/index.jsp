<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>eCommerce - Главная</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='//fonts.googleapis.com/css?family=PT+Sans:400,700,400italic,700italic%7CPT+Gudea:400,700,400italic%7CPT+Oswald:400,700,300'
          rel='stylesheet' id="googlefont">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/revslider.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/responsive.css">

    <style id="custom-style">

    </style>
</head>
<body>
<div id="wrapper">
    
    <%@include file="jspf/header.jspf"%>
    
    <section id="content">
        <div class="row">
            <div class="col-md-6 col-sm-6 col-xs-12">
                <header class="content-title">
                    <h2 class="title">Главная</h2>
                </header>
            </div><!-- End .col-md-6 -->
            <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="sm-margin visible-xs"></div><!-- space -->
                <img src="<%=request.getContextPath()%>/images/showcase.png" class="img-responsive" alt="e-Commerce">
            </div><!-- End .col-md-5 -->
        </div><!-- End .row -->
    </section>

    <%@include file="jspf/footer.jspf"%>

</div>
</body>
</html>

