// BoldItalicText.java
public class BoldItalicText extends TextDecorator {
    public BoldItalicText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold and italic";
    }
}