package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class pos_item_group extends SugarRecord {
    BigInteger item_group_id;
    String name;
    String account_code;
    String code;
    String account_sales;
    String account_cogs;
    String account_inv;
    Integer type;
    String image_name;
    BigInteger company_id;
    String account_sales_cash;
    String account_cash_income;
    String account_credit_income;
    String account_vat;
    String account_pph;
    String account_discount;
    String account_sales_jasa;
    String account_expense_jasa;
    String account_costing;
    String account_other_income;
    String account_bonus_income;
    String account_adjustment;
    Integer bonus;
    Float qty_beli;
    Float qth_bonus;
    String account_grosir_sales;
    String account_grosir_cogs;
    String account_grosir_inventory;
    String account_grosir_discount;
    String account_grosir_adjustment;

    public pos_item_group() {
    }
}
