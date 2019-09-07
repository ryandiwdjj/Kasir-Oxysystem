package Models;

import com.orm.SugarRecord;

import java.math.BigInteger;

public class bank extends SugarRecord {
    BigInteger bank_id;
    String name;
    String address;
    Float default_bunga;
    BigInteger coa_ar_id;
    BigInteger coa_debit_credit_id;

    public bank() {
    }


    public BigInteger getBank_id() {
        return bank_id;
    }

    public void setBank_id(BigInteger bank_id) {
        this.bank_id = bank_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getDefault_bunga() {
        return default_bunga;
    }

    public void setDefault_bunga(Float default_bunga) {
        this.default_bunga = default_bunga;
    }

    public BigInteger getCoa_ar_id() {
        return coa_ar_id;
    }

    public void setCoa_ar_id(BigInteger coa_ar_id) {
        this.coa_ar_id = coa_ar_id;
    }

    public BigInteger getCoa_debit_credit_id() {
        return coa_debit_credit_id;
    }

    public void setCoa_debit_credit_id(BigInteger coa_debit_credit_id) {
        this.coa_debit_credit_id = coa_debit_credit_id;
    }
}
