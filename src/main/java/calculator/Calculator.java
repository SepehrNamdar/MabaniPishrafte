package calculator;

import static java.lang.Double.parseDouble;

public class Calculator {
    public String add(final String adadAval, final String adadDovom) {
        double d1, d2;
        try {
            d1 = parseDouble(adadAval);
            d2 = parseDouble(adadDovom);
        } catch (NumberFormatException nfe) {
            System.out.println("Adade vared shode ghbel ghabol nist");
            throw nfe;
        }
        final double result = d1 + d2;
        return String.valueOf(result);
    }
}
