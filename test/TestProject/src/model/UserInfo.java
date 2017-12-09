package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserInfo {
    private IntegerProperty id = new SimpleIntegerProperty();
    private StringProperty name = new SimpleStringProperty();
    private StringProperty surName = new SimpleStringProperty();
    private StringProperty userName = new SimpleStringProperty();
    private StringProperty passWord = new SimpleStringProperty();
    private IntegerProperty age = new SimpleIntegerProperty();
     
    public UserInfo(int id, String name, String surName,String userName, String passWord, int age) {
        this.setId(id);
        this.setName(name);
        this.setSurName(surName);
        this.setUserName(userName);
        this.setPassWord(passWord);
        this.setAge(age);
    }
    
    public Integer getId() {
        return id.get();
    }
    public IntegerProperty idProperty() {
        return id;
    }
    public void setId(int id) {
    	this.id.set(id);
    }
    
    public String getName() {
        return name.get();
    }
    public StringProperty nameProperty() {
        return name;
    }
    public void setName(String name) {
    	this.name.set(name);
    }
    
    public String getSurName() {
        return surName.get();
    }
    public StringProperty surNameProperty() {
        return surName;
    }
    public void setSurName(String surName) {
    	this.surName.set(surName);
    }
    
    public String getUserName() {
        return userName.get();
    }
    public StringProperty userNameProperty() {
        return userName;
    }
    public void setUserName(String userName) {
    	this.userName.set(userName);
    }
    
    public String getPassWord() {
        return passWord.get();
    }
    public StringProperty passWordProperty() {
        return passWord;
    }
    public void setPassWord(String passWord) {
    	this.passWord.set(passWord);
    }
    
    public Integer getAge() {
        return age.get();
    }
    public IntegerProperty ageProperty() {
        return age;
    }
    public void setAge(Integer age) {
    	this.age.set(age);
    }
    
    @Override
    public String toString() {
        return "UserInfo[id=" + id.get() + ", name="
                + name.get() + ", surName=" + surName.get() + ", userName=" + userName.get() + ", passWord=" + passWord.get() + ", age=" + age.get() + "]";
    }
}
