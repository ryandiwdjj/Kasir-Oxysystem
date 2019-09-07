package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_credit_payment extends SugarRecord {
    BigInteger credit_payment_id;
    BigInteger sales_id;
    String pay_datetime;
    Float amount;
    Float rate;
    BigInteger cash_cashier_id;
    BigInteger company_id;
    Integer posted_status;
    String posted_date;
    String effective_date;
    BigInteger posted_by_id;
    Integer type;
    BigInteger bank_id;
    BigInteger customer_id;
    BigInteger merchant_id;
    Integer sts_upload;
    String query_string;
    String number;
    String name;
}
