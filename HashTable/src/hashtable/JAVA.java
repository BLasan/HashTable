package hashtable;


import java.util.Scanner;

public class JAVA{
    public static void main(String[] args) {
        // TODO code application logic 
        HashTable obj=new HashTable();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        obj.sz=size;
        int array[]=new int[size];
        for(int i=0;i<size;i++)
            array[i]=sc.nextInt();
        
        for(int i=0;i<size;i++)
            obj.Hash(array[i],size);
        
        
        System.out.println("Enter value to search");
        int val=sc.nextInt();
        int res=obj.retrieve(val, size)-1;
        if(res==-1)
            System.out.println("Invalid");
        
        else
            System.out.println(res);
    
}
}

