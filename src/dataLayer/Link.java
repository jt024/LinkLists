/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataLayer;

/**
 *
 * @author Trevi
 */
public class Link {
    private int value;
    private Link nLink=null;
//    private Link pLink=null;

    public Link(){
        this.nLink=null;
//        this.pLink=null;
    }
    public Link(int num){
        this.value = num;
        this.nLink=null;
//        this.pLink=null;
    }
    public Link(int num, Link n){
        this.value = num;
        this.nLink = n;
//        this.pLink = null;
    }
    public Link(int num, Link n, Link p){
        this.value = num;
        this.nLink = n;
//        this.pLink = p;
    }
    
    public int getValue(){
        return value;
    }
    public void setValue(int newValue){
        this.value = newValue;
        
    }
    public Link getNLink(){
        return nLink;
    }
    public void setNLink(Link nLink){
        this.nLink = nLink;
        
    }
//    public Link getPLink(){
//        return pLink;
//    }
//    public void setPLink(Link pLink){
//        this.pLink = pLink;
//        
//    }    
}
