package de.medieninformatik.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Reservation extends Remote {
    void addReservation(int row, int column, String name) throws RemoteException;
}

