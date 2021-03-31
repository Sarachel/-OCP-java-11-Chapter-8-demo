package sr.qualogy.zoo.abstracts;

import sr.qualogy.zoo.interfaces.Graphics;

public abstract class GraphicsDecorator implements Graphics {
    protected Graphics graphicsColor;

    public GraphicsDecorator(Graphics graphicsColor){
        this.graphicsColor = graphicsColor;
    }

    public void print(){
        graphicsColor.print();
        //setGraphicsColor();
    }
}