package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Partner;

import java.util.List;

public interface IPartnerService {

    public void insert(Partner partner);
    public List<Partner> list();
}
