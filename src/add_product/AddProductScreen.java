package add_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProductScreen {
	public static void showAddProductScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\ganuk\\eclipse-workspace\\ShopManagementJavaFxDB2\\src\\add_product\\AddProductScreen.fxml"));
			StageFactory.stage.setTitle("Add Prouct Screen");
			Scene scene = new Scene(actorGroup,600,400);
		    StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
		}
	}

}
