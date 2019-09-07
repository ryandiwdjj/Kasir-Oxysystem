package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_shift extends SugarRecord {
    BigInteger shift_id;
    String name;
    String end_time;
    String start_time;
    Integer start_hours;
    Integer start_minutes;
    Integer end_hours;
    Integer en_minutes;
    BigInteger company_id;
}
