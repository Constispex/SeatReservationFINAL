module SeatReservationThree.client.main {


    requires java.rmi;
    requires SeatReservationThree.server.main;
    requires transitive javafx.controls;
    requires transitive javafx.fxml;

    opens de.medieninformatik.client.client to javafx.fxml;
    exports de.medieninformatik.client;
}
