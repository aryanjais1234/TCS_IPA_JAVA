package footwear;
import java.lang.reflect.Array;
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Footwear[] arr = new Footwear[5];

        for(int i=0;i<5;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            arr[i] = new Footwear(a,b,c,d);
        }
        sc.nextLine();
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        int ans1 = getCountByType(arr,s);
        Footwear ans2 = getSecondHighestPriceByBrand(arr,s1);

        if (ans1 == 0) {
            System.out.println("Footwear Not available");
        }
        else{
            System.out.println(ans1);
        }
        if (ans2==null){
            System.out.println("Brand not available");
        }
        else{
            System.out.println(ans2.getFootwearId());
            System.out.println(ans2.getFootwearName());
            System.out.println(ans2.getPrice());
        }
    }

    public static int getCountByType(Footwear[] arr, String n){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getFootwearType().equalsIgnoreCase(n)){
                res++;
            }
        }
        return res==0?0:res;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[]arr,String n){
        ArrayList<Integer>nums = new ArrayList();

        for(int i=0;i<arr.length;i++){
            if(arr[i].getFootwearName().equalsIgnoreCase((n))){
                nums.add(arr[i].getPrice());
            }
        }
        Collections.sort(nums);
        int a = 0;
        if(nums.size()==1){
            a = nums.get(nums.size()-1);
        }
        else if(nums.size()==0){
            return null;
        }
        else {
            for (int i=0;i<nums.size()-1;i++) {
                a = nums.get(i);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(nums.size()!=0) {
                if (arr[i].getPrice() == a) {
                    return arr[i];
                }
            }
        }
        return null;
    }
}

class Footwear{
    int footwearId;
    String footwearName;
    String footwearType;
    int price;

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getFootwearId() {
        return footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public int getPrice() {
        return price;
    }
}
