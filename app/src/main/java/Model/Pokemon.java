package Model;

public class Pokemon {
    private String name;
    private int imageResource;
    private String type;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int exp;

    // Constructor đầy đủ
    public Pokemon(String name, int imageResource, String type, int hp, int atk, int def, int spd, int exp) {
        this.name = name;
        this.imageResource = imageResource;
        this.type = type;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.exp = exp;
    }

    // Constructor mặc định với chỉ 2 tham số
    public Pokemon(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
        this.type = "Unknown";
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
        this.spd = 0;
        this.exp = 0;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpd() {
        return spd;
    }

    public int getExp() {
        return exp;
    }
}
