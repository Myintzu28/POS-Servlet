package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CartController")
public class CartController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CartController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String itemsJson = request.getParameter("items");

        // You can parse the JSON string back to a Java object if needed
        // For example, if you're using Gson library:
        // Gson gson = new Gson();
        // Item[] items = gson.fromJson(itemsJson, Item[].class);

        // Echo back the received items (for testing purposes)
        PrintWriter out = response.getWriter();
        out.print(itemsJson);
       
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
