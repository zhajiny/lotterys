package demo.Lotterys.service;

import demo.Lotterys.dao.LotterysDAO;
import demo.Lotterys.entity.Lottery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class LotterysFileLoader {

    private LotterysDAO dao;

    @Autowired
    public void setLotterysDAO(LotterysDAO dao){
        this.dao = dao;
    }

    @Scheduled(fixedRate = 50000)
    public void loadLotteriesFromFile(){

    }
}
