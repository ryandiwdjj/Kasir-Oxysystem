package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_cash_cashier extends SugarRecord {
    BigInteger cash_cashier_id;
    BigInteger cash_master_id;
    BigInteger user_id;
    BigInteger shift_id;
    String date_open;
    BigInteger currency_id_open;
    Double rate_open;
    Double amount_open;
    String date_closing;
    BigInteger currency_id_closing;
    Double rate_closing;
    Double amount_closing;
    Double amount_guide_payment;
    Integer status;
    Double should_value;
    BigInteger company_id;
    String query_string;
    Integer sts_upload;
}
