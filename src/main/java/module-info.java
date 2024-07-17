module com.example.lab05_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.lab05_java to javafx.fxml;
    exports com.example.lab05_java;
}