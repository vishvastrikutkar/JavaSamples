package Problems;

enum Severity
{
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);
    private final int level;

    Severity(int Level) {
    this.level=Level;
    }

    //Getter Method
    public int getLevel() {
        return level;
    }
}

public class EnumSample {
    public static void main(String[] args) {
        Severity severity = Severity.MEDIUM;

        System.out.println("Severity "+severity);
        System.out.println("Level: "+severity.getLevel());

        for(Severity s:Severity.values())
        {
            System.out.println("Severity "+s);
            System.out.println("Level: "+s.getLevel());
        }
    }
}
