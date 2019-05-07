package orent.marcin.app2;

public class Villain {
    private String name;

    private int imgRes;

    public Villain(String name, int imgRes) {
        this.name = name;
        this.imgRes = imgRes;
    }

    public String getName() {
        return name;
    }


    public int getImgRes() {
        return imgRes;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static final Villain[] VILLAINS = {
            new Villain("Thanos", R.drawable.thanos),
            new Villain("Loki", R.drawable.loki),

    };
}
