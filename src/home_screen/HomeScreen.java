package home_screen;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.net.URL;

import common.StageFactory;
public class HomeScreen {
	
	public static void showHomeScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\ganuk\\eclipse-workspace\\ShopManagementJavaFxDB2\\src\\home_screen\\HomeScreen.fxml"));
			StageFactory.stage.setTitle("Home Screen");
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

