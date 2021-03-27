public class Level extends Tool{
    private String function;

    //Constructor
    public Level(String name) {
        super(name);
    }

    //Set function to set the specified function of the tool.
    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return ( super.getName() + " " + function );
    }
}
