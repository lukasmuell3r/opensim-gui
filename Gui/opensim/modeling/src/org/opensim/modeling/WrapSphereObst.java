/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapSphereObst extends WrapObject {
  private transient long swigCPtr;

  public WrapSphereObst(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.WrapSphereObst_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapSphereObst obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_WrapSphereObst(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapSphereObst safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.WrapSphereObst_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapSphereObst(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.WrapSphereObst_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.WrapSphereObst_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.WrapSphereObst_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapSphereObst(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.WrapSphereObst_getConcreteClassName(swigCPtr, this);
  }

  public WrapSphereObst() {
    this(opensimModelJNI.new_WrapSphereObst__SWIG_0(), true);
  }

  public WrapSphereObst(WrapSphereObst aWrapSphereObst) {
    this(opensimModelJNI.new_WrapSphereObst__SWIG_1(WrapSphereObst.getCPtr(aWrapSphereObst), aWrapSphereObst), true);
  }

  public void copyData(WrapSphereObst aWrapSphereObst) {
    opensimModelJNI.WrapSphereObst_copyData(swigCPtr, this, WrapSphereObst.getCPtr(aWrapSphereObst), aWrapSphereObst);
  }

  public double getRadius() {
    return opensimModelJNI.WrapSphereObst_getRadius(swigCPtr, this);
  }

  public void setRadius(double aRadius) {
    opensimModelJNI.WrapSphereObst_setRadius(swigCPtr, this, aRadius);
  }

  public double getLength() {
    return opensimModelJNI.WrapSphereObst_getLength(swigCPtr, this);
  }

  public void setLength(double aLength) {
    opensimModelJNI.WrapSphereObst_setLength(swigCPtr, this, aLength);
  }

  public String getWrapTypeName() {
    return opensimModelJNI.WrapSphereObst_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelJNI.WrapSphereObst_getDimensionsString(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelJNI.WrapSphereObst_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, PhysicalFrame aBody) {
    opensimModelJNI.WrapSphereObst_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, PhysicalFrame.getCPtr(aBody), aBody);
  }

}
