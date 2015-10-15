/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ModelComponentIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ModelComponentIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(ModelComponentIterator iter) {
    return opensimModelJNI.ModelComponentIterator_equals(swigCPtr, this, ModelComponentIterator.getCPtr(iter), iter);
  }

  public ModelComponent __ref__() {
    return new ModelComponent(opensimModelJNI.ModelComponentIterator___ref__(swigCPtr, this), false);
  }

  public ModelComponent __deref__() {
    long cPtr = opensimModelJNI.ModelComponentIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponent(cPtr, false);
  }

  public ModelComponentIterator next() {
    return new ModelComponentIterator(opensimModelJNI.ModelComponentIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ModelComponentIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponent(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ModelComponentIterator_getConcreteClassName(swigCPtr, this);
  }

  public Geometry get_geometry(int i) {
    return new Geometry(opensimModelJNI.ModelComponentIterator_get_geometry(swigCPtr, this, i), false);
  }

  public Model getModel() {
    return new Model(opensimModelJNI.ModelComponentIterator_getModel(swigCPtr, this), false);
  }

  public int getNumGeometry() {
    return opensimModelJNI.ModelComponentIterator_getNumGeometry(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.ModelComponentIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelJNI.ModelComponentIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.ModelComponentIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelJNI.ModelComponentIterator_getSystem(swigCPtr, this), false);
  }

  public Component getComponent(String name) {
    return new Component(opensimModelJNI.ModelComponentIterator_getComponent(swigCPtr, this, name), false);
  }

  public Component updComponent(String name) {
    return new Component(opensimModelJNI.ModelComponentIterator_updComponent(swigCPtr, this, name), false);
  }

  public int getNumStateVariables() {
    return opensimModelJNI.ModelComponentIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelJNI.ModelComponentIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelJNI.ModelComponentIterator_getNumConnectors(swigCPtr, this);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelJNI.ModelComponentIterator_getConnector(swigCPtr, this, i), false);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelJNI.ModelComponentIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelJNI.ModelComponentIterator_getOutput(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsBegin() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.ModelComponentIterator_getOutputsBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsEnd() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.ModelComponentIterator_getOutputsEnd(swigCPtr, this), true);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelJNI.ModelComponentIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelJNI.ModelComponentIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelJNI.ModelComponentIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelJNI.ModelComponentIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelJNI.ModelComponentIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelJNI.ModelComponentIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelJNI.ModelComponentIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelJNI.ModelComponentIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelJNI.ModelComponentIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelJNI.ModelComponentIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelJNI.ModelComponentIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public String getPathName() {
    return opensimModelJNI.ModelComponentIterator_getPathName(swigCPtr, this);
  }

  public void dumpPathName() {
    opensimModelJNI.ModelComponentIterator_dumpPathName(swigCPtr, this);
  }

  public FramesList getFramesList() {
    return new FramesList(opensimModelJNI.ModelComponentIterator_getFramesList(swigCPtr, this), true);
  }

  public BodiesList getBodiesList() {
    return new BodiesList(opensimModelJNI.ModelComponentIterator_getBodiesList(swigCPtr, this), true);
  }

  public MusclesList getMusclesList() {
    return new MusclesList(opensimModelJNI.ModelComponentIterator_getMusclesList(swigCPtr, this), true);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelJNI.ModelComponentIterator_getComponentsList(swigCPtr, this), true);
  }

  public ModelComponentList getModelComponentList() {
    return new ModelComponentList(opensimModelJNI.ModelComponentIterator_getModelComponentList(swigCPtr, this), true);
  }

  public JointsList getJointList() {
    return new JointsList(opensimModelJNI.ModelComponentIterator_getJointList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelJNI.ModelComponentIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelJNI.ModelComponentIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelJNI.ModelComponentIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelJNI.ModelComponentIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelJNI.ModelComponentIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelJNI.ModelComponentIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelJNI.ModelComponentIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelJNI.ModelComponentIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelJNI.ModelComponentIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelJNI.ModelComponentIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelJNI.ModelComponentIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelJNI.ModelComponentIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelJNI.ModelComponentIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelJNI.ModelComponentIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelJNI.ModelComponentIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelJNI.ModelComponentIterator_toString(swigCPtr, this);
  }

}
