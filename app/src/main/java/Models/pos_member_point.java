package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_member_point extends SugarRecord {
    BigInteger member_point_id;
    BigInteger customer_id;
    String date;
    Float point;
    Integer in_out;
    Integer type;
    Float point_unit_value;
    BigInteger sales_id;
    Integer group_type;
    BigInteger item_group_id;
    Float last_point;
    BigInteger cash_cashier_id;
    BigInteger location_id;
    Integer posted_status;
    BigInteger posted_by_id;
    String posted_date;
}
