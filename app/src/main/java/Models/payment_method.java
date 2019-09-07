package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class payment_method extends SugarRecord {
    BigInteger payment_method_id;
    String description;
    Integer pos_code;
    Integer status;
    Integer sort_order;
    Integer merchant_payment;
    Integer merchant_type;
    Integer ap_status;
    BigInteger segment1_id;
}
