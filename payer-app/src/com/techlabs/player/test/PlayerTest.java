package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String[] args) {

		Player p2 = new Player(102, "Virat");
		Player p1 = new Player(101, "Sachin", 50);
		Player elder = p1.whoIsElder(p2);
		printInfo(elder);
	}

	public static void printInfo(Player p) {

		System.out.print(p.getName() + " ");
		System.out.print(p.getId() + " ");
		System.out.println(p.getAge());
	}

}
