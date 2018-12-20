package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList(Arrays.asList("cat", "mouse", "frog", "dog", "dog"));

        WordList x = new WordList(arr);

        System.out.println(x.numWordsOfLength(4));
        System.out.println(x.numWordsOfLength(3));
        System.out.println(x.numWordsOfLength(2));

        x.removeWordsOfLength(4);
        System.out.println((x));
        x.removeWordsOfLength(3);
        System.out.println(x);
        x.removeWordsOfLength(2);
        System.out.println(x);
    }
}
