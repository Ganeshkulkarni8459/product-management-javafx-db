package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;
import search_user.SearchUserScreenController;



public class SearchProductScreenController {
	@FXML 
	private TextField nameToSearch;

	@FXML 
	private TextField productName;

	@FXML 
	private TextField productid;

	@FXML 
	private TextField price;

	@FXML 
	private TextField quantity;

	@FXML 
	private TextField category;

	@FXML 
	private Button search;

	@FXML 
	private Button edit;

	@FXML 
	private Button delete;

	@FXML 
	private Button close;


	public void showSearch(ActionEvent event) throws SQLException {
		boolean status = Search_User(nameToSearch.getText());
		
		if(!status) {
			System.out.println("!!!!PRODUCT NOT FOUND!!!!!");
		}
	}
	public boolean Search_User(String nameToSearch) throws SQLException {
		String query = "SELECT * FROM Product WHERE productname ='"+nameToSearch+"'";

		ResultSet rs = DBUtils.executeQueryGetResult(query);

		try {
			if(rs.next()) {
				productName.setText(rs.getString("ProductName"));
				productid.setText(rs.getString("ProductID"));
				price.setText(rs.getString("price"));
				quantity.setText(rs.getString("Quantity"));
				category.setText(rs.getString("category"));
				return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void showEdit(ActionEvent event) {
		boolean status = Edit_User(nameToSearch.getText());
		if(status) {
			System.out.println("Product Edited successfully.");
		}
		else {
			System.out.println("Product not found.");
		}
	}
	public boolean Edit_User(String nameToSearch) {
		String Query = "SELECT * FROM Product WHERE productname ='"+nameToSearch+"'";

		ResultSet rs = DBUtils.executeQueryGetResult(Query);
		try {
			if(rs.next()) {
				String query = "UPDATE Product SET productname = '"+productName.getText()+"' ,"
						+ "ProductID = '"+productid.getText()+"',"
						+ "price = '"+price.getText()+"',"
						+ "Quantity ='"+quantity.getText()+"',"
						+ "category ='"+category.getText()+"'"
						+ "WHERE productname = '"+nameToSearch+"'";

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


	public void showDelete(ActionEvent event) {
		boolean status =  SearchProductScreenController.Delete_User(nameToSearch.getText());

		if(!status) {
			System.out.println("!!!!PRODUCT NOT FOUND!!!!!");
		}
	}
	public static boolean Delete_User(String nameToSearch) {

		String Query = "DELETE FROM Product WHERE productname = '"+nameToSearch+"'";

		DBUtils.executeQuery(Query);
		
		int rowDeleted = DBUtils.getRowsDeleted();

		if(rowDeleted > 0) {
			return true;
		}
		return false;
	}
	public void showClose(ActionEvent event) {
		ProductManagementScreen.showProductManagementScreen();

	}
}
