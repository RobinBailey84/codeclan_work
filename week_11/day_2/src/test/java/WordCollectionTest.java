import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordCollectionTest {

    WordCollection wordCollection;

    @Before
    public void before(){
        wordCollection = new WordCollection();

    }

//    @Test
//    public void canGetNumberOfWords(){
//        assertEquals(0, wordCollection.wordCount());
//    }

    @Test
    public void canAddItemToArray(){
        wordCollection.add("Hello");
        String[] array = wordCollection.getWords();
        assertEquals("Hello", array[0]);
    }
}
