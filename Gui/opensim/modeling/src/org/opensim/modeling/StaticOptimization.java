/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StaticOptimization extends Analysis {
  private transient long swigCPtr;

  public StaticOptimization(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.StaticOptimization_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(StaticOptimization obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_StaticOptimization(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static StaticOptimization safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.StaticOptimization_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new StaticOptimization(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.StaticOptimization_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.StaticOptimization_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.StaticOptimization_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new StaticOptimization(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.StaticOptimization_getConcreteClassName(swigCPtr, this);
  }

  public StaticOptimization(Model aModel) {
    this(opensimModelJNI.new_StaticOptimization__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public StaticOptimization() {
    this(opensimModelJNI.new_StaticOptimization__SWIG_1(), true);
  }

  public StaticOptimization(StaticOptimization aObject) {
    this(opensimModelJNI.new_StaticOptimization__SWIG_2(StaticOptimization.getCPtr(aObject), aObject), true);
  }

  public void setStorageCapacityIncrements(int aIncrement) {
    opensimModelJNI.StaticOptimization_setStorageCapacityIncrements(swigCPtr, this, aIncrement);
  }

  public Storage getActivationStorage() {
    long cPtr = opensimModelJNI.StaticOptimization_getActivationStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getForceStorage() {
    long cPtr = opensimModelJNI.StaticOptimization_getForceStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public boolean getUseModelForceSet() {
    return opensimModelJNI.StaticOptimization_getUseModelForceSet(swigCPtr, this);
  }

  public void setUseModelForceSet(boolean aUseModelActuatorSet) {
    opensimModelJNI.StaticOptimization_setUseModelForceSet(swigCPtr, this, aUseModelActuatorSet);
  }

  public void setModel(Model aModel) {
    opensimModelJNI.StaticOptimization_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setActivationExponent(double aExponent) {
    opensimModelJNI.StaticOptimization_setActivationExponent(swigCPtr, this, aExponent);
  }

  public double getActivationExponent() {
    return opensimModelJNI.StaticOptimization_getActivationExponent(swigCPtr, this);
  }

  public void setUseMusclePhysiology(boolean useIt) {
    opensimModelJNI.StaticOptimization_setUseMusclePhysiology(swigCPtr, this, useIt);
  }

  public boolean getUseMusclePhysiology() {
    return opensimModelJNI.StaticOptimization_getUseMusclePhysiology(swigCPtr, this);
  }

  public void setConvergenceCriterion(double tolerance) {
    opensimModelJNI.StaticOptimization_setConvergenceCriterion(swigCPtr, this, tolerance);
  }

  public double getConvergenceCriterion() {
    return opensimModelJNI.StaticOptimization_getConvergenceCriterion(swigCPtr, this);
  }

  public void setMaxIterations(int maxIt) {
    opensimModelJNI.StaticOptimization_setMaxIterations(swigCPtr, this, maxIt);
  }

  public int getMaxIterations() {
    return opensimModelJNI.StaticOptimization_getMaxIterations(swigCPtr, this);
  }

  public int begin(State s) {
    return opensimModelJNI.StaticOptimization_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimModelJNI.StaticOptimization_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimModelJNI.StaticOptimization_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimModelJNI.StaticOptimization_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimModelJNI.StaticOptimization_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimModelJNI.StaticOptimization_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimModelJNI.StaticOptimization_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
