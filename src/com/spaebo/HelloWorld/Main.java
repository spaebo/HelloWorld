package com.spaebo.HelloWorld;



public class Main{

    public static void main(String[] args){
        hello("yanniqq","highc0","headegg");
		
    }
    
    

    /**
     * A universal greeting sent by the greeters.
     * @param greeters The greeting entity(s)
     */
	private static void hello(String... greeters) {
		for (String greeter : greeters){
			System.out.println(greeter + ": Hello World");
		}
	}
}
