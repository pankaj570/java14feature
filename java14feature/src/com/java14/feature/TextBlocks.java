package com.java14.feature;
/*
* it is supporting multiline string.
*  It preserves all the spaces present before it.
* if you want then format as you want using \n, \s (special carriage return characters)
*
* */
public class TextBlocks {
    public static void main(String[] args) {
        String text;
        text = """
                {
                  "array": [
                    1,
                    2,
                    3 
                  ],\n
                  "boolean": true,\s"color": "gold",
                  "null": null,
                  "number": 123,
                  "object": {
                    "a": "b",
                    "c": "d"
                  },
                  "string": "Hello World"
                }
                """;
        System.out.println(text);
    }
}
