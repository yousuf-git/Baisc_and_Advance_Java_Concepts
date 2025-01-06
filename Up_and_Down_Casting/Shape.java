package Up_and_Down_Casting;

public class Shape {
    String name;
    
    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape [name = " + name + "]";
    }


}
