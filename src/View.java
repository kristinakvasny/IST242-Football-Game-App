/**
 *
 * @author kristinakvasny
 */
public class View {
    private InitialFrame ifr;
    private Model model;
    public View(Model m)
    {
        //Setting IFr & Model in View
        this.model = m;
        ifr = new InitialFrame();
    }
    //Get IFr class
    public InitialFrame getIfr() {
        return ifr;
    }
    //Set IFr class
    public void setIfr(InitialFrame ifr) {
        this.ifr = ifr;
    }
    //Get Model class
    public Model getModel() {
        return model;
    }
    //Set Model class
    public void setModel(Model model) {
        this.model = model;
    }
}
