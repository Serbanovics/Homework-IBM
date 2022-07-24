public class Clasa {

    private int WhichClass;
    private String Name;
    private boolean Catalog;


    public Clasa() {
        super();
    }

    public Clasa(int WhichClass, String Name, boolean Catalog) {
        this.WhichClass = WhichClass;
        this.Name = Name;
        this.Catalog = Catalog;
    }

    public int getWhichClass() {
        return WhichClass;
    }

    // Getters And Setters
    public void setWhichClass(int whichClass) {
        WhichClass = whichClass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isCatalog() {
        return Catalog;
    }

    public void setCatalog(boolean catalog) {
        Catalog = catalog;
    }


    public void Catalog(){
        if(Catalog == true)
        {
            System.out.println(Name + " he had an A average in 4th grade");
        }
        else{
            System.out.println(Name + " didn't have an A average in 4th grade");
        }
    }

    //toString() overwritten
    @Override
    public String toString() {
        return "Clasa{" + "WhichClass=" + WhichClass + ", Name='" + Name + '\'' + ", Catalog=" + Catalog + '}';
    }
}
