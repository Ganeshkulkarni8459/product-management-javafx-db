package update_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UpdateProductScreen {
	public static void showUpdateProductScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\ganuk\\eclipse-workspace\\ShopManagementJavaFxDB2\\src\\update_product\\UpdateProductScreen.fxml"));
			StageFactory.stage.setTitle("Update User Screen");
			Scene scene = new Scene(actorGroup,600,400);
		    StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
		}
	}

}
