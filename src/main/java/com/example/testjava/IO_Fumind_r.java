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
IO_Fumind_r class was generated for DDL Rec/Def: fumind_r on: 5/9/24 at: 17:56:38.
This is an INPUT/OUTPUT class which can be used to read and write data.*/

  public class IO_Fumind_r implements com.tandem.ext.guardian.GuardianInput, 
            com.tandem.ext.guardian.GuardianOutput {
    protected int _numConversionErrors;
    protected boolean _allowErrors = false;
    protected HashMap _errorDetail;

    protected int _bufferLen = 248;
    public String ind_broker_id;
    public String ind_ib_no;
    public String ind_introduce_id;
    public long ind_date;
    public String ind_name;
    public String ind_english_name;
    public String ind_idno;
    public String ind_phone_no_o;
    public String ind_phone_no_h;
    public String ind_address;
    public String ind_oper_user;
    public long ind_oper_date;
    public long ind_oper_time;
    public String ind_prog;
    public String filler0;

/**
IO_Fumind_r Constructor
*/
   public IO_Fumind_r() {
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
Used to set a value for ind_broker_id.
@param value  the value to be set.
*/
    public void setInd_broker_id(String value) {
      ind_broker_id = value;
    }
/**
Used to set a value for ind_ib_no.
@param value  the value to be set.
*/
    public void setInd_ib_no(String value) {
      ind_ib_no = value;
    }
/**
Used to set a value for ind_introduce_id.
@param value  the value to be set.
*/
    public void setInd_introduce_id(String value) {
      ind_introduce_id = value;
    }
/**
Used to set a value for ind_date.
@param value  the value to be set.
*/
    public void setInd_date(long value) {
      ind_date = value;
    }
/**
Used to set a value for ind_name.
@param value  the value to be set.
*/
    public void setInd_name(String value) {
      ind_name = value;
    }
/**
Used to set a value for ind_english_name.
@param value  the value to be set.
*/
    public void setInd_english_name(String value) {
      ind_english_name = value;
    }
/**
Used to set a value for ind_idno.
@param value  the value to be set.
*/
    public void setInd_idno(String value) {
      ind_idno = value;
    }
/**
Used to set a value for ind_phone_no_o.
@param value  the value to be set.
*/
    public void setInd_phone_no_o(String value) {
      ind_phone_no_o = value;
    }
/**
Used to set a value for ind_phone_no_h.
@param value  the value to be set.
*/
    public void setInd_phone_no_h(String value) {
      ind_phone_no_h = value;
    }
/**
Used to set a value for ind_address.
@param value  the value to be set.
*/
    public void setInd_address(String value) {
      ind_address = value;
    }
/**
Used to set a value for ind_oper_user.
@param value  the value to be set.
*/
    public void setInd_oper_user(String value) {
      ind_oper_user = value;
    }
/**
Used to set a value for ind_oper_date.
@param value  the value to be set.
*/
    public void setInd_oper_date(long value) {
      ind_oper_date = value;
    }
/**
Used to set a value for ind_oper_time.
@param value  the value to be set.
*/
    public void setInd_oper_time(long value) {
      ind_oper_time = value;
    }
/**
Used to set a value for ind_prog.
@param value  the value to be set.
*/
    public void setInd_prog(String value) {
      ind_prog = value;
    }
/**
Used to set a value for filler0.
@param value  the value to be set.
*/
    public void setFiller0(String value) {
      filler0 = value;
    }

/**
Used to clear any existing values for ind_broker_id.
*/
    public void clearInd_broker_id() {
        ind_broker_id = null;
    }
/**
Used to clear any existing values for ind_ib_no.
*/
    public void clearInd_ib_no() {
        ind_ib_no = null;
    }
/**
Used to clear any existing values for ind_introduce_id.
*/
    public void clearInd_introduce_id() {
        ind_introduce_id = null;
    }
/**
Used to clear any existing values for ind_date.
*/
    public void clearInd_date() {
        ind_date = (long)0;
    }
/**
Used to clear any existing values for ind_name.
*/
    public void clearInd_name() {
        ind_name = null;
    }
/**
Used to clear any existing values for ind_english_name.
*/
    public void clearInd_english_name() {
        ind_english_name = null;
    }
/**
Used to clear any existing values for ind_idno.
*/
    public void clearInd_idno() {
        ind_idno = null;
    }
/**
Used to clear any existing values for ind_phone_no_o.
*/
    public void clearInd_phone_no_o() {
        ind_phone_no_o = null;
    }
/**
Used to clear any existing values for ind_phone_no_h.
*/
    public void clearInd_phone_no_h() {
        ind_phone_no_h = null;
    }
/**
Used to clear any existing values for ind_address.
*/
    public void clearInd_address() {
        ind_address = null;
    }
/**
Used to clear any existing values for ind_oper_user.
*/
    public void clearInd_oper_user() {
        ind_oper_user = null;
    }
/**
Used to clear any existing values for ind_oper_date.
*/
    public void clearInd_oper_date() {
        ind_oper_date = (long)0;
    }
/**
Used to clear any existing values for ind_oper_time.
*/
    public void clearInd_oper_time() {
        ind_oper_time = (long)0;
    }
/**
Used to clear any existing values for ind_prog.
*/
    public void clearInd_prog() {
        ind_prog = null;
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
      ind_broker_id = null;
      ind_ib_no = null;
      ind_introduce_id = null;
      ind_date = (long)0;
      ind_name = null;
      ind_english_name = null;
      ind_idno = null;
      ind_phone_no_o = null;
      ind_phone_no_h = null;
      ind_address = null;
      ind_oper_user = null;
      ind_oper_date = (long)0;
      ind_oper_time = (long)0;
      ind_prog = null;
      filler0 = null;
  }

/**
Used to obtain the value of ind_broker_id.
@return the value for ind_broker_id.
*/
    public String getInd_broker_id() {
      return(ind_broker_id);
    }
/**
Used to obtain the value of ind_ib_no.
@return the value for ind_ib_no.
*/
    public String getInd_ib_no() {
      return(ind_ib_no);
    }
/**
Used to obtain the value of ind_introduce_id.
@return the value for ind_introduce_id.
*/
    public String getInd_introduce_id() {
      return(ind_introduce_id);
    }
/**
Used to obtain the value of ind_date.
@return the value for ind_date.
*/
    public long getInd_date() {
      return(ind_date);
    }
/**
Used to obtain the value of ind_name.
@return the value for ind_name.
*/
    public String getInd_name() {
      return(ind_name);
    }
/**
Used to obtain the value of ind_english_name.
@return the value for ind_english_name.
*/
    public String getInd_english_name() {
      return(ind_english_name);
    }
/**
Used to obtain the value of ind_idno.
@return the value for ind_idno.
*/
    public String getInd_idno() {
      return(ind_idno);
    }
/**
Used to obtain the value of ind_phone_no_o.
@return the value for ind_phone_no_o.
*/
    public String getInd_phone_no_o() {
      return(ind_phone_no_o);
    }
/**
Used to obtain the value of ind_phone_no_h.
@return the value for ind_phone_no_h.
*/
    public String getInd_phone_no_h() {
      return(ind_phone_no_h);
    }
/**
Used to obtain the value of ind_address.
@return the value for ind_address.
*/
    public String getInd_address() {
      return(ind_address);
    }
/**
Used to obtain the value of ind_oper_user.
@return the value for ind_oper_user.
*/
    public String getInd_oper_user() {
      return(ind_oper_user);
    }
/**
Used to obtain the value of ind_oper_date.
@return the value for ind_oper_date.
*/
    public long getInd_oper_date() {
      return(ind_oper_date);
    }
/**
Used to obtain the value of ind_oper_time.
@return the value for ind_oper_time.
*/
    public long getInd_oper_time() {
      return(ind_oper_time);
    }
/**
Used to obtain the value of ind_prog.
@return the value for ind_prog.
*/
    public String getInd_prog() {
      return(ind_prog);
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
      encodeSetting = System.getProperty("ind_broker_id.encoding",defaultEncoding);
        try {
           ind_broker_id = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_broker_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 7;
      if(_offset >= _count) return;
      _fieldSize = Math.min(3,_count - _offset);
      encodeSetting = System.getProperty("ind_ib_no.encoding",defaultEncoding);
        try {
           ind_ib_no = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_ib_no",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 10;
      if(_offset >= _count) return;
      _fieldSize = Math.min(11,_count - _offset);
      encodeSetting = System.getProperty("ind_introduce_id.encoding",defaultEncoding);
        try {
           ind_introduce_id = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_introduce_id",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 22;
      if(_offset + 4 > _count) return;
        try {
            ind_date = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_date",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 26;
      if(_offset >= _count) return;
      _fieldSize = Math.min(20,_count - _offset);
      encodeSetting = System.getProperty("ind_name.encoding",defaultEncoding);
        try {
           ind_name = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_name",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 46;
      if(_offset >= _count) return;
      _fieldSize = Math.min(50,_count - _offset);
      encodeSetting = System.getProperty("ind_english_name.encoding",defaultEncoding);
        try {
           ind_english_name = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_english_name",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 96;
      if(_offset >= _count) return;
      _fieldSize = Math.min(11,_count - _offset);
      encodeSetting = System.getProperty("ind_idno.encoding",defaultEncoding);
        try {
           ind_idno = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_idno",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 107;
      if(_offset >= _count) return;
      _fieldSize = Math.min(20,_count - _offset);
      encodeSetting = System.getProperty("ind_phone_no_o.encoding",defaultEncoding);
        try {
           ind_phone_no_o = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_phone_no_o",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 127;
      if(_offset >= _count) return;
      _fieldSize = Math.min(20,_count - _offset);
      encodeSetting = System.getProperty("ind_phone_no_h.encoding",defaultEncoding);
        try {
           ind_phone_no_h = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_phone_no_h",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 147;
      if(_offset >= _count) return;
      _fieldSize = Math.min(50,_count - _offset);
      encodeSetting = System.getProperty("ind_address.encoding",defaultEncoding);
        try {
           ind_address = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_address",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 197;
      if(_offset >= _count) return;
      _fieldSize = Math.min(12,_count - _offset);
      encodeSetting = System.getProperty("ind_oper_user.encoding",defaultEncoding);
        try {
           ind_oper_user = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_oper_user",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 210;
      if(_offset + 4 > _count) return;
        try {
            ind_oper_date = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_oper_date",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 214;
      if(_offset + 4 > _count) return;
        try {
            ind_oper_time = DataConversion.UNBIN32ToJavaLong(_buffer, _offset);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_oper_time",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 218;
      if(_offset >= _count) return;
      _fieldSize = Math.min(4,_count - _offset);
      encodeSetting = System.getProperty("ind_prog.encoding",defaultEncoding);
        try {
           ind_prog = DataConversion.CobolStrToJavaStr(_buffer,_offset,_fieldSize,encodeSetting);
        }catch (DataConversionException dce) {
           _numConversionErrors++;
           if(_allowErrors) {
              _errorDetail.put("ind_prog",dce);
           } else { 
              throw dce;
           }
        }

      _offset = 222;
      if(_offset >= _count) return;
      _fieldSize = Math.min(26,_count - _offset);
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
        if(ind_broker_id != null) {
        encodeSetting = System.getProperty("ind_broker_id.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_broker_id,_offset,7, encodeSetting);
        }

      _offset = 7;
        if(ind_ib_no != null) {
        encodeSetting = System.getProperty("ind_ib_no.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_ib_no,_offset,3, encodeSetting);
        }

      _offset = 10;
        if(ind_introduce_id != null) {
        encodeSetting = System.getProperty("ind_introduce_id.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_introduce_id,_offset,11, encodeSetting);
        }

      _offset = 22;
        DataConversion.JavaLongToUNBIN32(_buffer, ind_date, _offset);

      _offset = 26;
        if(ind_name != null) {
        encodeSetting = System.getProperty("ind_name.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_name,_offset,20, encodeSetting);
        }

      _offset = 46;
        if(ind_english_name != null) {
        encodeSetting = System.getProperty("ind_english_name.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_english_name,_offset,50, encodeSetting);
        }

      _offset = 96;
        if(ind_idno != null) {
        encodeSetting = System.getProperty("ind_idno.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_idno,_offset,11, encodeSetting);
        }

      _offset = 107;
        if(ind_phone_no_o != null) {
        encodeSetting = System.getProperty("ind_phone_no_o.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_phone_no_o,_offset,20, encodeSetting);
        }

      _offset = 127;
        if(ind_phone_no_h != null) {
        encodeSetting = System.getProperty("ind_phone_no_h.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_phone_no_h,_offset,20, encodeSetting);
        }

      _offset = 147;
        if(ind_address != null) {
        encodeSetting = System.getProperty("ind_address.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_address,_offset,50, encodeSetting);
        }

      _offset = 197;
        if(ind_oper_user != null) {
        encodeSetting = System.getProperty("ind_oper_user.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_oper_user,_offset,12, encodeSetting);
        }

      _offset = 210;
        DataConversion.JavaLongToUNBIN32(_buffer, ind_oper_date, _offset);

      _offset = 214;
        DataConversion.JavaLongToUNBIN32(_buffer, ind_oper_time, _offset);

      _offset = 218;
        if(ind_prog != null) {
        encodeSetting = System.getProperty("ind_prog.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,ind_prog,_offset,4, encodeSetting);
        }

      _offset = 222;
        if(filler0 != null) {
        encodeSetting = System.getProperty("filler.encoding",defaultEncoding);
        DataConversion.JavaStrToCobolStr(_buffer,filler0,_offset,26, encodeSetting);
        }
      return _buffer;
    }
  }
