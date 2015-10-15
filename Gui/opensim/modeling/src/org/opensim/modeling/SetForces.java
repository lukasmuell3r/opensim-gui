/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetForces extends OpenSimObject {
  private transient long swigCPtr;

  public SetForces(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetForces_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetForces obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetForces(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetForces safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SetForces_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetForces(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SetForces_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SetForces_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SetForces_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetForces(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SetForces_getConcreteClassName(swigCPtr, this);
  }

  public SetForces() {
    this(opensimModelJNI.new_SetForces__SWIG_0(), true);
  }

  public SetForces(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetForces__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetForces(String aFileName) {
    this(opensimModelJNI.new_SetForces__SWIG_2(aFileName), true);
  }

  public SetForces(SetForces aSet) {
    this(opensimModelJNI.new_SetForces__SWIG_3(SetForces.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelJNI.SetForces_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetForces_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetForces_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetForces_getSize(swigCPtr, this);
  }

  public int getIndex(Force aObject, int aStartIndex) {
    return opensimModelJNI.SetForces_getIndex__SWIG_0(swigCPtr, this, Force.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Force aObject) {
    return opensimModelJNI.SetForces_getIndex__SWIG_1(swigCPtr, this, Force.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetForces_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetForces_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetForces_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Force aObject) {
    return opensimModelJNI.SetForces_adoptAndAppend(swigCPtr, this, Force.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Force aObject) {
    return opensimModelJNI.SetForces_cloneAndAppend(swigCPtr, this, Force.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Force aObject) {
    return opensimModelJNI.SetForces_insert(swigCPtr, this, aIndex, Force.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetForces_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Force aObject) {
    return opensimModelJNI.SetForces_remove__SWIG_1(swigCPtr, this, Force.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetForces_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Force aObject, boolean preserveGroups) {
    return opensimModelJNI.SetForces_set__SWIG_0(swigCPtr, this, aIndex, Force.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Force aObject) {
    return opensimModelJNI.SetForces_set__SWIG_1(swigCPtr, this, aIndex, Force.getCPtr(aObject), aObject);
  }

  public Force get(int aIndex) {
    return new Force(opensimModelJNI.SetForces_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Force get(String aName) {
    return new Force(opensimModelJNI.SetForces_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetForces_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetForces_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetForces_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetForces_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetForces_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetForces_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetForces_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetForces_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetForces_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetForces_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
