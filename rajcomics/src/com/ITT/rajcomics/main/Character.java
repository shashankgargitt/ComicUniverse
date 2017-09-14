package com.ITT.rajcomics.main;

public class Character {
	String name;
	String look;
	Attribute power;
	Attribute weakness;
	String heroOrVillan;
	int powerValue;
	int weaknesssValue;

	Character(String name, String look, Attribute power, Attribute weakness, String heroOrVillain, int powerValue,
			int weaknessValue) {
		this.name = name;
		this.look = look;
		this.power = power;
		this.weakness = weakness;
		this.heroOrVillan = heroOrVillain;
		this.powerValue = powerValue;
		this.weaknesssValue = weaknessValue;
	}

}