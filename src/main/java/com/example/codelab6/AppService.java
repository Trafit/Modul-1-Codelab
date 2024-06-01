package com.example.codelab6;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public abstract class AppService {
    protected Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    protected abstract Pane createRootPane();

    protected abstract void initializeComponents(Pane root);

    public void show() {
        Pane root = createRootPane();
        initializeComponents(root);
        primaryStage.getScene().setRoot(root);
    }
}
