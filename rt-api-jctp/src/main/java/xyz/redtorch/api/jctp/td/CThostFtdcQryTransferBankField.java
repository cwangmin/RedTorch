/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcQryTransferBankField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryTransferBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTransferBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcQryTransferBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBankID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryTransferBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryTransferBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryTransferBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryTransferBankField_BankBrchID_get(swigCPtr, this);
  }

  public CThostFtdcQryTransferBankField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcQryTransferBankField(), true);
  }

}
