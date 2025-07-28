import java.util.Arrays;
import java.util.List;

public class Api {
    private int id;
    private String name;
    private double amount;
    private String type;
    public Api(int id, String name, double amount, String type) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public String getType() {
        return type;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + amount + " " + type;
    }

    public static void main(String[] args) {
        List<Api> apiList = Arrays.asList(
                new Api(1,"millot",100000,"Multimedia"),
                new Api(2,"milo",200000,"CS"),
                new Api(3,"Adin",250000,"CS"),
                new Api(4,"Ross",500000,"Multimedia"),
                new Api(5,"Puyol",115000,"ADSE"),
                new Api(6,"Totti",108000,"CS"),
                new Api(7,"Pocki",130000,"ADSE"),
                new Api(8,"Daniel",160000,"Multimedia"),
                new Api(9,"Divine",700000,"ADSE"),
                new Api(10,"Ruth",290000,"ADSE")

        );
        System.out.println(apiList);
        apiList.stream().filter(api -> api.getAmount() > 200000)
                .forEach(System.out::println);
    }
}

