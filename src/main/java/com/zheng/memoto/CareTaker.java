package com.zheng.memoto;

import java.util.Stack;
/**
 * 负责人
 * @author Administrator
 */
public class CareTaker {
    Stack<UnicodeLabel.Memento> stack;
	
	CareTaker() {
		stack = new Stack<UnicodeLabel.Memento>();
	}
	
	public UnicodeLabel.Memento getMemento() {
		if(!stack.isEmpty()) {
			UnicodeLabel.Memento memento = stack.pop();
			return memento;
		}else {
			return null;
		}
	}
	
	public void setMemento(UnicodeLabel.Memento memento) {
		stack.push(memento);
	}
}
