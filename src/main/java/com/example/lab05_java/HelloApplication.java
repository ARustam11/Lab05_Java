package com.example.lab05_java;

import com.google.gson.Gson;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Lab05 Rustam Ainetdinov");
        Button button = new Button("Click here to parse JSON");
        button.setOnAction(actionEvent -> parseJSON());
        VBox vbox = new VBox(button);
        Scene scene = new Scene(vbox, 300, 300);

        stage.setScene(scene);
        stage.show();

    }



    public void parseJSON() {
        String jsonString = "{\"productId\":01,\"productName\":Shoes,\"orderDate\":\"July 17, 2024\",\"manufacturer\":\"Canada\"}";
        Gson gson = new Gson();
        Products products = gson.fromJson(jsonString, Products.class);
        System.out.println("Product ID:" + products.productId);
        System.out.println("Product Name:" + products.productName);
        System.out.println("Order Date:" + products.orderDate);
        System.out.println("Manufacturer:" + products.manufacturer);

        String jsonOutput = gson.toJson(products);
        System.out.println("The output for JSON: " + jsonOutput);
    }


    public static void main(String[] args) {
        launch();
    }
}