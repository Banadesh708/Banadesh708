module com.example.git_demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.git_demo1 to javafx.fxml;
    exports com.example.git_demo1;
}