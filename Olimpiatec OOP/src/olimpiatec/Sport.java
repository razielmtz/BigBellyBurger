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
public class Sport {
    private String sportName;
    private ArrayList<Team> teams;
    
    public Sport(String sportName){
        this.sportName = sportName;
        this.teams = new ArrayList();
    }
    public String getSportName(){
        return this.sportName;
    }
    public void setSportName(){
        this.sportName= sportName;
    }
    public boolean addTeam(Team team){
        for(Team t: this.teams){
            if(t.getTeamName().equalsIgnoreCase(team.getTeamName())){
               return false; 
            }
        }
        this.teams.add(team);
        return true;
    }
    public boolean removeTeam(Team team){
       for(Team t: this.teams){
            if(t.getTeamName().equalsIgnoreCase(t.getTeamName())){
               this.teams.remove(team);
               return true; 
            }
        } 
       return false;
    }

    @Override
    public String toString(){
        String string="Sport: "+this.sportName+"{\n";
        for (Team team : teams) {
            string+= "\t" + team.toString() + "\n";
        }
        string += "}";
        return string;
    }
}
