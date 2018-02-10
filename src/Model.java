import java.awt.Rectangle;
/**
 *
 * @author kristinakvasny
 */
public class Model {
    private RunningBack rb;
    private Tacklers t;
    private Goal g;
    public Model() 
    {
       //Create classes
       rb = new RunningBack();
       t = new Tacklers();
       g = new Goal();
    }
    //Check RB intersection with T1 & update score
    public boolean rbIntT1()
    {
        Rectangle rbR = new Rectangle(getRb().getxPos(),getRb().getyPos(),50,30);
        Rectangle r1 = new Rectangle(getT().getxPos1(),getT().getyPos1(),80,30);
        if(r1.intersects(rbR)){
            int tk = 0;
            tk = tk + 1;
            getRb().setTkScore(tk);
            return true;
        }
        else{
            getRb().getTkScore();
            return false;
        }
    }
    //Check RB intersection with T2 & update score
    public boolean rbIntT2()
    {
        Rectangle rbR = new Rectangle(getRb().getxPos(),getRb().getyPos(),50,30);
        Rectangle r2 = new Rectangle(getT().getxPos2(),getT().getyPos2(),80,30);
        if(r2.intersects(rbR)){
            int tk = 0;
            tk = tk + 1;
            getRb().setTkScore(tk);
            return true;
        }
        else{
            getRb().getTkScore();
            return false;
        }
    }
    //Check RB intersection with Goal & update score
    public boolean rbIntG()
    {
        Rectangle rbR = new Rectangle(getRb().getxPos(),getRb().getyPos(),50,30);
        Rectangle g1 = new Rectangle(getG().getxPos(),getG().getyPos(),80,650);
        if(rbR.intersects(g1)){
            int td = 0;
            td = td + 1;
            getRb().setTdScore(td);
            return true;
        }
        else{
            getRb().getTdScore();
            return false;
        }
    }
    //Move Tackler1 Left/Right
    public Rectangle moveTacklersLeftRight1()
    {
        if(getRb().getxPos()>getT().getxPos1())
        {
            getT().moveRight1();
        }else if(getRb().getxPos()<getT().getxPos1())
        {
            getT().moveLeft1();  
            return getT().moveLeft1();
        }
        return getT().moveRight1();
    } 
    //Move Tackler2 Left/Right
    public Rectangle moveTacklersLeftRight2()
    {
        if(getRb().getxPos()>getT().getxPos2())
        {
            getT().moveRight2();               
        }else if(getRb().getxPos()<getT().getxPos2())
        {
            getT().moveLeft2();
            return getT().moveLeft2();
        }
        return getT().moveRight2();
    }
    //Move Tackler1 Down/Up
    public Rectangle moveTacklersDownUp1()
    {
        if(getRb().getyPos()<getT().getyPos1()){
            getT().moveUp1();                
        }else if(getRb().getyPos()>getT().getyPos1()){
            getT().moveDown1();
            return getT().moveDown1();
        }
        return getT().moveUp1();
    }
    //Move Tackler2 Down/Up
    public Rectangle moveTacklersDownUp2()
    {
        if(getRb().getyPos()<getT().getyPos2()){
            getT().moveUp2();                
        }else if(getRb().getyPos()>getT().getyPos2()){
            getT().moveDown2();     
            return getT().moveDown2();
        }
        return getT().moveUp2();
    }
    //Get RB class
    public RunningBack getRb() {
        return rb;
    }
    //Set RB class
    public void setRb(RunningBack rb) {
        this.rb = rb;
    }
    //Get Tacklers class
    public Tacklers getT() {
        return t;
    }
    //Set Tacklers class
    public void setT(Tacklers t) {
        this.t = t;
    }
    //Get Goal class
    public Goal getG() {
        return g;
    }
    //Set Goal class
    public void setG(Goal g) {
        this.g = g;
    }
}
