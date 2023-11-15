package update_user;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.net.URL;

import common.StageFactory;

public class UpdateUserScreen {
	public static void showUpdateUserScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\ganuk\\eclipse-workspace\\ShopManagementJavaFxDB2\\src\\update_user\\UpdateUserScreen.fxml"));
			StageFactory.stage.setTitle("Update User Screen");
			Scene scene = new Scene(actorGroup,600,400);
		    StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
