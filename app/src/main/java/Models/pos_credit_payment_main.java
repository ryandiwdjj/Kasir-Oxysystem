package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_credit_payment_main extends SugarRecord {
    BigInteger credit_payment_main_id;
    BigInteger sales_id;
    String inv_date;
    String inv_number;
    BigInteger company_id;
}
