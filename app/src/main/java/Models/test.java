package Models;

import com.orm.SugarRecord;

public class test extends SugarRecord{
    String name;
    String number;

    public test() {
    }

    public test(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
