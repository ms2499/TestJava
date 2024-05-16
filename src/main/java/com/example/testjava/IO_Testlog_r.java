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
IO_Testlog_r class was generated for DDL Rec/Def: testlog on: 4/30/24 at: 11:43:52.
This is an INPUT/OUTPUT class which can be used to read and write data.*/

  public class IO_Testlog_r implements com.tandem.ext.guardian.GuardianInput, 
            com.tandem.ext.guardian.GuardianOutput {
    protected int _numConversionErrors;
    protected boolean _allowErrors = false;
    protected HashMap _errorDetail;

    protected int _bufferLen = 80;
    public String log_date;
    public String log_time;
    public String filler0;
    public String log_account_equity;
    public String filler1;
    public String log_initial_margin;
    public String filler2;
    public String log_maintain_rate;
    public String filler3;
    public String log_risk_rate;
    public String filler4;
    public long log_total;

/**
IO_Testlog_r Constructor
*/
   public IO_Testlog_r() {
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
Used to set a value for log_date.
@param value  the value to be set.
*/
    public void setLog_date(String value) {
      log_date = value;
    }
/**
Used to set a value for log_time.
@param value  the value to be set.
*/
    public void setLog_time(String value) {
      log_time = value;
    }
/**
Used to set a value for filler0.
@param value  the value to be set.
*/
    public void setFiller0(String value) {
      filler0 = value;
    }
/**
Used to set a value for log_account_equity.
@param value  the value to be set.
*/
    public void setLog_account_equity(String value) {
      log_account_equity = value;
    }
/**
Used to set a value for filler1.
@param value  the value to be set.
*/
    public void setFiller1(String value) {
      filler1 = value;
    }
/**
Used to set a value for log_initial_margin.
@param value  the value to be set.
*/
    public void setLog_initial_margin(String value) {
      log_initial_margin = value;
    }
/**
Used to set a value for filler2.
@param value  the value to be set.
*/
    public void setFiller2(String value) {
      filler2 = value;
    }
/**
Used to set a value for log_maintain_rate.
@param value  the value to be set.
*/
    public void setLog_maintain_rate(String value) {
      log_maintain_rate = value;
    }
/**
Used to set a value for filler3.
@param value  the value to be set.
*/
    public void setFiller3(String value) {
      filler3 = value;
    }
/**
Used to set a value for log_risk_rate.
@param value  the value to be set.
*/
    public void setLog_risk_rate(String value) {
      log_risk_rate = value;
    }
/**
Used to set a value for filler4.
@param value  the value to be set.
*/
    public void setFiller4(String value) {
      filler4 = value;
    }
/**
Used to set a value for log_total.
@param value  the value to be set.
*/
    public void setLog_total(long value) {
      log_total = value;
    }

/**
Used to clear any existing values for log_date.
*/
    public void clearLog_date() {
        log_date = null;
    }
/**
Used to clear any existing values for log_time.
*/
    public void clearLog_time() {
        log_time = null;
    }
/**
Used to clear any existing values for filler0.
*/
    public void clearFiller0() {
        filler0 = null;
    }
/**
Used to clear any existing values for log_account_equity.
*/
    public void clearLog_account_equity() {
        log_account_equity = null;
    }
/**
Used to clear any existing values for filler1.
*/
    public void clearFiller1() {
        filler1 = null;
    }
/**
Used to clear any existing values for log_initial_margin.
*/
    public void clearLog_initial_margin() {
        log_initial_margin = null;
    }
/**
Used to clear any existing values for filler2.
*/
    public void clearFiller2() {
        filler2 = null;
    }
/**
Used to clear any existing values for log_maintain_rate.
*/
    public void clearLog_maintain_rate() {
        log_maintain_rate = null;
    }
/**
Used to clear any existing values for filler3.
*/
    public void clearFiller3() {
        filler3 = null;
    }
/**
Used to clear any existing values for log_risk_rate.
*/
    public void clearLog_risk_rate() {
        log_risk_rate = null;
    }
/**
Used to clear any existing values for filler4.
*/
    public void clearFiller4() {
        filler4 = null;
    }
/**
Used to clear any existing values for log_total.
*/
    public void clearLog_total() {
        log_total = (long)0;
    }
/** Used to clear the values of all instance variables in this class.
*/
  public void clear_All() {
      log_date = "0";
      log_time = "0";
      filler0 = null;
      log_account_equity = null;
      filler1 = null;
      log_initial_margin = null;
      filler2 = null;
      log_maintain_rate = null;
      filler3 = null;
      log_risk_rate = null;
      filler4 = null;
      log_total = (long)0;
  }

/**
Used to obtain the value of log_date.
@return the value for log_date.
*/
    public String getLog_date() {
      return(log_date);
    }
/**
Used to obtain the value of log_time.
@return the value for log_time.
*/
    public String getLog_time() {
      return(log_time);
    }
/**
Used to obtain the value of filler0.
@return the value for filler0.
*/
    public String getFiller0() {
      return(filler0);
    }
/**
Used to obtain the value of log_account_equity.
@return the value for log_account_equity.
*/
    public String getLog_account_equity() {
      return(log_account_equity);
    }
/**
Used to obtain the value of filler1.
@return the value for filler1.
*/
    public String getFiller1() {
      return(filler1);
    }
/**
Used to obtain the value of log_initial_margin.
@return the value for log_initial_margin.
*/
    public String getLog_initial_margin() {
      return(log_initial_margin);
    }
/**
Used to obtain the value of filler2.
@return the value for filler2.
*/
    public String getFiller2() {
      return(filler2);
    }
/**
Used to obtain the value of log_maintain_rate.
@return the value for log_maintain_rate.
*/
    public String getLog_maintain_rate() {
      return(log_maintain_rate);
    }
/**
Used to obtain the value of filler3.
@return the value for filler3.
*/
    public String getFiller3() {
      return(filler3);
    }
/**
Used to obtain the value of log_risk_rate.
@return the value for log_risk_rate.
*/
    public String getLog_risk_rate() {
      return(log_risk_rate);
    }
/**
Used to obtain the value of filler4.
@return the value for filler4.
*/
    public String getFiller4() {
      return(filler4);
    }
/**
Used to obtain the value of log_total.
@return the value for log_total.
*/
    public long getLog_total() {
      return(log_total);
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
      if(_offset + 8 > _count) return;
        try {
           log_date = DataConversion.NumStrToJavaStr(_buffer,_offset,8, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("log_date",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 8;
      if(_offset + 8 > _count) return;
        try {
           log_time = DataConversion.NumStrToJavaStr(_buffer,_offset,8, 0, 16);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("log_time",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 16;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
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

      _offset = 17;
      if(_offset >= _count) return;
      _fieldSize = Math.min(15,_count - _offset);
      encodeSetting = System.getProperty("log_account_equity.encoding",defaultEncoding);
        try {
           log_account_equity = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("log_account_equity",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 32;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
      encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        try {
           filler1 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler1",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 33;
      if(_offset >= _count) return;
      _fieldSize = Math.min(15,_count - _offset);
      encodeSetting = System.getProperty("log_initial_margin.encoding",defaultEncoding);
        try {
           log_initial_margin = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("log_initial_margin",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 48;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
      encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        try {
           filler2 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler2",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 49;
      if(_offset >= _count) return;
      _fieldSize = Math.min(15,_count - _offset);
      encodeSetting = System.getProperty("log_maintain_rate.encoding",defaultEncoding);
        try {
           log_maintain_rate = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("log_maintain_rate",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 64;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
      encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        try {
           filler3 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler3",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 65;
      if(_offset + 9 > _count) return;
        try {
                log_risk_rate = DataConversion.NumStrToJavaStr(_buffer,_offset, 9,(short) 3,(short) 12); 
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("log_risk_rate",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 74;
      if(_offset >= _count) return;
      _fieldSize = Math.min(1,_count - _offset);
      encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        try {
           filler4 = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("filler4",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 76;
      if(_offset + 4 > _count) return;
        try {
            log_total = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("log_total",dce);
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
        if(log_date != null) 
          DataConversion.JavaStrToNumStr(_buffer,log_date, _offset, 8, 0, 16);

      _offset = 8;
        if(log_time != null) 
          DataConversion.JavaStrToNumStr(_buffer,log_time, _offset, 8, 0, 16);

      _offset = 16;
        if(filler0 != null) {
        encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,filler0,_offset,1, encodeSetting);
        }

      _offset = 17;
        if(log_account_equity != null) {
        encodeSetting = System.getProperty("log_account_equity.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,log_account_equity,_offset,15, encodeSetting);
        }

      _offset = 32;
        if(filler1 != null) {
        encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,filler1,_offset,1, encodeSetting);
        }

      _offset = 33;
        if(log_initial_margin != null) {
        encodeSetting = System.getProperty("log_initial_margin.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,log_initial_margin,_offset,15, encodeSetting);
        }

      _offset = 48;
        if(filler2 != null) {
        encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,filler2,_offset,1, encodeSetting);
        }

      _offset = 49;
        if(log_maintain_rate != null) {
        encodeSetting = System.getProperty("log_maintain_rate.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,log_maintain_rate,_offset,15, encodeSetting);
        }

      _offset = 64;
        if(filler3 != null) {
        encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,filler3,_offset,1, encodeSetting);
        }

      _offset = 65;
        if(log_risk_rate != null) 
        DataConversion.JavaStrToNumStr(_buffer, log_risk_rate, _offset,9, 3, 12);

      _offset = 74;
        if(filler4 != null) {
        encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,filler4,_offset,1, encodeSetting);
        }

      _offset = 76;
        DataConversion.JavaLongToUNBIN32(_buffer, log_total, _offset);
      return _buffer;
    }
  }
