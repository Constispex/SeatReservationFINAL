module de.medieninformatik.main {
    requires javafx.controls;
    requires javafx.fxml;
    opens de.medieninformatik.main to javafx.fxml;
    exports de.medieninformatik.main;
}