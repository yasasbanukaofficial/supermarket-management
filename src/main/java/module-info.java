module com.management.supermarket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.management.supermarket to javafx.fxml;
    exports com.management.supermarket;
}