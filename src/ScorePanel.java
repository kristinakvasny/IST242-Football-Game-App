import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author kristinakvasny
 */
public class ScorePanel extends JPanel{   
    private JSlider js1 = new JSlider();
    private int td = 0;
    private int miss = 0;
    private JButton blue = new JButton("PSU");
    private JButton red = new JButton("GSU");
    private JButton yellow = new JButton("Pitt");
    private JLabel tk = new JLabel();
    private JLabel st = new JLabel();
    public ScorePanel()
    {
        //Panel Functions
        super();
        setBackground(Color.LIGHT_GRAY);
        //Add buttons, slider & text
        rulesText();
        createSpeedSlider();
        createRedButton();
        createBlueButton();
        createYellowButton();
        tdScoreText();
        tkScoreText();
    }
    //Creates PSU
    public JButton createBlueButton()
    {
        getBlue().setBackground(Color.blue);
        add(getBlue());
        return getBlue();
    }
    //Creates GSU
    public JButton createRedButton()
    {
        getRed().setBackground(Color.red);
        add(getRed());
        return getRed();
    }
    //Creates Pitt
    public JButton createYellowButton()
    {
        getYellow().setBackground(Color.yellow);
        add(getYellow());
        return getYellow();
    }
    //Creates JSlider
    public JSlider createSpeedSlider()
    {
        setJs1(new JSlider(JSlider.HORIZONTAL,1,5,3)); 
        getJs1().setBorder(BorderFactory.createTitledBorder("Pick speed of game")); 
        getJs1().setMajorTickSpacing(1); 
        getJs1().setPaintTicks(true); 
        getJs1().setPaintLabels(true); 
        add(getJs1());
        return getJs1();
    }
    public boolean checkSpeed(int i){
        //i = getJs1().getValue();
        if(getJs1().getValue() == i){
            return true;
        }
        return false;
    }
    //Displays Touchdown score
    public JLabel tdScoreText()
    {
        getSt().setText("Touchdowns: "+getTd());
        add(getSt());
        return getSt();
    }
    //Displays Tackle score
    public JLabel tkScoreText()
    {
        getTk().setText("Tackles: "+getMiss());
        add(getTk());
        return getTk();
    }
    //Displays Rules
    public JLabel rulesText()
    {
        JLabel rt = new JLabel();
        rt.setText("Pick a team & Press 'Space' to start");
        add(rt);
        return rt;
    }
    //Get Slider
    public JSlider getJs1() {
        return js1;
    }
    //Set Slider
    public void setJs1(JSlider js1) {
        this.js1 = js1;
    }
    //Get TD score
    public int getTd() {
        return td;
    }
    //Set TD score
    public void setTd(int td) {
        this.td = td;
    }
    //Get TK score
    public int getMiss() {
        return miss;
    }
    //Set TK score
    public void setMiss(int miss) {
        this.miss = miss;
    }
    //Get Blue button
    public JButton getBlue() {
        return blue;
    }
    //Set Blue button
    public void setBlue(JButton blue) {
        this.blue = blue;
    }
    //Get Red button
    public JButton getRed() {
        return red;
    }
    //Set Red button
    public void setRed(JButton red) {
        this.red = red;
    }
    //Get Yellow button
    public JButton getYellow() {
        return yellow;
    }
    //Set Yellow button
    public void setYellow(JButton yellow) {
        this.yellow = yellow;
    }
    //Get Tackle label
    public JLabel getTk() {
        return tk;
    }
    //Set Tackle label
    public void setTk(JLabel tk) {
        this.tk = tk;
    }
    //Get Touchdown label
    public JLabel getSt() {
        return st;
    }
    //Set Touchdown label
    public void setSt(JLabel st) {
        this.st = st;
    }
}
