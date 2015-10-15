/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FiberCompressiveForceCosPennationCurve extends Function {
  private transient long swigCPtr;

  public FiberCompressiveForceCosPennationCurve(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.FiberCompressiveForceCosPennationCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(FiberCompressiveForceCosPennationCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_FiberCompressiveForceCosPennationCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static FiberCompressiveForceCosPennationCurve safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.FiberCompressiveForceCosPennationCurve_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new FiberCompressiveForceCosPennationCurve(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.FiberCompressiveForceCosPennationCurve_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new FiberCompressiveForceCosPennationCurve(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_engagement_angle_in_degrees(FiberCompressiveForceCosPennationCurve source) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_copyProperty_engagement_angle_in_degrees(swigCPtr, this, FiberCompressiveForceCosPennationCurve.getCPtr(source), source);
  }

  public double get_engagement_angle_in_degrees(int i) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_get_engagement_angle_in_degrees__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_engagement_angle_in_degrees(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.FiberCompressiveForceCosPennationCurve_upd_engagement_angle_in_degrees__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_engagement_angle_in_degrees(int i, double value) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_set_engagement_angle_in_degrees__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_engagement_angle_in_degrees(double value) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_append_engagement_angle_in_degrees(swigCPtr, this, value);
  }

  public void constructProperty_engagement_angle_in_degrees(double initValue) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_constructProperty_engagement_angle_in_degrees(swigCPtr, this, initValue);
  }

  public double get_engagement_angle_in_degrees() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_get_engagement_angle_in_degrees__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_engagement_angle_in_degrees() {
    return new SWIGTYPE_p_double(opensimModelJNI.FiberCompressiveForceCosPennationCurve_upd_engagement_angle_in_degrees__SWIG_1(swigCPtr, this), false);
  }

  public void set_engagement_angle_in_degrees(double value) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_set_engagement_angle_in_degrees__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_stiffness_at_perpendicular(FiberCompressiveForceCosPennationCurve source) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_copyProperty_stiffness_at_perpendicular(swigCPtr, this, FiberCompressiveForceCosPennationCurve.getCPtr(source), source);
  }

  public double get_stiffness_at_perpendicular(int i) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_get_stiffness_at_perpendicular__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_stiffness_at_perpendicular(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.FiberCompressiveForceCosPennationCurve_upd_stiffness_at_perpendicular__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_stiffness_at_perpendicular(int i, double value) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_set_stiffness_at_perpendicular__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_stiffness_at_perpendicular(double value) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_append_stiffness_at_perpendicular(swigCPtr, this, value);
  }

  public void constructProperty_stiffness_at_perpendicular() {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_constructProperty_stiffness_at_perpendicular__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_stiffness_at_perpendicular(double initValue) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_constructProperty_stiffness_at_perpendicular__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_stiffness_at_perpendicular() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_get_stiffness_at_perpendicular__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_stiffness_at_perpendicular() {
    return new SWIGTYPE_p_double(opensimModelJNI.FiberCompressiveForceCosPennationCurve_upd_stiffness_at_perpendicular__SWIG_1(swigCPtr, this), false);
  }

  public void set_stiffness_at_perpendicular(double value) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_set_stiffness_at_perpendicular__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_curviness(FiberCompressiveForceCosPennationCurve source) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_copyProperty_curviness(swigCPtr, this, FiberCompressiveForceCosPennationCurve.getCPtr(source), source);
  }

  public double get_curviness(int i) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_get_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_curviness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.FiberCompressiveForceCosPennationCurve_upd_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_curviness(int i, double value) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_set_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_curviness(double value) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_append_curviness(swigCPtr, this, value);
  }

  public void constructProperty_curviness() {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_constructProperty_curviness__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_curviness(double initValue) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_constructProperty_curviness__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_curviness() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_get_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_curviness() {
    return new SWIGTYPE_p_double(opensimModelJNI.FiberCompressiveForceCosPennationCurve_upd_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_curviness(double value) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_set_curviness__SWIG_1(swigCPtr, this, value);
  }

  public FiberCompressiveForceCosPennationCurve() {
    this(opensimModelJNI.new_FiberCompressiveForceCosPennationCurve__SWIG_0(), true);
  }

  public FiberCompressiveForceCosPennationCurve(double engagementAngleInDegrees, double stiffnessAtPerpendicular, double curviness, String muscleName) {
    this(opensimModelJNI.new_FiberCompressiveForceCosPennationCurve__SWIG_1(engagementAngleInDegrees, stiffnessAtPerpendicular, curviness, muscleName), true);
  }

  public FiberCompressiveForceCosPennationCurve(double engagementAngleInDegrees, String muscleName) {
    this(opensimModelJNI.new_FiberCompressiveForceCosPennationCurve__SWIG_2(engagementAngleInDegrees, muscleName), true);
  }

  public double getEngagementAngleInDegrees() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_getEngagementAngleInDegrees(swigCPtr, this);
  }

  public double getStiffnessAtPerpendicularInUse() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_getStiffnessAtPerpendicularInUse(swigCPtr, this);
  }

  public double getCurvinessInUse() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_getCurvinessInUse(swigCPtr, this);
  }

  public boolean isFittedCurveBeingUsed() {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_isFittedCurveBeingUsed(swigCPtr, this);
  }

  public void setEngagementAngleInDegrees(double aEngagementAngleInDegrees) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_setEngagementAngleInDegrees(swigCPtr, this, aEngagementAngleInDegrees);
  }

  public void setOptionalProperties(double aStiffnessAtPerpendicular, double aCurviness) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_setOptionalProperties(swigCPtr, this, aStiffnessAtPerpendicular, aCurviness);
  }

  public double calcValue(double cosPennationAngle) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_calcValue__SWIG_0(swigCPtr, this, cosPennationAngle);
  }

  public double calcValue(Vector x) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_calcValue__SWIG_1(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcDerivative(double cosPennationAngle, int order) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_calcDerivative(swigCPtr, this, cosPennationAngle, order);
  }

  public double calcIntegral(double cosPennationAngle) {
    return opensimModelJNI.FiberCompressiveForceCosPennationCurve_calcIntegral(swigCPtr, this, cosPennationAngle);
  }

  public Vec2 getCurveDomain() {
    return new Vec2(opensimModelJNI.FiberCompressiveForceCosPennationCurve_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path) {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_printMuscleCurveToCSVFile(swigCPtr, this, path);
  }

  public void ensureCurveUpToDate() {
    opensimModelJNI.FiberCompressiveForceCosPennationCurve_ensureCurveUpToDate(swigCPtr, this);
  }

}
