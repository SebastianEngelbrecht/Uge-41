import java.util.ArrayList;

public class Building {
    int rooms;
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;

    public ArrayList<Room> list = new ArrayList<Room>();


    public Building(int rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public int getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public ArrayList<Room> getList() {
        return list;
    }
}
