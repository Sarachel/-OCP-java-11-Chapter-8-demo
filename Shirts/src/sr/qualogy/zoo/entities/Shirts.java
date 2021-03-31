package sr.qualogy.zoo.entities;

public class Shirts {
    public int color;
    public int image, size;

    public Shirts() {

    }

    public int getColor(){
        return color;
    }

    public void setColor(int newColor) {
        color = newColor;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int newImage) {
        image = newImage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        size = newSize;
    }

    public Shirts(int color, int image, int size){
        this.color= color;
        this.image= image;
        this.size= size;
    }

    @Override
    public String toString(){
        return ("Shirt color: " + this.getColor() + "\n" +
                "Image: " + this.getImage() +  "\n" +
                "Image size: " + this.getSize() + "\n");
    }
}
