package de.medieninformatik.client;




import de.medieninformatik.server.Reservation;
import de.medieninformatik.server.ReservationFactory;

import java.rmi.RemoteException;



public class ReservationClient implements Reservation {
    private final Reservation res;

    public ReservationClient() throws Exception {
        this.res = ReservationFactory.getInstance();
    }

    @Override
    public void addReservation(int row, int column, String name) throws RemoteException {

        System.out.println("Client addReservation");
    }
}
