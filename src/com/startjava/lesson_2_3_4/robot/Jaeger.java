package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
	
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private String weapon;

	Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, String weapon) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.weapon = weapon;

	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrength() {
		return strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void move() {
		System.out.println(modelName + " is moving");
	}

	public void scanKaiju() {
		System.out.println("There is Kaiju here ");
	}

	public void weap() {
		System.out.println(modelName + " is using " + weapon);
	}

	public boolean dead() {
		System.out.println(modelName + " was killed");
		return true;
	}
}