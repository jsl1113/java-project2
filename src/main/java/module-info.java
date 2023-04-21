module com.example.javaproject3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaproject3 to javafx.fxml;
    exports com.example.javaproject3;
    exports com.example.javaproject3.week1.day3;
    opens com.example.javaproject3.week1.day3 to javafx.fxml;
}