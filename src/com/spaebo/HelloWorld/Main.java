package com.spaebo.HelloWorld;



public class Main{

    public static void main(String[] args){
        System.out.println("Hello World");
        yannickHallo();
		hello("highc0");
    }
    
    private static void yannickHallo() {
    	System.out.println("Yannick sagt auch allen 'Hallo!'");
    }

	private static void hello(String... greeters) {
		for (String greeter : greeters){
			System.out.println(greeter + ": Hello World");
		}
	}
}
