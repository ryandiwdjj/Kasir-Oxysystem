package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class waitress extends SugarRecord {
    BigInteger waitress_id;
    String name;
    String password;
    Integer status;
    BigInteger location_id;
    String code;
    String login_id;
    Integer level;

    public waitress() {
    }
}
