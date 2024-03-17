package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helper.DBHelper;
import model.Category;

public class CategoryDao {
	
	// Get all categories
	public List<Category> getAllCats(){
		
		List<Category> categories = new ArrayList<>();
		Connection con = DBHelper.getInstance().getConnection();
		String query = "SELECT * FROM categories";
		ResultSet  rs = null;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				categories.add(new Category(
						rs.getInt("id"),rs.getString("name"),rs.getString("image")
						));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return categories;
		
	}
}
