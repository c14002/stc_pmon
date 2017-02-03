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
public abstract class Pmon {
    public String name;
    public int type;
    public String typename;
    public String[] wepon;
    public int[] weponpower;
    public int[] statas;
    
    public Pmon(String name,int type,String typename,String[] wepon,int[] weponpower,int[] statas){
        this.name=name;
        this.type=type;
        this.typename=typename;
        this.wepon=wepon;
        this.weponpower=weponpower;
        this.statas=statas;
    }



 public String getname(){
        return name;
    }
 public int getstatas(int i){
     return statas[i];
 }
    public String gettype(){
        return typename;
    }
    public int getweponpower(int i){
        return weponpower[i];
    }
    public String Statas(){
        return getname()+"の現在のステータス("+statas[0]+statas[1]+statas[2]+statas[3]+")";
    }
    
     public String wepon(){
        return getname()+"の技一覧("+wepon[0]+wepon[1]+wepon[2]+wepon[3]+")";
    }
}
