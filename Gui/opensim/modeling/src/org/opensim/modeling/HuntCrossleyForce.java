/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class HuntCrossleyForce extends Force {
  private transient long swigCPtr;

  public HuntCrossleyForce(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.HuntCrossleyForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HuntCrossleyForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_HuntCrossleyForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static HuntCrossleyForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.HuntCrossleyForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new HuntCrossleyForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.HuntCrossleyForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.HuntCrossleyForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.HuntCrossleyForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new HuntCrossleyForce(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.HuntCrossleyForce_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_contact_parameters(HuntCrossleyForce source) {
    opensimModelJNI.HuntCrossleyForce_copyProperty_contact_parameters(swigCPtr, this, HuntCrossleyForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet get_contact_parameters(int i) {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelJNI.HuntCrossleyForce_get_contact_parameters__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet upd_contact_parameters(int i) {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelJNI.HuntCrossleyForce_upd_contact_parameters__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_contact_parameters(int i, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet value) {
    opensimModelJNI.HuntCrossleyForce_set_contact_parameters__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet.getCPtr(value));
  }

  public int append_contact_parameters(SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet value) {
    return opensimModelJNI.HuntCrossleyForce_append_contact_parameters(swigCPtr, this, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet.getCPtr(value));
  }

  public void constructProperty_contact_parameters(SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet initValue) {
    opensimModelJNI.HuntCrossleyForce_constructProperty_contact_parameters(swigCPtr, this, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet.getCPtr(initValue));
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet get_contact_parameters() {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelJNI.HuntCrossleyForce_get_contact_parameters__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet upd_contact_parameters() {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelJNI.HuntCrossleyForce_upd_contact_parameters__SWIG_1(swigCPtr, this), false);
  }

  public void set_contact_parameters(SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet value) {
    opensimModelJNI.HuntCrossleyForce_set_contact_parameters__SWIG_1(swigCPtr, this, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet.getCPtr(value));
  }

  public void copyProperty_transition_velocity(HuntCrossleyForce source) {
    opensimModelJNI.HuntCrossleyForce_copyProperty_transition_velocity(swigCPtr, this, HuntCrossleyForce.getCPtr(source), source);
  }

  public double get_transition_velocity(int i) {
    return opensimModelJNI.HuntCrossleyForce_get_transition_velocity__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_transition_velocity(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.HuntCrossleyForce_upd_transition_velocity__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_transition_velocity(int i, double value) {
    opensimModelJNI.HuntCrossleyForce_set_transition_velocity__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_transition_velocity(double value) {
    return opensimModelJNI.HuntCrossleyForce_append_transition_velocity(swigCPtr, this, value);
  }

  public void constructProperty_transition_velocity(double initValue) {
    opensimModelJNI.HuntCrossleyForce_constructProperty_transition_velocity(swigCPtr, this, initValue);
  }

  public double get_transition_velocity() {
    return opensimModelJNI.HuntCrossleyForce_get_transition_velocity__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_transition_velocity() {
    return new SWIGTYPE_p_double(opensimModelJNI.HuntCrossleyForce_upd_transition_velocity__SWIG_1(swigCPtr, this), false);
  }

  public void set_transition_velocity(double value) {
    opensimModelJNI.HuntCrossleyForce_set_transition_velocity__SWIG_1(swigCPtr, this, value);
  }

  public HuntCrossleyForce() {
    this(opensimModelJNI.new_HuntCrossleyForce(), true);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet updContactParametersSet() {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelJNI.HuntCrossleyForce_updContactParametersSet(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet getContactParametersSet() {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelJNI.HuntCrossleyForce_getContactParametersSet(swigCPtr, this), false);
  }

  public void addContactParameters(SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParameters params) {
    opensimModelJNI.HuntCrossleyForce_addContactParameters(swigCPtr, this, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParameters.getCPtr(params));
  }

  public double getTransitionVelocity() {
    return opensimModelJNI.HuntCrossleyForce_getTransitionVelocity(swigCPtr, this);
  }

  public void setTransitionVelocity(double velocity) {
    opensimModelJNI.HuntCrossleyForce_setTransitionVelocity(swigCPtr, this, velocity);
  }

  public double getStiffness() {
    return opensimModelJNI.HuntCrossleyForce_getStiffness(swigCPtr, this);
  }

  public void setStiffness(double stiffness) {
    opensimModelJNI.HuntCrossleyForce_setStiffness(swigCPtr, this, stiffness);
  }

  public double getDissipation() {
    return opensimModelJNI.HuntCrossleyForce_getDissipation(swigCPtr, this);
  }

  public void setDissipation(double dissipation) {
    opensimModelJNI.HuntCrossleyForce_setDissipation(swigCPtr, this, dissipation);
  }

  public double getStaticFriction() {
    return opensimModelJNI.HuntCrossleyForce_getStaticFriction(swigCPtr, this);
  }

  public void setStaticFriction(double friction) {
    opensimModelJNI.HuntCrossleyForce_setStaticFriction(swigCPtr, this, friction);
  }

  public double getDynamicFriction() {
    return opensimModelJNI.HuntCrossleyForce_getDynamicFriction(swigCPtr, this);
  }

  public void setDynamicFriction(double friction) {
    opensimModelJNI.HuntCrossleyForce_setDynamicFriction(swigCPtr, this, friction);
  }

  public double getViscousFriction() {
    return opensimModelJNI.HuntCrossleyForce_getViscousFriction(swigCPtr, this);
  }

  public void setViscousFriction(double friction) {
    opensimModelJNI.HuntCrossleyForce_setViscousFriction(swigCPtr, this, friction);
  }

  public void addGeometry(String name) {
    opensimModelJNI.HuntCrossleyForce_addGeometry(swigCPtr, this, name);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelJNI.HuntCrossleyForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimModelJNI.HuntCrossleyForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
