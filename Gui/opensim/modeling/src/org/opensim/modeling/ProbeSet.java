/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ProbeSet extends ModelComponentSetProbes {
  private transient long swigCPtr;

  public ProbeSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ProbeSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ProbeSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ProbeSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ProbeSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ProbeSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ProbeSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ProbeSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ProbeSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ProbeSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ProbeSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ProbeSet_getConcreteClassName(swigCPtr, this);
  }

  public ProbeSet() {
    this(opensimModelJNI.new_ProbeSet__SWIG_0(), true);
  }

  public ProbeSet(ProbeSet aAbsProbeSet) {
    this(opensimModelJNI.new_ProbeSet__SWIG_1(ProbeSet.getCPtr(aAbsProbeSet), aAbsProbeSet), true);
  }

}
