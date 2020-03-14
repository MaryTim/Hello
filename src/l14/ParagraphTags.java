// Написать программу, выполняющую поиск в строке всех тегов
//абзацев, в т.ч. тех, у которых есть параметры, например
//<p id ="p1">, и замену их на простые теги абзацев <p>

package l14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphTags {

    public static void replaceTags () {

        String txt = "<p> </p>" +
                "Нам видно, что HTML параграфы имеют отступы по вертикали – такова особенность тегов <p> </p>. " +
                "HTML блоки <div> </div> такие пространства не создают, потому что они не несут никакой нагрузки, " +
                "а просто являются контейнерами." +
                "<p id=\"p1\">" + "\n" + "Tеги <p> </p> не могут содержать другие <p> </p> или <div> </div>. " +
                "Внутри <p> </p> могут быть размещены линейные элементы, такие как <span> </span> или, например, теги, " +
                "отвечающие за форматирование текста.";

        Pattern pattern = Pattern.compile("</*p *\\S*>");
        Matcher matcher = pattern.matcher(txt);
        System.out.println(txt.replaceAll("</*p *\\S*>" , "<p>"));
    }
}

