package structuralpattern.Interpreter;

public class Zmain {
    /**
     * 解释器模式：
     * 解释器模式（Interpreter）是一种针对特定问题设计的一种解决方案。例如，匹配字符串的时候，由于匹配条件非常灵活，使得通过代码来实现非常不灵活。
     *
     */
    public static void main(String[] args) {
        String s = "+861012345678";
        System.out.println(s.matches("^\\+\\d+$"));
    }
}
