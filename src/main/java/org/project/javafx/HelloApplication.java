package org.project.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Hello, Java!");
        stage.setWidth(500);
        stage.setHeight(400);
        //InputStream iconStream = getClass().getResourceAsStream("C:/Users/Azerty/IdeaProjects/javafx/src/main/resources/org/project/javafx/img/Engredrius.png");
        //assert iconStream != null;
        //Image image = new Image(iconStream);
        //stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}