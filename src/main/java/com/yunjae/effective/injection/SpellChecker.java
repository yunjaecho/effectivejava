package com.yunjae.effective.injection;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class SpellChecker {
    private final Lexicon dictionary ;

    public SpellChecker(Supplier<Lexicon> dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary.get());
    }

    public static boolean isVVaild(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }
}
