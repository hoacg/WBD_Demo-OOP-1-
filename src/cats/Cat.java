package cats;

public class Cat {
    protected String specificName = "Mèo";
    private String name;

    public void setName(String name) throws Exception{

        if (name.trim().isEmpty()) {
            throw new Exception("Không được đặt tên như thế này!");
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
