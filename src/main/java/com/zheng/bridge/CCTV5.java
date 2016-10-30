package com.zheng.bridge;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by zhenglian on 2016/10/30.
 */
public class CCTV5 extends CCTV implements Runnable {
    JLabel showFilm;
    Thread thread;
    List<String> content;

    public CCTV5(Program program) {
        programMaker = program;
        setLayout(new BorderLayout());
        showFilm = new JLabel("CCTV5体育频道");
        showFilm.setFont(new Font("", Font.BOLD, 39));
        add(showFilm, BorderLayout.CENTER);
        this.setVisible(true);
        thread = new Thread(this);
        
        JFrame frame = new JFrame();
        frame.add(this);
        frame.setSize(550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void makeProgram() {
        content = programMaker.makeTvProgram();
        if(!thread.isAlive()) {
            thread = new Thread(this);
            thread.start();
        }
    }



    public void run() {
        for(int i = 0; i < content.size(); i++) {
            showFilm.setText(content.get(i));
            try{
                Thread.sleep(500);
            }catch(Exception e) {
            }
        }
    }
}
