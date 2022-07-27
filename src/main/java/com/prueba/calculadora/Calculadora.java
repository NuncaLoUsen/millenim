package com.prueba.calculadora;

public class Calculadora {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int sumar(int x, int y) {
		return x + y;
	}
	
	public int restar(int x, int y) {
		return x - y;
	}

}
