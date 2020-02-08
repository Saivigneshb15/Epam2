package com.task2.Newyear;

public class Lollipop extends Sweet {
public String lollipop_flavour;
public int count;
public Lollipop(String lollipop_flavour,String type_of_sweet,double cost,double weight,double egg_cont,int count)
{
this.name=lollipop_flavour;
this.type_of_sweet=type_of_sweet;
this.cost=cost;
this.weight=weight;
this.egg_cont=egg_cont;
this.count=count;
}
public void display()
{
System.out.println("Type_Of_Sweet"+type_of_sweet+"Name"+lollipop_flavour+"Cost"+cost+"Weight:"+weight+"Flour_Content"+egg_cont);
}
public String getName()
{
return name;
}
public double getWeight()
{
return weight;
}
public double getEggCont()
{
return egg_cont;
}
public int getCount()
{
return count;
}
public double getCost()
{
return cost;
}
public String getTypeOfSweet()
{
return type_of_sweet;
}

}
