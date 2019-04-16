package com.lpc.spring.elexp.test;

import com.lpc.mybatis.pojo.Role;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ElExpTest {
    public static void main(String[] args) {
        //表达式解析器
        ExpressionParser parser = new SpelExpressionParser();
        //设置表达式
        Expression exp = parser.parseExpression("'hello world'");
        String str = (String) exp.getValue();
        System.out.println(str);
        //通过EL访问普通方法
        exp = parser.parseExpression("'hello world'.charAt(0)");
        char ch = (char) exp.getValue();
        System.out.println(ch);


        exp = parser.parseExpression("'hello world'.bytes");
        byte[] bytes = (byte[]) exp.getValue();
        System.out.println(bytes);

        Role role = new Role("444","lpcc","hello word","100");
        exp = parser.parseExpression("note");

        String note = (String) exp.getValue(role);
        System.err.println(note);

        EvaluationContext ctx = new StandardEvaluationContext(role);
        parser.parseExpression("note").setValue(ctx,"new note");
        note = parser.parseExpression("note").getValue(ctx,String.class);
        System.err.println(note);
    }
}
