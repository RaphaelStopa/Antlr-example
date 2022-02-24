package com.example.antlrexample;


import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;


public class MyCalculator extends antrl.calculatorBaseListener {

    ParseTreeProperty<Integer> values = new ParseTreeProperty();
    public void setValue(ParseTree node, int value) {values.put(node, value);}

    public int getValue(ParseTree node) {return  values.get(node);}

    private int answer;


    @Override
    public void exitProg(antrl.calculatorParser.ProgContext ctx) {
        answer = getValue(ctx.expr());
    }


    @Override
    public void exitPar(antrl.calculatorParser.ParContext ctx) {
        int value = getValue(ctx.expr());
        setValue(ctx, value);
    }


    @Override
    public void exitNum(antrl.calculatorParser.NumContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        setValue(ctx, value);
    }

    @Override
    public void exitOpBin(antrl.calculatorParser.OpBinContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        final int value;
        String text = ctx.op.getText();
        if (text.equals("*")) {
            value = left * right;
        } else if (text.equals("/")) {
            value = left / right;
        } else if(text.equals("+")){
            value = left + right;
        } else {
            value = left - right;
        }
        setValue(ctx, value);
    }

    public int result(){
        return answer;
    }
}
