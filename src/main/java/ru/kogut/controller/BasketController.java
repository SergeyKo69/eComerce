package ru.kogut.controller;

import ru.kogut.model.dto.BasketDTO;
import ru.kogut.model.dto.ProductDTO;
import ru.kogut.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

/**
 * @author S.Kogut on 09.01.2020
 */

@WebServlet(name = "BasketController", urlPatterns = {"/basket/show","/basket/add","/basket/delete","/basket/buy"})
public class BasketController extends HttpServlet {

    private ProductService productService;

    @Override
    public void init() throws ServletException {
        this.productService = (ProductService) getServletContext().getAttribute("productService");

        if (productService == null) {
            throw new ServletException("ProductService not available");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        try {
            if (req.getServletPath().equals("/basket/show")) {
                getServletContext().getRequestDispatcher("/WEB-INF/basket.jsp").forward(req, resp);
            } else if (req.getServletPath().equals("/basket/buy")) {
                BasketDTO basket = (BasketDTO) req.getSession().getAttribute("basket");
                if (basket != null) {
                    basket.getProductList().clear();
                    basket.setTotal(BigDecimal.ZERO);
                }
                getServletContext().getRequestDispatcher("/WEB-INF/order.jsp").forward(req, resp);
            } else {
                resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            }
        } catch (Exception e) {
            throw new ServletException();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        try {
            if (req.getServletPath().equals("/basket/add")) {
                String productId = req.getParameter("productId");
                ProductDTO product = productService.findById(productId);
                String urlRedirect = req.getParameter("urlRedirect");
                BasketDTO basket = (BasketDTO) req.getSession().getAttribute("basket");
                if (product == null || basket == null) {
                    resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
                } else {
                    addProductBasket(product, basket);
                }
                if (urlRedirect.contains("/catalog/product")) {
                    urlRedirect+= "?productId=" + productId;
                }
                resp.sendRedirect(urlRedirect);
            } else if (req.getServletPath().equals("/basket/delete")) {
                String urlRedirect = req.getParameter("urlRedirect");
                String productId = req.getParameter("productId");
                ProductDTO product = productService.findById(productId);
                BasketDTO basket = (BasketDTO) req.getSession().getAttribute("basket");
                if (product == null || basket == null) {
                    resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
                } else {
                    deleteProduct(product, basket);
                }
                if (urlRedirect.contains("/catalog/product")) {
                    urlRedirect+= "?productId=" + productId;
                }
                resp.sendRedirect(urlRedirect);
            } else {
                resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            }
        } catch (Exception e) {
            throw new ServletException();
        }
    }

    private void addProductBasket(ProductDTO product, BasketDTO basket) {
        basket.getProductList().add(product);
        recountTotal(basket);
    }

    public void recountTotal(BasketDTO basket) {
        basket.setTotal(BigDecimal.ZERO);
        basket.getProductList().forEach(p-> basket.setTotal(basket.getTotal()
                .add(new BigDecimal(p.getPrice().replaceAll("\u00A0","")))));
    }

    public void deleteProduct(ProductDTO product, BasketDTO basket) {
        basket.getProductList().remove(product);
        recountTotal(basket);
    }
}
