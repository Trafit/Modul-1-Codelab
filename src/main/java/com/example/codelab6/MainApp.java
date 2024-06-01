package com.example.codelab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        LoginInterface LoginInterface = new LoginInterface();
        LoginInterface.setPrimaryStage(primaryStage);

        Scene scene = new Scene(LoginInterface.createRootPane(), 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Form Login");

        LoginInterface.show();

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
