/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetAnalysis extends OpenSimObject {
  private transient long swigCPtr;

  public SetAnalysis(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetAnalysis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetAnalysis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetAnalysis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetAnalysis safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SetAnalysis_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetAnalysis(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SetAnalysis_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SetAnalysis_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SetAnalysis_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetAnalysis(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SetAnalysis_getConcreteClassName(swigCPtr, this);
  }

  public SetAnalysis() {
    this(opensimModelJNI.new_SetAnalysis__SWIG_0(), true);
  }

  public SetAnalysis(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetAnalysis__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetAnalysis(String aFileName) {
    this(opensimModelJNI.new_SetAnalysis__SWIG_2(aFileName), true);
  }

  public SetAnalysis(SetAnalysis aSet) {
    this(opensimModelJNI.new_SetAnalysis__SWIG_3(SetAnalysis.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelJNI.SetAnalysis_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetAnalysis_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetAnalysis_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetAnalysis_getSize(swigCPtr, this);
  }

  public int getIndex(Analysis aObject, int aStartIndex) {
    return opensimModelJNI.SetAnalysis_getIndex__SWIG_0(swigCPtr, this, Analysis.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Analysis aObject) {
    return opensimModelJNI.SetAnalysis_getIndex__SWIG_1(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetAnalysis_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetAnalysis_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetAnalysis_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Analysis aObject) {
    return opensimModelJNI.SetAnalysis_adoptAndAppend(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Analysis aObject) {
    return opensimModelJNI.SetAnalysis_cloneAndAppend(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Analysis aObject) {
    return opensimModelJNI.SetAnalysis_insert(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetAnalysis_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Analysis aObject) {
    return opensimModelJNI.SetAnalysis_remove__SWIG_1(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetAnalysis_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Analysis aObject, boolean preserveGroups) {
    return opensimModelJNI.SetAnalysis_set__SWIG_0(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Analysis aObject) {
    return opensimModelJNI.SetAnalysis_set__SWIG_1(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject);
  }

  public Analysis get(int aIndex) {
    return new Analysis(opensimModelJNI.SetAnalysis_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Analysis get(String aName) {
    return new Analysis(opensimModelJNI.SetAnalysis_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetAnalysis_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetAnalysis_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetAnalysis_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetAnalysis_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetAnalysis_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetAnalysis_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetAnalysis_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetAnalysis_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetAnalysis_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetAnalysis_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
