package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", urlPatterns = "/discount")
public class ProductDiscountCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount_percent = Double.parseDouble(request.getParameter("discount_percent"));
        double discount_amount = price * discount_percent * 0.01;
        double discount_price = price - discount_amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Product Discount Calculator</title>");
        writer.print(" <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<div id=\"content\">");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<form>");
        writer.println("<div id=\"data\">");
        writer.println("<label>ProductDescription: " + description + "</label><br/>");
        writer.println("<label>Price: " + price + "<label><br/>");
        writer.println("<label>Discount Percent: " + discount_percent + "%" + "<label><br/>");
        writer.println("<label>Discount Amount: " + discount_amount + "<label><br/>");
        writer.println("<label >Discount Price: " + discount_price + "<label><br/>");
        writer.println("</div>");
        writer.println("</form>");
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
