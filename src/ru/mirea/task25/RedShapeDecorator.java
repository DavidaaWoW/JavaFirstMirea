package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator implements Shape{
    public Shape shape;
    public RedShapeDecorator(){

    }
    @Override
    public void draw() {
        super.draw();
    }
    private void setRedBorder(){

    }
}
