package ru.kogut.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author S.Kogut on 09.01.2020
 */
public class FormatUtil {

    public static String decimalToStringByGrupping(BigDecimal value) {
        final String pattern = "###,###.##";
        final DecimalFormat formatter = new DecimalFormat(pattern);

        return formatter.format(value);
    }
}
