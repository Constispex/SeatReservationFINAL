package de.medieninformatik.server;

import java.rmi.RemoteException;

public class ReservationImpl implements Reservation {
    @Override
    public void addReservation(int row, int column, String name) throws RemoteException {
        System.out.println("Reservation added!"); // TODO: implement addReservation
    }
}

