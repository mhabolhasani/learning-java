public class classes {
    //definig fields

    public String brand = null;
    public String model = null;
    public String color = null;

    // defining constructor
    public classes(String brand , String model , String color){
        this.brand = brand; //'this' like 'self' in python!
        this.model = model;
        this.color = color;
    }
    // we can define more than one constructor

    public classes(){}//like by defalut constructor

    // or like this with different argument .(we call it 'overload' constructor)

    // we can also define a method for our class .
    public void SetModel(String model){
        this.model = model;
    }

    // exeption in constructor 
    public classes(String brand) throws Exception {
        if(brand == null) {
            throw new Exception("The brand parameter cannot be null!");
        }
    }

    public static void main(String[] args) {
        
    }    
}
