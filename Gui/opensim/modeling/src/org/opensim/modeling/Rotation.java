/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Rotation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Rotation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Rotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Rotation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Rotation() {
    this(opensimModelJNI.new_Rotation__SWIG_0(), true);
  }

  public Rotation setRotationToIdentityMatrix() {
    return new Rotation(opensimModelJNI.Rotation_setRotationToIdentityMatrix(swigCPtr, this), false);
  }

  public Rotation setRotationToNaN() {
    return new Rotation(opensimModelJNI.Rotation_setRotationToNaN(swigCPtr, this), false);
  }

  public Rotation(Rotation R) {
    this(opensimModelJNI.new_Rotation__SWIG_1(Rotation.getCPtr(R), R), true);
  }

  public Rotation(double angle, CoordinateAxis axis) {
    this(opensimModelJNI.new_Rotation__SWIG_2(angle, CoordinateAxis.getCPtr(axis), axis), true);
  }

  public Rotation setRotationFromAngleAboutAxis(double angle, CoordinateAxis axis) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromAngleAboutAxis(swigCPtr, this, angle, CoordinateAxis.getCPtr(axis), axis), false);
  }

  public Rotation setRotationFromAngleAboutX(double angle) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromAngleAboutX__SWIG_0(swigCPtr, this, angle), false);
  }

  public Rotation setRotationFromAngleAboutY(double angle) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromAngleAboutY__SWIG_0(swigCPtr, this, angle), false);
  }

  public Rotation setRotationFromAngleAboutZ(double angle) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromAngleAboutZ__SWIG_0(swigCPtr, this, angle), false);
  }

  public Rotation setRotationFromAngleAboutX(double cosAngle, double sinAngle) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromAngleAboutX__SWIG_1(swigCPtr, this, cosAngle, sinAngle), false);
  }

  public Rotation setRotationFromAngleAboutY(double cosAngle, double sinAngle) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromAngleAboutY__SWIG_1(swigCPtr, this, cosAngle, sinAngle), false);
  }

  public Rotation setRotationFromAngleAboutZ(double cosAngle, double sinAngle) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromAngleAboutZ__SWIG_1(swigCPtr, this, cosAngle, sinAngle), false);
  }

  public Rotation(double angle, Vec3 nonUnitVector) {
    this(opensimModelJNI.new_Rotation__SWIG_3(angle, Vec3.getCPtr(nonUnitVector), nonUnitVector), true);
  }

  public Rotation setRotationFromAngleAboutNonUnitVector(double angle, Vec3 nonUnitVector) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromAngleAboutNonUnitVector(swigCPtr, this, angle, Vec3.getCPtr(nonUnitVector), nonUnitVector), false);
  }

  public Rotation(BodyOrSpaceType bodyOrSpace, double angle1, CoordinateAxis axis1, double angle2, CoordinateAxis axis2) {
    this(opensimModelJNI.new_Rotation__SWIG_4(bodyOrSpace.swigValue(), angle1, CoordinateAxis.getCPtr(axis1), axis1, angle2, CoordinateAxis.getCPtr(axis2), axis2), true);
  }

  public Rotation(BodyOrSpaceType bodyOrSpace, double angle1, CoordinateAxis axis1, double angle2, CoordinateAxis axis2, double angle3, CoordinateAxis axis3) {
    this(opensimModelJNI.new_Rotation__SWIG_5(bodyOrSpace.swigValue(), angle1, CoordinateAxis.getCPtr(axis1), axis1, angle2, CoordinateAxis.getCPtr(axis2), axis2, angle3, CoordinateAxis.getCPtr(axis3), axis3), true);
  }

  public Rotation setRotationFromTwoAnglesTwoAxes(BodyOrSpaceType bodyOrSpace, double angle1, CoordinateAxis axis1, double angle2, CoordinateAxis axis2) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromTwoAnglesTwoAxes(swigCPtr, this, bodyOrSpace.swigValue(), angle1, CoordinateAxis.getCPtr(axis1), axis1, angle2, CoordinateAxis.getCPtr(axis2), axis2), false);
  }

  public Rotation setRotationFromThreeAnglesThreeAxes(BodyOrSpaceType bodyOrSpace, double angle1, CoordinateAxis axis1, double angle2, CoordinateAxis axis2, double angle3, CoordinateAxis axis3) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromThreeAnglesThreeAxes(swigCPtr, this, bodyOrSpace.swigValue(), angle1, CoordinateAxis.getCPtr(axis1), axis1, angle2, CoordinateAxis.getCPtr(axis2), axis2, angle3, CoordinateAxis.getCPtr(axis3), axis3), false);
  }

  public void setRotationToBodyFixedXY(Vec2 v) {
    opensimModelJNI.Rotation_setRotationToBodyFixedXY(swigCPtr, this, Vec2.getCPtr(v), v);
  }

  public void setRotationToBodyFixedXYZ(Vec3 v) {
    opensimModelJNI.Rotation_setRotationToBodyFixedXYZ__SWIG_0(swigCPtr, this, Vec3.getCPtr(v), v);
  }

  public Rotation(SWIGTYPE_p_Mat33 m, boolean arg1) {
    this(opensimModelJNI.new_Rotation__SWIG_6(SWIGTYPE_p_Mat33.getCPtr(m), arg1), true);
  }

  public Rotation(SWIGTYPE_p_Mat33 m) {
    this(opensimModelJNI.new_Rotation__SWIG_7(SWIGTYPE_p_Mat33.getCPtr(m)), true);
  }

  public Rotation setRotationFromApproximateMat33(SWIGTYPE_p_Mat33 m) {
    return new Rotation(opensimModelJNI.Rotation_setRotationFromApproximateMat33(swigCPtr, this, SWIGTYPE_p_Mat33.getCPtr(m)), false);
  }

  public double convertOneAxisRotationToOneAngle(CoordinateAxis axis1) {
    return opensimModelJNI.Rotation_convertOneAxisRotationToOneAngle(swigCPtr, this, CoordinateAxis.getCPtr(axis1), axis1);
  }

  public Vec2 convertTwoAxesRotationToTwoAngles(BodyOrSpaceType bodyOrSpace, CoordinateAxis axis1, CoordinateAxis axis2) {
    return new Vec2(opensimModelJNI.Rotation_convertTwoAxesRotationToTwoAngles(swigCPtr, this, bodyOrSpace.swigValue(), CoordinateAxis.getCPtr(axis1), axis1, CoordinateAxis.getCPtr(axis2), axis2), true);
  }

  public Vec3 convertThreeAxesRotationToThreeAngles(BodyOrSpaceType bodyOrSpace, CoordinateAxis axis1, CoordinateAxis axis2, CoordinateAxis axis3) {
    return new Vec3(opensimModelJNI.Rotation_convertThreeAxesRotationToThreeAngles(swigCPtr, this, bodyOrSpace.swigValue(), CoordinateAxis.getCPtr(axis1), axis1, CoordinateAxis.getCPtr(axis2), axis2, CoordinateAxis.getCPtr(axis3), axis3), true);
  }

  public Vec4 convertRotationToAngleAxis() {
    return new Vec4(opensimModelJNI.Rotation_convertRotationToAngleAxis(swigCPtr, this), true);
  }

  public Vec2 convertRotationToBodyFixedXY() {
    return new Vec2(opensimModelJNI.Rotation_convertRotationToBodyFixedXY(swigCPtr, this), true);
  }

  public Vec3 convertRotationToBodyFixedXYZ() {
    return new Vec3(opensimModelJNI.Rotation_convertRotationToBodyFixedXYZ(swigCPtr, this), true);
  }

  public boolean isSameRotationToWithinAngle(Rotation R, double okPointingAngleErrorRads) {
    return opensimModelJNI.Rotation_isSameRotationToWithinAngle(swigCPtr, this, Rotation.getCPtr(R), R, okPointingAngleErrorRads);
  }

  public boolean isSameRotationToWithinAngleOfMachinePrecision(Rotation R) {
    return opensimModelJNI.Rotation_isSameRotationToWithinAngleOfMachinePrecision(swigCPtr, this, Rotation.getCPtr(R), R);
  }

  public double getMaxAbsDifferenceInRotationElements(Rotation R) {
    return opensimModelJNI.Rotation_getMaxAbsDifferenceInRotationElements(swigCPtr, this, Rotation.getCPtr(R), R);
  }

  public boolean areAllRotationElementsSameToEpsilon(Rotation R, double epsilon) {
    return opensimModelJNI.Rotation_areAllRotationElementsSameToEpsilon(swigCPtr, this, Rotation.getCPtr(R), R, epsilon);
  }

  public boolean areAllRotationElementsSameToMachinePrecision(Rotation R) {
    return opensimModelJNI.Rotation_areAllRotationElementsSameToMachinePrecision(swigCPtr, this, Rotation.getCPtr(R), R);
  }

  public Rotation(InverseRotation arg0) {
    this(opensimModelJNI.new_Rotation__SWIG_8(InverseRotation.getCPtr(arg0), arg0), true);
  }

  public InverseRotation invert() {
    return new InverseRotation(opensimModelJNI.Rotation_invert(swigCPtr, this), false);
  }

  public InverseRotation transpose() {
    return new InverseRotation(opensimModelJNI.Rotation_transpose(swigCPtr, this), false);
  }

  public Mat33 asMat33() {
    return new Mat33(opensimModelJNI.Rotation_asMat33(swigCPtr, this), false);
  }

  public Mat33 toMat33() {
    return new Mat33(opensimModelJNI.Rotation_toMat33(swigCPtr, this), true);
  }

  public void setRotationToBodyFixedXYZ(Vec3 c, Vec3 s) {
    opensimModelJNI.Rotation_setRotationToBodyFixedXYZ__SWIG_1(swigCPtr, this, Vec3.getCPtr(c), c, Vec3.getCPtr(s), s);
  }

  public static Vec3 convertAngVelToBodyFixed321Dot(Vec3 q, Vec3 w_PB_B) {
    return new Vec3(opensimModelJNI.Rotation_convertAngVelToBodyFixed321Dot(Vec3.getCPtr(q), q, Vec3.getCPtr(w_PB_B), w_PB_B), true);
  }

  public static Vec3 convertBodyFixed321DotToAngVel(Vec3 q, Vec3 qd) {
    return new Vec3(opensimModelJNI.Rotation_convertBodyFixed321DotToAngVel(Vec3.getCPtr(q), q, Vec3.getCPtr(qd), qd), true);
  }

  public static Vec3 convertAngVelDotToBodyFixed321DotDot(Vec3 q, Vec3 w_PB_B, Vec3 wdot_PB_B) {
    return new Vec3(opensimModelJNI.Rotation_convertAngVelDotToBodyFixed321DotDot(Vec3.getCPtr(q), q, Vec3.getCPtr(w_PB_B), w_PB_B, Vec3.getCPtr(wdot_PB_B), wdot_PB_B), true);
  }

  public static SWIGTYPE_p_Mat33 calcNForBodyXYZInBodyFrame(Vec3 q) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNForBodyXYZInBodyFrame__SWIG_0(Vec3.getCPtr(q), q), true);
  }

  public static SWIGTYPE_p_Mat33 calcNForBodyXYZInBodyFrame(Vec3 cq, Vec3 sq) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNForBodyXYZInBodyFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq), true);
  }

  public static SWIGTYPE_p_Mat33 calcNForBodyXYZInParentFrame(Vec3 q) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNForBodyXYZInParentFrame__SWIG_0(Vec3.getCPtr(q), q), true);
  }

  public static SWIGTYPE_p_Mat33 calcNForBodyXYZInParentFrame(Vec3 cq, Vec3 sq) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNForBodyXYZInParentFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq), true);
  }

  public static Vec3 multiplyByBodyXYZ_N_P(Vec2 cosxy, Vec2 sinxy, double oocosy, Vec3 w_PB) {
    return new Vec3(opensimModelJNI.Rotation_multiplyByBodyXYZ_N_P(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, oocosy, Vec3.getCPtr(w_PB), w_PB), true);
  }

  public static Vec3 multiplyByBodyXYZ_NT_P(Vec2 cosxy, Vec2 sinxy, double oocosy, Vec3 q) {
    return new Vec3(opensimModelJNI.Rotation_multiplyByBodyXYZ_NT_P(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, oocosy, Vec3.getCPtr(q), q), true);
  }

  public static Vec3 convertAngVelInParentToBodyXYZDot(Vec2 cosxy, Vec2 sinxy, double oocosy, Vec3 w_PB) {
    return new Vec3(opensimModelJNI.Rotation_convertAngVelInParentToBodyXYZDot(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, oocosy, Vec3.getCPtr(w_PB), w_PB), true);
  }

  public static Vec3 convertAngAccInParentToBodyXYZDotDot(Vec2 cosxy, Vec2 sinxy, double oocosy, Vec3 qdot, Vec3 b_PB) {
    return new Vec3(opensimModelJNI.Rotation_convertAngAccInParentToBodyXYZDotDot(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, oocosy, Vec3.getCPtr(qdot), qdot, Vec3.getCPtr(b_PB), b_PB), true);
  }

  public static Vec3 multiplyByBodyXYZ_NInv_P(Vec2 cosxy, Vec2 sinxy, Vec3 qdot) {
    return new Vec3(opensimModelJNI.Rotation_multiplyByBodyXYZ_NInv_P(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, Vec3.getCPtr(qdot), qdot), true);
  }

  public static Vec3 multiplyByBodyXYZ_NInvT_P(Vec2 cosxy, Vec2 sinxy, Vec3 v_P) {
    return new Vec3(opensimModelJNI.Rotation_multiplyByBodyXYZ_NInvT_P(Vec2.getCPtr(cosxy), cosxy, Vec2.getCPtr(sinxy), sinxy, Vec3.getCPtr(v_P), v_P), true);
  }

  public static SWIGTYPE_p_Mat33 calcNDotForBodyXYZInBodyFrame(Vec3 q, Vec3 qdot) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNDotForBodyXYZInBodyFrame__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(qdot), qdot), true);
  }

  public static SWIGTYPE_p_Mat33 calcNDotForBodyXYZInBodyFrame(Vec3 cq, Vec3 sq, Vec3 qdot) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNDotForBodyXYZInBodyFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq, Vec3.getCPtr(qdot), qdot), true);
  }

  public static SWIGTYPE_p_Mat33 calcNDotForBodyXYZInParentFrame(Vec3 q, Vec3 qdot) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNDotForBodyXYZInParentFrame__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(qdot), qdot), true);
  }

  public static SWIGTYPE_p_Mat33 calcNDotForBodyXYZInParentFrame(Vec2 cq, Vec2 sq, double ooc1, Vec3 qdot) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNDotForBodyXYZInParentFrame__SWIG_1(Vec2.getCPtr(cq), cq, Vec2.getCPtr(sq), sq, ooc1, Vec3.getCPtr(qdot), qdot), true);
  }

  public static SWIGTYPE_p_Mat33 calcNInvForBodyXYZInBodyFrame(Vec3 q) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNInvForBodyXYZInBodyFrame__SWIG_0(Vec3.getCPtr(q), q), true);
  }

  public static SWIGTYPE_p_Mat33 calcNInvForBodyXYZInBodyFrame(Vec3 cq, Vec3 sq) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNInvForBodyXYZInBodyFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq), true);
  }

  public static SWIGTYPE_p_Mat33 calcNInvForBodyXYZInParentFrame(Vec3 q) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNInvForBodyXYZInParentFrame__SWIG_0(Vec3.getCPtr(q), q), true);
  }

  public static SWIGTYPE_p_Mat33 calcNInvForBodyXYZInParentFrame(Vec3 cq, Vec3 sq) {
    return new SWIGTYPE_p_Mat33(opensimModelJNI.Rotation_calcNInvForBodyXYZInParentFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq), true);
  }

  public static Vec3 convertAngVelInBodyFrameToBodyXYZDot(Vec3 q, Vec3 w_PB_B) {
    return new Vec3(opensimModelJNI.Rotation_convertAngVelInBodyFrameToBodyXYZDot__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(w_PB_B), w_PB_B), true);
  }

  public static Vec3 convertAngVelInBodyFrameToBodyXYZDot(Vec3 cq, Vec3 sq, Vec3 w_PB_B) {
    return new Vec3(opensimModelJNI.Rotation_convertAngVelInBodyFrameToBodyXYZDot__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq, Vec3.getCPtr(w_PB_B), w_PB_B), true);
  }

  public static Vec3 convertBodyXYZDotToAngVelInBodyFrame(Vec3 q, Vec3 qdot) {
    return new Vec3(opensimModelJNI.Rotation_convertBodyXYZDotToAngVelInBodyFrame__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(qdot), qdot), true);
  }

  public static Vec3 convertBodyXYZDotToAngVelInBodyFrame(Vec3 cq, Vec3 sq, Vec3 qdot) {
    return new Vec3(opensimModelJNI.Rotation_convertBodyXYZDotToAngVelInBodyFrame__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq, Vec3.getCPtr(qdot), qdot), true);
  }

  public static Vec3 convertAngVelDotInBodyFrameToBodyXYZDotDot(Vec3 q, Vec3 w_PB_B, Vec3 wdot_PB_B) {
    return new Vec3(opensimModelJNI.Rotation_convertAngVelDotInBodyFrameToBodyXYZDotDot__SWIG_0(Vec3.getCPtr(q), q, Vec3.getCPtr(w_PB_B), w_PB_B, Vec3.getCPtr(wdot_PB_B), wdot_PB_B), true);
  }

  public static Vec3 convertAngVelDotInBodyFrameToBodyXYZDotDot(Vec3 cq, Vec3 sq, Vec3 w_PB_B, Vec3 wdot_PB_B) {
    return new Vec3(opensimModelJNI.Rotation_convertAngVelDotInBodyFrameToBodyXYZDotDot__SWIG_1(Vec3.getCPtr(cq), cq, Vec3.getCPtr(sq), sq, Vec3.getCPtr(w_PB_B), w_PB_B, Vec3.getCPtr(wdot_PB_B), wdot_PB_B), true);
  }

  public static Vec4 convertAngVelToQuaternionDot(Vec4 q, Vec3 w_PB_P) {
    return new Vec4(opensimModelJNI.Rotation_convertAngVelToQuaternionDot(Vec4.getCPtr(q), q, Vec3.getCPtr(w_PB_P), w_PB_P), true);
  }

  public static Vec3 convertQuaternionDotToAngVel(Vec4 q, Vec4 qdot) {
    return new Vec3(opensimModelJNI.Rotation_convertQuaternionDotToAngVel(Vec4.getCPtr(q), q, Vec4.getCPtr(qdot), qdot), true);
  }

  public static Vec4 convertAngVelDotToQuaternionDotDot(Vec4 q, Vec3 w_PB, Vec3 b_PB) {
    return new Vec4(opensimModelJNI.Rotation_convertAngVelDotToQuaternionDotDot(Vec4.getCPtr(q), q, Vec3.getCPtr(w_PB), w_PB, Vec3.getCPtr(b_PB), b_PB), true);
  }

}
