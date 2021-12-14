package ru.mirea.task28;

public class Car {
    String roof;
    Door frontDoor, backDoor;

    public Car(String frontDoorColor, double frontDoorWidth, String backDoorColor, double backDoorWidth){
        frontDoor = new Door(frontDoorColor, frontDoorWidth);
        backDoor = new Door(backDoorColor, backDoorWidth);
    }

    public Car(){}

    public void fillWithDiesel(){
        System.out.println("Filled with diesel");
    }

    public class Door{
        String color;
        double width;
        public Door(String color, double width){
            this.color = color;
            this.width = width;
        }

        public void setWidth(Double width) {
            this.width = width;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Double getWidth() {
            return width;
        }

        @Override
        public String toString() {
            return "Door{" +
                    "color='" + color + '\'' +
                    ", width=" + width +
                    '}';
        }
    }
    public class BabyCar extends Car{
        @Override
        public void fillWithDiesel() {
            System.out.println("Can't fill with Diesel baby car!");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "roof='" + roof + '\'' +
                ", frontDoor=" + frontDoor.toString() +
                ", backDoor=" + backDoor.toString() +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("Blue", 40.0, "Blue", 55.0);
        Car babyCar = new Car().new BabyCar();
        car.fillWithDiesel();
        babyCar.fillWithDiesel();
    }
}
