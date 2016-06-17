package Casting;

public class CastingObjects {
    public static void main(String[] args) {

        Camera camera = new Camera();

        Machine machine1 = (Machine) camera;
        machine1.start();

    }

}

class Machine{

    public void start(){
    }
}

class Camera extends Machine{


    public String getColour() {
        return "RED";
    }

    public void start(){
        System.out.println("Camera Started with colour "+ getColour());
    }
}
