package com.kinson.banana.util;

import com.kinson.banana.model.AwardModel;

import java.util.ArrayList;
import java.util.List;

public class AwardUtil {

    public static int getAwardIndex(List<AwardModel> awards) {
        int result = -1;
        double randomNum = Math.random();
        int totalWeight = totalWeight(awards);
        double min = 0;
        double max = 0;
        for(int i = 0; i < awards.size(); i ++) {
            max += Double.parseDouble(String.valueOf(awards.get(i).getAwardWeight()))/totalWeight;
            if (i == 0) {
                min = 0;
            } else {
                min += Double.parseDouble(String.valueOf(awards.get(i - 1).getAwardWeight()))/totalWeight;
            }
            if (randomNum >= min && randomNum <= max) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int totalWeight(List<AwardModel> awards) {
        return awards.stream().mapToInt(AwardModel::getAwardWeight).sum();
    }

    public static List<AwardModel> initAwards() {
        List<AwardModel> awardModels = new ArrayList<AwardModel>();
        AwardModel p1 = new AwardModel();
        p1.setAwardName("美团");
        p1.setAwardWeight(1);//奖品的权重设置成1
        awardModels.add(p1);
        AwardModel p2 = new AwardModel();
        p2.setAwardName("途牛");
        p2.setAwardWeight(2);//奖品的权重设置成2
        awardModels.add(p2);
        AwardModel p3 = new AwardModel();
        p3.setAwardName("环球黑卡");
        p3.setAwardWeight(10);//奖品的权重设置成10
        awardModels.add(p3);
        AwardModel p4 = new AwardModel();
        p4.setAwardName("拼多多");
        p4.setAwardWeight(40);//奖品的权重设置成40
        awardModels.add(p4);
        return awardModels;
    }
}
