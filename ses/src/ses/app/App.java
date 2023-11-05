package ses.app;

import ses.grammar.*;
import ses.*;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {
	public static void main(String[] args) {
		try {
			test();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void test() throws IOException {
		// create a CharStream that reads from standard input
		CharStream input = CharStreams.fromFileName("C:\\Users\\thejo\\git\\ses-repo\\ses\\src\\ses\\app\\test.txt");
		
		// create a lexer that feeds off of input CharStream
		SESGrammarLexer lexer = new SESGrammarLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		SESGrammarParser parser = new SESGrammarParser(tokens);
		ParseTree tree = parser.ses(); // begin parsing at ses (first) rule
		
		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		
		// Create the instantiator
		SESModelInstantiator modelInstantiator = new SESModelInstantiator();
		
		// Walk the tree created during the parse, trigger callbacks
		walker.walk(modelInstantiator, tree);
		
		System.out.println("Entities: ");
		for(Entity e : modelInstantiator.ses.getEntities()) {
			System.out.println(e.toString());
		}
		System.out.println();
		
		System.out.println("Relations: ");
		for(Relation r : modelInstantiator.ses.getRelations()) {
			System.out.println(r.toString());
		}
		System.out.println();
		
		System.out.println("Variables: ");
		for(Variable v : modelInstantiator.ses.getVariables()) {
			System.out.println(v.toString());
		}
		
		System.out.println();
	}
}
