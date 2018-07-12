package designpatterns.MVC.udemy.controller;

import designpatterns.MVC.udemy.model.Model;
import designpatterns.MVC.udemy.view.LoginFormEvent;
import designpatterns.MVC.udemy.view.LoginListener;
import designpatterns.MVC.udemy.view.View;

public class Controller implements LoginListener {
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
	}
	
	
}
