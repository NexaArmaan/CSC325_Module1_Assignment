module org.example.csc325_javafx_assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc325_javafx_assignment to javafx.fxml;
    exports org.example.csc325_javafx_assignment;
}