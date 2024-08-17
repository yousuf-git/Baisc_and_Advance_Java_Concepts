// Creating a simple class "Outer" and then crating an inner class iniside it
// Can be usefull if for a specific class needs a supportive class is making sense only for that specific class. So we just create it inside it and use it there

package InnerClasses;

public class Outer {
    int var;
    String str;
    Inner inner; // ignore it at first
    
    // Constructors

    Outer() {
    }

    public Outer(int var, String str) {
        inner = new Inner(); // can be created instances of inner and used as required
        this.var = var;
        this.str = str;
    }

    // getters / setters
    public void setStr(String str) {
        this.str = str;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var1) {
        this.var = var1;
    }

    public String getStr() {
        return str;
    }

    

    @Override
    public String toString() {
        return "Outer [var=" + var + ", str=" + str + ", inner=" + inner + "]";
    }



    // A class can also have inner class
    public class Inner {
        // Inner class constructor
        int var;
        String str;

        Inner() {
        }

        public Inner(int var, String str) {
            this.var = var;
            this.str = str;
        }

        public int getVar() {
            return var;
        }

        public void setVar(int var) {
            this.var = var;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        @Override
        public String toString() {
            return "Inner [var=" + var + ", str=" + str + "]";
        }
        

    }

    // A method that will be a helper to get inner class object
    public Inner createInnerClass(int var, String str) {
        return new Inner(var, str);
    }
    
    // Normal methods can also have inner classes
    public void createNewClass() {
        class MethodClass {
            MethodClass() {
            }
        }
        new MethodClass(); // can only be used within this method
    }
    // MethodClass m = new MethodClass(); // cannot be resolved to a type
}
