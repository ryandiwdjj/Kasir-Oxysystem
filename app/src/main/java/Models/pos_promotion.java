package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_promotion extends SugarRecord {
    BigInteger promotion_id;
    String start_date;
    String end_date;
    BigInteger user_id;
    String user_name;
    String promo_desc;
    Integer counter;
    String number;
    String status;
    String prefix_number;
    Integer tipe;
    Integer jenis;
}
