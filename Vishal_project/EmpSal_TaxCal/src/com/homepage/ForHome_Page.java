package com.homepage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ForHome_Page {
	static BufferedReader br;
	static Home_Page hp1;
	
	public ForHome_Page(){
	
	}
	
	public static void direct_HomePage() {
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Print any key to go at Home_page");
		try {
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hp1=new Home_Page();
		hp1.callHomePage();
			
	}
	

}
