package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import helper.DBHelper;
import model.Category;
import model.Product;

public class ProductDao {
	
	public List<Product> getAllProductByCat(int catId){
		List<Product> products = new ArrayList<>();
		Connection con = DBHelper.getInstance().getConnection();
		String query = "SELECT * FROM products WHERE cat_id=?";
		ResultSet rs = null;
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, catId);
			rs = ps.executeQuery();
			while(rs.next()) {
				products.add(new Product (
						
						rs.getInt("id"),
						rs.getInt("cat_id"),
						rs.getString("name"),
						rs.getDouble("price"),
						rs.getString("image"),
						rs.getString("description")						
						));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return products;
		
	}
}


