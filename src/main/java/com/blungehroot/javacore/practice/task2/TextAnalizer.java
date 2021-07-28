package com.blungehroot.javacore.practice.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class TextAnalizer {
    public static void main(String[] args) {
        String text1 = "[(Neque porro quisquam est qui dolorem {ipsum quia} dolor sit amet, consectetur, adipisci velit)]";
        String text2 = "[Neque porro quisquam (est qui dolorem ipsum {quia} dolor sit amet,) consectetur, adipisci velit";
        String text3 = "[Neque porro (quisquam} {est qui dolorem ipsum quia) dolor sit amet, consectetur, adipisci velit]";

        TextValidator textValidator = new TextValidator();

        textValidator.bracketsValidation(text1);
        textValidator.bracketsValidation(text2);
        textValidator.bracketsValidation(text3);
    }
}

class TextValidator {
    private static final String SQUARE_OPEN_BRACKET = "[";
    private static final String SQUARE_CLOSE_BRACKET = "]";
    private static final String OPEN_PARENTHESIS = "(";
    private static final String CLOSE_PARENTHESIS = ")";
    private static final String OPEN_CURLY_BRACE = "{";
    private static final String CLOSE_CURLY_BRACE = "}";

    public LinkedList<String> getOnlyBracketsList(String text) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(text.split("")));
        LinkedList<String> result = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (SQUARE_OPEN_BRACKET.equals(list.get(i))) {
                result.add(list.get(i));
            }
            if (SQUARE_CLOSE_BRACKET.equals(list.get(i))) {
                result.add(list.get(i));
            }
            if (OPEN_PARENTHESIS.equals(list.get(i))) {
                result.add(list.get(i));
            }
            if (CLOSE_PARENTHESIS.equals(list.get(i))) {
                result.add(list.get(i));
            }
            if (OPEN_CURLY_BRACE.equals(list.get(i))) {
                result.add(list.get(i));
            }
            if (CLOSE_CURLY_BRACE.equals(list.get(i))) {
                result.add(list.get(i));
            }
        }

        return result;
    }

    public boolean bracketsValidation(String str) {
        boolean valid = false;
        LinkedList<String> list = getOnlyBracketsList(str);

        for (int i = 0; i < list.size(); i++) {
            if (list.getFirst().equals(SQUARE_OPEN_BRACKET)) {
                if (list.getLast().equals(SQUARE_CLOSE_BRACKET)) {
                    list.removeFirst();
                    list.removeLast();
                    valid = true;
                }
            } else {
                valid = false;
            }
            if (list.getFirst().equals(OPEN_PARENTHESIS)) {
                if (list.getLast().equals(CLOSE_PARENTHESIS)) {
                    list.removeFirst();
                    list.removeLast();
                    valid = true;
                }
            } else {
                valid = false;
            }
            if (list.getFirst().equals(OPEN_CURLY_BRACE)) {
                if (list.getLast().equals(CLOSE_CURLY_BRACE)) {
                    list.removeFirst();
                    list.removeLast();
                    valid = true;
                }
            } else {
                valid = false;
            }
        }
        if (valid) {
            System.out.print("All opened brackets are closed: ");
            getOnlyBracketsList(str).forEach(System.out::print);
        } else {
            System.out.print("Some brackets are not closed: ");
            getOnlyBracketsList(str).forEach(System.out::print);
        }
        System.out.println();
        return valid;
    }
}
