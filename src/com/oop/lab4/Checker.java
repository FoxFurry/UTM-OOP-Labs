package com.oop.lab4;

public class Checker {
    private String expression;

    public Checker(String _expr) {
        expression = _expr;
    }

    public boolean checkExpr() {
        int paranth_count = 0;
        StringBuilder temp_expr = new StringBuilder(expression);
        for (int pos = 0; pos < temp_expr.length(); pos++)
            switch (temp_expr.charAt(pos)) {
                case ' ':
                    temp_expr.deleteCharAt(pos);
                    pos--;
                    break;
                case '(':
                    if(!isOperator(temp_expr.charAt(pos-1)) && temp_expr.charAt(pos-1) != '(')
                        return false;
                    paranth_count++;
                    break;
                case ')':
                    if(!Character.isDigit(temp_expr.charAt(pos-1)) && temp_expr.charAt(pos-1) != ')')return false;

                    paranth_count--;
                    break;
                default:
                    break;

            }
        expression = temp_expr.toString();
        return paranth_count==0;
    }

    boolean isOperator(char sign){
        return switch (sign) {
            case '+', '-', '*', '/', '^' -> true;
            default -> false;
        };
    }

    public String getExpression() {
        return expression;
    }
}
