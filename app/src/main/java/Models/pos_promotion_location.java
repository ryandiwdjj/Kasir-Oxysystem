package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_promotion_location extends SugarRecord {
    BigInteger promotion_location_id;
    BigInteger promotion_id;
    BigInteger location_id;
    String location_name;
}
