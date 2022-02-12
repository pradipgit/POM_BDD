package com.test.pagefactory;

public class test {

	//Input: "I am learning java"
    //Output: "a va jgninrae lmaI"
    
	private static void main(String a[]) {
	
    String name ="I am learning java";
    String temp="";
    for(int i= name.length() - 1;i>0;i--){
        
        temp=temp+name.charAt(i);
    }
    
    System.out.println(temp);
    
 
 
 
    int temp1 [] = {};
    int s=0; String space =" ";
    int len = name.length();
    System.out.println(len);
    for(int i1=0; i1<name.length(); i1++){
    	char p=name.charAt(i1);
    	System.out.println(p);
    	if(p==' '){
            temp1[s]=i1 ; //1 4 13 
            s++;
        }
        
  
 
    
    temp="";
    for(int i = name.length() - 1; i>0; i--){
        
        for(int j=0;j<temp1.length;j++ )
        {
           if(i==temp1[j])
               {
             temp=temp+space+name.charAt(i);
               }
               else
               {
                 temp=temp+name.charAt(i);
                   
               }
      }
    }
    
    System.out.println(temp);
 
 
}
	
}
	
}
