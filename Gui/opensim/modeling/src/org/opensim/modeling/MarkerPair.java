/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MarkerPair extends OpenSimObject {
  private transient long swigCPtr;

  public MarkerPair(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MarkerPair_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerPair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MarkerPair(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerPair safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.MarkerPair_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerPair(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.MarkerPair_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.MarkerPair_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MarkerPair_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerPair(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MarkerPair_getConcreteClassName(swigCPtr, this);
  }

  public MarkerPair() {
    this(opensimModelJNI.new_MarkerPair__SWIG_0(), true);
  }

  public MarkerPair(MarkerPair aMarkerPair) {
    this(opensimModelJNI.new_MarkerPair__SWIG_1(MarkerPair.getCPtr(aMarkerPair), aMarkerPair), true);
  }

  public MarkerPair(String aName1, String aName2) {
    this(opensimModelJNI.new_MarkerPair__SWIG_2(aName1, aName2), true);
  }

  public void copyData(MarkerPair aMarkerPair) {
    opensimModelJNI.MarkerPair_copyData(swigCPtr, this, MarkerPair.getCPtr(aMarkerPair), aMarkerPair);
  }

  public void getMarkerNames(SWIGTYPE_p_std__string aName1, SWIGTYPE_p_std__string aName2) {
    opensimModelJNI.MarkerPair_getMarkerNames(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(aName1), SWIGTYPE_p_std__string.getCPtr(aName2));
  }

  public String getMarkerName(int i) {
    return opensimModelJNI.MarkerPair_getMarkerName(swigCPtr, this, i);
  }

  public void setMarkerName(int i, String aName) {
    opensimModelJNI.MarkerPair_setMarkerName(swigCPtr, this, i, aName);
  }

}
