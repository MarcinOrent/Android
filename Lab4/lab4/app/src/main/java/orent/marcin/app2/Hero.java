package orent.marcin.app2;

public class Hero {
    private String name;
    private int imgRes;
    private String opis;

    public String getOpis() {
        return opis;
    }

    public static final Hero[] HEROES = {
            new Hero("Thor", R.drawable.thor, "tesdsfffffffffffffffffffft"),
            new Hero("Ironman", R.drawable.ironman, "test"),

    };

    public String getName() {
        return name;
    }


    public int getImgRes() {
        return imgRes;
    }

    public Hero(String name, int imgRes, String opis) {
        this.name = name;
        this.opis = opis;

        this.imgRes = imgRes;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
