/**
 *
 * @author kristinakvasny
 */
public class Goal {
    private int xPos;
    private int yPos;
    
    public Goal()
    {
        this.xPos = 1000;
        this.yPos = 10;
    }
    //Get xPos
    public int getxPos() {
        return this.xPos;
    }
    //Set xPos
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }
    //Get yPos
    public int getyPos() {
        return this.yPos;
    }
    //Set yPos
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
