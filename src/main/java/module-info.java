module com.example.myfistjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfistjava to javafx.fxml;
    exports com.example.myfistjava;
}