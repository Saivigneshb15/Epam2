package com.task2.Newyear;

import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
Scanner sca=new Scanner(System.in);
Chocolate c1=new Chocolate("Fivestar","Chocolate",20,10.5,33.6,4);
Chocolate c2=new Chocolate("MilkyBar","Chocolate",40,8.7,20.2,3);
Lollipop lo1=new Lollipop("StrawberryFlavour","Lollipop",25,7.7,13.4,2);
Lollipop lo2=new Lollipop("OrangeFlavour","Lollipop",18,12.8,30.8,3);
Sweet sw[]=new Sweet[4];
sw[0]=c1;
sw[1]=c2;
sw[2]=lo1;
sw[3]=lo2;
GiftPack g=new GiftPack(sw);
g.sortByEggCon();
g.display();
System.out.println("Enter the range for sweets to be displayed:");
float r1=sca.nextFloat();
float r2=sca.nextFloat();
for(int i=0;i<sw.length;i++)
{
if((sw[i].type_of_sweet.equals("Chocolate") || sw[i].type_of_sweet.equals("Lollipop")) && (sw[i].egg_cont>=r1) &&(sw[i].egg_cont<=r2))
{
System.out.println(sw[i].getName());
}

}
}

}

