package khodro;

// Outer Class
public class Ranande {

    private String noeGavahiname = "Paye 1";    // Runtime
    private static String nam = "Farhad";   // Compile Time

    // Non-static Nested Class : Inner Class
    public class Gavahiname {

        public void print() {
            System.out.println("Class Non Static : ");
            System.out.println(noeGavahiname);
            System.out.println(nam);
        }

    }

    // Static Nested Class
    public static class StaticGavahiname {

        public void print() {
            System.out.println("Class Static : ");
            //System.out.println(noeGavahiname);    // Kar nemikonad
            System.out.println(nam);
        }

    }
}
