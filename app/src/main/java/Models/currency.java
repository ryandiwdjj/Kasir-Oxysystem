package Models;

import com.orm.SugarRecord;
import java.math.BigInteger;

public class currency extends SugarRecord {
    BigInteger currency_id;
    String currency_code;
    String description;
    BigInteger company_id;
    Float rate;
    BigInteger coa_id;
}
