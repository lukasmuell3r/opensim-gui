/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Joint extends ModelComponent {
  private transient long swigCPtr;

  public Joint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Joint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Joint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Joint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Joint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Joint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Joint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Joint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Joint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Joint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_CoordinateSet(Joint source) {
    opensimModelJNI.Joint_copyProperty_CoordinateSet(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public CoordinateSet get_CoordinateSet(int i) {
    return new CoordinateSet(opensimModelJNI.Joint_get_CoordinateSet__SWIG_0(swigCPtr, this, i), false);
  }

  public CoordinateSet upd_CoordinateSet(int i) {
    return new CoordinateSet(opensimModelJNI.Joint_upd_CoordinateSet__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_CoordinateSet(int i, CoordinateSet value) {
    opensimModelJNI.Joint_set_CoordinateSet__SWIG_0(swigCPtr, this, i, CoordinateSet.getCPtr(value), value);
  }

  public int append_CoordinateSet(CoordinateSet value) {
    return opensimModelJNI.Joint_append_CoordinateSet(swigCPtr, this, CoordinateSet.getCPtr(value), value);
  }

  public void constructProperty_CoordinateSet(CoordinateSet initValue) {
    opensimModelJNI.Joint_constructProperty_CoordinateSet(swigCPtr, this, CoordinateSet.getCPtr(initValue), initValue);
  }

  public CoordinateSet get_CoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Joint_get_CoordinateSet__SWIG_1(swigCPtr, this), false);
  }

  public CoordinateSet upd_CoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Joint_upd_CoordinateSet__SWIG_1(swigCPtr, this), false);
  }

  public void set_CoordinateSet(CoordinateSet value) {
    opensimModelJNI.Joint_set_CoordinateSet__SWIG_1(swigCPtr, this, CoordinateSet.getCPtr(value), value);
  }

  public void copyProperty_reverse(Joint source) {
    opensimModelJNI.Joint_copyProperty_reverse(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public boolean get_reverse(int i) {
    return opensimModelJNI.Joint_get_reverse__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_reverse(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Joint_upd_reverse__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_reverse(int i, boolean value) {
    opensimModelJNI.Joint_set_reverse__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_reverse(boolean value) {
    return opensimModelJNI.Joint_append_reverse(swigCPtr, this, value);
  }

  public void constructProperty_reverse(boolean initValue) {
    opensimModelJNI.Joint_constructProperty_reverse(swigCPtr, this, initValue);
  }

  public boolean get_reverse() {
    return opensimModelJNI.Joint_get_reverse__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_reverse() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Joint_upd_reverse__SWIG_1(swigCPtr, this), false);
  }

  public void set_reverse(boolean value) {
    opensimModelJNI.Joint_set_reverse__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_frames(Joint source) {
    opensimModelJNI.Joint_copyProperty_frames(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public PhysicalFrame get_frames(int i) {
    return new PhysicalFrame(opensimModelJNI.Joint_get_frames(swigCPtr, this, i), false);
  }

  public PhysicalFrame upd_frames(int i) {
    return new PhysicalFrame(opensimModelJNI.Joint_upd_frames(swigCPtr, this, i), false);
  }

  public void set_frames(int i, PhysicalFrame value) {
    opensimModelJNI.Joint_set_frames(swigCPtr, this, i, PhysicalFrame.getCPtr(value), value);
  }

  public int append_frames(PhysicalFrame value) {
    return opensimModelJNI.Joint_append_frames(swigCPtr, this, PhysicalFrame.getCPtr(value), value);
  }

  public void constructProperty_frames() {
    opensimModelJNI.Joint_constructProperty_frames(swigCPtr, this);
  }

  public void setChildFrameName(String name) {
    opensimModelJNI.Joint_setChildFrameName(swigCPtr, this, name);
  }

  public String getChildFrameName() {
    return opensimModelJNI.Joint_getChildFrameName(swigCPtr, this);
  }

  public PhysicalFrame getChildFrame() {
    return new PhysicalFrame(opensimModelJNI.Joint_getChildFrame(swigCPtr, this), false);
  }

  public void setParentFrameName(String aName) {
    opensimModelJNI.Joint_setParentFrameName(swigCPtr, this, aName);
  }

  public String getParentFrameName() {
    return opensimModelJNI.Joint_getParentFrameName(swigCPtr, this);
  }

  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimModelJNI.Joint_getParentFrame(swigCPtr, this), false);
  }

  public CoordinateSet getCoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Joint_getCoordinateSet(swigCPtr, this), false);
  }

  public boolean getReverse() {
    return opensimModelJNI.Joint_getReverse(swigCPtr, this);
  }

  public int numCoordinates() {
    return opensimModelJNI.Joint_numCoordinates(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimModelJNI.Joint_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public SpatialVec calcEquivalentSpatialForce(State s, Vector mobilityForces) {
    return new SpatialVec(opensimModelJNI.Joint_calcEquivalentSpatialForce(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(mobilityForces), mobilityForces), true);
  }

  public double calcPower(State s) {
    return opensimModelJNI.Joint_calcPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelJNI.Joint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

}
