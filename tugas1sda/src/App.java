import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
    ArrayList<String> nama = new ArrayList<String>();
        
    nama.add("f");
    nama.add("a");       
    nama.add("n");
    nama.add("a");
    
    System.out.println("\n=== TAMPILKAN DATA ===\n");
    for(int i = 0; i < nama.size(); i++){
        System.out.println(nama.get(i));
    }
    
    //IsEmpty
    System.out.println("\n==== 1. isEmpty\n");
    System.out.println(nama.get(1).isEmpty());

    //size()
    System.out.println("\n==== 2. size\n");
    System.out.println("Jumlah Data : " + nama.size());
    
    //get(0), get(2), get(6), get(-3)
    System.out.println("\n==== 3. get \n");

    try{
    System.out.println("Get index 0 : " + nama.get(0));
    System.out.println("Get index 2 : " + nama.get(2));
    System.out.println("Get index 6 : " + nama.get(6));
    System.out.println("Get index -3 : " + nama.get(-3));
    }
        catch(Exception e){
            System.out.println("ada yang tidak ditemukan\n" + e);
        }


    //indexOf(a), indexOf(c), indexOf(q)
    System.out.println("\n==== 4. indexOf\n");

    try{
    System.out.println("Index dari a : " + nama.indexOf("a"));
    System.out.println("Index dari c : " + nama.indexOf("c"));
    System.out.println("Index dari q : " + nama.indexOf("q"));
    }
    catch(Exception e){
        System.out.println(e);
    }

    //remove(0), remove(3), remove(2)
    System.out.println("\n==== 5. remove\n");

    try{
    System.out.println("Remove Index ke 0 : " + nama.remove(0));
    System.out.println("Remove Index ke 3 : " + nama.remove(3));
    System.out.println("Remove Index ke 2 : " + nama.remove(2));
    }
    catch(Exception e){
        System.out.println(e);
    }

    //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
    System.out.println("\n==== 5. add\n");

    try{
    System.out.println("Add e pada index ke 0");
    nama.add(0, "e");
    System.out.println("Add f pada index ke 2");
    nama.add(2, "f");
    System.out.println("Add g pada index ke 3");
    nama.add(3, "g");
    System.out.println("Add h pada index ke 4");
    nama.add(4, "h");
    System.out.println("Add h pada index ke 6");
    nama.add(6, "h");
    System.out.println("Add j pada index ke -3");
    nama.add(-3, "j");
    }
    catch(Exception e){
        System.out.println(e);
    }

    System.out.println("Tampilkan semua data terbaru");
    for(int i = 0; i < nama.size(); i++){
        System.out.println(nama.get(i));
    }
}
}
