import java.util.Collections;
import java.util.Stack;

/**
 * Created by machu on 2017-06-11.
 */
public class Brackets {
    boolean checkBrackets(String str) {
        if (str == null) return false;

        if (str.isEmpty()) return true;

        Stack<Character> stack = new Stack();
        for (Character c : str.toCharArray()) {

            if (!(c.equals('(') || (c.equals(')')))) return false;
            if (c.equals('(')) stack.push(c);
            if (c.equals(')')) {
                if (stack.empty()) return false;
                else stack.pop();
            }
        }
        return true;
    }
}
