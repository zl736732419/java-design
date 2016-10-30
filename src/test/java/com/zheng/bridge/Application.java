package com.zheng.bridge;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class Application {
    public static void main(String[] args) {
        Program film = new FilmProgram();
        CCTV cctv5 = new CCTV5(film);
        cctv5.makeProgram();
    }
}
