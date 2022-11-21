package de.medieninformatik.server;

import de.medieninformatik.main.Reservation;
import de.medieninformatik.main.Sitzplatz;
import java.rmi.RemoteException;



public class ReservationImpl implements Reservation {
    final int COLUMNS = 10;
    final int ROWS = 20;
    Sitzplatz[][] arr = new Sitzplatz[ROWS][COLUMNS];

    public ReservationImpl() {
        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLUMNS; j++) {
                arr[i][j] = new Sitzplatz();
            }
        }
    }

    @Override
    public void addReservation(int row, int column, String name)  {
        Sitzplatz curr = arr[row][column];
        if (name == null) {
            System.out.println("name is null");
        } else {
            curr.setName(name);
        }

        curr.setValid(false);
    }

    @Override
    public void clearReservation(int row, int column) {
        Sitzplatz curr = arr[row][column];
        curr.setName("");
        curr.setValid(true);
    }

    @Override
    public void cancelReservation() {

    }

    @Override
    public boolean isReserved(int row, int column) {
        return arr[row][column].isValid();
    }

    @Override
    public String getName(int row, int column) {
        return arr[row][column].getName();
    }


    @Override
    public Sitzplatz[][] getSitzplatzArray() {
        return arr;
    }
}

