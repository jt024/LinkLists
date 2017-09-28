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
public class Stack {
    
    private Link head = null;
    private Link tail = null;
    private StringBuilder stackValueString = new StringBuilder();;

    public void setHead(Link out){
        this.head = out;
    }
    public Link getHead(){
        return head;
    }
    public void setTail(Link in){
        this.tail = in;
    }
    public Link getTail(){
        return tail;
    }    
    public void addLink(int value) {

        
        if(head==null) 
        {
            head = new Link();
            head.setValue(value);
            tail=head;
        }   
        else
        {
            if (head.getNLink()==null) {
                head.setNLink(tail);
            }
            
            Link temp = new Link();
            temp.setValue(value);
            tail.setNLink(temp);
            tail = temp;
        }
    }
//    public Link findHeadMinusOne(Link start){
//        if(start.getNLink()==head){
//            return start;
//        }
//        return findHeadMinusOne(start.getNLink());    
//        
//    }
    public void removeLink() {
        head=head.getNLink();
    }
    public void resetValueString(){
        this.stackValueString = new StringBuilder();
    }
    public String buildValueString(Link start){
        
        stackValueString.append(Integer.toString(start.getValue()));
        
        if (start.getNLink()!=null) 
        {
            stackValueString.append(", ");
            buildValueString(start.getNLink());
        }
        
        return stackValueString.toString();
    }
    
    
//    public String printValues(Link current)
//    {
//        
//        
//    }
}
//    public Link searchLinkList(int value, Link start){
//        if (start.getValue()==value) 
//            return start;
//        else
//            return recursiveSearch(start.getNLink(),value);  
//    }
//    public Link recursiveSearch(Link next, int value){
//        if(next.getValue()==value)
//            return next;
//        else
//            return recursiveSearch(next.getNLink(),value);
//    }
//    public void deleteLink(Link deleteLink){
//        
//        if (head==deleteLink) {
//            head = head.getNLink();
//        }
//        else
//            recursiveDelete(head,deleteLink);
//    }
//    public void recursiveDelete(Link startLink, Link deleteLink){
//        if (startLink.getNLink()==deleteLink) 
//            startLink.setNLink(startLink.getNLink().getNLink());
//        else
//            recursiveDelete(startLink.getNLink(),deleteLink);
//        
//        
//    }
//    

    
