package com.example.testjava;

import java.util.Vector;
import java.util.Hashtable;
import java.io.CharConversionException;
import java.util.HashMap;
import java.util.MissingResourceException;

import com.tandem.ext.guardian.*;
import com.tandem.ext.util.*;

import java.math.BigDecimal;

/**
 * I_Fumcom_r class was generated for DDL Rec/Def: fumcom_r on: 1/30/24 at: 12:25:54.
 * This is an INPUT class which is typically used to read data.
 */

public class I_Fumcom_r implements com.tandem.ext.guardian.GuardianInput {
    protected int _numConversionErrors;
    protected boolean _allowErrors = false;
    protected HashMap _errorDetail;

    protected int _bufferLen = 416;
    public String com_exch_id;
    public String com_commodity_id;
    public String com_name;
    public String com_english_name;
    public String com_alias;
    public String com_country;
    public String com_currency;
    public BigDecimal com_contract_size;
    public String com_unit;
    public String com_trade_flag;
    public int com_base_unit;
    public BigDecimal com_min_fluct;
    public String com_min_fluct_unit;
    public String com_ftsi_maker_flag;
    public BigDecimal com_tick_amt;
    public BigDecimal com_base_price;
    public String com_rule;
    public String com_status_flag;
    public BigDecimal com_daily_limit;
    public int com_limit_qty;
    public int com_non_cover_qty;
    public int com_submit_qty;
    public int com_warn_qty;
    public int com_non_cover_qty_p;
    public int com_submit_qty_p;
    public int com_warn_qty_p;
    public int com_begin_trading_hour;
    public int com_end_trading_hour;
    public BigDecimal com_tx_tax_r;
    public String com_tx_account_no;
    public int com_return_time;
    public String com_maker_flag;
    public String com_stop_flag;
    public String com_oper_user;
    public long com_oper_date;
    public long com_oper_time;
    public String com_prog;
    public String com_decimal_point;
    public String com_prod_king;
    public int com_non_cover_qty_l;
    public int com_submit_qty_l;
    public int com_warn_qty_l;
    public String com_up_fee_kind;
    public String com_fee_kind;
    public String com_dn_fee_kind;
    public String com_fu_commodity_id_1;
    public BigDecimal com_fu_factor;
    public BigDecimal com_ini_fee;
    public int com_non_cover_qty_m;
    public int com_submit_qty_m;
    public int com_warn_qty_m;
    public BigDecimal com_pre_contract_size;
    public BigDecimal com_strike_factor;
    public String com_pre_commodity_id;
    public String com_range;
    public BigDecimal com_prompt_tax_r;
    public BigDecimal com_price_factor;
    public long com_month_nc_qty;
    public String com_fee_currency;
    public String com_span_group_id;
    public String com_span_comm_id;
    public int com_return_time_l;
    public long com_month_nc_qty_s;
    public long com_month_nc_qty_p;
    public int com_dtr_stop_time;
    public int com_dtr_stop_time_l;
    public String com_stock_no_3;
    public String com_not_hedge_flag;
    public BigDecimal com_cash_dividend;
    public String com_hedge_status_flag;
    public String com_block_trade_flag;
    public int com_block_trade_qty;
    public String com_expiry_type;
    public String com_etf_flag;
    public String com_market_cls_group;
    public String com_ah_trade;
    public String com_ah_kill_flag;
    public int com_mts_end_time;
    public String com_ah_ftsi_maker_flag;
    public String com_ah_maker_flag;
    public String com_ah_block_trade_flag;
    public String com_end_session;
    public String com_us_track_a;
    public String com_us_track_b;
    public String com_symbol_grp;
    public String com_lmt_symbol3;
    public BigDecimal com_lmt_rate;
    public long com_market_mask;
    public String com_cold_flag;
    public String com_flex_flag;
    public int com_new_dtr_time;
    public String com_seqno;
    public int com_new_dtr_time_l;
    public String com_part_id;
    public String filler0;

    /**
     * I_Fumcom_r Constructor
     */
    public I_Fumcom_r() {
        _errorDetail = new HashMap();
    }

    /**
     * Returns the expected length of the byte array used by this class.
     *
     * @return int expected length of byte array.
     */
    public int getLength() {
        return _bufferLen;
    }

    /**
     * Indicates whether DataConversion Exceptions are thrown during execution
     * of the unmarshal method. Specifying false indicates that the first data
     * conversion error encountered during execution of the unmarshal method,
     * causes a DataConversionException to be thrown.  All subsequent data in
     * the byte array supplied to the unmarshal method is NOT converted
     * <p>
     * Specifying true indicates that DataConversionExceptions are ignored
     * during execution of the unmarshal method.  umarshal will attempt to
     * convert all data in the byte array.  To determine if errors have
     * occurred during execution of unmarshal, the user can call
     * getNumConversionFailures().  This method returns the number of fields
     * that failed to convert.  If the call to getNumConversionFailures()
     * returns a number greater than zero, a call to
     * getConversionFailureDetails() returns a HashMap whose keys are the fields
     * that failed to convert and whose value is the associated
     * DataConversionException.
     * //@param boolean true to indicate that conversion errors are to be
     * allowed; false otherwise.
     *
     * @see #getNumConversionFailures
     * @see #getConversionFailureDetails
     */
    public void allowErrors(boolean value) {
        _allowErrors = value;
    }

    /**
     * Returns the number of fields that failed to convert during execution
     * of the unmarshal method.
     *
     * @return the number of fields that failed to convert during the
     * execution of unmarshal.  A returned value of zero indicates that
     * all fields converted.
     * @see #allowErrors
     * @see #getConversionFailureDetails
     */
    public int getNumConversionFailures() {
        return _numConversionErrors;
    }

    /**
     * Returns a HashMap with information about fields that failed to
     * convert during execution of the unmarshal method.  Keys are
     * the fields that failed to convert and values are the associated
     * DataConversionExceptions.
     *
     * @return HashMap containing details of data conversion failures.
     * If no failures occurred the HashMap.isEmpty() method returns true.
     * @see #getNumConversionFailures
     * @see #allowErrors
     */
    public HashMap getConversionFailureDetails() {
        return _errorDetail;
    }

    /**
     * Used to clear any existing values for com_exch_id.
     */
    public void clearCom_exch_id() {
        com_exch_id = null;
    }

    /**
     * Used to clear any existing values for com_commodity_id.
     */
    public void clearCom_commodity_id() {
        com_commodity_id = null;
    }

    /**
     * Used to clear any existing values for com_name.
     */
    public void clearCom_name() {
        com_name = null;
    }

    /**
     * Used to clear any existing values for com_english_name.
     */
    public void clearCom_english_name() {
        com_english_name = null;
    }

    /**
     * Used to clear any existing values for com_alias.
     */
    public void clearCom_alias() {
        com_alias = null;
    }

    /**
     * Used to clear any existing values for com_country.
     */
    public void clearCom_country() {
        com_country = null;
    }

    /**
     * Used to clear any existing values for com_currency.
     */
    public void clearCom_currency() {
        com_currency = null;
    }

    /**
     * Used to clear any existing values for com_contract_size.
     */
    public void clearCom_contract_size() {
        com_contract_size = null;
    }

    /**
     * Used to clear any existing values for com_unit.
     */
    public void clearCom_unit() {
        com_unit = null;
    }

    /**
     * Used to clear any existing values for com_trade_flag.
     */
    public void clearCom_trade_flag() {
        com_trade_flag = null;
    }

    /**
     * Used to clear any existing values for com_base_unit.
     */
    public void clearCom_base_unit() {
        com_base_unit = (int) 0;
    }

    /**
     * Used to clear any existing values for com_min_fluct.
     */
    public void clearCom_min_fluct() {
        com_min_fluct = null;
    }

    /**
     * Used to clear any existing values for com_min_fluct_unit.
     */
    public void clearCom_min_fluct_unit() {
        com_min_fluct_unit = null;
    }

    /**
     * Used to clear any existing values for com_ftsi_maker_flag.
     */
    public void clearCom_ftsi_maker_flag() {
        com_ftsi_maker_flag = null;
    }

    /**
     * Used to clear any existing values for com_tick_amt.
     */
    public void clearCom_tick_amt() {
        com_tick_amt = null;
    }

    /**
     * Used to clear any existing values for com_base_price.
     */
    public void clearCom_base_price() {
        com_base_price = null;
    }

    /**
     * Used to clear any existing values for com_rule.
     */
    public void clearCom_rule() {
        com_rule = null;
    }

    /**
     * Used to clear any existing values for com_status_flag.
     */
    public void clearCom_status_flag() {
        com_status_flag = null;
    }

    /**
     * Used to clear any existing values for com_daily_limit.
     */
    public void clearCom_daily_limit() {
        com_daily_limit = null;
    }

    /**
     * Used to clear any existing values for com_limit_qty.
     */
    public void clearCom_limit_qty() {
        com_limit_qty = (int) 0;
    }

    /**
     * Used to clear any existing values for com_non_cover_qty.
     */
    public void clearCom_non_cover_qty() {
        com_non_cover_qty = (int) 0;
    }

    /**
     * Used to clear any existing values for com_submit_qty.
     */
    public void clearCom_submit_qty() {
        com_submit_qty = (int) 0;
    }

    /**
     * Used to clear any existing values for com_warn_qty.
     */
    public void clearCom_warn_qty() {
        com_warn_qty = (int) 0;
    }

    /**
     * Used to clear any existing values for com_non_cover_qty_p.
     */
    public void clearCom_non_cover_qty_p() {
        com_non_cover_qty_p = (int) 0;
    }

    /**
     * Used to clear any existing values for com_submit_qty_p.
     */
    public void clearCom_submit_qty_p() {
        com_submit_qty_p = (int) 0;
    }

    /**
     * Used to clear any existing values for com_warn_qty_p.
     */
    public void clearCom_warn_qty_p() {
        com_warn_qty_p = (int) 0;
    }

    /**
     * Used to clear any existing values for com_begin_trading_hour.
     */
    public void clearCom_begin_trading_hour() {
        com_begin_trading_hour = (int) 0;
    }

    /**
     * Used to clear any existing values for com_end_trading_hour.
     */
    public void clearCom_end_trading_hour() {
        com_end_trading_hour = (int) 0;
    }

    /**
     * Used to clear any existing values for com_tx_tax_r.
     */
    public void clearCom_tx_tax_r() {
        com_tx_tax_r = null;
    }

    /**
     * Used to clear any existing values for com_tx_account_no.
     */
    public void clearCom_tx_account_no() {
        com_tx_account_no = null;
    }

    /**
     * Used to clear any existing values for com_return_time.
     */
    public void clearCom_return_time() {
        com_return_time = (int) 0;
    }

    /**
     * Used to clear any existing values for com_maker_flag.
     */
    public void clearCom_maker_flag() {
        com_maker_flag = null;
    }

    /**
     * Used to clear any existing values for com_stop_flag.
     */
    public void clearCom_stop_flag() {
        com_stop_flag = null;
    }

    /**
     * Used to clear any existing values for com_oper_user.
     */
    public void clearCom_oper_user() {
        com_oper_user = null;
    }

    /**
     * Used to clear any existing values for com_oper_date.
     */
    public void clearCom_oper_date() {
        com_oper_date = (long) 0;
    }

    /**
     * Used to clear any existing values for com_oper_time.
     */
    public void clearCom_oper_time() {
        com_oper_time = (long) 0;
    }

    /**
     * Used to clear any existing values for com_prog.
     */
    public void clearCom_prog() {
        com_prog = null;
    }

    /**
     * Used to clear any existing values for com_decimal_point.
     */
    public void clearCom_decimal_point() {
        com_decimal_point = null;
    }

    /**
     * Used to clear any existing values for com_prod_king.
     */
    public void clearCom_prod_king() {
        com_prod_king = null;
    }

    /**
     * Used to clear any existing values for com_non_cover_qty_l.
     */
    public void clearCom_non_cover_qty_l() {
        com_non_cover_qty_l = (int) 0;
    }

    /**
     * Used to clear any existing values for com_submit_qty_l.
     */
    public void clearCom_submit_qty_l() {
        com_submit_qty_l = (int) 0;
    }

    /**
     * Used to clear any existing values for com_warn_qty_l.
     */
    public void clearCom_warn_qty_l() {
        com_warn_qty_l = (int) 0;
    }

    /**
     * Used to clear any existing values for com_up_fee_kind.
     */
    public void clearCom_up_fee_kind() {
        com_up_fee_kind = null;
    }

    /**
     * Used to clear any existing values for com_fee_kind.
     */
    public void clearCom_fee_kind() {
        com_fee_kind = null;
    }

    /**
     * Used to clear any existing values for com_dn_fee_kind.
     */
    public void clearCom_dn_fee_kind() {
        com_dn_fee_kind = null;
    }

    /**
     * Used to clear any existing values for com_fu_commodity_id_1.
     */
    public void clearCom_fu_commodity_id_1() {
        com_fu_commodity_id_1 = null;
    }

    /**
     * Used to clear any existing values for com_fu_factor.
     */
    public void clearCom_fu_factor() {
        com_fu_factor = null;
    }

    /**
     * Used to clear any existing values for com_ini_fee.
     */
    public void clearCom_ini_fee() {
        com_ini_fee = null;
    }

    /**
     * Used to clear any existing values for com_non_cover_qty_m.
     */
    public void clearCom_non_cover_qty_m() {
        com_non_cover_qty_m = (int) 0;
    }

    /**
     * Used to clear any existing values for com_submit_qty_m.
     */
    public void clearCom_submit_qty_m() {
        com_submit_qty_m = (int) 0;
    }

    /**
     * Used to clear any existing values for com_warn_qty_m.
     */
    public void clearCom_warn_qty_m() {
        com_warn_qty_m = (int) 0;
    }

    /**
     * Used to clear any existing values for com_pre_contract_size.
     */
    public void clearCom_pre_contract_size() {
        com_pre_contract_size = null;
    }

    /**
     * Used to clear any existing values for com_strike_factor.
     */
    public void clearCom_strike_factor() {
        com_strike_factor = null;
    }

    /**
     * Used to clear any existing values for com_pre_commodity_id.
     */
    public void clearCom_pre_commodity_id() {
        com_pre_commodity_id = null;
    }

    /**
     * Used to clear any existing values for com_range.
     */
    public void clearCom_range() {
        com_range = null;
    }

    /**
     * Used to clear any existing values for com_prompt_tax_r.
     */
    public void clearCom_prompt_tax_r() {
        com_prompt_tax_r = null;
    }

    /**
     * Used to clear any existing values for com_price_factor.
     */
    public void clearCom_price_factor() {
        com_price_factor = null;
    }

    /**
     * Used to clear any existing values for com_month_nc_qty.
     */
    public void clearCom_month_nc_qty() {
        com_month_nc_qty = (long) 0;
    }

    /**
     * Used to clear any existing values for com_fee_currency.
     */
    public void clearCom_fee_currency() {
        com_fee_currency = null;
    }

    /**
     * Used to clear any existing values for com_span_group_id.
     */
    public void clearCom_span_group_id() {
        com_span_group_id = null;
    }

    /**
     * Used to clear any existing values for com_span_comm_id.
     */
    public void clearCom_span_comm_id() {
        com_span_comm_id = null;
    }

    /**
     * Used to clear any existing values for com_return_time_l.
     */
    public void clearCom_return_time_l() {
        com_return_time_l = (int) 0;
    }

    /**
     * Used to clear any existing values for com_month_nc_qty_s.
     */
    public void clearCom_month_nc_qty_s() {
        com_month_nc_qty_s = (long) 0;
    }

    /**
     * Used to clear any existing values for com_month_nc_qty_p.
     */
    public void clearCom_month_nc_qty_p() {
        com_month_nc_qty_p = (long) 0;
    }

    /**
     * Used to clear any existing values for com_dtr_stop_time.
     */
    public void clearCom_dtr_stop_time() {
        com_dtr_stop_time = (int) 0;
    }

    /**
     * Used to clear any existing values for com_dtr_stop_time_l.
     */
    public void clearCom_dtr_stop_time_l() {
        com_dtr_stop_time_l = (int) 0;
    }

    /**
     * Used to clear any existing values for com_stock_no_3.
     */
    public void clearCom_stock_no_3() {
        com_stock_no_3 = null;
    }

    /**
     * Used to clear any existing values for com_not_hedge_flag.
     */
    public void clearCom_not_hedge_flag() {
        com_not_hedge_flag = null;
    }

    /**
     * Used to clear any existing values for com_cash_dividend.
     */
    public void clearCom_cash_dividend() {
        com_cash_dividend = null;
    }

    /**
     * Used to clear any existing values for com_hedge_status_flag.
     */
    public void clearCom_hedge_status_flag() {
        com_hedge_status_flag = null;
    }

    /**
     * Used to clear any existing values for com_block_trade_flag.
     */
    public void clearCom_block_trade_flag() {
        com_block_trade_flag = null;
    }

    /**
     * Used to clear any existing values for com_block_trade_qty.
     */
    public void clearCom_block_trade_qty() {
        com_block_trade_qty = (int) 0;
    }

    /**
     * Used to clear any existing values for com_expiry_type.
     */
    public void clearCom_expiry_type() {
        com_expiry_type = null;
    }

    /**
     * Used to clear any existing values for com_etf_flag.
     */
    public void clearCom_etf_flag() {
        com_etf_flag = null;
    }

    /**
     * Used to clear any existing values for com_market_cls_group.
     */
    public void clearCom_market_cls_group() {
        com_market_cls_group = null;
    }

    /**
     * Used to clear any existing values for com_ah_trade.
     */
    public void clearCom_ah_trade() {
        com_ah_trade = null;
    }

    /**
     * Used to clear any existing values for com_ah_kill_flag.
     */
    public void clearCom_ah_kill_flag() {
        com_ah_kill_flag = null;
    }

    /**
     * Used to clear any existing values for com_mts_end_time.
     */
    public void clearCom_mts_end_time() {
        com_mts_end_time = (int) 0;
    }

    /**
     * Used to clear any existing values for com_ah_ftsi_maker_flag.
     */
    public void clearCom_ah_ftsi_maker_flag() {
        com_ah_ftsi_maker_flag = null;
    }

    /**
     * Used to clear any existing values for com_ah_maker_flag.
     */
    public void clearCom_ah_maker_flag() {
        com_ah_maker_flag = null;
    }

    /**
     * Used to clear any existing values for com_ah_block_trade_flag.
     */
    public void clearCom_ah_block_trade_flag() {
        com_ah_block_trade_flag = null;
    }

    /**
     * Used to clear any existing values for com_end_session.
     */
    public void clearCom_end_session() {
        com_end_session = null;
    }

    /**
     * Used to clear any existing values for com_us_track_a.
     */
    public void clearCom_us_track_a() {
        com_us_track_a = null;
    }

    /**
     * Used to clear any existing values for com_us_track_b.
     */
    public void clearCom_us_track_b() {
        com_us_track_b = null;
    }

    /**
     * Used to clear any existing values for com_symbol_grp.
     */
    public void clearCom_symbol_grp() {
        com_symbol_grp = null;
    }

    /**
     * Used to clear any existing values for com_lmt_symbol3.
     */
    public void clearCom_lmt_symbol3() {
        com_lmt_symbol3 = null;
    }

    /**
     * Used to clear any existing values for com_lmt_rate.
     */
    public void clearCom_lmt_rate() {
        com_lmt_rate = null;
    }

    /**
     * Used to clear any existing values for com_market_mask.
     */
    public void clearCom_market_mask() {
        com_market_mask = (long) 0;
    }

    /**
     * Used to clear any existing values for com_cold_flag.
     */
    public void clearCom_cold_flag() {
        com_cold_flag = null;
    }

    /**
     * Used to clear any existing values for com_flex_flag.
     */
    public void clearCom_flex_flag() {
        com_flex_flag = null;
    }

    /**
     * Used to clear any existing values for com_new_dtr_time.
     */
    public void clearCom_new_dtr_time() {
        com_new_dtr_time = (int) 0;
    }

    /**
     * Used to clear any existing values for com_seqno.
     */
    public void clearCom_seqno() {
        com_seqno = null;
    }

    /**
     * Used to clear any existing values for com_new_dtr_time_l.
     */
    public void clearCom_new_dtr_time_l() {
        com_new_dtr_time_l = (int) 0;
    }

    /**
     * Used to clear any existing values for com_part_id.
     */
    public void clearCom_part_id() {
        com_part_id = null;
    }

    /**
     * Used to clear any existing values for filler0.
     */
    public void clearFiller0() {
        filler0 = null;
    }

    /**
     * Used to clear the values of all instance variables in this class.
     */
    public void clear_All() {
        com_exch_id = null;
        com_commodity_id = null;
        com_name = null;
        com_english_name = null;
        com_alias = null;
        com_country = null;
        com_currency = null;
        com_contract_size = null;
        com_unit = null;
        com_trade_flag = null;
        com_base_unit = (int) 0;
        com_min_fluct = null;
        com_min_fluct_unit = null;
        com_ftsi_maker_flag = null;
        com_tick_amt = null;
        com_base_price = null;
        com_rule = null;
        com_status_flag = null;
        com_daily_limit = null;
        com_limit_qty = (int) 0;
        com_non_cover_qty = (int) 0;
        com_submit_qty = (int) 0;
        com_warn_qty = (int) 0;
        com_non_cover_qty_p = (int) 0;
        com_submit_qty_p = (int) 0;
        com_warn_qty_p = (int) 0;
        com_begin_trading_hour = (int) 0;
        com_end_trading_hour = (int) 0;
        com_tx_tax_r = null;
        com_tx_account_no = null;
        com_return_time = (int) 0;
        com_maker_flag = null;
        com_stop_flag = null;
        com_oper_user = null;
        com_oper_date = (long) 0;
        com_oper_time = (long) 0;
        com_prog = null;
        com_decimal_point = "0";
        com_prod_king = null;
        com_non_cover_qty_l = (int) 0;
        com_submit_qty_l = (int) 0;
        com_warn_qty_l = (int) 0;
        com_up_fee_kind = null;
        com_fee_kind = null;
        com_dn_fee_kind = null;
        com_fu_commodity_id_1 = null;
        com_fu_factor = null;
        com_ini_fee = null;
        com_non_cover_qty_m = (int) 0;
        com_submit_qty_m = (int) 0;
        com_warn_qty_m = (int) 0;
        com_pre_contract_size = null;
        com_strike_factor = null;
        com_pre_commodity_id = null;
        com_range = null;
        com_prompt_tax_r = null;
        com_price_factor = null;
        com_month_nc_qty = (long) 0;
        com_fee_currency = null;
        com_span_group_id = null;
        com_span_comm_id = null;
        com_return_time_l = (int) 0;
        com_month_nc_qty_s = (long) 0;
        com_month_nc_qty_p = (long) 0;
        com_dtr_stop_time = (int) 0;
        com_dtr_stop_time_l = (int) 0;
        com_stock_no_3 = null;
        com_not_hedge_flag = null;
        com_cash_dividend = null;
        com_hedge_status_flag = null;
        com_block_trade_flag = null;
        com_block_trade_qty = (int) 0;
        com_expiry_type = null;
        com_etf_flag = null;
        com_market_cls_group = null;
        com_ah_trade = null;
        com_ah_kill_flag = null;
        com_mts_end_time = (int) 0;
        com_ah_ftsi_maker_flag = null;
        com_ah_maker_flag = null;
        com_ah_block_trade_flag = null;
        com_end_session = null;
        com_us_track_a = null;
        com_us_track_b = null;
        com_symbol_grp = null;
        com_lmt_symbol3 = null;
        com_lmt_rate = null;
        com_market_mask = (long) 0;
        com_cold_flag = null;
        com_flex_flag = null;
        com_new_dtr_time = (int) 0;
        com_seqno = "0";
        com_new_dtr_time_l = (int) 0;
        com_part_id = null;
        filler0 = null;
    }

    /**
     * Used to obtain the value of com_exch_id.
     *
     * @return the value for com_exch_id.
     */
    public String getCom_exch_id() {
        return (com_exch_id);
    }

    /**
     * Used to obtain the value of com_commodity_id.
     *
     * @return the value for com_commodity_id.
     */
    public String getCom_commodity_id() {
        return (com_commodity_id);
    }

    /**
     * Used to obtain the value of com_name.
     *
     * @return the value for com_name.
     */
    public String getCom_name() {
        return (com_name);
    }

    /**
     * Used to obtain the value of com_english_name.
     *
     * @return the value for com_english_name.
     */
    public String getCom_english_name() {
        return (com_english_name);
    }

    /**
     * Used to obtain the value of com_alias.
     *
     * @return the value for com_alias.
     */
    public String getCom_alias() {
        return (com_alias);
    }

    /**
     * Used to obtain the value of com_country.
     *
     * @return the value for com_country.
     */
    public String getCom_country() {
        return (com_country);
    }

    /**
     * Used to obtain the value of com_currency.
     *
     * @return the value for com_currency.
     */
    public String getCom_currency() {
        return (com_currency);
    }

    /**
     * Used to obtain the value of com_contract_size.
     *
     * @return the value for com_contract_size.
     */
    public BigDecimal getCom_contract_size() {
        return (com_contract_size);
    }

    /**
     * Used to obtain the value of com_unit.
     *
     * @return the value for com_unit.
     */
    public String getCom_unit() {
        return (com_unit);
    }

    /**
     * Used to obtain the value of com_trade_flag.
     *
     * @return the value for com_trade_flag.
     */
    public String getCom_trade_flag() {
        return (com_trade_flag);
    }

    /**
     * Used to obtain the value of com_base_unit.
     *
     * @return the value for com_base_unit.
     */
    public int getCom_base_unit() {
        return (com_base_unit);
    }

    /**
     * Used to obtain the value of com_min_fluct.
     *
     * @return the value for com_min_fluct.
     */
    public BigDecimal getCom_min_fluct() {
        return (com_min_fluct);
    }

    /**
     * Used to obtain the value of com_min_fluct_unit.
     *
     * @return the value for com_min_fluct_unit.
     */
    public String getCom_min_fluct_unit() {
        return (com_min_fluct_unit);
    }

    /**
     * Used to obtain the value of com_ftsi_maker_flag.
     *
     * @return the value for com_ftsi_maker_flag.
     */
    public String getCom_ftsi_maker_flag() {
        return (com_ftsi_maker_flag);
    }

    /**
     * Used to obtain the value of com_tick_amt.
     *
     * @return the value for com_tick_amt.
     */
    public BigDecimal getCom_tick_amt() {
        return (com_tick_amt);
    }

    /**
     * Used to obtain the value of com_base_price.
     *
     * @return the value for com_base_price.
     */
    public BigDecimal getCom_base_price() {
        return (com_base_price);
    }

    /**
     * Used to obtain the value of com_rule.
     *
     * @return the value for com_rule.
     */
    public String getCom_rule() {
        return (com_rule);
    }

    /**
     * Used to obtain the value of com_status_flag.
     *
     * @return the value for com_status_flag.
     */
    public String getCom_status_flag() {
        return (com_status_flag);
    }

    /**
     * Used to obtain the value of com_daily_limit.
     *
     * @return the value for com_daily_limit.
     */
    public BigDecimal getCom_daily_limit() {
        return (com_daily_limit);
    }

    /**
     * Used to obtain the value of com_limit_qty.
     *
     * @return the value for com_limit_qty.
     */
    public int getCom_limit_qty() {
        return (com_limit_qty);
    }

    /**
     * Used to obtain the value of com_non_cover_qty.
     *
     * @return the value for com_non_cover_qty.
     */
    public int getCom_non_cover_qty() {
        return (com_non_cover_qty);
    }

    /**
     * Used to obtain the value of com_submit_qty.
     *
     * @return the value for com_submit_qty.
     */
    public int getCom_submit_qty() {
        return (com_submit_qty);
    }

    /**
     * Used to obtain the value of com_warn_qty.
     *
     * @return the value for com_warn_qty.
     */
    public int getCom_warn_qty() {
        return (com_warn_qty);
    }

    /**
     * Used to obtain the value of com_non_cover_qty_p.
     *
     * @return the value for com_non_cover_qty_p.
     */
    public int getCom_non_cover_qty_p() {
        return (com_non_cover_qty_p);
    }

    /**
     * Used to obtain the value of com_submit_qty_p.
     *
     * @return the value for com_submit_qty_p.
     */
    public int getCom_submit_qty_p() {
        return (com_submit_qty_p);
    }

    /**
     * Used to obtain the value of com_warn_qty_p.
     *
     * @return the value for com_warn_qty_p.
     */
    public int getCom_warn_qty_p() {
        return (com_warn_qty_p);
    }

    /**
     * Used to obtain the value of com_begin_trading_hour.
     *
     * @return the value for com_begin_trading_hour.
     */
    public int getCom_begin_trading_hour() {
        return (com_begin_trading_hour);
    }

    /**
     * Used to obtain the value of com_end_trading_hour.
     *
     * @return the value for com_end_trading_hour.
     */
    public int getCom_end_trading_hour() {
        return (com_end_trading_hour);
    }

    /**
     * Used to obtain the value of com_tx_tax_r.
     *
     * @return the value for com_tx_tax_r.
     */
    public BigDecimal getCom_tx_tax_r() {
        return (com_tx_tax_r);
    }

    /**
     * Used to obtain the value of com_tx_account_no.
     *
     * @return the value for com_tx_account_no.
     */
    public String getCom_tx_account_no() {
        return (com_tx_account_no);
    }

    /**
     * Used to obtain the value of com_return_time.
     *
     * @return the value for com_return_time.
     */
    public int getCom_return_time() {
        return (com_return_time);
    }

    /**
     * Used to obtain the value of com_maker_flag.
     *
     * @return the value for com_maker_flag.
     */
    public String getCom_maker_flag() {
        return (com_maker_flag);
    }

    /**
     * Used to obtain the value of com_stop_flag.
     *
     * @return the value for com_stop_flag.
     */
    public String getCom_stop_flag() {
        return (com_stop_flag);
    }

    /**
     * Used to obtain the value of com_oper_user.
     *
     * @return the value for com_oper_user.
     */
    public String getCom_oper_user() {
        return (com_oper_user);
    }

    /**
     * Used to obtain the value of com_oper_date.
     *
     * @return the value for com_oper_date.
     */
    public long getCom_oper_date() {
        return (com_oper_date);
    }

    /**
     * Used to obtain the value of com_oper_time.
     *
     * @return the value for com_oper_time.
     */
    public long getCom_oper_time() {
        return (com_oper_time);
    }

    /**
     * Used to obtain the value of com_prog.
     *
     * @return the value for com_prog.
     */
    public String getCom_prog() {
        return (com_prog);
    }

    /**
     * Used to obtain the value of com_decimal_point.
     *
     * @return the value for com_decimal_point.
     */
    public String getCom_decimal_point() {
        return (com_decimal_point);
    }

    /**
     * Used to obtain the value of com_prod_king.
     *
     * @return the value for com_prod_king.
     */
    public String getCom_prod_king() {
        return (com_prod_king);
    }

    /**
     * Used to obtain the value of com_non_cover_qty_l.
     *
     * @return the value for com_non_cover_qty_l.
     */
    public int getCom_non_cover_qty_l() {
        return (com_non_cover_qty_l);
    }

    /**
     * Used to obtain the value of com_submit_qty_l.
     *
     * @return the value for com_submit_qty_l.
     */
    public int getCom_submit_qty_l() {
        return (com_submit_qty_l);
    }

    /**
     * Used to obtain the value of com_warn_qty_l.
     *
     * @return the value for com_warn_qty_l.
     */
    public int getCom_warn_qty_l() {
        return (com_warn_qty_l);
    }

    /**
     * Used to obtain the value of com_up_fee_kind.
     *
     * @return the value for com_up_fee_kind.
     */
    public String getCom_up_fee_kind() {
        return (com_up_fee_kind);
    }

    /**
     * Used to obtain the value of com_fee_kind.
     *
     * @return the value for com_fee_kind.
     */
    public String getCom_fee_kind() {
        return (com_fee_kind);
    }

    /**
     * Used to obtain the value of com_dn_fee_kind.
     *
     * @return the value for com_dn_fee_kind.
     */
    public String getCom_dn_fee_kind() {
        return (com_dn_fee_kind);
    }

    /**
     * Used to obtain the value of com_fu_commodity_id_1.
     *
     * @return the value for com_fu_commodity_id_1.
     */
    public String getCom_fu_commodity_id_1() {
        return (com_fu_commodity_id_1);
    }

    /**
     * Used to obtain the value of com_fu_factor.
     *
     * @return the value for com_fu_factor.
     */
    public BigDecimal getCom_fu_factor() {
        return (com_fu_factor);
    }

    /**
     * Used to obtain the value of com_ini_fee.
     *
     * @return the value for com_ini_fee.
     */
    public BigDecimal getCom_ini_fee() {
        return (com_ini_fee);
    }

    /**
     * Used to obtain the value of com_non_cover_qty_m.
     *
     * @return the value for com_non_cover_qty_m.
     */
    public int getCom_non_cover_qty_m() {
        return (com_non_cover_qty_m);
    }

    /**
     * Used to obtain the value of com_submit_qty_m.
     *
     * @return the value for com_submit_qty_m.
     */
    public int getCom_submit_qty_m() {
        return (com_submit_qty_m);
    }

    /**
     * Used to obtain the value of com_warn_qty_m.
     *
     * @return the value for com_warn_qty_m.
     */
    public int getCom_warn_qty_m() {
        return (com_warn_qty_m);
    }

    /**
     * Used to obtain the value of com_pre_contract_size.
     *
     * @return the value for com_pre_contract_size.
     */
    public BigDecimal getCom_pre_contract_size() {
        return (com_pre_contract_size);
    }

    /**
     * Used to obtain the value of com_strike_factor.
     *
     * @return the value for com_strike_factor.
     */
    public BigDecimal getCom_strike_factor() {
        return (com_strike_factor);
    }

    /**
     * Used to obtain the value of com_pre_commodity_id.
     *
     * @return the value for com_pre_commodity_id.
     */
    public String getCom_pre_commodity_id() {
        return (com_pre_commodity_id);
    }

    /**
     * Used to obtain the value of com_range.
     *
     * @return the value for com_range.
     */
    public String getCom_range() {
        return (com_range);
    }

    /**
     * Used to obtain the value of com_prompt_tax_r.
     *
     * @return the value for com_prompt_tax_r.
     */
    public BigDecimal getCom_prompt_tax_r() {
        return (com_prompt_tax_r);
    }

    /**
     * Used to obtain the value of com_price_factor.
     *
     * @return the value for com_price_factor.
     */
    public BigDecimal getCom_price_factor() {
        return (com_price_factor);
    }

    /**
     * Used to obtain the value of com_month_nc_qty.
     *
     * @return the value for com_month_nc_qty.
     */
    public long getCom_month_nc_qty() {
        return (com_month_nc_qty);
    }

    /**
     * Used to obtain the value of com_fee_currency.
     *
     * @return the value for com_fee_currency.
     */
    public String getCom_fee_currency() {
        return (com_fee_currency);
    }

    /**
     * Used to obtain the value of com_span_group_id.
     *
     * @return the value for com_span_group_id.
     */
    public String getCom_span_group_id() {
        return (com_span_group_id);
    }

    /**
     * Used to obtain the value of com_span_comm_id.
     *
     * @return the value for com_span_comm_id.
     */
    public String getCom_span_comm_id() {
        return (com_span_comm_id);
    }

    /**
     * Used to obtain the value of com_return_time_l.
     *
     * @return the value for com_return_time_l.
     */
    public int getCom_return_time_l() {
        return (com_return_time_l);
    }

    /**
     * Used to obtain the value of com_month_nc_qty_s.
     *
     * @return the value for com_month_nc_qty_s.
     */
    public long getCom_month_nc_qty_s() {
        return (com_month_nc_qty_s);
    }

    /**
     * Used to obtain the value of com_month_nc_qty_p.
     *
     * @return the value for com_month_nc_qty_p.
     */
    public long getCom_month_nc_qty_p() {
        return (com_month_nc_qty_p);
    }

    /**
     * Used to obtain the value of com_dtr_stop_time.
     *
     * @return the value for com_dtr_stop_time.
     */
    public int getCom_dtr_stop_time() {
        return (com_dtr_stop_time);
    }

    /**
     * Used to obtain the value of com_dtr_stop_time_l.
     *
     * @return the value for com_dtr_stop_time_l.
     */
    public int getCom_dtr_stop_time_l() {
        return (com_dtr_stop_time_l);
    }

    /**
     * Used to obtain the value of com_stock_no_3.
     *
     * @return the value for com_stock_no_3.
     */
    public String getCom_stock_no_3() {
        return (com_stock_no_3);
    }

    /**
     * Used to obtain the value of com_not_hedge_flag.
     *
     * @return the value for com_not_hedge_flag.
     */
    public String getCom_not_hedge_flag() {
        return (com_not_hedge_flag);
    }

    /**
     * Used to obtain the value of com_cash_dividend.
     *
     * @return the value for com_cash_dividend.
     */
    public BigDecimal getCom_cash_dividend() {
        return (com_cash_dividend);
    }

    /**
     * Used to obtain the value of com_hedge_status_flag.
     *
     * @return the value for com_hedge_status_flag.
     */
    public String getCom_hedge_status_flag() {
        return (com_hedge_status_flag);
    }

    /**
     * Used to obtain the value of com_block_trade_flag.
     *
     * @return the value for com_block_trade_flag.
     */
    public String getCom_block_trade_flag() {
        return (com_block_trade_flag);
    }

    /**
     * Used to obtain the value of com_block_trade_qty.
     *
     * @return the value for com_block_trade_qty.
     */
    public int getCom_block_trade_qty() {
        return (com_block_trade_qty);
    }

    /**
     * Used to obtain the value of com_expiry_type.
     *
     * @return the value for com_expiry_type.
     */
    public String getCom_expiry_type() {
        return (com_expiry_type);
    }

    /**
     * Used to obtain the value of com_etf_flag.
     *
     * @return the value for com_etf_flag.
     */
    public String getCom_etf_flag() {
        return (com_etf_flag);
    }

    /**
     * Used to obtain the value of com_market_cls_group.
     *
     * @return the value for com_market_cls_group.
     */
    public String getCom_market_cls_group() {
        return (com_market_cls_group);
    }

    /**
     * Used to obtain the value of com_ah_trade.
     *
     * @return the value for com_ah_trade.
     */
    public String getCom_ah_trade() {
        return (com_ah_trade);
    }

    /**
     * Used to obtain the value of com_ah_kill_flag.
     *
     * @return the value for com_ah_kill_flag.
     */
    public String getCom_ah_kill_flag() {
        return (com_ah_kill_flag);
    }

    /**
     * Used to obtain the value of com_mts_end_time.
     *
     * @return the value for com_mts_end_time.
     */
    public int getCom_mts_end_time() {
        return (com_mts_end_time);
    }

    /**
     * Used to obtain the value of com_ah_ftsi_maker_flag.
     *
     * @return the value for com_ah_ftsi_maker_flag.
     */
    public String getCom_ah_ftsi_maker_flag() {
        return (com_ah_ftsi_maker_flag);
    }

    /**
     * Used to obtain the value of com_ah_maker_flag.
     *
     * @return the value for com_ah_maker_flag.
     */
    public String getCom_ah_maker_flag() {
        return (com_ah_maker_flag);
    }

    /**
     * Used to obtain the value of com_ah_block_trade_flag.
     *
     * @return the value for com_ah_block_trade_flag.
     */
    public String getCom_ah_block_trade_flag() {
        return (com_ah_block_trade_flag);
    }

    /**
     * Used to obtain the value of com_end_session.
     *
     * @return the value for com_end_session.
     */
    public String getCom_end_session() {
        return (com_end_session);
    }

    /**
     * Used to obtain the value of com_us_track_a.
     *
     * @return the value for com_us_track_a.
     */
    public String getCom_us_track_a() {
        return (com_us_track_a);
    }

    /**
     * Used to obtain the value of com_us_track_b.
     *
     * @return the value for com_us_track_b.
     */
    public String getCom_us_track_b() {
        return (com_us_track_b);
    }

    /**
     * Used to obtain the value of com_symbol_grp.
     *
     * @return the value for com_symbol_grp.
     */
    public String getCom_symbol_grp() {
        return (com_symbol_grp);
    }

    /**
     * Used to obtain the value of com_lmt_symbol3.
     *
     * @return the value for com_lmt_symbol3.
     */
    public String getCom_lmt_symbol3() {
        return (com_lmt_symbol3);
    }

    /**
     * Used to obtain the value of com_lmt_rate.
     *
     * @return the value for com_lmt_rate.
     */
    public BigDecimal getCom_lmt_rate() {
        return (com_lmt_rate);
    }

    /**
     * Used to obtain the value of com_market_mask.
     *
     * @return the value for com_market_mask.
     */
    public long getCom_market_mask() {
        return (com_market_mask);
    }

    /**
     * Used to obtain the value of com_cold_flag.
     *
     * @return the value for com_cold_flag.
     */
    public String getCom_cold_flag() {
        return (com_cold_flag);
    }

    /**
     * Used to obtain the value of com_flex_flag.
     *
     * @return the value for com_flex_flag.
     */
    public String getCom_flex_flag() {
        return (com_flex_flag);
    }

    /**
     * Used to obtain the value of com_new_dtr_time.
     *
     * @return the value for com_new_dtr_time.
     */
    public int getCom_new_dtr_time() {
        return (com_new_dtr_time);
    }

    /**
     * Used to obtain the value of com_seqno.
     *
     * @return the value for com_seqno.
     */
    public String getCom_seqno() {
        return (com_seqno);
    }

    /**
     * Used to obtain the value of com_new_dtr_time_l.
     *
     * @return the value for com_new_dtr_time_l.
     */
    public int getCom_new_dtr_time_l() {
        return (com_new_dtr_time_l);
    }

    /**
     * Used to obtain the value of com_part_id.
     *
     * @return the value for com_part_id.
     */
    public String getCom_part_id() {
        return (com_part_id);
    }

    /**
     * Used to obtain the value of filler0.
     *
     * @return the value for filler0.
     */
    public String getFiller0() {
        return (filler0);
    }

    /**
     * Moves the data from the supplied byte array to the instance variables.
     *
     * @param _buffer a byte array which contains the data to be moved.
     * @param _count  the number of bytes to be converted.
     * @throws com.tandem.ext.util.DataConversionException if
     *                                                     a field fails to convert correctly and allowErrors has been set to false; or
     *                                                     allowErrors is set to true and _count < getLength().
     * @see #allowErrors
     **/
    public void unmarshal(byte[] _buffer, int _count)
            throws com.tandem.ext.util.DataConversionException {

        int _offset;
        int _fieldSize;
        _errorDetail.clear();
        _numConversionErrors = 0;
        if (!_allowErrors && _count < _bufferLen) {
            _numConversionErrors++;
            throw new DataConversionException(DataConversionException.ConvError.PARAM,
                    "The value supplied for the _count variable is less than expected (see getLength())");
        }
        if (_allowErrors && _count < _bufferLen) {
            DataConversionException _bfe = new DataConversionException(DataConversionException.ConvError.PARAM,
                    "The value supplied for the _count variable is less than expected (see  getLength())");
            _numConversionErrors++;
            _errorDetail.put(_buffer, _bfe);
        }
        String encodeSetting = new String();

        String defaultEncoding = "ISO8859-1";
        if (defaultEncoding == null) {
            throw new MissingResourceException("Property not found for character encoding default : ISO8859-1",
                    this.getClass().getName(), "ISO8859-1");
        }


        _offset = 0;
        if (_offset >= _count) return;
        _fieldSize = Math.min(7, _count - _offset);
        encodeSetting = System.getProperty("com_exch_id.encoding", defaultEncoding);
        try {
            com_exch_id = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_exch_id", dce);
            } else {
                throw dce;
            }
        }

        _offset = 7;
        if (_offset >= _count) return;
        _fieldSize = Math.min(7, _count - _offset);
        encodeSetting = System.getProperty("com_commodity_id.encoding", defaultEncoding);
        try {
            com_commodity_id = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_commodity_id", dce);
            } else {
                throw dce;
            }
        }

        _offset = 14;
        if (_offset >= _count) return;
        _fieldSize = Math.min(30, _count - _offset);
        encodeSetting = System.getProperty("com_name.encoding", defaultEncoding);
        try {
            com_name = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_name", dce);
            } else {
                throw dce;
            }
        }

        _offset = 44;
        if (_offset >= _count) return;
        _fieldSize = Math.min(30, _count - _offset);
        encodeSetting = System.getProperty("com_english_name.encoding", defaultEncoding);
        try {
            com_english_name = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_english_name", dce);
            } else {
                throw dce;
            }
        }

        _offset = 74;
        if (_offset >= _count) return;
        _fieldSize = Math.min(14, _count - _offset);
        encodeSetting = System.getProperty("com_alias.encoding", defaultEncoding);
        try {
            com_alias = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_alias", dce);
            } else {
                throw dce;
            }
        }

        _offset = 88;
        if (_offset >= _count) return;
        _fieldSize = Math.min(3, _count - _offset);
        encodeSetting = System.getProperty("com_country.encoding", defaultEncoding);
        try {
            com_country = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_country", dce);
            } else {
                throw dce;
            }
        }

        _offset = 91;
        if (_offset >= _count) return;
        _fieldSize = Math.min(3, _count - _offset);
        encodeSetting = System.getProperty("com_currency.encoding", defaultEncoding);
        try {
            com_currency = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_currency", dce);
            } else {
                throw dce;
            }
        }

        _offset = 94;
        if (_offset + 8 > _count) return;
        try {
            com_contract_size = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 6, 8, 5);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_contract_size", dce);
            } else {
                throw dce;
            }
        }

        _offset = 102;
        if (_offset >= _count) return;
        _fieldSize = Math.min(5, _count - _offset);
        encodeSetting = System.getProperty("com_unit.encoding", defaultEncoding);
        try {
            com_unit = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_unit", dce);
            } else {
                throw dce;
            }
        }

        _offset = 107;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_trade_flag.encoding", defaultEncoding);
        try {
            com_trade_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_trade_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 108;
        if (_offset + 2 > _count) return;
        try {
            com_base_unit = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_base_unit", dce);
            } else {
                throw dce;
            }
        }

        _offset = 110;
        if (_offset + 4 > _count) return;
        try {
            com_min_fluct = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 4, 4, 2);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_min_fluct", dce);
            } else {
                throw dce;
            }
        }

        _offset = 114;
        if (_offset >= _count) return;
        _fieldSize = Math.min(5, _count - _offset);
        encodeSetting = System.getProperty("com_min_fluct_unit.encoding", defaultEncoding);
        try {
            com_min_fluct_unit = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_min_fluct_unit", dce);
            } else {
                throw dce;
            }
        }

        _offset = 119;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_ftsi_maker_flag.encoding", defaultEncoding);
        try {
            com_ftsi_maker_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_ftsi_maker_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 120;
        if (_offset + 4 > _count) return;
        try {
            com_tick_amt = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 4, 4, 2);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_tick_amt", dce);
            } else {
                throw dce;
            }
        }

        _offset = 124;
        if (_offset + 4 > _count) return;
        try {
            com_base_price = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 4, 4, 4);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_base_price", dce);
            } else {
                throw dce;
            }
        }

        _offset = 128;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_rule.encoding", defaultEncoding);
        try {
            com_rule = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_rule", dce);
            } else {
                throw dce;
            }
        }

        _offset = 129;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_status_flag.encoding", defaultEncoding);
        try {
            com_status_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_status_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 130;
        if (_offset + 4 > _count) return;
        try {
            com_daily_limit = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 4, 4, 2);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_daily_limit", dce);
            } else {
                throw dce;
            }
        }

        _offset = 134;
        if (_offset + 4 > _count) return;
        try {
            com_limit_qty = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_limit_qty", dce);
            } else {
                throw dce;
            }
        }

        _offset = 138;
        if (_offset + 4 > _count) return;
        try {
            com_non_cover_qty = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_non_cover_qty", dce);
            } else {
                throw dce;
            }
        }

        _offset = 142;
        if (_offset + 4 > _count) return;
        try {
            com_submit_qty = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_submit_qty", dce);
            } else {
                throw dce;
            }
        }

        _offset = 146;
        if (_offset + 4 > _count) return;
        try {
            com_warn_qty = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_warn_qty", dce);
            } else {
                throw dce;
            }
        }

        _offset = 150;
        if (_offset + 4 > _count) return;
        try {
            com_non_cover_qty_p = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_non_cover_qty_p", dce);
            } else {
                throw dce;
            }
        }

        _offset = 154;
        if (_offset + 4 > _count) return;
        try {
            com_submit_qty_p = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_submit_qty_p", dce);
            } else {
                throw dce;
            }
        }

        _offset = 158;
        if (_offset + 4 > _count) return;
        try {
            com_warn_qty_p = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_warn_qty_p", dce);
            } else {
                throw dce;
            }
        }

        _offset = 162;
        if (_offset + 2 > _count) return;
        try {
            com_begin_trading_hour = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_begin_trading_hour", dce);
            } else {
                throw dce;
            }
        }

        _offset = 164;
        if (_offset + 2 > _count) return;
        try {
            com_end_trading_hour = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_end_trading_hour", dce);
            } else {
                throw dce;
            }
        }

        _offset = 166;
        if (_offset + 8 > _count) return;
        try {
            com_tx_tax_r = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 6, 8, 9);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_tx_tax_r", dce);
            } else {
                throw dce;
            }
        }

        _offset = 174;
        if (_offset >= _count) return;
        _fieldSize = Math.min(10, _count - _offset);
        encodeSetting = System.getProperty("com_tx_account_no.encoding", defaultEncoding);
        try {
            com_tx_account_no = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_tx_account_no", dce);
            } else {
                throw dce;
            }
        }

        _offset = 184;
        if (_offset + 2 > _count) return;
        try {
            com_return_time = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_return_time", dce);
            } else {
                throw dce;
            }
        }

        _offset = 186;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_maker_flag.encoding", defaultEncoding);
        try {
            com_maker_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_maker_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 187;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_stop_flag.encoding", defaultEncoding);
        try {
            com_stop_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_stop_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 188;
        if (_offset >= _count) return;
        _fieldSize = Math.min(12, _count - _offset);
        encodeSetting = System.getProperty("com_oper_user.encoding", defaultEncoding);
        try {
            com_oper_user = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_oper_user", dce);
            } else {
                throw dce;
            }
        }

        _offset = 200;
        if (_offset + 4 > _count) return;
        try {
            com_oper_date = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_oper_date", dce);
            } else {
                throw dce;
            }
        }

        _offset = 204;
        if (_offset + 4 > _count) return;
        try {
            com_oper_time = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_oper_time", dce);
            } else {
                throw dce;
            }
        }

        _offset = 208;
        if (_offset >= _count) return;
        _fieldSize = Math.min(4, _count - _offset);
        encodeSetting = System.getProperty("com_prog.encoding", defaultEncoding);
        try {
            com_prog = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_prog", dce);
            } else {
                throw dce;
            }
        }

        _offset = 212;
        if (_offset + 1 > _count) return;
        try {
            com_decimal_point = DataConversion.NumStrToJavaStr(_buffer, _offset, 1, 0, 16);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_decimal_point", dce);
            } else {
                throw dce;
            }
        }

        _offset = 213;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_prod_king.encoding", defaultEncoding);
        try {
            com_prod_king = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_prod_king", dce);
            } else {
                throw dce;
            }
        }

        _offset = 214;
        if (_offset + 4 > _count) return;
        try {
            com_non_cover_qty_l = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_non_cover_qty_l", dce);
            } else {
                throw dce;
            }
        }

        _offset = 218;
        if (_offset + 4 > _count) return;
        try {
            com_submit_qty_l = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_submit_qty_l", dce);
            } else {
                throw dce;
            }
        }

        _offset = 222;
        if (_offset + 4 > _count) return;
        try {
            com_warn_qty_l = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_warn_qty_l", dce);
            } else {
                throw dce;
            }
        }

        _offset = 226;
        if (_offset >= _count) return;
        _fieldSize = Math.min(7, _count - _offset);
        encodeSetting = System.getProperty("com_up_fee_kind.encoding", defaultEncoding);
        try {
            com_up_fee_kind = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_up_fee_kind", dce);
            } else {
                throw dce;
            }
        }

        _offset = 233;
        if (_offset >= _count) return;
        _fieldSize = Math.min(7, _count - _offset);
        encodeSetting = System.getProperty("com_fee_kind.encoding", defaultEncoding);
        try {
            com_fee_kind = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_fee_kind", dce);
            } else {
                throw dce;
            }
        }

        _offset = 240;
        if (_offset >= _count) return;
        _fieldSize = Math.min(7, _count - _offset);
        encodeSetting = System.getProperty("com_dn_fee_kind.encoding", defaultEncoding);
        try {
            com_dn_fee_kind = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_dn_fee_kind", dce);
            } else {
                throw dce;
            }
        }

        _offset = 247;
        if (_offset >= _count) return;
        _fieldSize = Math.min(7, _count - _offset);
        encodeSetting = System.getProperty("com_fu_commodity_id_1.encoding", defaultEncoding);
        try {
            com_fu_commodity_id_1 = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_fu_commodity_id_1", dce);
            } else {
                throw dce;
            }
        }

        _offset = 254;
        if (_offset + 2 > _count) return;
        try {
            com_fu_factor = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 3, 2, 2);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_fu_factor", dce);
            } else {
                throw dce;
            }
        }

        _offset = 256;
        if (_offset + 4 > _count) return;
        try {
            com_ini_fee = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 5, 4, 2);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_ini_fee", dce);
            } else {
                throw dce;
            }
        }

        _offset = 260;
        if (_offset + 4 > _count) return;
        try {
            com_non_cover_qty_m = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_non_cover_qty_m", dce);
            } else {
                throw dce;
            }
        }

        _offset = 264;
        if (_offset + 4 > _count) return;
        try {
            com_submit_qty_m = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_submit_qty_m", dce);
            } else {
                throw dce;
            }
        }

        _offset = 268;
        if (_offset + 4 > _count) return;
        try {
            com_warn_qty_m = DataConversion.BIN32ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_warn_qty_m", dce);
            } else {
                throw dce;
            }
        }

        _offset = 272;
        if (_offset + 8 > _count) return;
        try {
            com_pre_contract_size = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 6, 8, 5);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_pre_contract_size", dce);
            } else {
                throw dce;
            }
        }

        _offset = 280;
        if (_offset + 2 > _count) return;
        try {
            com_strike_factor = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 3, 2, 3);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_strike_factor", dce);
            } else {
                throw dce;
            }
        }

        _offset = 282;
        if (_offset >= _count) return;
        _fieldSize = Math.min(7, _count - _offset);
        encodeSetting = System.getProperty("com_pre_commodity_id.encoding", defaultEncoding);
        try {
            com_pre_commodity_id = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_pre_commodity_id", dce);
            } else {
                throw dce;
            }
        }

        _offset = 289;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_range.encoding", defaultEncoding);
        try {
            com_range = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_range", dce);
            } else {
                throw dce;
            }
        }

        _offset = 290;
        if (_offset + 8 > _count) return;
        try {
            com_prompt_tax_r = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 6, 8, 9);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_prompt_tax_r", dce);
            } else {
                throw dce;
            }
        }

        _offset = 298;
        if (_offset + 4 > _count) return;
        try {
            com_price_factor = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 5, 4, 8);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_price_factor", dce);
            } else {
                throw dce;
            }
        }

        _offset = 302;
        if (_offset + 4 > _count) return;
        try {
            com_month_nc_qty = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_month_nc_qty", dce);
            } else {
                throw dce;
            }
        }

        _offset = 306;
        if (_offset >= _count) return;
        _fieldSize = Math.min(3, _count - _offset);
        encodeSetting = System.getProperty("com_fee_currency.encoding", defaultEncoding);
        try {
            com_fee_currency = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_fee_currency", dce);
            } else {
                throw dce;
            }
        }

        _offset = 309;
        if (_offset >= _count) return;
        _fieldSize = Math.min(2, _count - _offset);
        encodeSetting = System.getProperty("com_span_group_id.encoding", defaultEncoding);
        try {
            com_span_group_id = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_span_group_id", dce);
            } else {
                throw dce;
            }
        }

        _offset = 311;
        if (_offset >= _count) return;
        _fieldSize = Math.min(5, _count - _offset);
        encodeSetting = System.getProperty("com_span_comm_id.encoding", defaultEncoding);
        try {
            com_span_comm_id = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_span_comm_id", dce);
            } else {
                throw dce;
            }
        }

        _offset = 316;
        if (_offset + 2 > _count) return;
        try {
            com_return_time_l = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_return_time_l", dce);
            } else {
                throw dce;
            }
        }

        _offset = 318;
        if (_offset + 4 > _count) return;
        try {
            com_month_nc_qty_s = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_month_nc_qty_s", dce);
            } else {
                throw dce;
            }
        }

        _offset = 322;
        if (_offset + 4 > _count) return;
        try {
            com_month_nc_qty_p = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_month_nc_qty_p", dce);
            } else {
                throw dce;
            }
        }

        _offset = 326;
        if (_offset + 2 > _count) return;
        try {
            com_dtr_stop_time = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_dtr_stop_time", dce);
            } else {
                throw dce;
            }
        }

        _offset = 328;
        if (_offset + 2 > _count) return;
        try {
            com_dtr_stop_time_l = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_dtr_stop_time_l", dce);
            } else {
                throw dce;
            }
        }

        _offset = 330;
        if (_offset >= _count) return;
        _fieldSize = Math.min(7, _count - _offset);
        encodeSetting = System.getProperty("com_stock_no_3.encoding", defaultEncoding);
        try {
            com_stock_no_3 = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_stock_no_3", dce);
            } else {
                throw dce;
            }
        }

        _offset = 337;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_not_hedge_flag.encoding", defaultEncoding);
        try {
            com_not_hedge_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_not_hedge_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 338;
        if (_offset + 4 > _count) return;
        try {
            com_cash_dividend = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 5, 4, 2);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_cash_dividend", dce);
            } else {
                throw dce;
            }
        }

        _offset = 342;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_hedge_status_flag.encoding", defaultEncoding);
        try {
            com_hedge_status_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_hedge_status_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 343;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_block_trade_flag.encoding", defaultEncoding);
        try {
            com_block_trade_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_block_trade_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 344;
        if (_offset + 2 > _count) return;
        try {
            com_block_trade_qty = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_block_trade_qty", dce);
            } else {
                throw dce;
            }
        }

        _offset = 346;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_expiry_type.encoding", defaultEncoding);
        try {
            com_expiry_type = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_expiry_type", dce);
            } else {
                throw dce;
            }
        }

        _offset = 347;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_etf_flag.encoding", defaultEncoding);
        try {
            com_etf_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_etf_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 348;
        if (_offset >= _count) return;
        _fieldSize = Math.min(2, _count - _offset);
        encodeSetting = System.getProperty("com_market_cls_group.encoding", defaultEncoding);
        try {
            com_market_cls_group = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_market_cls_group", dce);
            } else {
                throw dce;
            }
        }

        _offset = 350;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_ah_trade.encoding", defaultEncoding);
        try {
            com_ah_trade = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_ah_trade", dce);
            } else {
                throw dce;
            }
        }

        _offset = 351;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_ah_kill_flag.encoding", defaultEncoding);
        try {
            com_ah_kill_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_ah_kill_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 352;
        if (_offset + 2 > _count) return;
        try {
            com_mts_end_time = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_mts_end_time", dce);
            } else {
                throw dce;
            }
        }

        _offset = 354;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_ah_ftsi_maker_flag.encoding", defaultEncoding);
        try {
            com_ah_ftsi_maker_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_ah_ftsi_maker_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 355;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_ah_maker_flag.encoding", defaultEncoding);
        try {
            com_ah_maker_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_ah_maker_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 356;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_ah_block_trade_flag.encoding", defaultEncoding);
        try {
            com_ah_block_trade_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_ah_block_trade_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 357;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_end_session.encoding", defaultEncoding);
        try {
            com_end_session = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_end_session", dce);
            } else {
                throw dce;
            }
        }

        _offset = 358;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_us_track_a.encoding", defaultEncoding);
        try {
            com_us_track_a = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_us_track_a", dce);
            } else {
                throw dce;
            }
        }

        _offset = 359;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_us_track_b.encoding", defaultEncoding);
        try {
            com_us_track_b = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_us_track_b", dce);
            } else {
                throw dce;
            }
        }

        _offset = 360;
        if (_offset >= _count) return;
        _fieldSize = Math.min(3, _count - _offset);
        encodeSetting = System.getProperty("com_symbol_grp.encoding", defaultEncoding);
        try {
            com_symbol_grp = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_symbol_grp", dce);
            } else {
                throw dce;
            }
        }

        _offset = 363;
        if (_offset >= _count) return;
        _fieldSize = Math.min(3, _count - _offset);
        encodeSetting = System.getProperty("com_lmt_symbol3.encoding", defaultEncoding);
        try {
            com_lmt_symbol3 = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_lmt_symbol3", dce);
            } else {
                throw dce;
            }
        }

        _offset = 366;
        if (_offset + 8 > _count) return;
        try {
            com_lmt_rate = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 6, 8, 5);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_lmt_rate", dce);
            } else {
                throw dce;
            }
        }

        _offset = 374;
        if (_offset + 4 > _count) return;
        try {
            com_market_mask = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_market_mask", dce);
            } else {
                throw dce;
            }
        }

        _offset = 378;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_cold_flag.encoding", defaultEncoding);
        try {
            com_cold_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_cold_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 379;
        if (_offset >= _count) return;
        _fieldSize = Math.min(1, _count - _offset);
        encodeSetting = System.getProperty("com_flex_flag.encoding", defaultEncoding);
        try {
            com_flex_flag = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_flex_flag", dce);
            } else {
                throw dce;
            }
        }

        _offset = 380;
        if (_offset + 2 > _count) return;
        try {
            com_new_dtr_time = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_new_dtr_time", dce);
            } else {
                throw dce;
            }
        }

        _offset = 382;
        if (_offset + 2 > _count) return;
        try {
            com_seqno = DataConversion.NumStrToJavaStr(_buffer, _offset, 2, 0, 16);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_seqno", dce);
            } else {
                throw dce;
            }
        }

        _offset = 384;
        if (_offset + 2 > _count) return;
        try {
            com_new_dtr_time_l = DataConversion.UNBIN16ToJavaInt(_buffer, _offset);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_new_dtr_time_l", dce);
            } else {
                throw dce;
            }
        }

        _offset = 386;
        if (_offset >= _count) return;
        _fieldSize = Math.min(3, _count - _offset);
        encodeSetting = System.getProperty("com_part_id.encoding", defaultEncoding);
        try {
            com_part_id = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("com_part_id", dce);
            } else {
                throw dce;
            }
        }

        _offset = 389;
        if (_offset >= _count) return;
        _fieldSize = Math.min(27, _count - _offset);
        encodeSetting = System.getProperty("filler.encoding", defaultEncoding);
        try {
            filler0 = DataConversion.CStrToJavaStr(_buffer, _offset, _fieldSize, encodeSetting);
        } catch (DataConversionException dce) {
            _numConversionErrors++;
            if (_allowErrors) {
                _errorDetail.put("filler0", dce);
            } else {
                throw dce;
            }
        }
    }
}
