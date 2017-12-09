package com.mamezou.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtUISample implements EntryPoint {

	public void onModuleLoad() {
		
		/*
		 * VerticalPanel
		 */
		VerticalPanel verticalPanel = new VerticalPanel();
	    
	    SimplePanel panel_1 = new SimplePanel();
	    panel_1.add(new Button("1番目", new ClickListener(){
	    	public void onClick(Widget sender){
	    		Window.alert("I am No1!");
	    	}
	    }));
	    
	    SimplePanel panel_2 = new SimplePanel();
	    panel_2.add(new Button("2番目", new ClickListener(){
	    	public void onClick(Widget sender){
	    		Window.alert("I am No2!");
	    	}
	    }));
	    
	    SimplePanel panel_3 = new SimplePanel();
	    panel_3.add(new Button("3番目", new ClickListener(){
	    	public void onClick(Widget sender){
	    		Window.alert("I am No3!");
	    	}
	    }));
	    
	    SimplePanel panel_4 = new SimplePanel();
	    panel_4.add(new Button("4番目", new ClickListener(){
	    	public void onClick(Widget sender){
	    		Window.alert("I am No4!");
	    	}
	    }));
	    
	    verticalPanel.add(panel_1);
	    verticalPanel.add(panel_2);
	    verticalPanel.add(panel_3);
	    verticalPanel.add(panel_4);
	    //verticalPanel.insert(panel_1, 0);
	    
	    RootPanel.get().add(verticalPanel);
	    
	    /*
	     * FlowPanel
	     */
	    FlowPanel flowPanel = new FlowPanel();
	    
	    flowPanel.add(new Button("１番目", new ClickListener(){
	    	public void onClick(Widget sender){
	    		Window.alert("I am No1!");
	    	}
	    }));
	    flowPanel.add(new Button("２番目", new ClickListener(){
	    	public void onClick(Widget sender){
	    		Window.alert("I am No2!");
	    	}
	    }));
	    flowPanel.add(new Button("３番目", new ClickListener(){
	    	public void onClick(Widget sender){
	    		Window.alert("I am No3!");
	    	}
	    }));
	    flowPanel.add(new Button("４番目", new ClickListener(){
	    	public void onClick(Widget sender){
	    		Window.alert("I am No4!");
	    	}
	    }));
	    
	    RootPanel.get().add(flowPanel);
	    
	    /*
	     * HTML Panel
	     */
	    HTMLPanel htmlPanel = new HTMLPanel(
	    		"HTMLPanelですよ！ <h3>HTML形式が有効です。</h3>");
	    RootPanel.get().add(htmlPanel);
	    
	    /*
	     * StackPanel
	     */
	    StackPanel stackPanel = new StackPanel();
	    
	    stackPanel.add(new Label("Label_1"),"[Label_1]");
	    stackPanel.add(new Label("Label_2"),"[Label_2]");
	    stackPanel.add(new Label("Label_3"),"[Label_3]");
	    
	    RootPanel.get().add(stackPanel);
	    
	    /*
	     * HTMLTable
	     */
	    
	}
}

