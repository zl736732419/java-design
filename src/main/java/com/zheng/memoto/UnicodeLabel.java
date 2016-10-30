package com.zheng.memoto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 原发者
 * @author Administrator
 */
public class UnicodeLabel extends JLabel {
    private Integer m;
	public UnicodeLabel() {
		setFont(new Font("宋体", Font.BOLD,100));
		setHorizontalAlignment(SwingConstants.CENTER);
		m = new Integer(19968);
		setText("" + (char) m.intValue());
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.getModifiers() == InputEvent.BUTTON1_MASK) {//释放左键
					m = (int) (Math.random() * 1000 + 19968);
					setText("" + (char)m.intValue());
				}
				if(e.getModifiers() == InputEvent.BUTTON3_MASK) {//释放右键
					setText("" + (char)m.intValue());
				}
			}
		});
	}
	
	public Memento createMemento() {
		Memento memento = new Memento();
		memento.setState(m);
		return memento;
	}
	
	public void restoreFromMemento(Memento memento) {
		m = memento.getState();
	}
	
	/**
	 * 备忘录,这样设计的目的是只有原发者可以访问备忘录中的信息
	 * @author Administrator
	 */
	public class Memento {
		private Integer m;
		
		private void setState(Integer state) {
			this.m = state;
		}
		
		private Integer getState() {
			return m;
		}
	}
}
