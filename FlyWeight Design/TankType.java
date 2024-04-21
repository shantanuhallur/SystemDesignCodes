import javax.swing.ImageIcon;

public class TankType {
    String typeName;
    public int power;
    public int orrHealth;
    public ImageIcon image;

    public TankType(String typeName, int power, int orrHealth, ImageIcon image) {
        this.typeName = typeName;
        this.power = power;
        this.orrHealth = orrHealth;
        this.image = image;
    }
}
