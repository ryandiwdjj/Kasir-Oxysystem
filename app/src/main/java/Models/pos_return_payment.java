package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_return_payment extends SugarRecord {
    BigInteger return_payment_id;
    BigInteger sales_id;
    BigInteger currency_id;
    Double amount;
    BigInteger company_id;
    Integer sts_upload;
    String query_string;
    Integer type;
}
