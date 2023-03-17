package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

//Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники слово «Java».
public class Decrypt {
    private static final String[] PREPOSITIONS = {
            "у", "в", "на", "до", "над", "про", "з", "із",
            "за", "біля", "перед", "при", "під", "від", "до",
            "для", "без", "над", "між"
    };

    public static void main(String[] args) throws IOException {
        Path filepath = Path.of("/home/nadia/IdeaProjects/AdvHomework4/src/task2/task2.txt");
        String fileContent = Files.readString(filepath);
        String prepositionsRegex = buildPrepositionsRegex();
        String newFileContent = fileContent.replaceAll(prepositionsRegex, "Java");
        Files.writeString(filepath, newFileContent, StandardOpenOption.APPEND);
    }

    private static String buildPrepositionsRegex() {
        StringBuilder builder = new StringBuilder();
        for (String preposition : PREPOSITIONS) {
            builder.append("\\b").append(preposition).append("\\b|");
        }
        return builder.substring(0, builder.length() - 1);
    }
}
