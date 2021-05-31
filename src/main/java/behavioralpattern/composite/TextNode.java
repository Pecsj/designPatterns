package behavioralpattern.composite;

import java.util.List;

public class TextNode implements Node {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public Node add(Node node) {
        throw new UnsupportedOperationException();
    }

    public List<Node> children() {
        return null;
    }

    public String toXml() {
        return text;
    }
}