package com.lw.hellogit;


/**
 * Hello world!
 *
 */
public class App 
{
    public void say(String something)
    {
        if (null != something || something.length() != 0)
        {
            System.out.println(something);
        }
    }
    
    
    public static void main( String[] args )
    {
        System.out.println("Hello git hub!");
        System.out.println("Test for modify!");
    }
}
