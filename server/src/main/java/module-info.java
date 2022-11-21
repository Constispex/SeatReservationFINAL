module de.medieninformatik.server {
    requires java.rmi;
    requires de.medieninformatik.common;
    opens de.medieninformatik.server to javafx.fxml;
    exports de.medieninformatik.server;
}
