package HotelManagementSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class algorithms {

    ArrayList<HotelManagementSystem> items;

    public algorithms(ArrayList<HotelManagementSystem> items) {
        this.items = items;
    }
    public static void main(String[] args) {
        var items = new ArrayList<HotelManagementSystem>();
        //items.add(new HotelManagementSystem(1, 1, 1000, "big", 1, "13-13-531", "open"));
        //items.add(new HotelManagementSystem(2, 1, 100, "big", 1, "13-13-531", "open"));
        //items.add(new HotelManagementSystem(3, 1, 5000, "big", 1, "13-13-531", "open"));
        //items.add(new HotelManagementSystem(4, 1, 9000, "small", 1, "13-13-531", "open"));

        //Collections.sort(items);
        //int ret = binarySearch(items,9000);
        //System.out.println(items.get(ret).getRoomType());
        algorithms alo = new algorithms(items);
        alo.importCsv();
        ArrayList<HotelManagementSystem> c =  alo.getFromTypes("not ok");
        for(HotelManagementSystem a:c){
            System.out.println(a.getStatus());
        }
        
    }
    public static int binarySearch(ArrayList<HotelManagementSystem> items, int search) {
        Collections.sort(items);
        int f = 0;
        int l = items.size() - 1;
        int mid;
        while (f <= l) {
            mid = (f + l) / 2;
            if (search == items.get(mid).getPrice()) {
                return mid;
            } else if ((items.get(mid).getPrice()) - search > 0) {
                l = mid - 1;
            } else {
                f = mid + 1;
            }
        }
        return -1;
    }
    public  void importCsv(){
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("rooms.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] item = line.split(",");
                this.items.add(new HotelManagementSystem(Integer.parseInt(item[0]),Integer.parseInt(item[1]) , Integer.parseInt(item[2]), item[3], Integer.parseInt(item[4]),item[5],item[6]));
            }
            br.close();
        } 
        catch (Exception e) {
        }    
    }
    public ArrayList<HotelManagementSystem> getFromTypes(String type){
        ArrayList<HotelManagementSystem> cats = new ArrayList<>();
        for (HotelManagementSystem h:this.items){
            if(h.getRoomType().equals(type)){
                cats.add(h);
            }
        }
        return cats;
    }
    
    
}
