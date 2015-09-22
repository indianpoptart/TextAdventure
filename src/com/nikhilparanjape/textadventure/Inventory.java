package com.nikhilparanjape.textadventure;
import com.nikhilparanjape.textadventure.Game;

/**
 * A simple text adventure
 * 
 * Inventory Mechanics Class
 * 
 * @author Nikhil Paranjape (indianpoptart)
 * @version September 22nd 2015 - v1.0
 * 
 * 
 */

public class Inventory {
	
	static String[] inventory = new String[100];
	static int[] inventoryV = new int[100];
	static int[] abilities = new int[100];
	
	public static String[] getInventory() {
	       return inventory;
	}
	public static int[] getValues(){
		return inventoryV;
	}
	public static int[] getAbilities(){
		return abilities;
	}
	
	public static void display(){
		for(int i = 0; i < 100; i++){
			if(inventory[i] != null){
				System.out.println(inventory[i]);
				System.out.println(inventoryV[i]);
				
			}
		}
		
	}
}
