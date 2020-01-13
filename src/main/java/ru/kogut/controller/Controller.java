package ru.kogut.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author S.Kogut on 06.01.2020
 */

@WebServlet(name = "Controller", urlPatterns = {"","/main","/basket","/order","/about"})
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String url = "/WEB-INF/";
        switch (req.getServletPath()) {
            case "/":
            case "/main":
                url += "index.jsp";
                break;
            case "/about":
                url += "about.jsp";
                break;
        }
        req.getRequestDispatcher(url).forward(req, resp);
    }
}
