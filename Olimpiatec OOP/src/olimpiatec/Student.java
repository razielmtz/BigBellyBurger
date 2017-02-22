/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

import java.util.ArrayList;

/**
 *
 * @author Raziel 2
 */
public class Student {
    private String name;
    private String lastName;
    private String id;
    
    public Student(String name,String id, String lastName){
        this.name = name;
        this.id = id;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }
    public String getLastName(){
        return lastName;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent(){
        return "Student: " + this.name + " " + this.lastName + ", id: " + this.id;
    }
    @Override
    public String toString() {
        return "Student[Name: " + name + " " + lastName + ", ID: " + id + ']';
    }
    
}
