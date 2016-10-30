package com.zheng.bridge;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * 播放电影
 * Created by zhenglian on 2016/10/30.
 */
public class FilmProgram implements Program {
    public List<String> makeTvProgram() {
        List<String> content = Lists.newArrayList();
        content.add("地道战");
        content.add("1937年鬼子侵略中国");
        content.add("八路军带领民兵展开地道战");
        content.add("把鬼子打的找不到北");
        content.add("鬼子最后被消灭了");
        return content;
    }
}
