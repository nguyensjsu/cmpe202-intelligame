
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;


public class Cactus extends Actor
{
  private boolean flag = false;
 
  public Cactus() {
   
    }
   public void setFlag(boolean value)
    {
        flag = value;
    }
  public void act()
  {
      
    if (isTouching(Monkey.class) && (flag == false)) {
      ((Monkey)getWorld().getObjects(Monkey.class).get(0)).setImage(new GreenfootImage("monkey_dead.png"));
      
      ((HealthScreen)getWorld().getObjects(HealthScreen.class).get(0)).updateHealth(-1);
      new GreenfootSound("power-down.wav").play();
      setFlag(true);
    }
    
  }
  
}
