package com.management.supermarket.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardPageController implements Initializable {
    public AnchorPane ancMainContainer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        navigateTo("CustomerPage.fxml");
    }

    public void goToCustPage(ActionEvent actionEvent) {
        navigateTo("CustomerPage.fxml");
    }

    public void goToItemPage(ActionEvent actionEvent) {
        navigateTo("ItemPage.fxml");
    }

    public void goToOrderPage(ActionEvent actionEvent) {
        navigateTo("OrderPage.fxml");
    }

    public void navigateTo(String path){
        try{
            ancMainContainer.getChildren().clear();
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/" + path));
            anchorPane.prefWidthProperty().bind(ancMainContainer.widthProperty());
            anchorPane.prefHeightProperty().bind(ancMainContainer.heightProperty());
            ancMainContainer.getChildren().add(anchorPane);
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error defining url path");
            e.printStackTrace();
        }
    }
}
