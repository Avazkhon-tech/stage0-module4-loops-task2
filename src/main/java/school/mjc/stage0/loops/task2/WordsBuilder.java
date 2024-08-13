package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        String phrase = "";
        while (counter <= chars.length -1) {
            phrase += chars[counter];
            counter++;
        }

        System.out.print(phrase);
    }
}
