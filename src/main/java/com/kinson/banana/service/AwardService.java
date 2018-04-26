package com.kinson.banana.service;

import com.kinson.banana.model.AwardModel;
import com.kinson.banana.util.AwardUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AwardService {

    public int test() {
        List<AwardModel> awardModels = AwardUtil.initAwards();
        System.out.println("抽奖开始");
        int awardIndex = AwardUtil.getAwardIndex(awardModels);
        System.out.println("奖项名称：" + awardModels.get(awardIndex).getAwardName());
        return awardIndex;
    }
}
