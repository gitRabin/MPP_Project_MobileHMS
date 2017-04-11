package lab6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class lab6A extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {

		stage.setTitle("Address Form");
		stage.setHeight(500);
		stage.setWidth(500);
		GridPane girdR1 = new GridPane();
		girdR1.setAlignment(Pos.CENTER);
		girdR1.setHgap(10);
		girdR1.setVgap(10);
		// girdR1.setGridLinesVisible(true);
		girdR1.resize(800, 800);
		girdR1.autosize();
		girdR1.setPadding(new Insets(25, 25, 25, 25));

		// for #Row1
		Text lblName = new Text("Name");
		girdR1.add(lblName, 0, 0);

		TextField txtName = new TextField();
		girdR1.add(txtName, 0, 1);

		Text lblStreet = new Text("Street");
		girdR1.add(lblStreet, 1, 0);

		TextField txtStreet = new TextField();
		girdR1.add(txtStreet, 1, 1);

		Text lblCity = new Text("City");
		girdR1.add(lblCity, 2, 0);

		TextField txtCity = new TextField();
		girdR1.add(txtCity, 2, 1);

		//for #Row2
		GridPane girdR2 = new GridPane();

		girdR2.setHgap(10);
		girdR2.setVgap(10);
		// girdR2.setGridLinesVisible(true);
		girdR2.setAlignment(Pos.CENTER);
		girdR2.setPadding(new Insets(25, 25, 10, 25));

		Text lblState = new Text("State");
		girdR2.add(lblState, 0, 0, 2, 1);

		TextField txtState = new TextField();
		girdR2.add(txtState, 0, 1);

		Text lblZip = new Text("Zip");
		girdR2.add(lblZip, 1, 0, 2, 1);

		TextField txtZip = new TextField();
		girdR2.add(txtZip, 1, 1);

		// For #Row3
		GridPane girdR3 = new GridPane();
		girdR3.setAlignment(Pos.CENTER);
		// girdR3.setGridLinesVisible(true);
		girdR3.setHgap(10);
		girdR3.setVgap(10);
		girdR3.setPadding(new Insets(25, 25, 25, 25));
		Button btnSubmit = new Button("Submit");

		girdR3.add(btnSubmit, 0, 0);
		
		
//Handling button Click
		btnSubmit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				String message = txtName.getText() + "\n" + txtStreet.getText() + "\n" + txtCity.getText() + ", "
						+ txtState.getText() + txtZip.getText();
				System.out.println(message);

			}
		});
		
		
// Crating a wrapper container GridPane to hold three Grid: gridR1,gridR2,gridR3
		GridPane girdContainer = new GridPane();
		girdContainer.setAlignment(Pos.TOP_CENTER);
		girdContainer.setHgap(2);
		girdContainer.setVgap(2);
		girdContainer.add(girdR1, 0, 0);
		girdContainer.add(girdR2, 0, 1);
		girdContainer.add(girdR3, 0, 2);

		Scene scene = new Scene(girdContainer, 500, 500);
		stage.setScene(scene);

		stage.show();
	}
}