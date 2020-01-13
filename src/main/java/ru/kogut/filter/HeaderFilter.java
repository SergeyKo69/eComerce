package ru.kogut.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author S.Kogut on 23.12.2019
 */

@WebFilter(urlPatterns = "/*")
public class HeaderFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/css");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
