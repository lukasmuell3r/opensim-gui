/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InverseDynamicsTool extends DynamicsTool {
  private transient long swigCPtr;

  public InverseDynamicsTool(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.InverseDynamicsTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseDynamicsTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_InverseDynamicsTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static InverseDynamicsTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.InverseDynamicsTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new InverseDynamicsTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.InverseDynamicsTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.InverseDynamicsTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.InverseDynamicsTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new InverseDynamicsTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.InverseDynamicsTool_getConcreteClassName(swigCPtr, this);
  }

  public InverseDynamicsTool() {
    this(opensimModelJNI.new_InverseDynamicsTool__SWIG_0(), true);
  }

  public InverseDynamicsTool(String aFileName, boolean aLoadModel) throws java.io.IOException {
    this(opensimModelJNI.new_InverseDynamicsTool__SWIG_1(aFileName, aLoadModel), true);
  }

  public InverseDynamicsTool(String aFileName) throws java.io.IOException {
    this(opensimModelJNI.new_InverseDynamicsTool__SWIG_2(aFileName), true);
  }

  public InverseDynamicsTool(InverseDynamicsTool aObject) {
    this(opensimModelJNI.new_InverseDynamicsTool__SWIG_3(InverseDynamicsTool.getCPtr(aObject), aObject), true);
  }

  public static void registerTypes() {
    opensimModelJNI.InverseDynamicsTool_registerTypes();
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimModelJNI.InverseDynamicsTool_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimModelJNI.InverseDynamicsTool_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public void setCoordinateValues(Storage aStorage) {
    opensimModelJNI.InverseDynamicsTool_setCoordinateValues(swigCPtr, this, Storage.getCPtr(aStorage), aStorage);
  }

  public String getOutputGenForceFileName() {
    return opensimModelJNI.InverseDynamicsTool_getOutputGenForceFileName(swigCPtr, this);
  }

  public void setOutputGenForceFileName(String desiredOutputFileName) {
    opensimModelJNI.InverseDynamicsTool_setOutputGenForceFileName(swigCPtr, this, desiredOutputFileName);
  }

  public String getCoordinatesFileName() {
    return opensimModelJNI.InverseDynamicsTool_getCoordinatesFileName(swigCPtr, this);
  }

  public void setCoordinatesFileName(String aCoordinateFile) {
    opensimModelJNI.InverseDynamicsTool_setCoordinatesFileName(swigCPtr, this, aCoordinateFile);
  }

  public double getLowpassCutoffFrequency() {
    return opensimModelJNI.InverseDynamicsTool_getLowpassCutoffFrequency(swigCPtr, this);
  }

  public void setLowpassCutoffFrequency(double aFrequency) {
    opensimModelJNI.InverseDynamicsTool_setLowpassCutoffFrequency(swigCPtr, this, aFrequency);
  }

  public boolean run() throws java.io.IOException {
    return opensimModelJNI.InverseDynamicsTool_run(swigCPtr, this);
  }

}
