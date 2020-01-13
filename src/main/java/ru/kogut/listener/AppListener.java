package ru.kogut.listener;

import ru.kogut.model.dao.ProductDAO;
import ru.kogut.service.ProductService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author S.Kogut on 09.01.2020
 */

@WebListener
public class AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        ctx.setAttribute("productService", new ProductService(productDTOList()));
    }

    //Статический список продуктов.
    public List<ProductDAO> productDTOList() {
        List<ProductDAO> productList = new ArrayList<>();
        //1.
        ProductDAO product1 = new ProductDAO();
        product1.setId(UUID.randomUUID().toString());
        product1.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон с Android 9.0</li>" +
                "<li>экран 6.4\", разрешение 2340x1080</li>" +
                "<li>память 64 Гб, слот для карты памяти</li>" +
                "</ul>");
        product1.setTitle("Смартфон Galaxy A50 64GB");
        product1.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон с Android 9.0</li>" +
                "<li>поддержка двух SIM-карт</li>" +
                "<li>экран 6.4\", разрешение 2340x1080</li>" +
                "<li>три камеры 25 МП/8 МП/5 МП, автофокус</li>" +
                "<li>память 64 Гб, слот для карты памяти</li>" +
                "<li>3G, 4G LTE, LTE-A, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>объем оперативной памяти 4 Гб</li>" +
                "<li>аккумулятор 4000 мА⋅ч</li>" +
                "<li>вес 166 г, ШxВxТ 74.70x158.50x7.70 мм</li>" +
                "</ul>");
        product1.setPathTitlePicture("images/mobile/galaxyA50.jpg");
        product1.setPrice(new BigDecimal(15890));
        productList.add(product1);

        ProductDAO product2 = new ProductDAO();
        product2.setId(UUID.randomUUID().toString());
        product2.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон с iOS 11</li>" +
                "<li>экран 4.7\", разрешение 1334x750</li>" +
                "<li>память 64 Гб, без слота для карт памяти</li>" +
                "</ul>");
        product2.setTitle("Смартфон Apple iPhone 8 64GB");
        product2.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон с iOS 11</li>" +
                "<li>экран 4.7\", разрешение 1334x750</li>" +
                "<li>камера 12 МП, автофокус</li>" +
                "<li>память 64 Гб, без слота для карт памяти</li>" +
                "<li>3G, 4G LTE, LTE-A, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>вес 148 г, ШxВxТ 67.30x138.40x7.30 мм</li>" +
                "</ul>");
        product2.setPathTitlePicture("images/mobile/iPhone8.jpg");
        product2.setPrice(new BigDecimal(31750));
        productList.add(product2);

        ProductDAO product3 = new ProductDAO();
        product3.setId(UUID.randomUUID().toString());
        product3.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон с iOS 13</li>" +
                "<li>экран 5.8\", разрешение 2436x1125</li>" +
                "<li>память 64 Гб, без слота для карт памяти</li>" +
                "</ul>");
        product3.setTitle("Смартфон Apple iPhone 11 Pro 64GB");
        product3.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон с iOS 13</li>" +
                "<li>экран 5.8\", разрешение 2436x1125</li>" +
                "<li>три камеры 12 МП/12 МП/12 МП, автофокус</li>" +
                "<li>память 64 Гб, без слота для карт памяти</li>" +
                "<li>3G, 4G LTE, LTE-A, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>вес 188 г, ШxВxТ 71.40x144x8.10 мм</li>" +
                "</ul>");
        product3.setPathTitlePicture("images/mobile/iPhone11.jpg");
        product3.setPrice(new BigDecimal(72900));
        productList.add(product3);

        ProductDAO product4 = new ProductDAO();
        product4.setId(UUID.randomUUID().toString());
        product4.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон с iOS 12</li>" +
                "<li>экран 6.1\", разрешение 1792x828</li>" +
                "<li>память 64 Гб, без слота для карт памяти</li>" +
                "</ul>");
        product4.setTitle("Смартфон Apple iPhone Xr 64GB");
        product4.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон с iOS 12</li>" +
                "<li>поддержка двух SIM-карт (nano SIM+eSIM)</li>" +
                "<li>экран 6.1\", разрешение 1792x828</li>" +
                "<li>камера 12 МП, автофокус</li>" +
                "<li>объем оперативной памяти 3 Гб</li>" +
                "<li>память 64 Гб, без слота для карт памяти</li>" +
                "<li>3G, 4G LTE, LTE-A, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>вес 194 г, ШxВxТ 75.70x150.90x8.30 мм</li>" +
                "</ul>");
        product4.setPathTitlePicture("images/mobile/iPhoneXr.jpg");
        product4.setPrice(new BigDecimal(42050));
        productList.add(product4);

        ProductDAO product5 = new ProductDAO();
        product5.setId(UUID.randomUUID().toString());
        product5.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон с iOS 12</li>" +
                "<li>экран 5.8\", разрешение 2436x1125</li>" +
                "<li>память 64 Гб, без слота для карт памяти</li>" +
                "</ul>");
        product5.setTitle("Смартфон Apple iPhone Xs 64GB");
        product5.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон с iOS 12</li>" +
                "<li>поддержка двух SIM-карт (nano SIM+eSIM)</li>" +
                "<li>экран 5.8\", разрешение 2436x1125</li>" +
                "<li>двойная камера 12 МП/12 МП, автофокус</li>" +
                "<li>объем оперативной памяти 4 Гб</li>" +
                "<li>память 64 Гб, без слота для карт памяти</li>" +
                "<li>3G, 4G LTE, LTE-A, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>вес 177 г, ШxВxТ 70.90x143.60x7.70 мм</li>" +
                "</ul>");
        product5.setPathTitlePicture("images/mobile/iPhoneXs.jpg");
        product5.setPrice(new BigDecimal(47780));
        productList.add(product5);

        ProductDAO product6 = new ProductDAO();
        product6.setId(UUID.randomUUID().toString());
        product6.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>экран 6.39\", разрешение 2340x1080</li>" +
                "<li>память 128 Гб, слот для карты памяти</li>" +
                "</ul>");
        product6.setTitle("Смартфон Xiaomi Mi 9 Lite 6/128GB");
        product6.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>поддержка двух SIM-карт</li>" +
                "<li>экран 6.39\", разрешение 2340x1080</li>" +
                "<li>три камеры 48 МП/8 МП/2 МП, автофокус</li>" +
                "<li>объем оперативной памяти 6 Гб</li>" +
                "<li>память 128 Гб, слот для карты памяти</li>" +
                "<li>аккумулятор 4030 мА⋅ч</li>" +
                "<li>3G, 4G LTE, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>вес 179 г, ШxВxТ 74.50x156.80x8.67 мм</li>" +
                "</ul>");
        product6.setPathTitlePicture("images/mobile/mi9Lite6.jpg");
        product6.setPrice(new BigDecimal(19990));
        productList.add(product6);

        ProductDAO product7 = new ProductDAO();
        product7.setId(UUID.randomUUID().toString());
        product7.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>экран 6.09\", разрешение 1560x720</li>" +
                "<li>память 64 Гб, слот для карты памяти</li>" +
                "</ul>");
        product7.setTitle("Смартфон Xiaomi Mi A3 4/64GB Android One");
        product7.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>поддержка двух SIM-карт</li>" +
                "<li>экран 6.09\", разрешение 1560x720</li>" +
                "<li>три камеры 48 МП/8 МП/2 МП, автофокус</li>" +
                "<li>объем оперативной памяти 4 Гб</li>" +
                "<li>память 64 Гб, слот для карты памяти</li>" +
                "<li>аккумулятор 4030 мА⋅ч</li>" +
                "<li>3G, 4G LTE, Wi-Fi, Bluetooth, GPS, ГЛОНАСС</li>" +
                "<li>вес 174 г, ШxВxТ 71.85x153.48x8.48 мм</li>" +
                "</ul>");
        product7.setPathTitlePicture("images/mobile/miA34.jpg");
        product7.setPrice(new BigDecimal(15990));
        productList.add(product7);

        ProductDAO product8 = new ProductDAO();
        product8.setId(UUID.randomUUID().toString());
        product8.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>экран 6.47\", разрешение 2340x1080</li>" +
                "<li>память 128 Гб, без слота для карт памяти</li>" +
                "</ul>");
        product8.setTitle("Смартфон Xiaomi Mi Note 10 6/128GB");
        product8.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>поддержка двух SIM-карт</li>" +
                "<li>экран 6.47\", разрешение 2340x1080</li>" +
                "<li>пять камер 108 МП/12 МП/20 МП/5 МП, автофокус</li>" +
                "<li>объем оперативной памяти 6 Гб</li>" +
                "<li>память 128 Гб, без слота для карт памяти</li>" +
                "<li>аккумулятор 5260 мА⋅ч</li>" +
                "<li>3G, 4G LTE, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>вес 208 г, ШxВxТ 74.20x157.80x9.67 мм</li>" +
                "</ul>");
        product8.setPathTitlePicture("images/mobile/miNote10.png");
        product8.setPrice(new BigDecimal(36990));
        productList.add(product8);

        ProductDAO product9 = new ProductDAO();
        product9.setId(UUID.randomUUID().toString());
        product9.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>экран 6.53\", разрешение 2340x1080</li>" +
                "<li>память 64 Гб, слот для карты памяти</li>" +
                "</ul>");
        product9.setTitle("Смартфон Xiaomi Redmi Note 8 Pro 6/64GB");
        product9.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>поддержка двух SIM-карт</li>" +
                "<li>экран 6.53\", разрешение 2340x1080</li>" +
                "<li>четыре камеры 64 МП/8 МП/2 МП/2 МП, автофокус</li>" +
                "<li>объем оперативной памяти 6 Гб</li>" +
                "<li>память 64 Гб, слот для карты памяти</li>" +
                "<li>аккумулятор 4500 мА⋅ч</li>" +
                "<li>3G, 4G LTE, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>вес 200 г, ШxВxТ 76.40x161.35x8.79 мм</li>" +
                "</ul>");
        product9.setPathTitlePicture("images/mobile/redmi8.png");
        product9.setPrice(new BigDecimal(17990));
        productList.add(product9);

        ProductDAO product10 = new ProductDAO();
        product10.setId(UUID.randomUUID().toString());
        product10.setShortDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>экран 6.3\", разрешение 2340x1080</li>" +
                "<li>память 64 Гб, слот для карты памяти</li>" +
                "</ul>");
        product10.setTitle("Смартфон Xiaomi Redmi Note 8T 4/64GB");
        product10.setFullDescription("<ul type=\"disc\">" +
                "<li>смартфон на платформе Android</li>" +
                "<li>поддержка двух SIM-карт</li>" +
                "<li>экран 6.3\", разрешение 2340x1080</li>" +
                "<li>четыре камеры 48 МП/8 МП/2 МП/2 МП, автофокус</li>" +
                "<li>объем оперативной памяти 4 Гб</li>" +
                "<li>память 64 Гб, слот для карты памяти</li>" +
                "<li>аккумулятор 4000 мА⋅ч</li>" +
                "<li>33G, 4G LTE, Wi-Fi, Bluetooth, NFC, GPS, ГЛОНАСС</li>" +
                "<li>вес 200 г, ШxВxТ 75.40x161.15x8.60 мм</li>" +
                "</ul>");
        product10.setPathTitlePicture("images/mobile/redmiNote.jpg");
        product10.setPrice(new BigDecimal(17990));
        productList.add(product10);
        return productList;
    }
}
