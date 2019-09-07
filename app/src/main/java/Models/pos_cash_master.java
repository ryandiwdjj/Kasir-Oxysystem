package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_cash_master extends SugarRecord {
    BigInteger cash_master_id;
    Integer cashier_number;
    BigInteger location_id;
    BigInteger company_id;
    String sts_loc;
}
