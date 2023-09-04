package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Partner;
import pe.edu.upc.aaw.demo01.repositories.IPartnerRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IPartnerService;

import java.util.List;

@Service
public class PartnerServiceImplement implements IPartnerService {

    @Autowired
    private IPartnerRepository R;
    @Override
    public void insert(Partner partner) {
        R.save(partner);

    }

    @Override
    public List<Partner> list() {

        return R.findAll();
    }
}
