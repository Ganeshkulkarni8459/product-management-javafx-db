package product_management;

import add_product.AddProductScreen;
import add_user.AddUserScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SearchProductScreen;
import update_product.UpdateProductScreen;


public class ProductManagementScreenController {

	@FXML
	private Button addProduct;

	@FXML
	private Button updateProduct;

	@FXML
	private Button searchProduct;

	@FXML
	private Button deleteProduct;

	@FXML
	private Button quit;
	
    
	public void showAddProduct(ActionEvent event) {
		AddProductScreen.showAddProductScreen();
	}
	public void showupdateProduct(ActionEvent event) {
		UpdateProductScreen.showUpdateProductScreen();
	}
	public void showSearchProduct(ActionEvent event) {
		SearchProductScreen.showSearchProductScreen();
	}
	public void showDeleteProduct(ActionEvent event) {
		SearchProductScreen.showSearchProductScreen();
	}
	public void quit(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}

}
