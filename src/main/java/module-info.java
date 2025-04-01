module com.management.supermarket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.management.supermarket.controller to javafx.fxml;
    exports com.management.supermarket;
}