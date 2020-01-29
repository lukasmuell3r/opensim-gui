# this script replaces the use of cmake and visual studio projects in the original repository
# it should be run after build-opensim-core.sh
# still need to be tested on clean build on clean Ubuntu

# # reset
# rm -r -f ../opensim-gui
#unzip ../opensim-gui_01.zip -d ../

# define relative paths 
oSim="$(pwd)" # root development tree: VisSim-OpenSim-dev  
oSimI=$oSim/install-opensim-core            # opensim-core install
oSimGS=$oSim/opensim-gui                    # opensim-gui src, it also contains the build
OpenSim_JAVA_FILES_DIR=$oSimI/sdk/Java/OpenSim/java/org
CMAKE_CURRENT_SOURCE_DIR=$oSimGS/Gui/opensim
MODELS_DIR=$oSimGS/opensim-models/Models
GEOMETRY_DIR=$oSimGS/opensim-models/Geometry
Doc_DIR=$oSimGS/opensim-models/Tutorials/doc
MODELS_INSTALL_DIR=$oSimGS/dist/Resources
Ant_EXECUTABLE="ant"
ANT_ARGS=" "
echo "---------------------------------------------"
echo "   Start openSim building"
echo "---------------------------------------------"
#-----------------------------------------------------
#   first open opensim project using netbeans 
#-----------------------------------------------------
echo "You must open opensim project with netbeans then close it first before running this script"
#netbeans $CMAKE_CURRENT_SOURCE_DIR

#-----------------------------------------------------
#   CopyOpenSimCore
#-----------------------------------------------------
${Ant_EXECUTABLE} "copy-java-bindings" -f ${CMAKE_CURRENT_SOURCE_DIR}/build.xml  -DapiJava.dir=${OpenSim_JAVA_FILES_DIR}
#cp -r ${OpenSim_JAVA_FILES_DIR}/* ${CMAKE_CURRENT_SOURCE_DIR}/modeling/src/org

#-----------------------------------------------------
#   PrepareInstaller
#-----------------------------------------------------
${Ant_EXECUTABLE} "copy-installer-files" -f ${CMAKE_CURRENT_SOURCE_DIR}/build.xml  -Dapi.dir=${oSimI} -Dapp.version=${OPENSIMGUI_BUILD_VERSION}

#-----------------------------------------------------
#    CopyJRE
#-----------------------------------------------------
${Ant_EXECUTABLE} "copy-jre" -f ${CMAKE_CURRENT_SOURCE_DIR}/build.xml  

#-----------------------------------------------------
#   CopyVisualizer 
#-----------------------------------------------------
${Ant_EXECUTABLE} "copy-visualizer" -f ${CMAKE_CURRENT_SOURCE_DIR}/build.xml  

#-----------------------------------------------------
#    Modells installation
#-----------------------------------------------------
#mkdir ${MODELS_INSTALL_DIR}
cp -r  ${MODELS_DIR} ${CMAKE_CURRENT_SOURCE_DIR}/${MODELS_INSTALL_DIR}
cp -r  ${GEOMETRY_DIR/} ${CMAKE_CURRENT_SOURCE_DIR}/${MODELS_INSTALL_DIR}
cp -r  ${Doc_DIR} ${CMAKE_CURRENT_SOURCE_DIR}/${MODELS_INSTALL_DIR}
zip ${CMAKE_CURRENT_SOURCE_DIR}/Resources.zip   ${CMAKE_CURRENT_SOURCE_DIR}/${MODELS_INSTALL_DIR}

#-----------------------------------------------------
#    CopyModels
#-----------------------------------------------------
${Ant_EXECUTABLE} "copy-models" -f ${CMAKE_CURRENT_SOURCE_DIR}/build.xml  -Dmodels.dir=${MODELS_INSTALL_DIR}

