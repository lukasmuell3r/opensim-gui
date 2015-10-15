/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CoordinateLimitForce extends Force {
  private transient long swigCPtr;

  public CoordinateLimitForce(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.CoordinateLimitForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateLimitForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_CoordinateLimitForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CoordinateLimitForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.CoordinateLimitForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CoordinateLimitForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.CoordinateLimitForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.CoordinateLimitForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.CoordinateLimitForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CoordinateLimitForce(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.CoordinateLimitForce_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_coordinate(CoordinateLimitForce source) {
    opensimModelJNI.CoordinateLimitForce_copyProperty_coordinate(swigCPtr, this, CoordinateLimitForce.getCPtr(source), source);
  }

  public String get_coordinate(int i) {
    return opensimModelJNI.CoordinateLimitForce_get_coordinate__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_coordinate(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.CoordinateLimitForce_upd_coordinate__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_coordinate(int i, String value) {
    opensimModelJNI.CoordinateLimitForce_set_coordinate__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_coordinate(String value) {
    return opensimModelJNI.CoordinateLimitForce_append_coordinate(swigCPtr, this, value);
  }

  public void constructProperty_coordinate(String initValue) {
    opensimModelJNI.CoordinateLimitForce_constructProperty_coordinate(swigCPtr, this, initValue);
  }

  public String get_coordinate() {
    return opensimModelJNI.CoordinateLimitForce_get_coordinate__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_coordinate() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.CoordinateLimitForce_upd_coordinate__SWIG_1(swigCPtr, this), false);
  }

  public void set_coordinate(String value) {
    opensimModelJNI.CoordinateLimitForce_set_coordinate__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_upper_stiffness(CoordinateLimitForce source) {
    opensimModelJNI.CoordinateLimitForce_copyProperty_upper_stiffness(swigCPtr, this, CoordinateLimitForce.getCPtr(source), source);
  }

  public double get_upper_stiffness(int i) {
    return opensimModelJNI.CoordinateLimitForce_get_upper_stiffness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_upper_stiffness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_upper_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_upper_stiffness(int i, double value) {
    opensimModelJNI.CoordinateLimitForce_set_upper_stiffness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_upper_stiffness(double value) {
    return opensimModelJNI.CoordinateLimitForce_append_upper_stiffness(swigCPtr, this, value);
  }

  public void constructProperty_upper_stiffness(double initValue) {
    opensimModelJNI.CoordinateLimitForce_constructProperty_upper_stiffness(swigCPtr, this, initValue);
  }

  public double get_upper_stiffness() {
    return opensimModelJNI.CoordinateLimitForce_get_upper_stiffness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_upper_stiffness() {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_upper_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public void set_upper_stiffness(double value) {
    opensimModelJNI.CoordinateLimitForce_set_upper_stiffness__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_upper_limit(CoordinateLimitForce source) {
    opensimModelJNI.CoordinateLimitForce_copyProperty_upper_limit(swigCPtr, this, CoordinateLimitForce.getCPtr(source), source);
  }

  public double get_upper_limit(int i) {
    return opensimModelJNI.CoordinateLimitForce_get_upper_limit__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_upper_limit(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_upper_limit__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_upper_limit(int i, double value) {
    opensimModelJNI.CoordinateLimitForce_set_upper_limit__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_upper_limit(double value) {
    return opensimModelJNI.CoordinateLimitForce_append_upper_limit(swigCPtr, this, value);
  }

  public void constructProperty_upper_limit(double initValue) {
    opensimModelJNI.CoordinateLimitForce_constructProperty_upper_limit(swigCPtr, this, initValue);
  }

  public double get_upper_limit() {
    return opensimModelJNI.CoordinateLimitForce_get_upper_limit__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_upper_limit() {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_upper_limit__SWIG_1(swigCPtr, this), false);
  }

  public void set_upper_limit(double value) {
    opensimModelJNI.CoordinateLimitForce_set_upper_limit__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_lower_stiffness(CoordinateLimitForce source) {
    opensimModelJNI.CoordinateLimitForce_copyProperty_lower_stiffness(swigCPtr, this, CoordinateLimitForce.getCPtr(source), source);
  }

  public double get_lower_stiffness(int i) {
    return opensimModelJNI.CoordinateLimitForce_get_lower_stiffness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_lower_stiffness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_lower_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_lower_stiffness(int i, double value) {
    opensimModelJNI.CoordinateLimitForce_set_lower_stiffness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_lower_stiffness(double value) {
    return opensimModelJNI.CoordinateLimitForce_append_lower_stiffness(swigCPtr, this, value);
  }

  public void constructProperty_lower_stiffness(double initValue) {
    opensimModelJNI.CoordinateLimitForce_constructProperty_lower_stiffness(swigCPtr, this, initValue);
  }

  public double get_lower_stiffness() {
    return opensimModelJNI.CoordinateLimitForce_get_lower_stiffness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_lower_stiffness() {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_lower_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public void set_lower_stiffness(double value) {
    opensimModelJNI.CoordinateLimitForce_set_lower_stiffness__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_lower_limit(CoordinateLimitForce source) {
    opensimModelJNI.CoordinateLimitForce_copyProperty_lower_limit(swigCPtr, this, CoordinateLimitForce.getCPtr(source), source);
  }

  public double get_lower_limit(int i) {
    return opensimModelJNI.CoordinateLimitForce_get_lower_limit__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_lower_limit(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_lower_limit__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_lower_limit(int i, double value) {
    opensimModelJNI.CoordinateLimitForce_set_lower_limit__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_lower_limit(double value) {
    return opensimModelJNI.CoordinateLimitForce_append_lower_limit(swigCPtr, this, value);
  }

  public void constructProperty_lower_limit(double initValue) {
    opensimModelJNI.CoordinateLimitForce_constructProperty_lower_limit(swigCPtr, this, initValue);
  }

  public double get_lower_limit() {
    return opensimModelJNI.CoordinateLimitForce_get_lower_limit__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_lower_limit() {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_lower_limit__SWIG_1(swigCPtr, this), false);
  }

  public void set_lower_limit(double value) {
    opensimModelJNI.CoordinateLimitForce_set_lower_limit__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_damping(CoordinateLimitForce source) {
    opensimModelJNI.CoordinateLimitForce_copyProperty_damping(swigCPtr, this, CoordinateLimitForce.getCPtr(source), source);
  }

  public double get_damping(int i) {
    return opensimModelJNI.CoordinateLimitForce_get_damping__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_damping(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_damping(int i, double value) {
    opensimModelJNI.CoordinateLimitForce_set_damping__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_damping(double value) {
    return opensimModelJNI.CoordinateLimitForce_append_damping(swigCPtr, this, value);
  }

  public void constructProperty_damping(double initValue) {
    opensimModelJNI.CoordinateLimitForce_constructProperty_damping(swigCPtr, this, initValue);
  }

  public double get_damping() {
    return opensimModelJNI.CoordinateLimitForce_get_damping__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_damping() {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_damping(double value) {
    opensimModelJNI.CoordinateLimitForce_set_damping__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_transition(CoordinateLimitForce source) {
    opensimModelJNI.CoordinateLimitForce_copyProperty_transition(swigCPtr, this, CoordinateLimitForce.getCPtr(source), source);
  }

  public double get_transition(int i) {
    return opensimModelJNI.CoordinateLimitForce_get_transition__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_transition(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_transition__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_transition(int i, double value) {
    opensimModelJNI.CoordinateLimitForce_set_transition__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_transition(double value) {
    return opensimModelJNI.CoordinateLimitForce_append_transition(swigCPtr, this, value);
  }

  public void constructProperty_transition(double initValue) {
    opensimModelJNI.CoordinateLimitForce_constructProperty_transition(swigCPtr, this, initValue);
  }

  public double get_transition() {
    return opensimModelJNI.CoordinateLimitForce_get_transition__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_transition() {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateLimitForce_upd_transition__SWIG_1(swigCPtr, this), false);
  }

  public void set_transition(double value) {
    opensimModelJNI.CoordinateLimitForce_set_transition__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_compute_dissipation_energy(CoordinateLimitForce source) {
    opensimModelJNI.CoordinateLimitForce_copyProperty_compute_dissipation_energy(swigCPtr, this, CoordinateLimitForce.getCPtr(source), source);
  }

  public boolean get_compute_dissipation_energy(int i) {
    return opensimModelJNI.CoordinateLimitForce_get_compute_dissipation_energy__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_compute_dissipation_energy(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.CoordinateLimitForce_upd_compute_dissipation_energy__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_compute_dissipation_energy(int i, boolean value) {
    opensimModelJNI.CoordinateLimitForce_set_compute_dissipation_energy__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_compute_dissipation_energy(boolean value) {
    return opensimModelJNI.CoordinateLimitForce_append_compute_dissipation_energy(swigCPtr, this, value);
  }

  public void constructProperty_compute_dissipation_energy(boolean initValue) {
    opensimModelJNI.CoordinateLimitForce_constructProperty_compute_dissipation_energy(swigCPtr, this, initValue);
  }

  public boolean get_compute_dissipation_energy() {
    return opensimModelJNI.CoordinateLimitForce_get_compute_dissipation_energy__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_compute_dissipation_energy() {
    return new SWIGTYPE_p_bool(opensimModelJNI.CoordinateLimitForce_upd_compute_dissipation_energy__SWIG_1(swigCPtr, this), false);
  }

  public void set_compute_dissipation_energy(boolean value) {
    opensimModelJNI.CoordinateLimitForce_set_compute_dissipation_energy__SWIG_1(swigCPtr, this, value);
  }

  public CoordinateLimitForce() {
    this(opensimModelJNI.new_CoordinateLimitForce__SWIG_0(), true);
  }

  public CoordinateLimitForce(String coordName, double q_upper, double K_upper, double q_lower, double K_lower, double damping, double dq, boolean computeDissipationEnergy) {
    this(opensimModelJNI.new_CoordinateLimitForce__SWIG_1(coordName, q_upper, K_upper, q_lower, K_lower, damping, dq, computeDissipationEnergy), true);
  }

  public CoordinateLimitForce(String coordName, double q_upper, double K_upper, double q_lower, double K_lower, double damping, double dq) {
    this(opensimModelJNI.new_CoordinateLimitForce__SWIG_2(coordName, q_upper, K_upper, q_lower, K_lower, damping, dq), true);
  }

  public void setUpperStiffness(double aUpperStiffness) {
    opensimModelJNI.CoordinateLimitForce_setUpperStiffness(swigCPtr, this, aUpperStiffness);
  }

  public double getUpperStiffness() {
    return opensimModelJNI.CoordinateLimitForce_getUpperStiffness(swigCPtr, this);
  }

  public void setUpperLimit(double aUpperLimit) {
    opensimModelJNI.CoordinateLimitForce_setUpperLimit(swigCPtr, this, aUpperLimit);
  }

  public double getUpperLimit() {
    return opensimModelJNI.CoordinateLimitForce_getUpperLimit(swigCPtr, this);
  }

  public void setLowerStiffness(double aLowerStiffness) {
    opensimModelJNI.CoordinateLimitForce_setLowerStiffness(swigCPtr, this, aLowerStiffness);
  }

  public double getLowerStiffness() {
    return opensimModelJNI.CoordinateLimitForce_getLowerStiffness(swigCPtr, this);
  }

  public void setLowerLimit(double aLowerLimit) {
    opensimModelJNI.CoordinateLimitForce_setLowerLimit(swigCPtr, this, aLowerLimit);
  }

  public double getLowerLimit() {
    return opensimModelJNI.CoordinateLimitForce_getLowerLimit(swigCPtr, this);
  }

  public void setDamping(double aDamping) {
    opensimModelJNI.CoordinateLimitForce_setDamping(swigCPtr, this, aDamping);
  }

  public double getDamping() {
    return opensimModelJNI.CoordinateLimitForce_getDamping(swigCPtr, this);
  }

  public void setTransition(double aTransition) {
    opensimModelJNI.CoordinateLimitForce_setTransition(swigCPtr, this, aTransition);
  }

  public double getTransition() {
    return opensimModelJNI.CoordinateLimitForce_getTransition(swigCPtr, this);
  }

  public void setComputeDissipationEnergy(boolean flag) {
    opensimModelJNI.CoordinateLimitForce_setComputeDissipationEnergy(swigCPtr, this, flag);
  }

  public boolean isComputingDissipationEnergy() {
    return opensimModelJNI.CoordinateLimitForce_isComputingDissipationEnergy(swigCPtr, this);
  }

  public double getPowerDissipation(State s) {
    return opensimModelJNI.CoordinateLimitForce_getPowerDissipation(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getDissipatedEnergy(State s) {
    return opensimModelJNI.CoordinateLimitForce_getDissipatedEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public double calcLimitForce(State s) {
    return opensimModelJNI.CoordinateLimitForce_calcLimitForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double computePotentialEnergy(State s) {
    return opensimModelJNI.CoordinateLimitForce_computePotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelJNI.CoordinateLimitForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimModelJNI.CoordinateLimitForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
