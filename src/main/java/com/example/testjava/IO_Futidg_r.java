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
IO_Futidg_r class was generated for DDL Rec/Def: futidg_r on: 5/9/24 at: 17:56:38.
This is an INPUT/OUTPUT class which can be used to read and write data.*/

  public class IO_Futidg_r implements com.tandem.ext.guardian.GuardianInput, 
            com.tandem.ext.guardian.GuardianOutput {
    protected int _numConversionErrors;
    protected boolean _allowErrors = false;
    protected HashMap _errorDetail;

    protected int _bufferLen = 144;
    public String idg_broker_id;
    public String idg_ib_no;
    public String idg_introduce_id;
    public String idg_investor_acno;
    public String idg_commodity_id;
    public String idg_in_kind;
    public String idg_begin_date;
    public String idg_seqno;
    public String idg_broker_id_1;
    public String idg_ib_no_1;
    public String idg_investor_acno_1;
    public String idg_commodity_id_1;
    public String idg_in_kind_1;
    public String idg_end_date_1;
    public String idg_end_date_2;
    public String idg_rule;
    public BigDecimal idg_amt;
    public String idg_oper_user;
    public long idg_oper_date;
    public long idg_oper_time;
    public String idg_prog;
    public String idg_cancel_mark;
    public String filler0;

/**
IO_Futidg_r Constructor
*/
   public IO_Futidg_r() {
        _errorDetail = new HashMap();
   }

/**
Returns the expected length of the byte array used by this class.
@return int expected length of byte array.
*/
   public int getLength() {
      return _bufferLen;
   }
/**
  Indicates whether DataConversion Exceptions are thrown during execution
  of the unmarshal method. Specifying false indicates that the first data
  conversion error encountered during execution of the unmarshal method, 
  causes a DataConversionException to be thrown.  All subsequent data in 
  the byte array supplied to the unmarshal method is NOT converted

  Specifying true indicates that DataConversionExceptions are ignored 
  during execution of the unmarshal method.  umarshal will attempt to 
  convert all data in the byte array.  To determine if errors have 
  occurred during execution of unmarshal, the user can call 
  getNumConversionFailures().  This method returns the number of fields 
  that failed to convert.  If the call to getNumConversionFailures() 
  returns a number greater than zero, a call to 
  getConversionFailureDetails() returns a HashMap whose keys are the fields
  that failed to convert and whose value is the associated 
  DataConversionException.
  @param boolean true to indicate that conversion errors are to be 
  allowed; false otherwise.
  @see #getNumConversionFailures
  @see #getConversionFailureDetails
*/
    public void allowErrors(boolean value) {
       _allowErrors = value;
    }
/**
   Returns the number of fields that failed to convert during execution
   of the unmarshal method.
   @return the number of fields that failed to convert during the 
   execution of unmarshal.  A returned value of zero indicates that
   all fields converted.
   @see #allowErrors
   @see #getConversionFailureDetails
*/
    public int getNumConversionFailures() {
       return _numConversionErrors;
    }
/**
    Returns a HashMap with information about fields that failed to 
    convert during execution of the unmarshal method.  Keys are 
    the fields that failed to convert and values are the associated
    DataConversionExceptions.

    @return HashMap containing details of data conversion failures.
    If no failures occurred the HashMap.isEmpty() method returns true.
    @see #getNumConversionFailures
    @see #allowErrors
*/
     public HashMap getConversionFailureDetails() {
        return _errorDetail;
     }

/**
Used to set a value for idg_broker_id.
@param value  the value to be set.
*/
    public void setIdg_broker_id(String value) {
      idg_broker_id = value;
    }
/**
Used to set a value for idg_ib_no.
@param value  the value to be set.
*/
    public void setIdg_ib_no(String value) {
      idg_ib_no = value;
    }
/**
Used to set a value for idg_introduce_id.
@param value  the value to be set.
*/
    public void setIdg_introduce_id(String value) {
      idg_introduce_id = value;
    }
/**
Used to set a value for idg_investor_acno.
@param value  the value to be set.
*/
    public void setIdg_investor_acno(String value) {
      idg_investor_acno = value;
    }
/**
Used to set a value for idg_commodity_id.
@param value  the value to be set.
*/
    public void setIdg_commodity_id(String value) {
      idg_commodity_id = value;
    }
/**
Used to set a value for idg_in_kind.
@param value  the value to be set.
*/
    public void setIdg_in_kind(String value) {
      idg_in_kind = value;
    }
/**
Used to set a value for idg_begin_date.
@param value  the value to be set.
*/
    public void setIdg_begin_date(String value) {
      idg_begin_date = value;
    }
/**
Used to set a value for idg_seqno.
@param value  the value to be set.
*/
    public void setIdg_seqno(String value) {
      idg_seqno = value;
    }
/**
Used to set a value for idg_broker_id_1.
@param value  the value to be set.
*/
    public void setIdg_broker_id_1(String value) {
      idg_broker_id_1 = value;
    }
/**
Used to set a value for idg_ib_no_1.
@param value  the value to be set.
*/
    public void setIdg_ib_no_1(String value) {
      idg_ib_no_1 = value;
    }
/**
Used to set a value for idg_investor_acno_1.
@param value  the value to be set.
*/
    public void setIdg_investor_acno_1(String value) {
      idg_investor_acno_1 = value;
    }
/**
Used to set a value for idg_commodity_id_1.
@param value  the value to be set.
*/
    public void setIdg_commodity_id_1(String value) {
      idg_commodity_id_1 = value;
    }
/**
Used to set a value for idg_in_kind_1.
@param value  the value to be set.
*/
    public void setIdg_in_kind_1(String value) {
      idg_in_kind_1 = value;
    }
/**
Used to set a value for idg_end_date_1.
@param value  the value to be set.
*/
    public void setIdg_end_date_1(String value) {
      idg_end_date_1 = value;
    }
/**
Used to set a value for idg_end_date_2.
@param value  the value to be set.
*/
    public void setIdg_end_date_2(String value) {
      idg_end_date_2 = value;
    }
/**
Used to set a value for idg_rule.
@param value  the value to be set.
*/
    public void setIdg_rule(String value) {
      idg_rule = value;
    }
/**
Used to set a value for idg_amt.
@param value  the value to be set.
*/
    public void setIdg_amt(BigDecimal value) {
      idg_amt = value;
    }
/**
Used to set a value for idg_oper_user.
@param value  the value to be set.
*/
    public void setIdg_oper_user(String value) {
      idg_oper_user = value;
    }
/**
Used to set a value for idg_oper_date.
@param value  the value to be set.
*/
    public void setIdg_oper_date(long value) {
      idg_oper_date = value;
    }
/**
Used to set a value for idg_oper_time.
@param value  the value to be set.
*/
    public void setIdg_oper_time(long value) {
      idg_oper_time = value;
    }
/**
Used to set a value for idg_prog.
@param value  the value to be set.
*/
    public void setIdg_prog(String value) {
      idg_prog = value;
    }
/**
Used to set a value for idg_cancel_mark.
@param value  the value to be set.
*/
    public void setIdg_cancel_mark(String value) {
      idg_cancel_mark = value;
    }
/**
Used to set a value for filler0.
@param value  the value to be set.
*/
    public void setFiller0(String value) {
      filler0 = value;
    }

/**
Used to clear any existing values for idg_broker_id.
*/
    public void clearIdg_broker_id() {
        idg_broker_id = null;
    }
/**
Used to clear any existing values for idg_ib_no.
*/
    public void clearIdg_ib_no() {
        idg_ib_no = null;
    }
/**
Used to clear any existing values for idg_introduce_id.
*/
    public void clearIdg_introduce_id() {
        idg_introduce_id = null;
    }
/**
Used to clear any existing values for idg_investor_acno.
*/
    public void clearIdg_investor_acno() {
        idg_investor_acno = null;
    }
/**
Used to clear any existing values for idg_commodity_id.
*/
    public void clearIdg_commodity_id() {
        idg_commodity_id = null;
    }
/**
Used to clear any existing values for idg_in_kind.
*/
    public void clearIdg_in_kind() {
        idg_in_kind = null;
    }
/**
Used to clear any existing values for idg_begin_date.
*/
    public void clearIdg_begin_date() {
        idg_begin_date = null;
    }
/**
Used to clear any existing values for idg_seqno.
*/
    public void clearIdg_seqno() {
        idg_seqno = null;
    }
/**
Used to clear any existing values for idg_broker_id_1.
*/
    public void clearIdg_broker_id_1() {
        idg_broker_id_1 = null;
    }
/**
Used to clear any existing values for idg_ib_no_1.
*/
    public void clearIdg_ib_no_1() {
        idg_ib_no_1 = null;
    }
/**
Used to clear any existing values for idg_investor_acno_1.
*/
    public void clearIdg_investor_acno_1() {
        idg_investor_acno_1 = null;
    }
/**
Used to clear any existing values for idg_commodity_id_1.
*/
    public void clearIdg_commodity_id_1() {
        idg_commodity_id_1 = null;
    }
/**
Used to clear any existing values for idg_in_kind_1.
*/
    public void clearIdg_in_kind_1() {
        idg_in_kind_1 = null;
    }
/**
Used to clear any existing values for idg_end_date_1.
*/
    public void clearIdg_end_date_1() {
        idg_end_date_1 = null;
    }
/**
Used to clear any existing values for idg_end_date_2.
*/
    public void clearIdg_end_date_2() {
        idg_end_date_2 = null;
    }
/**
Used to clear any existing values for idg_rule.
*/
    public void clearIdg_rule() {
        idg_rule = null;
    }
/**
Used to clear any existing values for idg_amt.
*/
    public void clearIdg_amt() {
        idg_amt = null;
    }
/**
Used to clear any existing values for idg_oper_user.
*/
    public void clearIdg_oper_user() {
        idg_oper_user = null;
    }
/**
Used to clear any existing values for idg_oper_date.
*/
    public void clearIdg_oper_date() {
        idg_oper_date = (long)0;
    }
/**
Used to clear any existing values for idg_oper_time.
*/
    public void clearIdg_oper_time() {
        idg_oper_time = (long)0;
    }
/**
Used to clear any existing values for idg_prog.
*/
    public void clearIdg_prog() {
        idg_prog = null;
    }
/**
Used to clear any existing values for idg_cancel_mark.
*/
    public void clearIdg_cancel_mark() {
        idg_cancel_mark = null;
    }
/**
Used to clear any existing values for filler0.
*/
    public void clearFiller0() {
        filler0 = null;
    }
/** Used to clear the values of all instance variables in this class.
*/
  public void clear_All() {
      idg_broker_id = null;
      idg_ib_no = null;
      idg_introduce_id = null;
      idg_investor_acno = null;
      idg_commodity_id = null;
      idg_in_kind = null;
      idg_begin_date = "0";
      idg_seqno = "0";
      idg_broker_id_1 = null;
      idg_ib_no_1 = null;
      idg_investor_acno_1 = null;
      idg_commodity_id_1 = null;
      idg_in_kind_1 = null;
      idg_end_date_1 = "0";
      idg_end_date_2 = "0";
      idg_rule = null;
      idg_amt = null;
      idg_oper_user = null;
      idg_oper_date = (long)0;
      idg_oper_time = (long)0;
      idg_prog = null;
      idg_cancel_mark = null;
      filler0 = null;
  }

/**
Used to obtain the value of idg_broker_id.
@return the value for idg_broker_id.
*/
    public String getIdg_broker_id() {
      return(idg_broker_id);
    }
/**
Used to obtain the value of idg_ib_no.
@return the value for idg_ib_no.
*/
    public String getIdg_ib_no() {
      return(idg_ib_no);
    }
/**
Used to obtain the value of idg_introduce_id.
@return the value for idg_introduce_id.
*/
    public String getIdg_introduce_id() {
      return(idg_introduce_id);
    }
/**
Used to obtain the value of idg_investor_acno.
@return the value for idg_investor_acno.
*/
    public String getIdg_investor_acno() {
      return(idg_investor_acno);
    }
/**
Used to obtain the value of idg_commodity_id.
@return the value for idg_commodity_id.
*/
    public String getIdg_commodity_id() {
      return(idg_commodity_id);
    }
/**
Used to obtain the value of idg_in_kind.
@return the value for idg_in_kind.
*/
    public String getIdg_in_kind() {
      return(idg_in_kind);
    }
/**
Used to obtain the value of idg_begin_date.
@return the value for idg_begin_date.
*/
    public String getIdg_begin_date() {
      return(idg_begin_date);
    }
/**
Used to obtain the value of idg_seqno.
@return the value for idg_seqno.
*/
    public String getIdg_seqno() {
      return(idg_seqno);
    }
/**
Used to obtain the value of idg_broker_id_1.
@return the value for idg_broker_id_1.
*/
    public String getIdg_broker_id_1() {
      return(idg_broker_id_1);
    }
/**
Used to obtain the value of idg_ib_no_1.
@return the value for idg_ib_no_1.
*/
    public String getIdg_ib_no_1() {
      return(idg_ib_no_1);
    }
/**
Used to obtain the value of idg_investor_acno_1.
@return the value for idg_investor_acno_1.
*/
    public String getIdg_investor_acno_1() {
      return(idg_investor_acno_1);
    }
/**
Used to obtain the value of idg_commodity_id_1.
@return the value for idg_commodity_id_1.
*/
    public String getIdg_commodity_id_1() {
      return(idg_commodity_id_1);
    }
/**
Used to obtain the value of idg_in_kind_1.
@return the value for idg_in_kind_1.
*/
    public String getIdg_in_kind_1() {
      return(idg_in_kind_1);
    }
/**
Used to obtain the value of idg_end_date_1.
@return the value for idg_end_date_1.
*/
    public String getIdg_end_date_1() {
      return(idg_end_date_1);
    }
/**
Used to obtain the value of idg_end_date_2.
@return the value for idg_end_date_2.
*/
    public String getIdg_end_date_2() {
      return(idg_end_date_2);
    }
/**
Used to obtain the value of idg_rule.
@return the value for idg_rule.
*/
    public String getIdg_rule() {
      return(idg_rule);
    }
/**
Used to obtain the value of idg_amt.
@return the value for idg_amt.
*/
    public BigDecimal getIdg_amt() {
      return(idg_amt);
    }
/**
Used to obtain the value of idg_oper_user.
@return the value for idg_oper_user.
*/
    public String getIdg_oper_user() {
      return(idg_oper_user);
    }
/**
Used to obtain the value of idg_oper_date.
@return the value for idg_oper_date.
*/
    public long getIdg_oper_date() {
      return(idg_oper_date);
    }
/**
Used to obtain the value of idg_oper_time.
@return the value for idg_oper_time.
*/
    public long getIdg_oper_time() {
      return(idg_oper_time);
    }
/**
Used to obtain the value of idg_prog.
@return the value for idg_prog.
*/
    public String getIdg_prog() {
      return(idg_prog);
    }
/**
Used to obtain the value of idg_cancel_mark.
@return the value for idg_cancel_mark.
*/
    public String getIdg_cancel_mark() {
      return(idg_cancel_mark);
    }
/**
Used to obtain the value of filler0.
@return the value for filler0.
*/
    public String getFiller0() {
      return(filler0);
    }
/**
Moves the data from the supplied byte array to the instance variables.
@param _buffer a byte array which contains the data to be moved. 
@param _count the number of bytes to be converted.
@exception com.tandem.ext.util.DataConversionException if 
a field fails to convert correctly and allowErrors has been set to false; or
allowErrors is set to true and _count < getLength().
@see #allowErrors
**/
    public void unmarshal(byte [] _buffer, int _count) 
      throws com.tandem.ext.util.DataConversionException {

      int _offset;
      int _fieldSize;
      _errorDetail.clear();
      _numConversionErrors = 0;
      if(!_allowErrors && _count < _bufferLen) {
          _numConversionErrors++;
          throw new DataConversionException(DataConversionException.ConvError.PARAM,
            "The value supplied for the _count variable is less than expected (see getLength())");
      }
      if(_allowErrors && _count < _bufferLen) {
          DataConversionException _bfe = new DataConversionException(DataConversionException.ConvError.PARAM,
          "The value supplied for the _count variable is less than expected (see  getLength())");
          _numConversionErrors++;
          _errorDetail.put(_buffer,_bfe);
      }
      String encodeSetting = new String();

      String defaultEncoding = "ISO8859-1";
      if(defaultEncoding == null){ 
       throw new MissingResourceException("Property not found for character encoding default : ISO8859-1",
          this.getClass().getName(),"ISO8859-1");
      }


      _offset = 0;
      if(_offset >= _count) return;
      _fieldSize = Math.min(7,_count - _offset);
      encodeSetting = System.getProperty("idg_broker_id.encoding",defaultEncoding);
        try {
           idg_broker_id = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_broker_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 7;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
      encodeSetting = System.getProperty("idg_ib_no.encoding",defaultEncoding);
        try {
           idg_ib_no = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_ib_no",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 10;
      if(_offset >= _count) return;
      _fieldSize = Math.min(11,_count - _offset);
      encodeSetting = System.getProperty("idg_introduce_id.encoding",defaultEncoding);
        try {
           idg_introduce_id = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_introduce_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 21;
      if(_offset >= _count) return;
      _fieldSize = Math.min(7,_count - _offset);
      encodeSetting = System.getProperty("idg_investor_acno.encoding",defaultEncoding);
        try {
           idg_investor_acno = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_investor_acno",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 28;
      if(_offset >= _count) return;
      _fieldSize = Math.min(7,_count - _offset);
      encodeSetting = System.getProperty("idg_commodity_id.encoding",defaultEncoding);
        try {
           idg_commodity_id = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_commodity_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 35;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
      encodeSetting = System.getProperty("idg_in_kind.encoding",defaultEncoding);
        try {
           idg_in_kind = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_in_kind",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 36;
      if(_offset + 8 > _count) return;
        try {
           idg_begin_date = DataConversion.NumStrToJavaStr(_buffer,_offset,8, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_begin_date",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 44;
      if(_offset + 4 > _count) return;
        try {
           idg_seqno = DataConversion.NumStrToJavaStr(_buffer,_offset,4, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_seqno",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 48;
      if(_offset >= _count) return;
      _fieldSize = Math.min(7,_count - _offset);
      encodeSetting = System.getProperty("idg_broker_id_1.encoding",defaultEncoding);
        try {
           idg_broker_id_1 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_broker_id_1",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 55;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
      encodeSetting = System.getProperty("idg_ib_no_1.encoding",defaultEncoding);
        try {
           idg_ib_no_1 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_ib_no_1",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 58;
      if(_offset >= _count) return;
      _fieldSize = Math.min(7,_count - _offset);
      encodeSetting = System.getProperty("idg_investor_acno_1.encoding",defaultEncoding);
        try {
           idg_investor_acno_1 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_investor_acno_1",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 65;
      if(_offset >= _count) return;
      _fieldSize = Math.min(7,_count - _offset);
      encodeSetting = System.getProperty("idg_commodity_id_1.encoding",defaultEncoding);
        try {
           idg_commodity_id_1 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_commodity_id_1",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 72;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
      encodeSetting = System.getProperty("idg_in_kind_1.encoding",defaultEncoding);
        try {
           idg_in_kind_1 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_in_kind_1",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 73;
      if(_offset + 8 > _count) return;
        try {
           idg_end_date_1 = DataConversion.NumStrToJavaStr(_buffer,_offset,8, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_end_date_1",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 81;
      if(_offset + 8 > _count) return;
        try {
           idg_end_date_2 = DataConversion.NumStrToJavaStr(_buffer,_offset,8, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_end_date_2",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 89;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
      encodeSetting = System.getProperty("idg_rule.encoding",defaultEncoding);
        try {
           idg_rule = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_rule",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 90;
      if(_offset + 8 > _count) return;
        try {
            idg_amt = DataConversion.BINToJavaBigDecimal(_buffer, _offset, 6, 8, 4);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_amt",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 98;
      if(_offset >= _count) return;
      _fieldSize = Math.min(12,_count - _offset);
      encodeSetting = System.getProperty("idg_oper_user.encoding",defaultEncoding);
        try {
           idg_oper_user = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_oper_user",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 110;
      if(_offset + 4 > _count) return;
        try {
            idg_oper_date = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_oper_date",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 114;
      if(_offset + 4 > _count) return;
        try {
            idg_oper_time = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_oper_time",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 118;
      if(_offset >= _count) return;
      _fieldSize = Math.min(4,_count - _offset);
      encodeSetting = System.getProperty("idg_prog.encoding",defaultEncoding);
        try {
           idg_prog = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_prog",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 122;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
      encodeSetting = System.getProperty("idg_cancel_mark.encoding",defaultEncoding);
        try {
           idg_cancel_mark = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("idg_cancel_mark",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 123;
      if(_offset >= _count) return;
      _fieldSize = Math.min(21,_count - _offset);
      encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        try {
           filler0 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler0",dce);
           } else { 
              throw dce;
           }
        }
    }
/**
Moves and converts the data from the instance variables to a byte array
@return a byte array containing the converted data.
@exception com.tandem.ext.util.DataConversionException if an instance
variable fails to convert successfully.
**/

    public byte[] marshal()
        throws com.tandem.ext.util.DataConversionException, NumberFormatException {

        byte [] _buffer = new byte[_bufferLen];
        marshal(_buffer);
        return _buffer;
    }

/**
Moves and converts the data from the instance variables to a byte array
@param _buffer the byte array to which the data is to be moved.
@return a byte array containing the converted data.
@exception com.tandem.guardian.DataConversionException if the length of the
supplied byte array is not greater than or equal to the minimum required
length or if an instance variable fails to convert successfully.
**/

    public byte[] marshal(byte [] _buffer)
        throws com.tandem.ext.util.DataConversionException {
      if(_buffer.length < _bufferLen) 
         throw new DataConversionException(DataConversionException.ConvError.RANGE,
          "Buffer length is less than minimum required buffer length");

      int _offset;
      String encodeSetting = new String();

      String defaultEncoding = "ISO8859-1";
      if(defaultEncoding == null){ 
       throw new MissingResourceException("Property not found for character encoding default : ISO8859-1",
          this.getClass().getName(),"ISO8859-1");
      }


      _offset = 0;
        if(idg_broker_id != null) {
        encodeSetting = System.getProperty("idg_broker_id.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_broker_id,_offset,7, encodeSetting);
        }

      _offset = 7;
        if(idg_ib_no != null) {
        encodeSetting = System.getProperty("idg_ib_no.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_ib_no,_offset,3, encodeSetting);
        }

      _offset = 10;
        if(idg_introduce_id != null) {
        encodeSetting = System.getProperty("idg_introduce_id.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_introduce_id,_offset,11, encodeSetting);
        }

      _offset = 21;
        if(idg_investor_acno != null) {
        encodeSetting = System.getProperty("idg_investor_acno.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_investor_acno,_offset,7, encodeSetting);
        }

      _offset = 28;
        if(idg_commodity_id != null) {
        encodeSetting = System.getProperty("idg_commodity_id.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_commodity_id,_offset,7, encodeSetting);
        }

      _offset = 35;
        if(idg_in_kind != null) {
        encodeSetting = System.getProperty("idg_in_kind.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_in_kind,_offset,1, encodeSetting);
        }

      _offset = 36;
        if(idg_begin_date != null) 
          DataConversion.JavaStrToNumStr(_buffer,idg_begin_date, _offset, 8, 0, 16);

      _offset = 44;
        if(idg_seqno != null) 
          DataConversion.JavaStrToNumStr(_buffer,idg_seqno, _offset, 4, 0, 16);

      _offset = 48;
        if(idg_broker_id_1 != null) {
        encodeSetting = System.getProperty("idg_broker_id_1.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_broker_id_1,_offset,7, encodeSetting);
        }

      _offset = 55;
        if(idg_ib_no_1 != null) {
        encodeSetting = System.getProperty("idg_ib_no_1.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_ib_no_1,_offset,3, encodeSetting);
        }

      _offset = 58;
        if(idg_investor_acno_1 != null) {
        encodeSetting = System.getProperty("idg_investor_acno_1.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_investor_acno_1,_offset,7, encodeSetting);
        }

      _offset = 65;
        if(idg_commodity_id_1 != null) {
        encodeSetting = System.getProperty("idg_commodity_id_1.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_commodity_id_1,_offset,7, encodeSetting);
        }

      _offset = 72;
        if(idg_in_kind_1 != null) {
        encodeSetting = System.getProperty("idg_in_kind_1.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_in_kind_1,_offset,1, encodeSetting);
        }

      _offset = 73;
        if(idg_end_date_1 != null) 
          DataConversion.JavaStrToNumStr(_buffer,idg_end_date_1, _offset, 8, 0, 16);

      _offset = 81;
        if(idg_end_date_2 != null) 
          DataConversion.JavaStrToNumStr(_buffer,idg_end_date_2, _offset, 8, 0, 16);

      _offset = 89;
        if(idg_rule != null) {
        encodeSetting = System.getProperty("idg_rule.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_rule,_offset,1, encodeSetting);
        }

      _offset = 90;
        if((idg_amt != null) && (idg_amt.compareTo(BigDecimal.ZERO) != 0)) 
        DataConversion.BigDecimalToBIN(_buffer, idg_amt, _offset, 6, 8, 4);

      _offset = 98;
        if(idg_oper_user != null) {
        encodeSetting = System.getProperty("idg_oper_user.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_oper_user,_offset,12, encodeSetting);
        }

      _offset = 110;
        DataConversion.JavaLongToUNBIN32(_buffer, idg_oper_date, _offset);

      _offset = 114;
        DataConversion.JavaLongToUNBIN32(_buffer, idg_oper_time, _offset);

      _offset = 118;
        if(idg_prog != null) {
        encodeSetting = System.getProperty("idg_prog.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_prog,_offset,4, encodeSetting);
        }

      _offset = 122;
        if(idg_cancel_mark != null) {
        encodeSetting = System.getProperty("idg_cancel_mark.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,idg_cancel_mark,_offset,1, encodeSetting);
        }

      _offset = 123;
        if(filler0 != null) {
        encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,filler0,_offset,21, encodeSetting);
        }
      return _buffer;
    }
  }
