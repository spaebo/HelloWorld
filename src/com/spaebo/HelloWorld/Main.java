package com.spaebo.HelloWorld;

import java.util.Arrays;


public class Main{

    public static void main(String[] args){
        String[] greeters = { "yaniqq", "highc0", "headegg", "PlebLex" };
        hello(greeters);
    }


    /**
     * A universal greeting sent by the greeters.
     * @param greeters The greeting entity(s)
     */
	private static void hello(String... greeters) {
        Arrays.stream(greeters).forEach(greeter -> hello(greeter));
	}
    
    /**
     * A single greeting sent by a greeter.
     * @param greeter The greeting entity
     */ 
    private static void hello(String greeter) {
        System.out.println(greeter + " sagt hallo");
    }
}
