package com.kinson.banana.model;

public class AwardModel {
    //奖品id
    private int id;
    //奖品名称
    private String awardName;
    //奖品（剩余）数量
    private int awardAmount;
    //奖品权重
    private int awardWeight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public int getAwardAmount() {
        return awardAmount;
    }

    public void setAwardAmount(int awardAmount) {
        this.awardAmount = awardAmount;
    }

    public int getAwardWeight() {
        return awardWeight;
    }

    public void setAwardWeight(int awardWeight) {
        this.awardWeight = awardWeight;
    }
}
