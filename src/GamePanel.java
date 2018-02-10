import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
/**
 *
 * @author kristinakvasny
 */
public class GamePanel extends JPanel{
    private RunningBackButton rbb;
    private TacklersButton t1;
    private TacklersButton t2;
    private GoalButton goal;
    public GamePanel()
    {
        //Panel Functions
        super();
        setBackground(Color.green.darker());
        setLayout(null);
        setFocusable(true);
        //Create player buttons
        rbb = new RunningBackButton();
        add(rbb);
        t1 = new TacklersButton();
        add(t1);
        t2 = new TacklersButton();
        add(t2);
        goal = new GoalButton();
        add(goal);
    }
    //Paint component
    public void paintComponent(Graphics g) 
    { 
        super.paintComponent(g); 
        requestFocusInWindow(); 
    } 
    //Get T1 Button
    public TacklersButton getT1() {
        return t1;
    }
    //Set T1 Button
    public void setT1(TacklersButton t1) {
        this.t1 = t1;
    }
    //Get T2 Button
    public TacklersButton getT2() {
        return t2;
    }
    //Set T2 Button
    public void setT2(TacklersButton t2) {
        this.t2 = t2;
    }
    //Get Goal button
    public GoalButton getGoal() {
        return goal;
    }
    //Set Goal button
    public void setGoal(GoalButton goal) {
        this.goal = goal;
    }
    //Get Runningback Button
    public RunningBackButton getRbb() {
        return rbb;
    }
    //Set Runningback Button
    public void setRbb(RunningBackButton rbb) {
        this.rbb = rbb;
    }
    
}
