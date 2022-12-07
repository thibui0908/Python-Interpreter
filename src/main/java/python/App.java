package python;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import python.antlr.PythonLexer;
import python.antlr.PythonParser;
import python.executor.Executor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        InputStream source = Files.newInputStream(
                Paths.get(args[0]));

        // Create the character stream from the input stream.
        CharStream cs = CharStreams.fromStream(source);

        PythonLexer lexer = new PythonLexer(cs);
        PythonParser parser = new PythonParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        Executor exec = new Executor();

        exec.visit(parser.file_input());


    }
}
