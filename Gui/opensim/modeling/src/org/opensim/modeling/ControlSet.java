/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ControlSet extends SetControls {
  private transient long swigCPtr;

  public ControlSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ControlSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ControlSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ControlSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ControlSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ControlSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ControlSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ControlSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ControlSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ControlSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ControlSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ControlSet_getConcreteClassName(swigCPtr, this);
  }

  public ControlSet() {
    this(opensimModelJNI.new_ControlSet__SWIG_0(), true);
  }

  public ControlSet(String aFileName) {
    this(opensimModelJNI.new_ControlSet__SWIG_1(aFileName), true);
  }

  public ControlSet(ControlSet aSet) {
    this(opensimModelJNI.new_ControlSet__SWIG_2(ControlSet.getCPtr(aSet), aSet), true);
  }

  public ControlSet(Storage aStorage, int nControlsToConvert, int aStartIndex) {
    this(opensimModelJNI.new_ControlSet__SWIG_3(Storage.getCPtr(aStorage), aStorage, nControlsToConvert, aStartIndex), true);
  }

  public ControlSet(Storage aStorage, int nControlsToConvert) {
    this(opensimModelJNI.new_ControlSet__SWIG_4(Storage.getCPtr(aStorage), aStorage, nControlsToConvert), true);
  }

  public ControlSet(Storage aStorage) {
    this(opensimModelJNI.new_ControlSet__SWIG_5(Storage.getCPtr(aStorage), aStorage), true);
  }

  public int getSize(boolean aForModelControls) {
    return opensimModelJNI.ControlSet_getSize__SWIG_0(swigCPtr, this, aForModelControls);
  }

  public int getSize() {
    return opensimModelJNI.ControlSet_getSize__SWIG_1(swigCPtr, this);
  }

  public void getControlList(String aType, ArrayInt rList, boolean aForModelControls) {
    opensimModelJNI.ControlSet_getControlList__SWIG_0(swigCPtr, this, aType, ArrayInt.getCPtr(rList), rList, aForModelControls);
  }

  public void getControlList(String aType, ArrayInt rList) {
    opensimModelJNI.ControlSet_getControlList__SWIG_1(swigCPtr, this, aType, ArrayInt.getCPtr(rList), rList);
  }

  public void getControlValues(double aT, double[] rX, boolean aForModelControls) {
    opensimModelJNI.ControlSet_getControlValues__SWIG_0(swigCPtr, this, aT, rX, aForModelControls);
  }

  public void getControlValues(double aT, double[] rX) {
    opensimModelJNI.ControlSet_getControlValues__SWIG_1(swigCPtr, this, aT, rX);
  }

  public void getControlValues(double aT, ArrayDouble rX, boolean aForModelControls) {
    opensimModelJNI.ControlSet_getControlValues__SWIG_2(swigCPtr, this, aT, ArrayDouble.getCPtr(rX), rX, aForModelControls);
  }

  public void getControlValues(double aT, ArrayDouble rX) {
    opensimModelJNI.ControlSet_getControlValues__SWIG_3(swigCPtr, this, aT, ArrayDouble.getCPtr(rX), rX);
  }

  public void setControlValues(double aT, double[] aX, boolean aForModelControls) {
    opensimModelJNI.ControlSet_setControlValues__SWIG_0(swigCPtr, this, aT, aX, aForModelControls);
  }

  public void setControlValues(double aT, double[] aX) {
    opensimModelJNI.ControlSet_setControlValues__SWIG_1(swigCPtr, this, aT, aX);
  }

  public void setControlValues(double aT, ArrayDouble aX, boolean aForModelControls) {
    opensimModelJNI.ControlSet_setControlValues__SWIG_2(swigCPtr, this, aT, ArrayDouble.getCPtr(aX), aX, aForModelControls);
  }

  public void setControlValues(double aT, ArrayDouble aX) {
    opensimModelJNI.ControlSet_setControlValues__SWIG_3(swigCPtr, this, aT, ArrayDouble.getCPtr(aX), aX);
  }

  public int getNumParameters(boolean aForModelControls) {
    return opensimModelJNI.ControlSet_getNumParameters__SWIG_0(swigCPtr, this, aForModelControls);
  }

  public int getNumParameters() {
    return opensimModelJNI.ControlSet_getNumParameters__SWIG_1(swigCPtr, this);
  }

  public void getParameterList(ArrayInt rList, boolean aForModelControls) {
    opensimModelJNI.ControlSet_getParameterList__SWIG_0(swigCPtr, this, ArrayInt.getCPtr(rList), rList, aForModelControls);
  }

  public void getParameterList(ArrayInt rList) {
    opensimModelJNI.ControlSet_getParameterList__SWIG_1(swigCPtr, this, ArrayInt.getCPtr(rList), rList);
  }

  public void getParameterList(double aT, ArrayInt rList, boolean aForModelControls) {
    opensimModelJNI.ControlSet_getParameterList__SWIG_2(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList, aForModelControls);
  }

  public void getParameterList(double aT, ArrayInt rList) {
    opensimModelJNI.ControlSet_getParameterList__SWIG_3(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList);
  }

  public void getParameterList(double aTLower, double aTUpper, ArrayInt rList, boolean aForModelControls) {
    opensimModelJNI.ControlSet_getParameterList__SWIG_4(swigCPtr, this, aTLower, aTUpper, ArrayInt.getCPtr(rList), rList, aForModelControls);
  }

  public void getParameterList(double aTLower, double aTUpper, ArrayInt rList) {
    opensimModelJNI.ControlSet_getParameterList__SWIG_5(swigCPtr, this, aTLower, aTUpper, ArrayInt.getCPtr(rList), rList);
  }

  public void getParameterMins(ArrayDouble rMins, ArrayInt aList) {
    opensimModelJNI.ControlSet_getParameterMins__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(rMins), rMins, ArrayInt.getCPtr(aList), aList);
  }

  public void getParameterMins(ArrayDouble rMins) {
    opensimModelJNI.ControlSet_getParameterMins__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rMins), rMins);
  }

  public void getParameterMaxs(ArrayDouble rMaxs, ArrayInt aList) {
    opensimModelJNI.ControlSet_getParameterMaxs__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(rMaxs), rMaxs, ArrayInt.getCPtr(aList), aList);
  }

  public void getParameterMaxs(ArrayDouble rMaxs) {
    opensimModelJNI.ControlSet_getParameterMaxs__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rMaxs), rMaxs);
  }

  public void getParameterValues(double[] rP, ArrayInt aList) {
    opensimModelJNI.ControlSet_getParameterValues__SWIG_0(swigCPtr, this, rP, ArrayInt.getCPtr(aList), aList);
  }

  public void getParameterValues(double[] rP) {
    opensimModelJNI.ControlSet_getParameterValues__SWIG_1(swigCPtr, this, rP);
  }

  public void getParameterValues(ArrayDouble rP, ArrayInt aList) {
    opensimModelJNI.ControlSet_getParameterValues__SWIG_2(swigCPtr, this, ArrayDouble.getCPtr(rP), rP, ArrayInt.getCPtr(aList), aList);
  }

  public void getParameterValues(ArrayDouble rP) {
    opensimModelJNI.ControlSet_getParameterValues__SWIG_3(swigCPtr, this, ArrayDouble.getCPtr(rP), rP);
  }

  public void setParameterValues(double[] aP, ArrayInt aList) {
    opensimModelJNI.ControlSet_setParameterValues__SWIG_0(swigCPtr, this, aP, ArrayInt.getCPtr(aList), aList);
  }

  public void setParameterValues(double[] aP) {
    opensimModelJNI.ControlSet_setParameterValues__SWIG_1(swigCPtr, this, aP);
  }

  public void setParameterValues(ArrayDouble aP, ArrayInt aList) {
    opensimModelJNI.ControlSet_setParameterValues__SWIG_2(swigCPtr, this, ArrayDouble.getCPtr(aP), aP, ArrayInt.getCPtr(aList), aList);
  }

  public void setParameterValues(ArrayDouble aP) {
    opensimModelJNI.ControlSet_setParameterValues__SWIG_3(swigCPtr, this, ArrayDouble.getCPtr(aP), aP);
  }

  public void simplify(SWIGTYPE_p_PropertySet aProperties) {
    opensimModelJNI.ControlSet_simplify(swigCPtr, this, SWIGTYPE_p_PropertySet.getCPtr(aProperties));
  }

  public void filter(double aT) {
    opensimModelJNI.ControlSet_filter(swigCPtr, this, aT);
  }

  public Storage constructStorage(int aN, double aT1, double aT2, boolean aForModelControls) {
    long cPtr = opensimModelJNI.ControlSet_constructStorage(swigCPtr, this, aN, aT1, aT2, aForModelControls);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public int mapParameterToControl(int aIndex) {
    return opensimModelJNI.ControlSet_mapParameterToControl(swigCPtr, this, aIndex);
  }

  public int mapParameterToParameter(int aIndex) {
    return opensimModelJNI.ControlSet_mapParameterToParameter(swigCPtr, this, aIndex);
  }

  public void generateParameterMaps() {
    opensimModelJNI.ControlSet_generateParameterMaps(swigCPtr, this);
  }

}
