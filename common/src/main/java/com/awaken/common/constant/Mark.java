package com.awaken.common.constant;

public enum Mark {
    /**
     * 逗号：,
     */
    COMMA(","),
    /**
     * 冒号：:
     */
    COLON(":"),
    /**
     * 分号：;
     */
    SEMICOLON(";"),
    /**
     * 连字符／减号：-
     */
    HYPHEN("-"),
    /**
     * 斜杠：/
     */
    SLASH("/"),
    /**
     * 反斜杠：\
     */
    BACKSLASH("\\"),
    /**
     * 点／句号：.
     */
    PERIOD("."),
    /**
     * 下划线：_
     */
    UNDERSCORE("_"),
    /**
     * 星号：*
     */
    ASTERISK("*"),
    /**
     * 问号：?
     */
    QUESTION_MARK("?"),
    /**
     * 感叹号：!
     */
    EXCLAMATION_MARK("!"),
    /**
     * 单引号：'
     */
    SINGLE_QUOTATION_MARK("'"),
    /**
     * 引号："
     */
    QUOTATION_MARK("\""),
    /**
     * 左 括号：
     */
    LEFT_BRACKET("("),
    /**
     * 右 括号：
     */
    RIGHT_BRACKET(")"),
    /**
     * 左 中括号：
     */
    LEFT_SQUARE_BRACKET("["),
    /**
     * 右 中括号：
     */
    RIGHT_SQUARE_BRACKET("]"),
    /**
     * 左 大括号：
     */
    LEFT_BRACE("{"),
    /**
     * 右 大括号：
     */
    RIGHT_BRACE("}"),
    /**
     * 小于号：<
     */
    LESS_THAN("<"),
    /**
     * 大于号：>
     */
    GREATER_THAN(">"),
    /**
     * 等号：=
     */
    EQUAL("="),
    /**
     * 加号：+
     */
    PLUS("+"),
    /**
     * 百分号：%
     */
    PERCENT("%"),
    /**
     * & 符号
     */
    AMPERSAND("&"),
    /**
     * | 符号
     */
    PIPE("|"),
    /**
     * # 符号
     */
    OCTOTHORP("#"),
    /**
     * $ 符号
     */
    DOLLAR("$");

    private String mark;

    private Mark(String c) {
        this.mark = c;
    }

    @Override
    public String toString() {
        return this.mark;
    }
}
