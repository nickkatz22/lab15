/**
 * Created by nickk on 4/24/2017.
 */
public class CountriesTextFile {
    private String count1;
    private String count2;
    private String count3;
    private String count4;
    private String count5;

    public CountriesTextFile(String count1, String count2, String count3, String count4, String count5) {
        this.count1 = count1;
        this.count2 = count2;
        this.count3 = count3;
        this.count4 = count4;
        this.count5 = count5;
    }

    public String getCount1() {
        return count1;
    }

    public void setCount1(String count1) {
        this.count1 = count1;
    }

    public String getCount2() {
        return count2;
    }

    public void setCount2(String count2) {
        this.count2 = count2;
    }

    public String getCount3() {
        return count3;
    }

    public void setCount3(String count3) {
        this.count3 = count3;
    }

    public String getCount4() {
        return count4;
    }

    public void setCount4(String count4) {
        this.count4 = count4;
    }

    public String getCount5() {
        return count5;
    }

    public void setCount5(String count5) {
        this.count5 = count5;
    }
    @Override

    public String toString() {
        return count1 + "," + count2 + "," + count3 + "," + count4 + "," + count5;
    }
}
