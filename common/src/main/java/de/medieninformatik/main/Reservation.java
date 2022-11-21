package de.medieninformatik.main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Reservation extends Remote {
    void addReservation(int row, int column, String name) throws RemoteException;
    void clearReservation(int row, int column) throws RemoteException;

    boolean isReserved(int row, int column);

    String getName(int row, int column) throws RemoteException;
    Sitzplatz[][] getSitzplatzArray() throws RemoteException;

}
