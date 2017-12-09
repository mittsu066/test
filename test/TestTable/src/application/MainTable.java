package application;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MainTable {
	
    private SimpleBooleanProperty checkBox = new SimpleBooleanProperty();
    private SimpleStringProperty string1 = new SimpleStringProperty();
    private SimpleStringProperty string2 = new SimpleStringProperty();
    
    public Boolean getCheckBox() {
        return checkBox.get();
    }
    public String getString1() {
        return string1.get();
    }
    public String getString2() {
        return string2.get();
    }
    
    public void setCheckBox(Boolean checkBox){
    	this.checkBox.set(checkBox);
    }
    public void setString1(String string1) {
    	this.string1.set(string1);
    }
    public void setString2(String string2) {
    	this.string2.set(string2);
    }
    public BooleanProperty checkBoxProperty(){
    	return checkBox;
    }
    public StringProperty string1Property(){
		return string1;
    }
    public StringProperty string2Property(){
		return string2;
    }
}
