/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16315
 */
public class Character {
    private String name;
    private int no;
    private String type;
    private String characteristic;
    private String masterName;
    
    public Character(String name,int no,String type,String characteristic,String masterName){
        
        this.name=name;
        this.no=no;
        this.type=type;
        this.characteristic=characteristic;
        this.masterName=masterName;
    }
    
    public String getName(){ return name;}
    
    public String getType(){ return type;}
    
    public int getNo(){return no;}

    public String getEgg_group(){ return masterName;}
   
    public String getCharacteristic(){ return characteristic;}

    
    public void introduce(){
        System.out.println("NO."+no+"："+name);
        System.out.println("Type："+type);
        System.out.println("特性："+characteristic);
        System.out.println("主人："+masterName);
    }
    
    
    public void work(int sw){
        switch(sw){
            case 0: System.out.println("戦闘します");    break;
            case 1: System.out.println("アイテム使用します");    break;
            case 2: System.out.println("ポケモンを変えます");    break;
            case 3: System.out.println("逃げます");        break;
        }
    }
    
}
