/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BodyList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public BodyList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(BodyList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_BodyList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BodyList(Component root, ComponentFilter f) {
    this(opensimModelJNI.new_BodyList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public BodyList(Component root) {
    this(opensimModelJNI.new_BodyList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public BodyIterator begin() {
    return new BodyIterator(opensimModelJNI.BodyList_begin(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimModelJNI.BodyList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

  public BodyIterator end() {
    return new BodyIterator(opensimModelJNI.BodyList_end(swigCPtr, this), true);
  }

}