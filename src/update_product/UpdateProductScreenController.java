package update_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;


public class UpdateProductScreenController {
	@FXML
	private TextField productNameToUpdate;
	
	@FXML
	private TextField productName;
	
	@FXML
	private TextField productId;
	
	@FXML
	private TextField price;
	
	@FXML
	private TextField quantity;
	
	@FXML
	private TextField category;
	
	@FXML
	private Button update;
	
	@FXML
	private Button close;
	
	public void showUpdate(ActionEvent event) {
		boolean status = Update_User(productNameToUpdate.getText());
		if(status) {
			System.out.println("Product updated successfully.");
		}
		else {
			System.out.println("Product not found.");
		}
	}
	public boolean Update_User(String productNameToUpdate) {
		String Query = "select * from Product where productname = '"+productNameToUpdate+"'";

		ResultSet rs = DBUtils.executeQueryGetResult(Query);
		try {
			if(rs.next()) {
				String query = "UPDATE Product SET productname = '"+productName.getText()+"' ,"
						+ "ProductID = '"+productId.getText()+"',"
						+ "price = '"+price.getText()+"',"
						+ "Quantity ='"+quantity.getText()+"',"
						+ "category ='"+category.getText()+"'"
						+ "WHERE productname = '"+productNameToUpdate+"'";
				DBUtils.executeQuery(query);

				System.out.println("Product updated successfully.");
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
	public void showClose(ActionEvent event) {
		ProductManagementScreen.showProductManagementScreen();
	}

}
