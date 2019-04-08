package day10;

import day9.Car;

public class KiaCar extends Car{
	public final static String brand = "KIA";
	public KiaCar(){
		//접근 불가=>부모에서 접근제한자가 private이기 때문에
		//speed = 0;	
		setSpeed(0);
	}
}
