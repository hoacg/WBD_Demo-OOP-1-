package cats;

public class LongHairCat extends Cat {

    private void initSpecificName() {
        this.specificName = "Mèo Lông Dài";
    }

    public LongHairCat() {
        this.initSpecificName();
    }

    public LongHairCat(String name) {
        this.initSpecificName();
        this.setName(name);
    }
}
