package ru.kogut.controller;

import ru.kogut.model.dto.ProductDTO;
import ru.kogut.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author S.Kogut on 09.01.2020
 */

@WebServlet(name = "ProductController", urlPatterns = {"/catalog/all","/catalog/product"})
public class ProductController extends HttpServlet {

    private ProductService productService;

    @Override
    public void init() throws ServletException {
        this.productService = (ProductService) getServletContext().getAttribute("productService");

        if (productService == null) {
            throw new ServletException("ProductService not available");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getServletPath().equals("/catalog/all")) {
            req.setAttribute("products", productService.findAll());
           getServletContext().getRequestDispatcher("/WEB-INF/catalog.jsp").forward(req, resp);
        } else if (req.getServletPath().equals("/catalog/product")) {
            showProduct(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    private void showProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String id;
        id = req.getParameter("productId");
        if (id == null) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Id cannot be null");
            return;
        }
        ProductDTO product = productService.findById(id);
        req.setAttribute("product", product);
        getServletContext().getRequestDispatcher("/WEB-INF/product.jsp").forward(req, resp);

    }
}
