import java.awt.*;
import javax.swing.*;
/**
 *
 * @author kristinakvasny
 */
public class InitialPanel extends JPanel { 
    private ScorePanel sp;
    private GamePanel gp;
    public InitialPanel()
    {
        //Panel Functions
        super();
        setBackground(Color.gray);
        setLayout(new BorderLayout());
        //Create & set panels
        sp = new ScorePanel(); 
        add(sp,BorderLayout.NORTH);
        gp = new GamePanel();
        add(gp,BorderLayout.CENTER);
    }
    //Get SP class
    public ScorePanel getSp() {
        return sp;
    }
    //Set SP class
    public void setSp(ScorePanel sp) {
        this.sp = sp;
    }
    //Get GP class
    public GamePanel getGp() {
        return gp;
    }
    //Set GP class
    public void setGp(GamePanel gp) {
        this.gp = gp;
    }
}
