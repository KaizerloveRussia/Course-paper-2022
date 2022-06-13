package com.TSP;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        stage.getIcons().add(new Image(Objects.requireNonNull(Application.class.getResourceAsStream("/icon.png"))));
        stage.setResizable(false);
        stage.setTitle("TSP");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        CitiesCollection.createCitiesCollection(67);
        launch();
    }
}