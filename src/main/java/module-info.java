module de.medieninformatik.main {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.rmi;
    opens de.medieninformatik.main to javafx.fxml;
    exports de.medieninformatik.main;
}