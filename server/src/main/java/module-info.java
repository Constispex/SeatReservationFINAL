module SeatReservationThree.server.main {
    requires java.rmi;
    opens de.medieninformatik.server to javafx.fxml;
    exports de.medieninformatik.server;
}
