/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Vector extends VectorBaseDouble {
  private transient long swigCPtr;

  public Vector(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Vector_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Vector(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Vector() {
    this(opensimModelJNI.new_Vector__SWIG_0(), true);
  }

  public Vector(Vector src) {
    this(opensimModelJNI.new_Vector__SWIG_1(Vector.getCPtr(src), src), true);
  }

  public Vector(int m, double initialValue) {
    this(opensimModelJNI.new_Vector__SWIG_2(m, initialValue), true);
  }

  public String toString() {
    return opensimModelJNI.Vector_toString(swigCPtr, this);
  }

  public double get(int i) {
    return opensimModelJNI.Vector_get(swigCPtr, this, i);
  }

  public void set(int i, double value) {
    opensimModelJNI.Vector_set(swigCPtr, this, i, value);
  }

}
