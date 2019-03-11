public class WordCollection {
    private String[] words;

    public WordCollection(){
        this.words = new String[5];
    }

    public int wordCount() {
        return this.words.length;
    }

    public String[] getWords() {
        return words;
    }

    public void add(String word) {
        this.words[0] = word;
    }
}
