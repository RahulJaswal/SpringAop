package com.rahul.SpringAop;

public class Triangle //implements Drawable
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void draw()
	{
		System.out.println("triangle is drawn");
	}
}
