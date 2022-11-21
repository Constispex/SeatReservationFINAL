module de.medieninformatik.common {
    requires java.rmi;
    opens de.medieninformatik.main to javafx.fxml;
    exports de.medieninformatik.main;
}