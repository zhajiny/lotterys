package demo.Lotterys.service;

import demo.Lotterys.dao.LotterysDAO;
import demo.Lotterys.entity.Lottery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotterysService {

    private LotterysDAO dao;

    @Autowired
    public void setLotterysDAO(LotterysDAO dao){
        this.dao = dao;
    }

    public List<Lottery> getAllLottery(){
        return dao.selectAll();
    }
}
