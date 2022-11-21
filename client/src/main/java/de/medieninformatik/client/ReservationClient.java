package de.medieninformatik.client;




import de.medieninformatik.main.Reservation;
import de.medieninformatik.server.ReservationFactory;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;


public class ReservationClient {
    private final Reservation res;

    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Reservation reservation = (Reservation) Naming.lookup("//localhost:" + 1099 + "/Reservation");


        if (reservation == null) System.out.println("Res ist null");

        assert reservation != null;
        reservation.addReservation(1,1,"Test");
        System.out.println(reservation.getName(1,1));

    }

    public ReservationClient() throws Exception {
        this.res = ReservationFactory.getInstance();
    }

}
