package com.startjava.lesson_2_3.robot;
import com.startjava.lesson_2_3.robot.Jaeger;


class JaegerTest {
	public static void main(String[] args) {
		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, "Z-14 Tesla Fists");
		System.out.println("Model name " + chernoAlpha.getModelName());
		System.out.println("Mark is " + chernoAlpha.getMark());
		System.out.println("Origin is " + chernoAlpha.getOrigin());
		System.out.println("Height is " + chernoAlpha.getHeight());
		System.out.println("Weight is " + chernoAlpha.getWeight());
		System.out.println("Speed is " + chernoAlpha.getSpeed());
		System.out.println("Strength is " + chernoAlpha.getStrength());
		System.out.println("Weapon is " + chernoAlpha.getWeapon());

		chernoAlpha.move();
		chernoAlpha.scanKaiju();
		chernoAlpha.weap();
		chernoAlpha.dead();
		System.out.println("");

		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3" , "United States of America", 79.25f, 1.980f, 7, 8, "I-19 Plasmacaster");
		System.out.println("Model name " + gipsyDanger.getModelName());
		System.out.println("Mark is " + gipsyDanger.getMark());
		System.out.println("Origin is " + gipsyDanger.getOrigin());
		System.out.println("Height is " + gipsyDanger.getHeight());
		System.out.println("Weight is " + gipsyDanger.getWeight());
		System.out.println("Speed is " + gipsyDanger.getSpeed());
		System.out.println("Strength is " + gipsyDanger.getStrength());
		System.out.println("Weapon is " + gipsyDanger.getWeapon());

		gipsyDanger.move();
		gipsyDanger.scanKaiju();
		gipsyDanger.weap();
		gipsyDanger.dead();
	}
}