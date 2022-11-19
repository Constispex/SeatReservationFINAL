module de.medieninformatik.seatreservationthree {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.medieninformatik.seatreservationthree to javafx.fxml;
    exports de.medieninformatik.seatreservationthree;
}