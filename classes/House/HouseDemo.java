public class HouseDemo
{
  public static void main(String[] args)
  {
   House myHouse = new House();
   House yourHouse = new House(3, 10, "yellow");

   myHouse.setNumStories(2);
   myHouse.setNumWindows(6);
   myHouse.setColour("red");

   /*
   yourHouse.setNumStories(3);
   yourHouse.setNumWindows(10);
   yourHouse.setColour("yellow");
   */

   printHouseData(myHouse);

   System.out.println();

   printHouseData(yourHouse);
   
  }

  public static void printHouseData(House house)
  {
    System.out.println("This house is " + house.getColour() +
		       " and has " + house.getNumStories() + " stories and " +
		       house.getNumWindows() + " windows.");  
  }
}
