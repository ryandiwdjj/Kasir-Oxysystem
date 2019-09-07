package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_sales_detail_cancel extends SugarRecord {
    BigInteger sales_detail_id;
    BigInteger sales_id;
    BigInteger product_master_id;
    Integer squence;
    Float cogs;
    Float selling_price;
    Integer status;
    BigInteger currency_id;
    BigInteger company_id;
    Double qty;
    Float total;
    Double discount_percent;
    Double discount_amount;
    BigInteger proposal_id;
    Integer sales_type;
    String serial_number;
    String QUERY_STRING;
    Integer sts_upload;
    Float qty_retur;
    Integer order_status;
    String note;
    String description;
    BigInteger description_id;
    BigInteger cancelled_by;
    Float discount_item;
    Float discount_promo;
    Float discount_global;
}
