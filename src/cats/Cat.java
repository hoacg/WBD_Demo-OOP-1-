package cats;

import java.util.InputMismatchException;

public class Cat {
    protected String specificName = "Mèo";
    private String name;

    public void setName(String name) {

        if (name.trim().isEmpty()) {
            throw new InputMismatchException("Không được đặt tên như thế này!");
        }


        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecificName() {
        return this.specificName;
    }


}
