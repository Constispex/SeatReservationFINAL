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
        /*String s = "01000";
        String s1 = s.substring(0,1);
        System.out.println(s1);
        String s2 = s.substring(1);
        System.out.println(s2);
        */
        try{
            final int port = args.length > 0 ?
                    Integer.parseInt(args[0]) : Registry.REGISTRY_PORT;
            LocateRegistry.createRegistry(port);
            Remote remote = new ReservationImpl();
            UnicastRemoteObject.exportObject(remote, 50000);
            Naming.rebind("//:" + port + "/Reservation", remote);
            System.out.println("Datum -Server gestartet");
        } catch (RemoteException | MalformedURLException e){
            System.err.println(e.getMessage());
        }

    }
}