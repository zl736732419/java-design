package com.zheng.memoto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Application extends JFrame implements MouseListener {
    UnicodeLabel label;
	CareTaker careTaker;//负责人
	
	public Application() {
		label = new UnicodeLabel();
		label.addMouseListener(this);
		add(new JLabel("单机左键显示一个汉字，单机右键撤销单机左键的操作效果"), BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		careTaker = new CareTaker();//创建负责人
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getModifiers() == InputEvent.BUTTON1_MASK) {
			careTaker.setMemento(label.createMemento());
		}
		if(e.getModifiers() == InputEvent.BUTTON3_MASK) {
			UnicodeLabel.Memento memento = careTaker.getMemento();
			if(memento != null) {
				label.restoreFromMemento(memento);
			}
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	public static void main(String[] args) {
		Application application = new Application();
		application.setBounds(10, 10, 300, 300);
		application.setVisible(true);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
