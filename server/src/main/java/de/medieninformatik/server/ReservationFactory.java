package de.medieninformatik.server;

import de.medieninformatik.main.Reservation;

import java.rmi.Naming;
import java.rmi.registry.Registry;

public class ReservationFactory {
    private static final String host = "localhost";
    private static final int port = Registry.REGISTRY_PORT;
    public static Reservation getInstance() throws Exception{
        return (Reservation) Naming.lookup("//" + host + ":" + port + "/Reservation");
    }
}

