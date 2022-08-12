module com.example.discountratesystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.discountratesystem to javafx.fxml;
    exports com.example.discountratesystem;
}