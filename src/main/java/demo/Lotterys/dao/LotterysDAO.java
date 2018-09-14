package demo.Lotterys.dao;

import demo.Lotterys.entity.Lottery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LotterysDAO {
    public void updateLotteries(List<Lottery> lotteries) {
    }

    public List<Lottery> selectAll() {
        List<Lottery> lotteries = new ArrayList<Lottery>();
        return lotteries;
    }
}
