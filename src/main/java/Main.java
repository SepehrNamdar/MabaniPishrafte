import khodro.jadid.Mashin;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class Main {

    public static void main(String... args) {    // arguments

        for (int index = 0; index < args.length; index++) {
            out.println(args[index]);
        }

        String mark = args[0];
        String gonjayeshSandogh = args[1];
        String noeDande = args[2];
        Mashin mashin = new Mashin(mark, parseInt(gonjayeshSandogh), noeDande);
        if (mashin.ayaDarHaleHarekatAst()) {
            out.println("Mashin Dar hale harekat ast");
        } else {
            out.println("Mashin park ast");
        }

        out.println(mashin.getMark());

        out.println("Payan Ejra");
    }
}
