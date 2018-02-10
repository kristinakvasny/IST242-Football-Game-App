import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.UIManager;
/**
 *
 * @author kristinakvasny
 */
public class InitialFrame extends JFrame {
    private InitialPanel ip;
    public InitialFrame()
    {
        //Frame Functions
        super("Football Game");
        LayoutSetupMAC();
        //Create & set main panel
        ip = new InitialPanel();
        add(ip);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,900);
        setVisible(true);
    }
    //Get IP class
    public InitialPanel getIp() {
        return ip;
    }
    //Set IP class
    public void setIp(InitialPanel ip) {
        this.ip = ip;
    }
    //MAC Layout
    void LayoutSetupMAC()
    {  
       try 
        {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        }catch(Exception e) 
        {
            e.printStackTrace();
        }                
    }
    
}
