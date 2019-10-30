import cats.Cat;
import cats.LongHairCat;

public class PetManager {
    public static void main(String[] args) {
        LongHairCat nam = new LongHairCat("Nấm");

        System.out.println("Đây là " + nam.getSpecificName());
        System.out.println("Bạn này tên: " + nam.getName());

        System.out.println("------------------------------");

        Cat sun = new Cat();
        sun.setName("Sún");
        System.out.println("Đây là " + sun.getSpecificName());
        System.out.println("Bạn này tên: " + sun.getName());


    }
}
