import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.application.Application;
import java.util.Optional;

public class Rectangle extends Application{
	@Override
	public void start(Stage PrimaryStage){
	
	TextInputDialog first = new TextInputDialog();
	first.setTitle("Rectangle Magic");
	first.setHeaderText("Area and Permiter finder");
	first.setContentText("Enter the height of the rectangle");
	Optional<String> Height = first.showAndWait();

	TextInputDialog second = new TextInputDialog();
	second.setTitle("Rectangle Magic");
	second.setHeaderText("Area and Perimeter finder");
	second.setContentText("Enter the width of the rectangle");
	Optional<String> Width = second.showAndWait();

	int heightin = Integer.parseInt(Height.get());
	int widthin = Integer.parseInt(Width.get());

	int perimeter = (heightin*2) + (widthin*2);
	int area = (heightin*widthin);

	Alert alert = new Alert (AlertType.INFORMATION);
	alert.setTitle("Rectangle Magic");
	alert.setHeaderText("Results");
	alert.setContentText("Area: " + area + "\n" + "Perimeter: " + perimeter);
	alert.show();
	
	
	
	}
}
