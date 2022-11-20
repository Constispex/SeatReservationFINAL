module de.medieninformatik.client {

    requires javafx.fxml;
    requires javafx.controls;
    requires java.rmi;
    requires de.medieninformatik.server;

    opens de.medieninformatik.client.client to javafx.fxml;
    exports de.medieninformatik.client;
}