package com.zheng.facade;

/**
 * Charge/CheckWord/TypeSetting为三个广告子系统
 * 当前类为用户调用这三个子系统的入口facade,所有的操作
 * 都经过该facade进行
 * Created by zhenglian on 2016/10/29.
 */
public class AdvertisementFacade {
    private CheckWord checkWord;
    private Charge charge;
    private TypeSetting typeSetting;

    public AdvertisementFacade(String advertisement) {
        this.checkWord = new CheckWord(advertisement);
        this.charge = new Charge(checkWord);
        this.typeSetting = new TypeSetting(advertisement);
    }

    public void doAdvertisement() {
        charge.getCharge();
        typeSetting.typeSetting();
    }

}
