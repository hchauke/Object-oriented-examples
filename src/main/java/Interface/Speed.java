package Interface;

public class Speed {
    public void fast(){
        System.out.println(" can reach maximum speeds of: " +getSpeed()+ "\n");
    }

    public void slow(){
        System.out.println(" can not reach maximum speed of: " +getSpeed()+ "\n");
    }

    public String getSpeed(){
        return "55 km/h";
    }
}
