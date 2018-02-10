import java.awt.*;
/**
 *
 * @author kristinakvasny
 */
public class RunningBack{
    private Rectangle startPos;
    private Rectangle leftPos;
    private Rectangle rightPos;
    private Rectangle upPos;
    private Rectangle downPos;
    private int xPos;
    private int yPos;
    private int tdScore;
    private int tkScore;
    public RunningBack()
    {
        //Creating position
        this.xPos=300;
        this.yPos=300;
        this.startPos=new Rectangle(getxPos(),getyPos(),50,30);
    }
    //Move RB Left
    public Rectangle moveLeft()
    {
        setxPos(getxPos()-15);
        setLeftPos(new Rectangle(getxPos(),getyPos(),50,30));
        return getLeftPos();
    }
    //Move RB Right
    public Rectangle moveRight()
    {
        setxPos(getxPos()+15);
        setRightPos(new Rectangle(getxPos(),getyPos(),50,30));
        return getRightPos();
    }
    //Move RB Up
    public Rectangle moveUp()
    {
        setyPos(getyPos()-15);
        setUpPos(new Rectangle(getxPos(),getyPos(),50,30));
        return getUpPos();
    }
    //Move RB Down
    public Rectangle moveDown()
    {
        setyPos(getyPos()+15);
        setDownPos(new Rectangle(getxPos(),getyPos(),50,30));
        return getDownPos();
    }
    //Gets RB Position 
    public Rectangle getStartPos() {
        return this.startPos;
    }
    //Set RB Position
    public void setStartPos(Rectangle startPos) {
        this.startPos = startPos;
    }
    //Get X Position of RB
    public int getxPos() {
        return this.xPos;
    }
    //Set X Position of RB
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }
    //Get Y Position of RB
    public int getyPos() {
        return this.yPos;
    }
    //Set Y Position of RB
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }   
    //Get Left Position of RB
    public Rectangle getLeftPos() {
        return leftPos;
    }
    //Set Left Position of RB
    public void setLeftPos(Rectangle leftPos) {
        this.leftPos = leftPos;
    }
    //Get Right Position of RB
    public Rectangle getRightPos() {
        return rightPos;
    }
    //Set Right Position of RB
    public void setRightPos(Rectangle rightPos) {
        this.rightPos = rightPos;
    }
    //Get Up Position of RB
    public Rectangle getUpPos() {
        return upPos;
    }
    //Set Up Position of RB
    public void setUpPos(Rectangle upPos) {
        this.upPos = upPos;
    }
    //Get Down Position of RB
    public Rectangle getDownPos() {
        return downPos;
    }
    //Set Down Position of RB
    public void setDownPos(Rectangle downPos) {
        this.downPos = downPos;
    }
    //Get Touchdown score
    public int getTdScore() {
        return tdScore;
    }
    //Set Touchdown score
    public void setTdScore(int tdScore) {
        this.tdScore = tdScore;
    }
    //Get Tackle score
    public int getTkScore() {
        return tkScore;
    }
    //Set Tackle score
    public void setTkScore(int tkScore) {
        this.tkScore = tkScore;
    }
}
