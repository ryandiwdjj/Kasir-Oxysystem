package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_item_category extends SugarRecord {

    BigInteger item_category_id;
    BigInteger item_group_id;
    String name;
    Integer priority;
    String account_code;
    String group_code;
    String code;
    BigInteger company_id;
    Integer group_type;

    public pos_item_category() {
    }

    public pos_item_category(BigInteger item_category_id, BigInteger item_group_id, String name, Integer priority, String account_code, String group_code, String code, BigInteger company_id, Integer group_type) {
        this.item_category_id = item_category_id;
        this.item_group_id = item_group_id;
        this.name = name;
        this.priority = priority;
        this.account_code = account_code;
        this.group_code = group_code;
        this.code = code;
        this.company_id = company_id;
        this.group_type = group_type;
    }
}
