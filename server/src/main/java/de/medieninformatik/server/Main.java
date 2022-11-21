package de.medieninformatik.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) {

        try{
            final int port = args.length > 0 ?
                    Integer.parseInt(args[0]) : Registry.REGISTRY_PORT;
            LocateRegistry.createRegistry(port);
            Remote remote = new ReservationImpl();
            UnicastRemoteObject.exportObject(remote, 50000);
            Naming.rebind("//:" + port + "/Reservation", remote);
            System.out.println("Server gestartet");
            System.out.println("//:" + port + "/Reservation");
        } catch (RemoteException | MalformedURLException e){
            System.err.println(e.getMessage());
        }

    }
}