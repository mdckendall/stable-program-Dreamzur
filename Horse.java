//Create the Horse class here.
public class Horse {

  private String horseName;
  private double horseWeight;
  private boolean horseTame;

  public Horse (String horseName, double horseWeight, boolean horseTame){

    this.horseName = horseName;
    this.horseWeight = horseWeight;
    this.horseTame = horseTame;
  }

  public String getName(){
    return this.horseName;
  }

  public double getWeight(){
    return this.horseWeight;
  }

  public boolean getTame(){
    return this.horseTame;
  }
  
}