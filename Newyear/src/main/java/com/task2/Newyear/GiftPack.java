package com.task2.Newyear;

public class GiftPack {

	Sweet s[];
	double no_of_items;
	double weight;
	double egg_cont;
	public GiftPack(Sweet s[])
	{
	no_of_items=0;
	weight=0;
	egg_cont=0;
	this.s=new Sweet[s.length];
	for(int i=0;i<s.length;i++)
	{
	this.s[i]=s[i];
	       weight=weight+s[i].getWeight();
	       no_of_items+=s[i].getCount();
	       egg_cont+=s[i].getEggCont();
	}
	}
	public void sortByEggCon()
	{
	Sweet t;
	for(int i=0;i<s.length;i++)
	{
	for(int j=i+1;j<s.length;j++)
	{
	if(s[i].getEggCont()>s[j].getEggCont())
	{
	t=s[i];
	s[i]=s[j];
	s[j]=t;
	}
	}
	}
	}
	public void display()
	{
	System.out.println("GiftBox sorted based on egg content");
	System.out.println("Name \t Weight \t Count \t EggContent");
	for(int i=0;i<s.length;i++)
	{
	System.out.println(s[i].getName()+"\t"+s[i].getWeight()+"\t"+s[i].getCount()+"\t"+s[i].getEggCont());
	}
	System.out.println("Weight of whole Giftbox:"+weight);
	System.out.println("EggContent in Giftbox:"+egg_cont);
	}
}
