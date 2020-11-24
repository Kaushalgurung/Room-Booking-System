/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManagementSystem;

/**
 *
 * @author user
 */
public class HotelManagementSystem {

    public HotelManagementSystem(int entryNum, int RoomNo, int price, String roomType, int days) {
        this.entryNum = entryNum;
        this.RoomNo = RoomNo;
        this.price = price;
        this.roomType = roomType;
        this.days = days;
    }
    
    int entryNum;
    int RoomNo;
    int price;
    String roomType;

    public int getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(int entryNum) {
        this.entryNum = entryNum;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int RoomNo) {
        this.RoomNo = RoomNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    int days;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
