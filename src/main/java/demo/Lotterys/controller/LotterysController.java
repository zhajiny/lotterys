package demo.Lotterys.controller;

import demo.Lotterys.entity.Lottery;
import demo.Lotterys.service.LotterysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LotterysController {

    private LotterysService service;

    @Autowired
    public void setLotterysService(LotterysService service){
        this.service = service;
    }

    @GetMapping(value="/")
    @ResponseBody
    public Object showLotteries(Model model){
        List<Lottery> lotteries = service.getAllLottery();
        model.addAttribute(lotteries);
        return lotteries;
    }
}
