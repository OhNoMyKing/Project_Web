package test.demo.service;

import test.demo.entity.Home;
import test.demo.respository.HomeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomeServiceImpl implements HomeService{
    @Autowired
    private HomeRespository homeRespository;



    @Override
    public List<Object[]> findHomeService(String listingtypes, String offertype, String selectcity) {
        return homeRespository.findHome(listingtypes, offertype, selectcity);
    }

    @Override
    public List<Home> getAllHome() {
        return homeRespository.findAll();
    }

    @Override
    public Home getHomeById(Long id) {
        return homeRespository.getById(id);
    }

    @Override
    public Home addHome(Home home) {
        return homeRespository.save(home);
    }

    @Override
    public Home updateHome(Home home) {
        return homeRespository.saveAndFlush(home);
    }

    @Override
    public void Delete(Long id) {
         homeRespository.deleteById(id);
    }


}
