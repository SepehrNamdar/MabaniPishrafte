package calculator;

import java.io.IOException;

import static java.lang.Double.parseDouble;
import static java.lang.System.out;

public class Calculator {

    public String add(final String adadAval, final String adadDovom) {
        double d1, d2;
        try {
            d1 = parseDouble(adadAval);
            d2 = parseDouble(adadDovom);
        } catch (NumberFormatException nfe ) {
            out.println("Adade vared shode ghbel ghabol nist");
            throw nfe;
        } catch (Exception e) {
            out.println("Yek khataye gheyr ghabele pishbini dar system rokh dad");
            throw e;
        } finally {
            out.println("Lotfan Dobare Emtehan konid");
        }
        final double result = d1 + d2;
        return String.valueOf(result);
    }

}
