/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcQryBrokerTradingAlgosField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryBrokerTradingAlgosField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBrokerTradingAlgosField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcQryBrokerTradingAlgosField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerTradingAlgosField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerTradingAlgosField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerTradingAlgosField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerTradingAlgosField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerTradingAlgosField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerTradingAlgosField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryBrokerTradingAlgosField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcQryBrokerTradingAlgosField(), true);
  }

}
