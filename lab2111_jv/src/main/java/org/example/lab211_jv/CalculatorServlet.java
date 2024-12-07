package org.example.lab211_jv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double x = Double.parseDouble(request.getParameter("x"));
        int n = Integer.parseInt(request.getParameter("n"));
        double e1 = Double.parseDouble(request.getParameter("e1"));
        double e2 = Double.parseDouble(request.getParameter("e2"));

        double sumN = Calculator.calculateSum(n, x);
        double sumE1 = Calculator.calculateSumLargerTerms(n, x, e1);
        double sumE2 = Calculator.calculateSumLargerTerms(n, x, e2);
        double exact = Calculator.exactValue(x);

        request.setAttribute("sumN", sumN);
        request.setAttribute("sumE1", sumE1);
        request.setAttribute("sumE2", sumE2);
        request.setAttribute("exact", exact);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}