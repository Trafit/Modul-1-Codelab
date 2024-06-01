package com.example.codelab6;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HomeService extends AppService {

    private Label welcomeLabel;

    @Override
    protected Pane createRootPane() {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        root.setPadding(new Insets(75));
        return root;
    }

    @Override
    protected void initializeComponents(Pane root) {
        if (root instanceof VBox) {
            VBox vBox = (VBox) root;
            String username = "F";
            welcomeLabel = createLabel("Halo, " + username + "!", "-fx-font-size: 16px;");
            Button backButton = new Button("Kembali");
            backButton.setOnAction(event -> handleLogoutButtonAction());

            vBox.getChildren().addAll(welcomeLabel, backButton);
        }
    }

    private Label createLabel(String text, String style) {
        Label label = new Label(text);
        label.setStyle(style);
        return label;
    }

    private void handleLogoutButtonAction() {
        LoginInterface loginController = new LoginInterface();
        loginController.setPrimaryStage(primaryStage);
        loginController.show();
    }
}
