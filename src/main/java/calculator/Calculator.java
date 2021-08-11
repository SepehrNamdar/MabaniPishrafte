package calculator;

import static java.lang.Double.parseDouble;

public class Calculator {
    public String add(final String adadAval, final String adadDovom) {
        final double d1 = parseDouble(adadAval);
        final double d2 = parseDouble(adadDovom);
        final double result = d1 + d2;
        return String.valueOf(result);
    }
}
