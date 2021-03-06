package pl.teamjava.hotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("loginView.fxml"));
        primaryStage.setTitle("Hotel");
        Scene scene= new Scene(root,600,400);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream( "/images/icon.png" )));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
