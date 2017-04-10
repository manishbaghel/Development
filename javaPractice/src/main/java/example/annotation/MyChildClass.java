package example.annotation;

/**
 * Created by mb00549 on 3/21/2017.
 */
public class MyChildClass extends MyParentClass {

    @Override
    public void justaMethod() {
        System.out.println("Child class method");
    }

    /**
     * @deprecated do not use this method anymore
     */
    @Deprecated
    public void anyMethodHere() {
        System.out.println("This is depricated method");
    }

    public static void main(String args[]) {
        MyChildClass myChildClass = new MyChildClass();
        myChildClass.justaMethod();
        myChildClass.anyMethodHere();
    }

    @SuppressWarnings("deprecation")
    public void suppWarning() {
        anyMethodHere();
    }
}