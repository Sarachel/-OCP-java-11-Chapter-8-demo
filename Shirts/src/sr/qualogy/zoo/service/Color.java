package sr.qualogy.zoo.service;

import sr.qualogy.zoo.abstracts.GraphicsDecorator;
import sr.qualogy.zoo.interfaces.Graphics;

public class Color extends GraphicsDecorator {

    public Color(Graphics graphicsColor) {
        super(graphicsColor);
    }

    @Override
    public void print() {
        graphicsColor.print();
        setGraphicsColor(graphicsColor);
    }

    private void setGraphicsColor(Graphics graphicsColor) {
        System.out.println("Graphics is black");
    }


}
