/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

/**
 *
 * @author Raziel 2
 */
public class Olimpiatec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Student leonn = new Student("Leon", "D10S","Guevara");
    Student jaime = new Student("Jaime","A00821432","Guevara");        
    Student esteban = new Student("Esteban","A01410412","Guevara");        
    Sport handball = new Sport("Handball");        
    Sport cagar = new Sport("Cagar");        
    Team i = new Team("Ingenieros");        
    Team l = new Team("Licenciados");        
    Team p1 = new Team("Prepa - 1er Sem");        
    Team p3 = new Team("Prepa - 3er Sem");        
    Team p5 = new Team("Prepa - 5to Sem");                            
    System.out.println(cagar);        
    System.out.println(handball);        
    System.out.println(i);        
    System.out.println(l);        
    System.out.println(p1);        
    System.out.println(p3);        
    System.out.println(p5);
}
}