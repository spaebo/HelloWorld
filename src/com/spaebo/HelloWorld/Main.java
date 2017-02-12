package com.spaebo.HelloWorld;

import java.util.Arrays;


public class Main{

    public static void main(String[] args){
        String[] greeters = { "yaniqq", "highc0", "headegg" };
        hello(greeters);
    }


    /**
     * A universal greeting sent by the greeters.
     * @param greeters The greeting entity(s)
     */
	private static void hello(String[] greeters) {
        Arrays.stream(greeters).forEach(x -> System.out.println(x));
	}
}
