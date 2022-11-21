module de.medieninformatik.client {

    requires javafx.fxml;
    requires javafx.controls;
    requires java.rmi;
    requires de.medieninformatik.server;
    requires de.medieninformatik.common;

    opens de.medieninformatik.client to javafx.fxml;
    exports de.medieninformatik.client;
}