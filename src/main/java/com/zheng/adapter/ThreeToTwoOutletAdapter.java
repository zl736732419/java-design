package com.zheng.adapter;

/**
 * 适配器模式常用于兼容不同接口的情况
 * 因为某些原因无法对已有的接口进行变动，只能通过提供新的接口来适配已经存在但又不满足条件的接口
 * Created by zhenglian on 2016/10/21.
 */
public class ThreeToTwoOutletAdapter implements ThreeElectricOutlet {
    private TwoElectricOutlet outlet;

    public ThreeToTwoOutletAdapter(TwoElectricOutlet outlet) {
        this.outlet = outlet;
    }

    public void connectElectric() {
        outlet.connectElectric();
    }
}
