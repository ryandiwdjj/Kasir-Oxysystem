package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_payment extends SugarRecord {
    BigInteger payment_id;
    BigInteger sales_id;
    BigInteger currency_id;
    String pay_date;
    Integer pay_type;
    Float amount;
    Double rate;
    Double cost_card_amount;
    Double cost_card_percent;
    BigInteger cc_id;
    BigInteger bank_id;
    BigInteger merchant_id;
    Integer sts_upload;
    String query_string;
    Float voucher_amount;
}
