package add_product;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;

public class AddProductScreenController {
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
	
	
	public void saveDetails(ActionEvent event) {
		String Insertquery = "INSERT INTO Product(productname,ProductID,price,Quantity,category)VALUES('"+productName.getText()+"','"+productId.getText()+"','"+price.getText()+"','"+quantity.getText()+"','"+category.getText()+"')";
		DBUtils.executeQuery(Insertquery);
		System.out.println("User added successfully.");
	}
	
	public void backToProductManagementScreen(ActionEvent event) {
		
		ProductManagementScreen.showProductManagementScreen();
	}
}
