public class copil extends Clasa {

    private String Elevi;


    public copil() {
        super(4, "Not specified", false);
        Elevi = "Not specified";
    }

    public copil(String Elevi) {
        this();
        this.Elevi = Elevi;
    }

    public String getElevi() {
        return Elevi;
    }

    public void setElevi(String Elevi)
    {
        Elevi = Elevi;
    }

    @Override
    public String toString() {
        return "copil{" + "Elevi='" + Elevi + '\'' + super.toString();
    }
}