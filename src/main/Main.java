package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import static javafx.application.Application.launch;

public class Main extends Application implements EventHandler<ActionEvent>
{

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }

/*
    public void setStage(Stage mainWindow)
    {
        Image img = new Image("test.png");
        ImageView test = new ImageView(img);
        mainWindow.setTitle("Zoldo");

        StackPane layout = new StackPane();
        layout.getChildren().add(test);

        Scene scene = new Scene(layout,1920, 1080);
        mainWindow.setScene(scene);
        mainWindow.show();

    }
*/

    @Override
    public void start(Stage mainWindow) throws Exception
    {
        Image img = new Image("test.png");
        Image player1 = new Image("player1.png");
        ImageView test = new ImageView(img);
        ImageView player = new ImageView(player1);

        mainWindow.setTitle("Zoldo");

        StackPane layout = new StackPane();
        layout.getChildren().add(test);
        layout.getChildren().add(player);

        Scene scene = new Scene(layout,1920, 1080);
        mainWindow.setScene(scene);
        mainWindow.show();

    }
}
