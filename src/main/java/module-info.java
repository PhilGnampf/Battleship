module com.example.philippmorawitz.battleshipfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.philippmorawitz.battleshipfx to javafx.fxml;
    exports com.example.philippmorawitz.battleshipfx;
}