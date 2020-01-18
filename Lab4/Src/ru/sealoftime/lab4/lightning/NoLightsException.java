package ru.sealoftime.lab4.lightning;

public class NoLightsException extends RuntimeException{
	private Lightning where;
	public NoLightsException(Lightning where, Throwable cause){
		super(cause);
		this.where = where;
	}
	public Lightning getWhereNoLights(){
		return where;
	}
}