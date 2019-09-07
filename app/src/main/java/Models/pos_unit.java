package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_unit extends SugarRecord {
    BigInteger uom_id;
    String unit;
    BigInteger company_id;
    String code;
    Integer counter;
    Float qty1;
    BigInteger level1;
    Float qty2;
    BigInteger level2;
    Float qty3;
    BigInteger level3;
    Float qty4;
    BigInteger level4;
}
