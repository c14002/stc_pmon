/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author c14002
 */
public class Player {
    private String name;
    public int partner;
    public int money;
    
    public Player(String name,int partner,int money){
        this.name=name;
        this.partner=partner;
        this.money=money;
    }
    public String getname(){
        return name;
    }
    public int getpartner(){
        return partner;
    }
    public int getmoney(){
        return money;
    }
    
}
