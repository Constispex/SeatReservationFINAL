package de.medieninformatik.server;

import de.medieninformatik.main.Reservation;
import de.medieninformatik.main.Sitzplatz;


public class ReservationImpl implements Reservation {
    final int COLUMNS = 10;
    final int ROWS = 20;
    final Sitzplatz[][] ARR = new Sitzplatz[ROWS][COLUMNS];

    public ReservationImpl() {
        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLUMNS; j++) {
                ARR[i][j] = new Sitzplatz();
            }
        }
    }

    @Override
    public void addReservation(int row, int column, String name)  {
        Sitzplatz curr = ARR[row][column];
        if (name == null) {
            System.out.println("name is null");
        } else {
            curr.setName(name);
        }

        curr.setValid(false);
    }

    @Override
    public void clearReservation(int row, int column) {
        Sitzplatz curr = ARR[row][column];
        curr.setName("");
        curr.setValid(true);
    }

    @Override
    public boolean isReserved(int row, int column) {
        return ARR[row][column].isValid();
    }

    @Override
    public String getName(int row, int column) {
        return ARR[row][column].getName();
    }


    @Override
    public Sitzplatz[][] getSitzplatzArray() {
        return ARR;
    }
}

