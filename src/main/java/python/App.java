package python;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        InputStream source = new FileInputStream(
                "/Users/domino/Documents/School/Fall2022/cs152/python/Python-Interpreter/input.txt");

        // Create the character stream from the input stream.
        CharStream cs = CharStreams.fromStream(source);

        testLexer lexer = new testLexer(cs);
        testParser parser = new testParser(new CommonTokenStream(lexer));
        System.out.println("HI!");
        System.out.println(parser.text().toStringTree());

    }
}
