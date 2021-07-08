package com.Marco.model;

public class Sumulation {
	public static void main(String[] args) {
		FlyingVehicle fv = new FlyingVehicle((short)4, new Engine());
		
		fv.setName("New Flying Vehicle");
		System.out.println(fv.getName());
		
		Airplane Boeing = new Airplane((short)4, (short)5);
		Boeing.move(15);
	}

}
