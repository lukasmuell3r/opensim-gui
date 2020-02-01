
/* -------------------------------------------------------------------------- *
 * OpenSim: OneBodyRmoveAction.java                                            *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ibraheem Aldhamari , Grimes Yasser                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */
package org.opensim.view.nodes;

import java.io.IOException;
import java.util.Vector;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;
import org.opensim.modeling.Body;
import org.opensim.modeling.Joint;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;
import org.opensim.view.ExplorerTopComponent;
import org.opensim.view.ModelRenameAction;
import org.opensim.view.ObjectsRenamedEvent;
import org.opensim.view.SingleModelGuiElements;
import org.opensim.view.nodes.OneModelNode;
import org.opensim.view.nodes.OpenSimObjectNode;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.view.pub.ViewDB;
import org.opensim.modeling.JointSet;
import org.opensim.modeling.PhysicalFrame;
import org.opensim.modeling.PhysicalOffsetFrame;
import org.opensim.modeling.SWIGTYPE_p_SimTK__Xml__Element;
import org.opensim.view.NavigatorByTypeModel;

public final class OneBodyRemoveAction extends CallableSystemAction {
   
   public boolean isEnabled() {
      Node[] selected = ExplorerTopComponent.findInstance().getExplorerManager().getSelectedNodes();
      return selected.length==1;
   }
   
   public void performAction() {
      Node[] selected = ExplorerTopComponent.findInstance().getExplorerManager().getSelectedNodes();
      if (selected.length == 1){
         OpenSimObjectNode objectNode = (OpenSimObjectNode) selected[0];
         //selected body : the body to ewmovw with its dependencies
         OneBodyNode selectedBodyNode = (OneBodyNode) objectNode;
         if(selectedBodyNode == null) return;
          System.out.println("the type is "+ objectNode.getOpenSimObject());
          try {
              OpenSimObject osObj =  objectNode.getOpenSimObject();
              objectNode.destroy();
              
              //osObj.updateFromXMLNode(SWIGTYPE_p_SimTK__, 0);
              objectNode.getOpenSimObject().delete();
          } catch (IOException ex) {
              Exceptions.printStackTrace(ex);
              System.out.println("something wrong with the delete of the object");
          }
        
        //body.getModel().
        OpenSimDB.getInstance().setChanged();
        //OpenSimDB.getInstance().notifyObservers(evnt);
        // The following is specific to renaming a model since
        // other windows may display currentModel's name
        // A more generic scheme using events should be used.

    
      } else { // Should never happen
         DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("Deleting of multiple objects is not supported."));
      }
   }
   //to update the naming of the body after the renaming
   private void updateOneBodyDependencies(OneBodyNode bodyNode,Model parentModel,String oldBodyName,String newBodyName){
       JointSet modelJoints  = parentModel.updJointSet();
       
       for (int i = 0; i < modelJoints.getSize(); i++) {
           
            Joint joint_i = modelJoints.get(i);
            PhysicalFrame parentFrame =  joint_i.getParentFrame();
            PhysicalFrame childFrame = joint_i.getChildFrame();
            boolean noMoreFrames = false;
            int j = 0;
            while(!noMoreFrames)
            {
                try {
                     PhysicalOffsetFrame offsetFrame = joint_i.get_frames(j);
                     //System.out.println("Parent Frame Name");
                     //System.out.println("*** "+offsetFrame.getParentFrame().getName()+" "+newBodyName);
                     if(offsetFrame.getParentFrame().getName().equals(newBodyName)){
                        System.out.println("this frame is altered by the renaming "+offsetFrame.getName()+" for the old name"+oldBodyName
                        +"and this is the property "+offsetFrame.getPropertyByName("socket_parent"));
                        //offsetFrame.updPropertyByName("socket_parent").setValueAsObject(bodyNode.getOpenSimObject());
                        //offsetFrame.updateXMLNode(null);                                
                        //offsetFrame.updPropertyByName("").
                     }



                } catch (Exception e) {
                    noMoreFrames = true;
                }
                j++;
                //fatal error after two iterarion fix
                if(j==2) noMoreFrames = true;
            }          
       }
       
   }
   
   @Override
   public String getName() {
       return  "Remove..";//NbBundle.getMessage(ModelRenameAction.class, "CTL_ObjectRenameAction");
   }
   
   @Override
   protected void initialize() {
      super.initialize();
      // see org.openide.util.actions.SystemAction.iconResource() javadoc for more details
      putValue("noIconInMenu", Boolean.TRUE);
   }
   
   @Override
   public HelpCtx getHelpCtx() {
      return HelpCtx.DEFAULT_HELP;
   }
   
   @Override
   protected boolean asynchronous() {
      return false;
   }
   
}
