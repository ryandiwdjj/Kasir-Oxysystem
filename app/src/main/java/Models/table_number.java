package Models;

import com.orm.SugarRecord;
import java.math.BigInteger;

public class table_number extends SugarRecord {
    BigInteger table_id;
    String table_number;
    String description;
    Integer posx;
    Integer posy;
    String pax;
    Integer posx1;
    Integer posy1;
    Integer status_open;
    Integer type;
}
