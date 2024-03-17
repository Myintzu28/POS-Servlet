package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Category;
import model.Product;

import java.io.IOException;
import java.util.List;

import daos.CategoryDao;
import daos.ProductDao;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Check if cat_id parameter exists
				String catIdParam = request.getParameter("cat_id");
				
			ProductDao productDao = new ProductDao();	
			
			if(catIdParam == null) {
				catIdParam = "1";
			}
			List<Product> products=productDao.getAllProductByCat(Integer.parseInt(catIdParam));
			request.setAttribute("products", products);
			request.getRequestDispatcher("/product.jsp").forward(request, response);
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
