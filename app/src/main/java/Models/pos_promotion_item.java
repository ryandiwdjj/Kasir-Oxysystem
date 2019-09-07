package Models;

import android.os.DropBoxManager;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_promotion_item extends SugarRecord {
    BigInteger promotion_item_id;
    BigInteger promotion_id;
    BigInteger item_master_id;
    String item_name;
    String item_code;
    String item_barcode;
    Double discount_percent;
    Double discount_value;
    Double selling_price;
    Integer tipe;
    Double qty_min;
    Double qty_bonus;
    Integer is_variant;
}
