package user_management;

import java.util.Scanner;



import add_user.AddUserScreen;
import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_user.SearchUserScreen;
import update_user.UpdateUserScreen;

public class UserManagementScreenController {

	@FXML
	private Button addUser;

	@FXML
	private Button updateUser;

	@FXML
	private Button searchUser;

	@FXML
	private Button deleteUser;

	@FXML
	private Button quit;
	
    
	public void addUserButton(ActionEvent event) {
		AddUserScreen.showAddUserScreen();
	}
	public void updateUserButton(ActionEvent event) {
		UpdateUserScreen.showUpdateUserScreen();   //update user
	}
	public void searchUserButton(ActionEvent event) {
		SearchUserScreen.showSearchUserScreen();
	}
	public void deleteUserButton(ActionEvent event) {
		SearchUserScreen.showSearchUserScreen();
	}
	public void quit(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}
}
