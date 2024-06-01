package com.example.codelab6;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginInterface extends AppService {

    private TextField usernameField;
    private PasswordField passwordField;
    private Label messageLabel;

    @Override
    protected Pane createRootPane() {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25));
        return root;
    }

    @Override
    protected void initializeComponents(Pane root) {
        if (root instanceof GridPane) {
            GridPane gridPane = (GridPane) root;

            Label usernameLabel = new Label("User Name:");
            usernameField = new TextField();

            Label passwordLabel = new Label("Password:");
            passwordField = new PasswordField();

            Button signInButton = new Button("Sign in");
            signInButton.setOnAction(event -> handleLoginButtonAction());

            messageLabel = new Label();
            messageLabel.setStyle("-fx-text-fill: red;");

            gridPane.add(usernameLabel, 0, 0);
            gridPane.add(usernameField, 1, 0);
            gridPane.add(passwordLabel, 0, 1);
            gridPane.add(passwordField, 1, 1);
            gridPane.add(signInButton, 1, 2);
            gridPane.add(messageLabel, 0, 3, 2, 1);
        }
    }

    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("F") && password.equals("1")) {
            HomeService homeService = new HomeService();
            homeService.setPrimaryStage(primaryStage);
            homeService.show();
        } else {
            messageLabel.setText("Username / Password salah!");
            messageLabel.setStyle("-fx-text-fill: red;");
        }
    }
}

