/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayPointForceDirection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayPointForceDirection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayPointForceDirection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ArrayPointForceDirection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayPointForceDirection(PointForceDirection aDefaultValue, int aSize, int aCapacity) {
    this(opensimModelJNI.new_ArrayPointForceDirection__SWIG_0(PointForceDirection.getCPtr(aDefaultValue), aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayPointForceDirection(PointForceDirection aDefaultValue, int aSize) {
    this(opensimModelJNI.new_ArrayPointForceDirection__SWIG_1(PointForceDirection.getCPtr(aDefaultValue), aDefaultValue, aSize), true);
  }

  public ArrayPointForceDirection(PointForceDirection aDefaultValue) {
    this(opensimModelJNI.new_ArrayPointForceDirection__SWIG_2(PointForceDirection.getCPtr(aDefaultValue), aDefaultValue), true);
  }

  public ArrayPointForceDirection() {
    this(opensimModelJNI.new_ArrayPointForceDirection__SWIG_3(), true);
  }

  public ArrayPointForceDirection(ArrayPointForceDirection aArray) {
    this(opensimModelJNI.new_ArrayPointForceDirection__SWIG_4(ArrayPointForceDirection.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayPointForceDirection aArray) {
    return opensimModelJNI.ArrayPointForceDirection_arrayEquals(swigCPtr, this, ArrayPointForceDirection.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimModelJNI.ArrayPointForceDirection_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.ArrayPointForceDirection_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.ArrayPointForceDirection_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimModelJNI.ArrayPointForceDirection_size(swigCPtr, this);
  }

  public int append(PointForceDirection aValue) {
    return opensimModelJNI.ArrayPointForceDirection_append__SWIG_0(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue);
  }

  public int append(ArrayPointForceDirection aArray) {
    return opensimModelJNI.ArrayPointForceDirection_append__SWIG_1(swigCPtr, this, ArrayPointForceDirection.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, PointForceDirection aValue) {
    return opensimModelJNI.ArrayPointForceDirection_insert(swigCPtr, this, aIndex, PointForceDirection.getCPtr(aValue), aValue);
  }

  public int remove(int aIndex) {
    return opensimModelJNI.ArrayPointForceDirection_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, PointForceDirection aValue) {
    opensimModelJNI.ArrayPointForceDirection_set(swigCPtr, this, aIndex, PointForceDirection.getCPtr(aValue), aValue);
  }

  public PointForceDirection get(int aIndex) {
    long cPtr = opensimModelJNI.ArrayPointForceDirection_get(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new PointForceDirection(cPtr, false);
  }

  public PointForceDirection getitem(int index) {
    long cPtr = opensimModelJNI.ArrayPointForceDirection_getitem(swigCPtr, this, index);
    return (cPtr == 0) ? null : new PointForceDirection(cPtr, false);
  }

  public void setitem(int index, PointForceDirection val) {
    opensimModelJNI.ArrayPointForceDirection_setitem(swigCPtr, this, index, PointForceDirection.getCPtr(val), val);
  }

  public PointForceDirection getLast() {
    long cPtr = opensimModelJNI.ArrayPointForceDirection_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new PointForceDirection(cPtr, false);
  }

  public int findIndex(PointForceDirection aValue) {
    return opensimModelJNI.ArrayPointForceDirection_findIndex(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue);
  }

  public int rfindIndex(PointForceDirection aValue) {
    return opensimModelJNI.ArrayPointForceDirection_rfindIndex(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue);
  }

  public int searchBinary(PointForceDirection aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelJNI.ArrayPointForceDirection_searchBinary__SWIG_0(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(PointForceDirection aValue, boolean aFindFirst, int aLo) {
    return opensimModelJNI.ArrayPointForceDirection_searchBinary__SWIG_1(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue, aFindFirst, aLo);
  }

  public int searchBinary(PointForceDirection aValue, boolean aFindFirst) {
    return opensimModelJNI.ArrayPointForceDirection_searchBinary__SWIG_2(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue, aFindFirst);
  }

  public int searchBinary(PointForceDirection aValue) {
    return opensimModelJNI.ArrayPointForceDirection_searchBinary__SWIG_3(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue);
  }

}
