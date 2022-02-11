package com.example.antlrexample;

import antrl.calculatorLexer;
import antrl.calculatorParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class AntlrExampleApplication {

	private static ParseTree parse(String progam) {
		final ANTLRInputStream input = new ANTLRInputStream(progam);
		final antrl.calculatorLexer lexer = new calculatorLexer(input);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final antrl.calculatorParser parser = new calculatorParser(tokens);
		return parser.prog();
	}


	public static void main(String... args) throws IOException {
//		SpringApplication.run(AntlrExampleApplication.class, args);
		String progam = "1+2*(3-4)*5/2";
		if(args.length > 0) {
			progam =args[0];
		}
		final ParseTree tree = parse(progam);
		final ParseTreeWalker walker = new ParseTreeWalker();

		//Percorendo a Arvore para avaliar o programa
		final MyCalculator listener = new MyCalculator();
		walker.walk(listener, tree);
		int result = listener.result();

		System.out.println(progam);
		System.out.println("=======");
		System.out.println(result);
		System.out.println("=======");
	}



}
