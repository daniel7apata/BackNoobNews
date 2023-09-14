package pe.edu.upc.aaw.demo01.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.ConnectedDevice;
import pe.edu.upc.aaw.demo01.repositories.IConnectedDeviceRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IConnectedDeviceService;

import java.util.List;

@Service
public class ConnectedDeviceServiceImplement implements IConnectedDeviceService {

    @Autowired
    private IConnectedDeviceRepository connD;

    @Override
    public void insert(ConnectedDevice connectedDevice) {
        connD.save(connectedDevice);
    }

    @Override
    public void delete(int idConnectedDevice) {
        connD.deleteById(idConnectedDevice);
    }

    @Override
    public List<ConnectedDevice> list() {
        return connD.findAll();
    }

    @Override
    public ConnectedDevice listId(int idConnectedDevice) {
        return connD.findById(idConnectedDevice).orElse(new ConnectedDevice());
    }
}
