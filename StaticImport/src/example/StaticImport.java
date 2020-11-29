package example;

//Static import are for importing static members while regular import are for importing classes
import static example.Config.*;
import static java.lang.Math.PI;
import static java.lang.Math.min;

public class StaticImport {
    public static void main(String[] args) {
        System.out.println(PI); //No need use Math.PI
        System.out.println(min(5, 7)); //No need use Math.min

        printConfig();
        System.out.println(name);
        System.out.println(val);
    }
}
