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
public class Team {
    private String teamName;
    private ArrayList<Student> students;
    
    public Team(String teamName){
        this.teamName = teamName;
        this.students = new ArrayList();
    }
    public String getTeamName(){
        return this.teamName;
    }
    public void setSportName(){
        this.teamName= teamName;
    }
    public boolean addStudent(Student student){
        for(Student stu: this.students){
            if(stu.getName().equalsIgnoreCase(student.getName())){
               return false; 
            }
        }
        this.students.add(student);
        return true;
    }
    public boolean removeStudent(Student student){
       for(Student stu: this.students){
            if(stu.getName().equalsIgnoreCase(stu.getName())){
               this.students.remove(student);
               return true; 
            }
        } 
       return false;
    }
    public String getStudents(){
        String list="\tStudents:[\n";
        for (Student stu: this.students) {
            list+="\t"+stu.getStudent()+"\n";
        }
        return list;
    }
    @Override
    public String toString(){
        return "Team:"+this.getTeamName()+",\n"+this.getStudents()+"\t]";
    }
}