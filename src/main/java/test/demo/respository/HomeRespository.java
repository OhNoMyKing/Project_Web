package test.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.demo.entity.Home;

import java.util.List;

@Repository
public interface HomeRespository extends JpaRepository<Home,Long> {

    @Query("SELECT h.id,h.ten, h.giatien,h.sophong FROM Home h WHERE h.listingtypes LIKE %:listingtypes% AND h.offertype LIKE %:offertype% AND h.selectcity LIKE %:selectcity% ")
    List<Object[]> findHome(String listingtypes, String offertype, String selectcity );

}