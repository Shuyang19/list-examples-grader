import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testFiler()
  {
    StringChecker sc = new StringChecker() 
    {
        public boolean checkString(String str)
        {
          if(str.contains("a")) 
          {
            return true;
          }
            return false;
        }
    };

      List<String> input = Array.asList("cat", "dog", "apple");
      List<String> output = Array.asList("cat", "apple");
      assertEquals(output.toArray(), ListExamples.filter(input, sc).toArray());
    

  }
  @Test
  public void testmerge()
  {
    List<String> ls1 = Array.asList("apple", "cat", "pear");
    List<String> ls2 = Array.asList("banana", "dog");
    List<String> expected = Array.asList("apple", "banana", "cat", "dog", "pear");
    assertArrayEquals(expected.toArray(), ListExamples.merge(ls1, ls2));
  }
}
