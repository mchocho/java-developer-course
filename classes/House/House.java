public class House
{
  private int numStories;
  private int numWindows;
  private String colour;

  //no-arg constructor
  public House()
  {
    this.numStories = 1;
    this.numWindows = 4;
    this.colour = "gray";
  }

  //parameteriezed constructor
  public House(int numStories, int numWindows, String colour)
  {
    this.numStories = numStories;
    this.numWindows = numWindows;
    this.colour = colour;
  }

  public int getNumStories()
  {
    return (this.numStories);
  }

  public void setNumStories(int numStories)
  {
    this.numStories = numStories;
  }

  public int getNumWindows()
  {
    return (this.numWindows);
  }

  public void setNumWindows(int numWindows)
  {
    this.numWindows = numWindows;
  }

  public String getColour()
  {
    return (this.colour);
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }
};
