public class Bead {
    private float diameter;
    private float sizeOfBead;
    private String colour;
    private String designerName;
    private int id;

    public Bead() {
        diameter = 50.0f;
        sizeOfBead = 100.0f;
        colour = "red";
        designerName ="Karla";
        id = 1000;
    }

    public Bead(float diameter, float sizeOfBead, String colour, String designerName, int id) {
        this.diameter = diameter;
        this.sizeOfBead = sizeOfBead;
        this.colour = colour;
        this.designerName = designerName;
        this.id = id;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getSizeOfBead() {
        return sizeOfBead;
    }

    public void setSizeOfBead(float sizeOfBead) {
        this.sizeOfBead = sizeOfBead;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDesignerName() {
        return designerName;
    }

    public void setDesignerName(String designerName) {
        this.designerName = designerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void display(){
        System.out.println("Diameter: " + diameter);
        System.out.println("Size: " + sizeOfBead);
        System.out.println("Colour: " + colour);
        System.out.println("Designer: " + designerName);
        System.out.println("ID#: " + id);

    }
}
