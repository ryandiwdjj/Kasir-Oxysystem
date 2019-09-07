package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_location extends SugarRecord {
    BigInteger location_id;
    String type;
    String name;
    String address_street;
    String address_country;
    String address_city;
    String telp;
    String pic;
    String code;
    String description;
    BigInteger company_id;
    BigInteger coa_ar_id;
    BigInteger coa_ap_id;
    BigInteger coa_ppn_id;
    BigInteger coa_pph_id;
    BigInteger coa_discount_id;
    BigInteger coa_sales_code_id;
    BigInteger coa_project_pph_pasal_23_id;
    BigInteger coa_project_pph_pasal_22_id;
    BigInteger location_request;
    String gol_price;
    String npwp;
    String prefix_faktur_pajak;
    String prefix_faktur_transfer;
    Integer aktif_auto_order;
    BigInteger coa_ap_grosir_id;
    String date_start;
    Integer type_grosir;
    Integer type_24hour;
    BigInteger dc_loc_id;
    Integer periode_delivery;
}
