package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.ConnectedDevice;


import java.util.List;

public interface IConnectedDeviceService {

    public void insert(ConnectedDevice connectedDevice);
    public List<ConnectedDevice> list();
    public void delete(int idConnectedDevice);
    public ConnectedDevice listId(int idConnectedDevice);
}
