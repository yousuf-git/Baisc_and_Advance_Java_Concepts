package Up_and_Down_Casting;

public class Square extends Shape {
    int len;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    Square(String name, int len) {
        super(name);
    }

    @Override
    public String toString() {
        return "Square [name = " + name + ", len = " + len + "]";
    }

    public int getArea() {
        return len*len;
    }

}
