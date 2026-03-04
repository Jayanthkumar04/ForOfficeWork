package com.jay.string.basics;

nopublic class StringMethods {

  public static void evenIndexPrint(String s1)
  {
    for(int i=0;i<s1.length;i++)
    {
      if(i%2 == 0 && s1.charAt(i)!=' ')
    System.out.print(s1.charAt(i)+"");
    }
  }
  }
  
  public static void substrings(String s2)
  {
    for(int i=0;i<s2.length;i++)
    {
      for(int j=i+1;j<s2.length;k++)
      {
        System.out.println(s2.substring(i,j));
      }
    }
  }
  public static void main(String args[])
  {
    String s1 = "this is the end";
    
    System.out.println(s1.charAt(1));
    
    //program which returns only char at even index
    
    evenIndexPrint(s1);
    
    /Program which print substring
    
    String s2 = "abcd";
    
    substrings(s");
    
        
  }
}