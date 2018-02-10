import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author kristinakvasny
 */
public class Controller {
    private Model model;
    private View view;
    private Timer tim;
    private RunningBackButton rbb;
    private TacklersButton tb1;
    private TacklersButton tb2;
    private GoalButton gb;
    private int delay = 600;
    public Controller(Model m, View v) 
    {
        //Setting Model & View in Controller
        this.model = m;
        this.view = v;
        //Initial setup of bounds
        setPlayersBounds();
        //Listeners & Timers
        PSUListener();
        GSUListener();
        PittListener();
        movementListener();
        timer();
        sliderChange();
    }

    public void setPlayersBounds(){
        getView().getIfr().getIp().getGp().getRbb().setBounds(getModel().getRb().getStartPos());
        getView().getIfr().getIp().getGp().getT1().setBounds(getModel().getT().getxPos1(),getModel().getT().getyPos1(),80,30);
        getView().getIfr().getIp().getGp().getT2().setBounds(getModel().getT().getxPos2(),getModel().getT().getyPos2(),80,30);
        getView().getIfr().getIp().getGp().getGoal().setBounds(getModel().getG().getxPos(),getModel().getG().getyPos(),80,650);
    }
    private void sliderChange()
    {
        getView().getIfr().getIp().getSp().getJs1().addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent e) 
            {
                if(getView().getIfr().getIp().getSp().checkSpeed(1)){
                    getTim().setDelay(1000);
                }
                if(getView().getIfr().getIp().getSp().checkSpeed(2)){
                    getTim().setDelay(800);
                }
                if(getView().getIfr().getIp().getSp().checkSpeed(3)){
                    getTim().setDelay(600);
                }
                if(getView().getIfr().getIp().getSp().checkSpeed(4)){
                    getTim().setDelay(400);
                }
                if(getView().getIfr().getIp().getSp().checkSpeed(5)){
                    getTim().setDelay(200);
                }
                getView().getIfr().getIp().getGp().requestFocusInWindow();
            }           
        });       
    }
    private void timer()
    {
        setTim(new Timer(getDelay(), new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                getModel().moveTacklersLeftRight1();
                getModel().moveTacklersDownUp1();
                getModel().moveTacklersLeftRight2();
                getModel().moveTacklersDownUp2();

                getView().getIfr().getIp().getGp().getT1().setBounds(getModel().getT().getxPos1(),getModel().getT().getyPos1(),80,30);
                getView().getIfr().getIp().getGp().getT2().setBounds(getModel().getT().getxPos2(),getModel().getT().getyPos2(),80,30);

                goalInt();
                tacklerInt();
            }           
        }));
    }
    //Keys to move RB
    private void movementListener()
    {
        getView().getIfr().getIp().getGp().addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent evt) 
            {
                int kk = evt.getKeyCode(); 
                if(kk == evt.VK_LEFT) {    
                    getView().getIfr().getIp().getGp().getRbb().setBounds(getModel().getRb().moveLeft());
                }    
                if(kk == evt.VK_RIGHT) {
                    getView().getIfr().getIp().getGp().getRbb().setBounds(getModel().getRb().moveRight());
                } 
                if(kk == evt.VK_UP) {
                    getView().getIfr().getIp().getGp().getRbb().setBounds(getModel().getRb().moveUp());
                } 
                if(kk == evt.VK_DOWN) {
                    getView().getIfr().getIp().getGp().getRbb().setBounds(getModel().getRb().moveDown());
                } 
                if(kk == evt.VK_SPACE) {
                    getTim().start();
                }               
            }           
        });
        getView().getIfr().getIp().getGp().getRbb().requestFocus();
    }
    //Goal intersection
    public void goalInt(){
        if(getModel().rbIntG()){
            getView().getIfr().getIp().getSp().setTd(getModel().getRb().getTdScore());
            getView().getIfr().getIp().getSp().tdScoreText();
            getTim().stop();    
        }       
    }
    //Tacklers intersection
    public void tacklerInt(){
        if(getModel().rbIntT1()){
            getView().getIfr().getIp().getSp().setMiss(getModel().getRb().getTkScore());
            getView().getIfr().getIp().getSp().tkScoreText();
            getTim().stop();
        }
        if(getModel().rbIntT2()){
            getView().getIfr().getIp().getSp().setMiss(getModel().getRb().getTkScore());
            getView().getIfr().getIp().getSp().tkScoreText();
            getTim().stop();
        }    
    }   
    //Adds ActionListener to blue button
    private void PSUListener()
    {
        getView().getIfr().getIp().getSp().getBlue().addActionListener((ActionEvent e) -> {
            getView().getIfr().getIp().getGp().getRbb().setBackground(Color.blue);
            getView().getIfr().getIp().getGp().requestFocusInWindow();
        });
    }
    //Adds ActionListener to red button
    private void GSUListener()
    {
        getView().getIfr().getIp().getSp().getRed().addActionListener((ActionEvent e) -> {
            getView().getIfr().getIp().getGp().getRbb().setBackground(Color.red);
            getView().getIfr().getIp().getGp().requestFocusInWindow();
        });
    }
    //Adds ActionListener to yellow button
    private void PittListener()
    {
        getView().getIfr().getIp().getSp().getYellow().addActionListener((ActionEvent e) -> {
            getView().getIfr().getIp().getGp().getRbb().setBackground(Color.yellow);
            getView().getIfr().getIp().getGp().requestFocusInWindow();
        });
    }
    //Get Model class
    public Model getModel() {
        return model;
    }
    //Set Model class
    public void setModel(Model model) {
        this.model = model;
    }
    //Get View class
    public View getView() {
        return view;
    }
    //Set View class
    public void setView(View view) {
        this.view = view;
    }
    //Get Timer
    public Timer getTim() {
        return tim;
    }
    //Set Timer
    public void setTim(Timer tim) {
        this.tim = tim;
    }
    //Get Runningback button
    public RunningBackButton getRbb() {
        return rbb;
    }
    //Set Runningback button
    public void setRbb(RunningBackButton rbb) {
        this.rbb = rbb;
    }
    //Get Delay
    public int getDelay() {
        return delay;
    }
    //Set Delay
    public void setDelay(int delay) {
        this.delay = delay;
    }
    //Get T1 button
    public TacklersButton getTb1() {
        return tb1;
    }
    //Set T1 button
    public void setTb1(TacklersButton tb1) {
        this.tb1 = tb1;
    }
    //Get T2 button
    public TacklersButton getTb2() {
        return tb2;
    }
    //Set T2 button
    public void setTb2(TacklersButton tb2) {
        this.tb2 = tb2;
    }
    //Get Goal button
    public GoalButton getGb() {
        return gb;
    }
    //Set Goal button
    public void setGb(GoalButton gb) {
        this.gb = gb;
    }
}
