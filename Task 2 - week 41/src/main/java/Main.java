public class Main {

    public static void main (String[] args){
        Room room1 = new Room(new Wall(4),2,6,4);
        Room room2 = new Room(new Wall(6),2,4,6);
        Room room3 = new Room(new Wall(4), 1,3,2);
        Building building = new Building(3,1,2,false);

        building.getList().add(room1);
        building.getList().add(room2);
        building.getList().add(room3);

        int sum = room1.getNumberOfLamps() + room2.getNumberOfLamps() + room3.getNumberOfLamps();
        System.out.println("Number of lamps is " + sum);

        if(building.numberOfFloors > building.getRooms()){
            System.out.println("This is an odd building");
        }
        else
        {
            System.out.println("This is a normal Building");
        }




    }
}
