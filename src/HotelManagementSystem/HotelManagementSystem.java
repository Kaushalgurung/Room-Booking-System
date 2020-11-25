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
    
    public HotelManagementSystem(int entryNum, int RoomNo, int Price, String RoomType, int days, String date, String status) {
        this.entryNum = entryNum;
        this.RoomNo = RoomNo;
        this.Price = Price;
        this.RoomType = RoomType;
        this.days = days;
        this.date= date;
        this.status= status;
    }
        int entryNum;
        int RoomNo;
        int Price;
        String RoomType;
        int days;
        String date;
        String status;
        
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
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void setdate(String date){
        this.date = date;
    }
    public String getdate(){
        return date;
    }
    public void setstatus(String status){
        this.status= status;
    }
    public String getstatus(){
        return status;
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
