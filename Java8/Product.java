package Java8;

public class Product
{
    private String name;
    private final double price;
    private final String category;
    private String grade;

    Product(String name,double price, String category,String grade)
    {
        this.name=name;
        this.price=price;
        this.category=category;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setGrade(String grade) {
        this.grade=grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString()
    {
        return "\nName:"+getName()+"\tPrice:"+getPrice()+"\tCategory:"+getCategory()+"\tGrade:"+getGrade();
    }
}