package com.zheng.adapter;

/**
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
