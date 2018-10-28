/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;
import java.util.*;
/**
 *
 * @author Benura
 */
public class HashTable {
    int sz=5;
    int[] table=new int[sz];

    protected void  Hash(int k,int size){
        int index = k%size;

       if(table[index]==0)
           table[index]=k;
       else
           for(int i=(index+1)%size;i!=index;i++){
                if(i>=size){
       
                i=i%size;
                }
               if(table[i]!=0)
                   continue;
               else{
                   table[i]=k;
                   break;
               }
           }
       for(int i=0;i<size;i++)
            System.out.print(table[i]+"->");
       System.out.println();
    }
    
    protected int retrieve(int re,int size){
     
        int index = re%size;
        
        if(table[index]==re){
     
            return index+1;
        }
        else
            for(int i=(index+1)%size;i!=index;i++){
               if(i>=size){
              
                i=i%size;
                }
             
               if(table[i]==re){
              
                   return i+1;
                   
               }
               else{
                  
                   continue;
               }
            } 
       
       return 0;  
    }
    /**
     * @param args the command line arguments
     */
}
