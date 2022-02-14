package com.example.ppiproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private AnchorPane parent;
    @FXML
    private Pane ContenidoArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        makeStageDrageable();
    }

    public void makeStageDrageable() {
        parent.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        parent.setOnMouseDragged(event -> {
            AvistoquiaMainApplication.stage.setX(event.getScreenX() - xOffset);
            AvistoquiaMainApplication.stage.setY(event.getScreenY() - yOffset);
        });
        parent.setOnDragDone((e) -> {
            AvistoquiaMainApplication.stage.setOpacity(1.0f);
        });
        parent.setOnMouseReleased((e) -> {
            AvistoquiaMainApplication.stage.setOpacity(1.0f);
        });
    }

    @FXML
    private void abrirRegistro() throws IOException {
        Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Registro.fxml")));
        ContenidoArea.getChildren().removeAll();
        ContenidoArea.getChildren().setAll(fxml);
    }

    @FXML
    private void cerrarAplicacion(MouseEvent event) {
        System.exit(0);
    }

}
