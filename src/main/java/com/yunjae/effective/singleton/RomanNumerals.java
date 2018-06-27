package com.yunjae.effective.singleton;

import java.util.regex.Pattern;

/**
 * auth : yunjae.cho
 * description : Reusing expensive object for improved performance
 */
public class RomanNumerals {
    // Reusing expensive object for improved performance
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
