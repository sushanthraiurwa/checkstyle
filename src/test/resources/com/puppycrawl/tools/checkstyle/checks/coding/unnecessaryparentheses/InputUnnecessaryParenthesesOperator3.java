/*
UnnecessaryParentheses
tokens = (default)EXPR, IDENT, NUM_DOUBLE, NUM_FLOAT, NUM_INT, NUM_LONG, \
         STRING_LITERAL, LITERAL_NULL, LITERAL_FALSE, LITERAL_TRUE, ASSIGN, \
         BAND_ASSIGN, BOR_ASSIGN, BSR_ASSIGN, BXOR_ASSIGN, DIV_ASSIGN, \
         MINUS_ASSIGN, MOD_ASSIGN, PLUS_ASSIGN, SL_ASSIGN, SR_ASSIGN, STAR_ASSIGN, \
         LAMBDA, TEXT_BLOCK_LITERAL_BEGIN, LAND, LITERAL_INSTANCEOF, GT, LT, GE, \
         LE, EQUAL, NOT_EQUAL, UNARY_MINUS, UNARY_PLUS, INC, DEC, LNOT, BNOT, \
         POST_INC, POST_DEC


*/

package com.puppycrawl.tools.checkstyle.checks.coding.unnecessaryparentheses;

public class InputUnnecessaryParenthesesOperator3 {

    public void closeBlock() {
        int code = 3;
        if ((code & 2) > 21) {}
        if ((code | 2) > 21) {}
        if ((code ^ 2) > 21) {}

        if ((code & 2) < 21) {}
        if ((code | 1) < 8) {}
        if ((code ^ 2) < 21) {}

        if ((code & 2) <= 21) {}
        if ((code | 1) <= 8) {}
        if ((code ^ 2) <= 21) {}

        if ((code & 2) >= 21) {}
        if ((code | 1) >= 8) {}
        if ((code ^ 2) >= 21) {}
        if ((code ^ 1) >= 21) {}

        int x = 9, y = 8;
        if(x>= 0 != (x<=8 | y<=11) && y>=8) {
            return;
        }
    }
}
