package com.capgemini.MavenApp;

/**
 * Hello world!
 *
 */
public class App 
{
       public int fact(int num)
       {
    	   int factorial=1;
    	   if(num<0)
    	   {
    		   throw new IllegalArgumentException();
    	   }
    	   if(num==0)
    		   return 1;
    	   
    	   for(int i=1;i<=num;i++)
    	   {
    		   factorial=factorial*i;
    	   }
    	   return factorial;
       }
       public static void main( String[] args )
       {
    	   System.out.println(new App().fact(4));
    }
}
