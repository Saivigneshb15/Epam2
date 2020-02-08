package com.task2.Newyear;

public class Chocolate extends Sweet {
public String chocolate_name;
public Chocolate(String chocolate_name,String type_of_sweet,double cost,double weight,double egg_cont,int count)
{
this.name=chocolate_name;
this.type_of_sweet=type_of_sweet;
this.cost=cost;
this.weight=weight;
this.egg_cont=egg_cont;
this.count=count;
}
public void display()
{
System.out.println("Type_Of_Sweet"+type_of_sweet+"Name"+chocolate_name+"Cost"+cost+"Weight:"+weight+"Egg_Content"+egg_cont);
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

