package de.medieninformatik.server;

import java.rmi.Naming;
import java.rmi.registry.Registry;

public class ReservationFactory {
    private static final String host = "localhost";
    int w = 2;
    private static final int port = Registry.REGISTRY_PORT;
    public static Reservation getInstance() throws Exception{
        return (Reservation) Naming.lookup("//" + host + ":" + port + "/Reservation");
    }
}

