module SeatReservationThree.main {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.rmi;
    opens de.medieninformatik.seatreservationthree to javafx.fxml;
    exports de.medieninformatik.seatreservationthree;
}