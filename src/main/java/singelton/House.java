package singelton;

public class House {
    private static House house;
    private House () { }

    public House getInstance(){
        if ( House.house == null ) {
            House.house = new House();
        }
        return House.house;
    }
}
