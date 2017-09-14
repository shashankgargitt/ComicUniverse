package com.ITT.rajcomics.main;

public class Attribute {
	String name;
	String powerOrWeakness;

	Attribute(String name, String powerOrWeakness) {
		this.name = name;
		this.powerOrWeakness = powerOrWeakness;
	}

	String getName() {
		return this.name;
	}

	String getPowerOrWeakness() {
		return this.powerOrWeakness;
	}
}