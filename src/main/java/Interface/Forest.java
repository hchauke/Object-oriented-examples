package Interface;


import java.util.List;

class Forest{

    private List<Animal> animals;

    public Forest(List<Animal> animals){
        this.animals = animals;
    }


    public void lunch(){
        for (int i = 0; i < this.animals.size(); i++) {
            this.animals.get(i).eat();
        }
    }

    public void racing(){
        for (int i = 0; i < this.animals.size(); i++) {
            this.animals.get(i).run();
        }
    }
}
