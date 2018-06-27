package com.yunjae.effective.injection;

public class MainApp {
    public static void main(String[] args) {
        Lexicon lexicon = new KoreanDictionary();
        SpellChecker spellChecker = new SpellChecker(() -> lexicon);
    }
}
