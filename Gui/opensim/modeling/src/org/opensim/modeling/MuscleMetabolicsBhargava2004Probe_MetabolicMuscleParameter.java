/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter extends OpenSimObject {
  private long swigCPtr;

  public MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_specific_tension(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_specific_tension_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_specific_tension() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_specific_tension_get(swigCPtr, this), true);
  }

  public void copyProperty_specific_tension(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_specific_tension(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_specific_tension() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_specific_tension(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_specific_tension() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_specific_tension(swigCPtr, this), false);
  }

  public double get_specific_tension(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_specific_tension__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_specific_tension(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_specific_tension__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_specific_tension(int i, double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_specific_tension__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_specific_tension(double value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_specific_tension(swigCPtr, this, value);
  }

  public void constructProperty_specific_tension(double initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_specific_tension(swigCPtr, this, initValue);
  }

  public double get_specific_tension() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_specific_tension__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_specific_tension() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_specific_tension__SWIG_1(swigCPtr, this), false);
  }

  public void set_specific_tension(double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_specific_tension__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_density(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_density_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_density() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_density_get(swigCPtr, this), true);
  }

  public void copyProperty_density(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_density(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_density() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_density(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_density() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_density(swigCPtr, this), false);
  }

  public double get_density(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_density__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_density(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_density__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_density(int i, double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_density__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_density(double value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_density(swigCPtr, this, value);
  }

  public void constructProperty_density(double initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_density(swigCPtr, this, initValue);
  }

  public double get_density() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_density__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_density() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_density__SWIG_1(swigCPtr, this), false);
  }

  public void set_density(double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_density__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_ratio_slow_twitch_fibers(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_ratio_slow_twitch_fibers_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_ratio_slow_twitch_fibers() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_ratio_slow_twitch_fibers_get(swigCPtr, this), true);
  }

  public void copyProperty_ratio_slow_twitch_fibers(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_ratio_slow_twitch_fibers(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_ratio_slow_twitch_fibers() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_ratio_slow_twitch_fibers(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_ratio_slow_twitch_fibers() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_ratio_slow_twitch_fibers(swigCPtr, this), false);
  }

  public double get_ratio_slow_twitch_fibers(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_ratio_slow_twitch_fibers(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ratio_slow_twitch_fibers(int i, double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_ratio_slow_twitch_fibers(double value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_ratio_slow_twitch_fibers(swigCPtr, this, value);
  }

  public void constructProperty_ratio_slow_twitch_fibers(double initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_ratio_slow_twitch_fibers(swigCPtr, this, initValue);
  }

  public double get_ratio_slow_twitch_fibers() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_ratio_slow_twitch_fibers() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this), false);
  }

  public void set_ratio_slow_twitch_fibers(double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_use_provided_muscle_mass(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_use_provided_muscle_mass_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_use_provided_muscle_mass() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_use_provided_muscle_mass_get(swigCPtr, this), true);
  }

  public void copyProperty_use_provided_muscle_mass(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_use_provided_muscle_mass(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_bool_t getProperty_use_provided_muscle_mass() {
    return new SWIGTYPE_p_OpenSim__PropertyT_bool_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_use_provided_muscle_mass(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_bool_t updProperty_use_provided_muscle_mass() {
    return new SWIGTYPE_p_OpenSim__PropertyT_bool_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_use_provided_muscle_mass(swigCPtr, this), false);
  }

  public boolean get_use_provided_muscle_mass(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_use_provided_muscle_mass(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_use_provided_muscle_mass(int i, boolean value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_use_provided_muscle_mass(boolean value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_use_provided_muscle_mass(swigCPtr, this, value);
  }

  public void constructProperty_use_provided_muscle_mass() {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_use_provided_muscle_mass__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_use_provided_muscle_mass(boolean initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_use_provided_muscle_mass__SWIG_1(swigCPtr, this, initValue);
  }

  public boolean get_use_provided_muscle_mass() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_use_provided_muscle_mass__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_use_provided_muscle_mass() {
    return new SWIGTYPE_p_bool(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_use_provided_muscle_mass__SWIG_1(swigCPtr, this), false);
  }

  public void set_use_provided_muscle_mass(boolean value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_use_provided_muscle_mass__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_provided_muscle_mass(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_provided_muscle_mass_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_provided_muscle_mass() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_provided_muscle_mass_get(swigCPtr, this), true);
  }

  public void copyProperty_provided_muscle_mass(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_provided_muscle_mass(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_provided_muscle_mass() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_provided_muscle_mass(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_provided_muscle_mass() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_provided_muscle_mass(swigCPtr, this), false);
  }

  public double get_provided_muscle_mass(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_provided_muscle_mass__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_provided_muscle_mass(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_provided_muscle_mass__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_provided_muscle_mass(int i, double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_provided_muscle_mass__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_provided_muscle_mass(double value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_provided_muscle_mass(swigCPtr, this, value);
  }

  public void constructProperty_provided_muscle_mass() {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_provided_muscle_mass__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_provided_muscle_mass(double initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_provided_muscle_mass__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_provided_muscle_mass() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_provided_muscle_mass__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_provided_muscle_mass() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_provided_muscle_mass__SWIG_1(swigCPtr, this), false);
  }

  public void set_provided_muscle_mass(double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_provided_muscle_mass__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_activation_constant_slow_twitch(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_activation_constant_slow_twitch_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_activation_constant_slow_twitch() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_activation_constant_slow_twitch_get(swigCPtr, this), true);
  }

  public void copyProperty_activation_constant_slow_twitch(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_activation_constant_slow_twitch(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_activation_constant_slow_twitch() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_activation_constant_slow_twitch(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_activation_constant_slow_twitch() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_activation_constant_slow_twitch(swigCPtr, this), false);
  }

  public double get_activation_constant_slow_twitch(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_activation_constant_slow_twitch__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_activation_constant_slow_twitch(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_activation_constant_slow_twitch__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_activation_constant_slow_twitch(int i, double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_activation_constant_slow_twitch__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_activation_constant_slow_twitch(double value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_activation_constant_slow_twitch(swigCPtr, this, value);
  }

  public void constructProperty_activation_constant_slow_twitch(double initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_activation_constant_slow_twitch(swigCPtr, this, initValue);
  }

  public double get_activation_constant_slow_twitch() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_activation_constant_slow_twitch__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_activation_constant_slow_twitch() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_activation_constant_slow_twitch__SWIG_1(swigCPtr, this), false);
  }

  public void set_activation_constant_slow_twitch(double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_activation_constant_slow_twitch__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_activation_constant_fast_twitch(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_activation_constant_fast_twitch_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_activation_constant_fast_twitch() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_activation_constant_fast_twitch_get(swigCPtr, this), true);
  }

  public void copyProperty_activation_constant_fast_twitch(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_activation_constant_fast_twitch(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_activation_constant_fast_twitch() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_activation_constant_fast_twitch(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_activation_constant_fast_twitch() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_activation_constant_fast_twitch(swigCPtr, this), false);
  }

  public double get_activation_constant_fast_twitch(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_activation_constant_fast_twitch__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_activation_constant_fast_twitch(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_activation_constant_fast_twitch__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_activation_constant_fast_twitch(int i, double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_activation_constant_fast_twitch__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_activation_constant_fast_twitch(double value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_activation_constant_fast_twitch(swigCPtr, this, value);
  }

  public void constructProperty_activation_constant_fast_twitch(double initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_activation_constant_fast_twitch(swigCPtr, this, initValue);
  }

  public double get_activation_constant_fast_twitch() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_activation_constant_fast_twitch__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_activation_constant_fast_twitch() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_activation_constant_fast_twitch__SWIG_1(swigCPtr, this), false);
  }

  public void set_activation_constant_fast_twitch(double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_activation_constant_fast_twitch__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_maintenance_constant_slow_twitch(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_maintenance_constant_slow_twitch_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_maintenance_constant_slow_twitch() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_maintenance_constant_slow_twitch_get(swigCPtr, this), true);
  }

  public void copyProperty_maintenance_constant_slow_twitch(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_maintenance_constant_slow_twitch(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_maintenance_constant_slow_twitch() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_maintenance_constant_slow_twitch(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_maintenance_constant_slow_twitch() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_maintenance_constant_slow_twitch(swigCPtr, this), false);
  }

  public double get_maintenance_constant_slow_twitch(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_maintenance_constant_slow_twitch__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_maintenance_constant_slow_twitch(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_maintenance_constant_slow_twitch__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_maintenance_constant_slow_twitch(int i, double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_maintenance_constant_slow_twitch__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_maintenance_constant_slow_twitch(double value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_maintenance_constant_slow_twitch(swigCPtr, this, value);
  }

  public void constructProperty_maintenance_constant_slow_twitch(double initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_maintenance_constant_slow_twitch(swigCPtr, this, initValue);
  }

  public double get_maintenance_constant_slow_twitch() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_maintenance_constant_slow_twitch__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_maintenance_constant_slow_twitch() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_maintenance_constant_slow_twitch__SWIG_1(swigCPtr, this), false);
  }

  public void set_maintenance_constant_slow_twitch(double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_maintenance_constant_slow_twitch__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_maintenance_constant_fast_twitch(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_maintenance_constant_fast_twitch_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_maintenance_constant_fast_twitch() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_PropertyIndex_maintenance_constant_fast_twitch_get(swigCPtr, this), true);
  }

  public void copyProperty_maintenance_constant_fast_twitch(MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter source) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_copyProperty_maintenance_constant_fast_twitch(swigCPtr, this, MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_maintenance_constant_fast_twitch() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getProperty_maintenance_constant_fast_twitch(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_maintenance_constant_fast_twitch() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_updProperty_maintenance_constant_fast_twitch(swigCPtr, this), false);
  }

  public double get_maintenance_constant_fast_twitch(int i) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_maintenance_constant_fast_twitch__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_maintenance_constant_fast_twitch(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_maintenance_constant_fast_twitch__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_maintenance_constant_fast_twitch(int i, double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_maintenance_constant_fast_twitch__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_maintenance_constant_fast_twitch(double value) {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_append_maintenance_constant_fast_twitch(swigCPtr, this, value);
  }

  public void constructProperty_maintenance_constant_fast_twitch(double initValue) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_constructProperty_maintenance_constant_fast_twitch(swigCPtr, this, initValue);
  }

  public double get_maintenance_constant_fast_twitch() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_get_maintenance_constant_fast_twitch__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_maintenance_constant_fast_twitch() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_upd_maintenance_constant_fast_twitch__SWIG_1(swigCPtr, this), false);
  }

  public void set_maintenance_constant_fast_twitch(double value) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_set_maintenance_constant_fast_twitch__SWIG_1(swigCPtr, this, value);
  }

  public MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter() {
    this(opensimModelJNI.new_MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter__SWIG_0(), true);
  }

  public MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers, double muscle_mass) {
    this(opensimModelJNI.new_MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter__SWIG_1(muscleName, ratio_slow_twitch_fibers, muscle_mass), true);
  }

  public MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers) {
    this(opensimModelJNI.new_MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter__SWIG_2(muscleName, ratio_slow_twitch_fibers), true);
  }

  public MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers, double activation_constant_slow_twitch, double activation_constant_fast_twitch, double maintenance_constant_slow_twitch, double maintenance_constant_fast_twitch, double muscle_mass) {
    this(opensimModelJNI.new_MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter__SWIG_3(muscleName, ratio_slow_twitch_fibers, activation_constant_slow_twitch, activation_constant_fast_twitch, maintenance_constant_slow_twitch, maintenance_constant_fast_twitch, muscle_mass), true);
  }

  public MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers, double activation_constant_slow_twitch, double activation_constant_fast_twitch, double maintenance_constant_slow_twitch, double maintenance_constant_fast_twitch) {
    this(opensimModelJNI.new_MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter__SWIG_4(muscleName, ratio_slow_twitch_fibers, activation_constant_slow_twitch, activation_constant_fast_twitch, maintenance_constant_slow_twitch, maintenance_constant_fast_twitch), true);
  }

  public double getMuscleMass() {
    return opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getMuscleMass(swigCPtr, this);
  }

  public void setMuscleMass() {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_setMuscleMass(swigCPtr, this);
  }

  public Muscle getMuscle() {
    long cPtr = opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_getMuscle(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, false);
  }

  public void setMuscle(Muscle m) {
    opensimModelJNI.MuscleMetabolicsBhargava2004Probe_MetabolicMuscleParameter_setMuscle(swigCPtr, this, Muscle.getCPtr(m), m);
  }

}