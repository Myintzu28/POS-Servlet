package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Category;

import java.io.IOException;
import java.util.List;

import daos.CategoryDao;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/CategoryController")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CategoryController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Check if cat_id parameter exists
		String catIdParam = request.getParameter("cat_id");
		
		if(catIdParam != null && !catIdParam.isEmpty()) {
			request.getRequestDispatcher("/product.jsp").forward(request, response);
			
		} else {
			CategoryDao category = new CategoryDao();
			List<Category> categories = category.getAllCats();
			request.setAttribute("categories", categories);
				
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		}	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
