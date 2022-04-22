package com.qa.encapsulation;

public class Encapsulation 
{
	private String country;
	private int	population;
	private double gdp_total;
	private float area;
	private long gdp_per_capita;
	
	public Encapsulation(String country
						,int	population
						,double gdp_total
						,float area
						,long gdp_per_capita)
	{
		this.country		= country;
		this.population		= population;
		this.gdp_total		= gdp_total;
		this.area			= area;
		this.gdp_per_capita	= gdp_per_capita;		
	}

	public Encapsulation()
	{	
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public int getPopulation()
	{
		return population;
	}
	
	public double getGdpTotal()
	{
		return gdp_total;
	}
	
	public float getArea()
	{
		return area;
	}

	public long getGdpPerCapita()
	{
		return gdp_per_capita;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public void setPopulation(int population)
	{
		this.population = population;
	}
	
	public void setGdpTotal(double gdp_total)
	{
		this.gdp_total = gdp_total;
	}
	
	public void setArea(float area)
	{
		this.area = area;
	}

	public void setGdpPerCapita(long gdp_per_capita)
	{
		this.gdp_per_capita = gdp_per_capita;
	}
	
	@Override
	public String toString() {
		return "Country: " + country + ", Population: " + population + ", Area: " + area + "km(squared),  GDP Total: " + gdp_total + " trillion, GDP Per Capita: " + gdp_per_capita + " billion";
	}

}