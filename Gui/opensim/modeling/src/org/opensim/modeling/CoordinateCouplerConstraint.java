/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CoordinateCouplerConstraint extends Constraint {
  private transient long swigCPtr;

  public CoordinateCouplerConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.CoordinateCouplerConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateCouplerConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_CoordinateCouplerConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CoordinateCouplerConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.CoordinateCouplerConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CoordinateCouplerConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.CoordinateCouplerConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.CoordinateCouplerConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.CoordinateCouplerConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CoordinateCouplerConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.CoordinateCouplerConstraint_getConcreteClassName(swigCPtr, this);
  }

  public CoordinateCouplerConstraint() {
    this(opensimModelJNI.new_CoordinateCouplerConstraint(), true);
  }

  public void setIndependentCoordinateNames(ArrayStr aCoordNames) {
    opensimModelJNI.CoordinateCouplerConstraint_setIndependentCoordinateNames(swigCPtr, this, ArrayStr.getCPtr(aCoordNames), aCoordNames);
  }

  public ArrayStr getIndependentCoordinateNames() {
    return new ArrayStr(opensimModelJNI.CoordinateCouplerConstraint_getIndependentCoordinateNames(swigCPtr, this), true);
  }

  public void setDependentCoordinateName(String aCoordName) {
    opensimModelJNI.CoordinateCouplerConstraint_setDependentCoordinateName(swigCPtr, this, aCoordName);
  }

  public String getDependentCoordinateName() {
    return opensimModelJNI.CoordinateCouplerConstraint_getDependentCoordinateName(swigCPtr, this);
  }

  public Function getFunction() {
    return new Function(opensimModelJNI.CoordinateCouplerConstraint_getFunction(swigCPtr, this), false);
  }

  public void setFunction(Function aFunction) {
    opensimModelJNI.CoordinateCouplerConstraint_setFunction__SWIG_0(swigCPtr, this, Function.getCPtr(aFunction), aFunction);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelJNI.CoordinateCouplerConstraint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

}
