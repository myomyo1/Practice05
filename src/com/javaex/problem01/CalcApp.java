package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	Add add = new Add();
    	Div div = new Div();
    	Mul mul = new Mul();
    	Sub sub = new Sub();
    	
    	boolean isRunning = true;
    				
    	while(isRunning) {
    		String info=scan.nextLine();
    		if (info.equals("/q")){
    			System.out.println("종료합니다.");
    			isRunning = false;
    			break;
    		}
        	
    		String[] string =info.split(" ");
        	int a = Integer.parseInt(string[0]);
        	int b = Integer.parseInt(string[2]);
        	
        	if(string[1].equals("+")) {
    			add.setValue(a,b);
    			System.out.println(add.calculate());
    		}else if(string[1].equals("-")) {
    			sub.setValue(a,b);
    			System.out.println(sub.calculate());
    		}else if(string[1].equals("*")) {
    			mul.setValue(a,b);
    			System.out.println(mul.calculate());
    		}else if(string[1].equals("/")){
    			div.setValue(a,b);
    			System.out.println(div.calculate());    		
    		}else if(string[1].equals("&")) {
    			System.out.println("알 수 없는 연산입니다.");
    		}
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	scan.close();
    }
}
