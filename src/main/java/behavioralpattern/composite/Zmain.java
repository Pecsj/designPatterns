package behavioralpattern.composite;

public class Zmain {
    public static void main(String[] args) {
        /**
         * 组合模式：
         * 常用于树结构
         *
         */
        Node root = new ElementNode("school");
        root.add(new ElementNode("classA")
                .add(new TextNode("Tom"))
                .add(new TextNode("Alice")));
        root.add(new ElementNode("classB")
                .add(new TextNode("Bob"))
                .add(new TextNode("Grace")));
        System.out.println(root.toXml());

    }
}
