package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class merchant extends SugarRecord {
    BigInteger merchant_id;
    BigInteger bank_id;
    BigInteger location_id;
    String code_merchant;
    Float persen_expense;
    String description;
    BigInteger coa_id;
    BigInteger coa_expense_id;
    Integer type_payment;
    BigInteger coa_diskon_id;
    Integer payment_by;
    Float persen_diskon;
    BigInteger pendapatan_merchant;
    Integer posting_expense;
}
