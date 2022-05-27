package ticu.robert.g1099.Observer;

import java.util.ArrayList;

public class CentralWeatherStation {

    ArrayList<Handler> clients = new ArrayList<>();

    public void registerClient(Handler client){
        if(clients != null)
            clients.add(client);
    }

    public void unregisterClient(Handler client){
        if(clients != null)
            clients.remove(client);
    }

    public void notifyClients(){
        if(clients != null){
            for(Handler client : clients){
                client.reactToData();
            }
        }
    }
}
