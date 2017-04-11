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
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lab6B extends Application{
	public static void main(String [] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("String Utility");	
		
		GridPane grid1 = new GridPane();
		grid1.setAlignment(Pos.CENTER);
		grid1.setHgap(10);
		grid1.setVgap(10);
		grid1.setPadding(new Insets(25,25,25,25));
		
		Button btnCount = new Button("Count Letters");
		btnCount.setMinWidth(200);
		
		Button btnReverse = new Button("Reverse Letters");		
		btnReverse.setMinWidth(200);
		
		Button btnRemoveDubs = new Button("Remove Duplicates");
		btnRemoveDubs.setMinWidth(200);
		
		grid1.add(btnCount, 0, 0);
		grid1.add(btnReverse, 0, 1);
		grid1.add(btnRemoveDubs, 0, 2);
		
		// separate gridPane here
		GridPane grid2=new GridPane();
		grid2.setPadding(new Insets(30,25,25,25));
		
		Text input=new Text("input");
		Text output=new Text("Output");		
		TextField txtInputText = new TextField();
		
		TextField txtOutputText = new TextField();
		 grid2.add(input, 0, 0);
		 grid2.add(txtInputText, 0, 1);
		 grid2.add(output, 0, 2);
		 grid2.add(txtOutputText, 0, 3);
		
		
			
		
		final Text actiontarget = new Text();
		grid1.add(actiontarget, 1, 8);
		btnCount.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				actiontarget.setFill(Color.FIREBRICK);
				
				
				String str = txtInputText.getText();
				int i = str.length();
					txtOutputText.setText("" + i);
													
					
					
			}
		});
			
				
		btnReverse.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				actiontarget.setFill(Color.FIREBRICK);
				StringBuilder temp = new StringBuilder(txtInputText.getText());

				txtOutputText.setText(temp.reverse().toString());
				
				}
			});
		
		btnRemoveDubs.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) 
			{
				actiontarget.setFill(Color.FIREBRICK);
				
				
				String temp1 = txtInputText.getText();
				
				String finaloutput=new String("");
				for(Character c:temp1.toCharArray())
				{
					if(finaloutput.indexOf(c)==-1)
						finaloutput+=c;
					
				}
				txtOutputText.setText(finaloutput);
				}		
			
			
		});
		
		
		GridPane mainOuterContainer=new GridPane();		
		mainOuterContainer.add(grid1, 0, 0);
		mainOuterContainer.add(grid2, 1, 0);
		
		Scene scene = new Scene(mainOuterContainer,500,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
		
		
		
		
	