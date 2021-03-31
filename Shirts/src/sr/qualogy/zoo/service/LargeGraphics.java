package sr.qualogy.zoo.service;

import sr.qualogy.zoo.interfaces.Graphics;

public class LargeGraphics implements Graphics {

    @Override
    public void print()  {
        System.out.println("Graphics: Large");
    }
}
