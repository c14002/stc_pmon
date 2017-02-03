/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author c14002
 */
public class GameTester {
    public static int  attack(int wepon,int kougeki,int bougyo){
    int damage;
   return damage=wepon+kougeki-bougyo;
}
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        Random rand=new Random();
        Player[]com=new Player[3];
        Player ishihara=new Trainer("Ishihara",0,1000);
        com[0] =new  EnemyPlayer("武蔵",2,1000);
        com[1] =new   EnemyPlayer("コジロー",1,2000);
        com[2]=new EnemyPlayer("武",3,50000);
        Pmon[]p=new Pmon[4];
        int k=0;
       
        p[0]=new hitokage("人影",4,"火",["大文字","鳴き声","パンチ"],[50,3,30],[100,20,10,10]);
        p[1]=new zenigame("ゼニガメ",4,"水",["あわ","鳴き声","メガトンパンチ"],[20,40,60],[100,20,10,10]);
        p[2]=new husigidane("不思議だね",4,"くさ",["日照り","ソーラービーム","ためる"],[20,60,40],[100,20,10,10]);
        p[3]=new iwaku('曰く',4,'岩',['岩砕き','鳴き声','ためる'],[30,4,1],[100,20,10,10]);
        p[4]=new zubatto("ズバッと",4,"飛行",["ドクドク","叩く","噛み付く"],[456,69,34],[100,20,10,10]);
        System.out.println("ポケットモンスターの世界へようこそ！");
        System.out.println("一番初めのパートナーを1~4の中から選んでください");
        ishihara.partner=stdIn.nextInt()-1;
        System.out.println(p[ishihara.partner].getname()+"があなたのパートナーです。");
        System.out.println("体力攻撃防御素早さ");
        System.out.println(p[ishihara.partner].Statas());
        System.out.println(p[ishihara.partner].wepon());
        
        do{
             
             int enemy=rand.nextInt(3);//対戦相手をランダムで選ぶ
            System.out.println("対戦を開始します。あなたの対戦相手は"+com[enemy].getname());
            do{
                              
            int action=rand.nextInt(4);//コンピュータの手をランダムで選ぶ
           if(p[com[enemy].getpartner()].getstatas(3)>p[ishihara.getpartner()].getstatas(3)){
               System.out.println("技を選択してください１〜４");
               int waza=stdIn.nextInt();
              int damage=attack(p[ishihara.getpartner()].getweponpower(waza),
                      p[ishihara.getpartner()].getstatas(3),
                      p[com[enemy].getpartner()].getstatas(3));
              p[com[enemy].getpartner()].getstatas(0)-=damage;
              
           }else{
               
                 System.out.println("技を選択してください１〜４");
               int waza=stdIn.nextInt();
              int damage=attack(p[ishihara.getpartner()].getweponpower(waza),
                      p[ishihara.getpartner()].getstatas(3),
                      p[com[enemy].getpartner()].getstatas(3));
              p[com[enemy].getpartner()].getstatas(0)-=damage;
           }
            if(p[com[enemy].getpartner()].statas[0]>=0){
                System.out.println("あなたの勝利です。コインを"+com[enemy].getmoney()+"枚ゲットしました。");
                ishihara.money+=com[enemy].getmoney();
            }
            if(p[ishihara.partner].getstatas(0)>=0)
            System.out.println("あなたの負けです。目の前が真っ暗になった");
            ishihara.money-=ishihara.money/2+100;
            }while(p[com[enemy].getpartner()].statas[0]<=0||p[com[enemy].getpartner()].statas[0]<=0);
            if(ishihara.money==0){
            System.out.println("コインが０になりましたゲームを続行できません。");
           k=0;
            }else{
                System.out.println("ゲームを続行しますか？yes:1 no:0");
            
             k=stdIn.nextInt();
            }
        }while(k==1);
        
        
        
        
    }
}
