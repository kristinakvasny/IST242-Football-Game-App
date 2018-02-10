import java.awt.*;
/**
 *
 * @author kristinakvasny
 */
public class Tacklers { 
    private int xPos1;
    private int yPos1;
    private int xPos2;
    private int yPos2; 
    private Rectangle leftPos1;
    private Rectangle leftPos2;
    private Rectangle rightPos1;
    private Rectangle rightPos2;
    private Rectangle upPos1;
    private Rectangle upPos2;
    private Rectangle downPos1;
    private Rectangle downPos2;
    public Tacklers()
    {
        this.xPos1=750;
        this.yPos1=200;
        this.xPos2=500;
        this.yPos2=500;
    }
    //Moves Tackler1 left
    public Rectangle moveLeft1()
    {
        setxPos1(getxPos1()-20);
        setLeftPos1(new Rectangle(getxPos1(),getyPos1(),80,30));
        return getLeftPos1();
    }
    //Moves Tackler2 left
    public Rectangle moveLeft2()
    {
        setxPos2(getxPos2()-30);
        setLeftPos2(new Rectangle(getxPos2(),getyPos2(),80,30));
        return getLeftPos2();
    }
    //Moves Tackler1 right
    public Rectangle moveRight1()
    {
        setxPos1(getxPos1()+20);
        setRightPos1(new Rectangle(getxPos1(),getyPos1(),80,30));
        return getRightPos1();
    }
    //Moves Tackler2 right
    public Rectangle moveRight2()
    {
        setxPos2(getxPos2()+30);
        setRightPos2(new Rectangle(getxPos2(),getyPos2(),80,30));
        return getRightPos2();
    }
    //Moves Tackler1 up
    public Rectangle moveUp1()
    {
        setyPos1(getyPos1()-20);
        setUpPos1(new Rectangle(getxPos1(),getyPos1(),80,30));
        return getUpPos1();
    }
    //Moves Tackler2 up
    public Rectangle moveUp2()
    {
        setyPos2(getyPos2()-30);
        setUpPos2(new Rectangle(getxPos2(),getyPos2(),80,30));
        return getUpPos2();
    }
    //Moves Tackler1 down
    public Rectangle moveDown1()
    {
        setyPos1(getyPos1()+20);
        setDownPos1(new Rectangle(getxPos1(),getyPos1(),80,30));
        return getDownPos1();
    }
    //Moves Tackler2 down
    public Rectangle moveDown2()
    {
        setyPos2(getyPos2()+30);
        setDownPos2(new Rectangle(getxPos2(),getyPos2(),80,30));
        return getDownPos2();
    }
    //Position of Tackler1
    public Rectangle setPos1()
    {
        Rectangle startPos1 = new Rectangle(getxPos1(),getyPos1(),80,30);
        return startPos1;
    }
    //Position of Tackler2
    public Rectangle setPos2()
    {
        Rectangle startPos2 = new Rectangle(getxPos2(),getyPos2(),80,30);
        return startPos2;
    }
    //Get X position of Tackler1
    public int getxPos1() {
        return xPos1;
    }
    //Set X position of Tackler1
    public void setxPos1(int xPos1) {
        this.xPos1 = xPos1;
    }
    //Get Y position of Tackler1
    public int getyPos1() {
        return yPos1;
    }
    //Get Y position of Tackler1
    public void setyPos1(int yPos1) {
        this.yPos1 = yPos1;
    }
    //Get X position of Tackler2
    public int getxPos2() {
        return xPos2;
    }
    //Set X position of Tackler2
    public void setxPos2(int xPos2) {
        this.xPos2 = xPos2;
    }
    //Get Y position of Tackler2
    public int getyPos2() {
        return yPos2;
    }
    //Set Y position of Tackler2
    public void setyPos2(int yPos2) {
        this.yPos2 = yPos2;
    }
    //Get Left position of Tackler1
    public Rectangle getLeftPos1() {
        return leftPos1;
    }
    //Set Left position of Tackler1
    public void setLeftPos1(Rectangle leftPos1) {
        this.leftPos1 = leftPos1;
    }
    //Get Left position of Tackler2
    public Rectangle getLeftPos2() {
        return leftPos2;
    }
    //Set Left position of Tackler2
    public void setLeftPos2(Rectangle leftPos2) {
        this.leftPos2 = leftPos2;
    }
    //Get Right position of Tackler1
    public Rectangle getRightPos1() {
        return rightPos1;
    }
    //Set Right position of Tackler1
    public void setRightPos1(Rectangle rightPos1) {
        this.rightPos1 = rightPos1;
    }
    //Get Right position of Tackler2
    public Rectangle getRightPos2() {
        return rightPos2;
    }
    //Set Right position of Tackler2
    public void setRightPos2(Rectangle rightPos2) {
        this.rightPos2 = rightPos2;
    }
    //Get Up position of Tackler1
    public Rectangle getUpPos1() {
        return upPos1;
    }
    //Set Up position of Tackler1
    public void setUpPos1(Rectangle upPos1) {
        this.upPos1 = upPos1;
    }
    //Get Up position of Tackler2
    public Rectangle getUpPos2() {
        return upPos2;
    }
    //Set Up position of Tackler2
    public void setUpPos2(Rectangle upPos2) {
        this.upPos2 = upPos2;
    }
    //Get Down position of Tackler1
    public Rectangle getDownPos1() {
        return downPos1;
    }
    //Set Down position of Tackler1
    public void setDownPos1(Rectangle downPos1) {
        this.downPos1 = downPos1;
    }
    //Get Down position of Tackler2
    public Rectangle getDownPos2() {
        return downPos2;
    }
    //Set Down position of Tackler2
    public void setDownPos2(Rectangle downPos2) {
        this.downPos2 = downPos2;
    }
}
