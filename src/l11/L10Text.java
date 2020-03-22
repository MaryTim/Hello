package l11;

import java.util.*;

public class L10Text {

    public static void main (String[] args) {

        String txt = "And she had never been here before. She realized it was the quiet place where the growing pheasants were reared "
                + "the keeper in his shirt‑sleeves was kneeling, hammering. The dog trotted forward with a short, sharp bark, " +
                "and the keeper lifted his face suddenly and saw her. He had a startled look in his eyes.";

        txt = txt.replaceAll(", ", " ");
        txt = txt.replaceAll("\\. ", " ");
        txt = txt.replaceAll("\\.", "");
        txt = txt.toLowerCase();
        List<String> txtList = List.of(txt.split(" "));
        System.out.println(txtList);
        Map<String, Integer> wordbook = new LinkedHashMap<>();
        for (int i = 0; i<txtList.size(); i++) {
            wordbook.put(txtList.get(i), Collections.frequency(txtList, txtList.get(i)));
        }
        System.out.println(wordbook);
    }

}
