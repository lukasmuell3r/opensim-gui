REM REM # ====================================================
REM REM # BUILD opensim-gui for Windows
REM REM # by Ibraheem AL-Dhamari, Koblenz University, Germany 
REM REM # ====================================================
REM REM # Todos: - download and install all required tools in the script
REM REM #            git, python ,java, netbeans, cmake, doxygen, swig, VS2015 
REM REM #        - copy the files using simple commands instead of ant 

REM REM # this script replaces the use of cmake and visual studio projects in the original repository
REM REM # it should be run after build-opensim-core.sh
REM REM # still need to be tested on clean build on clean Ubuntu

REM REM # define relative paths 
set oSimI=%cd%\install-opensim-core
set oSimGS=%cd%\opensim-gui
set OpenSim_JAVA_FILES_DIR=%oSimI%\sdk\Java
set CMAKE_CURRENT_SOURCE_DIR=%oSimGS%\Gui\opensim
set MODELS_DIR=%oSimGS%\opensim-models\Models
set GEOMETRY_DIR=%oSimGS%\opensim-models\Geometry
set Doc_DIR=%oSimGS%\opensim-models\Tutorials\doc
set MODELS_INSTALL_DIR=%oSimGS%\dist\Resources
set THREEJS_Src=%oSimGS%\Gui\opensim\threejs\buildWin
set THREEJS_Dst=%oSimGS%\Gui\opensim\threejs\build

set Ant_EXECUTABLE=ant
set ANT_ARGS=" "
echo "---------------------------------------------"
echo "   Start openSim building"
echo "---------------------------------------------"
REM #-----------------------------------------------------
REM #   first open opensim project using netbeans 
REM #-----------------------------------------------------
echo "You must open opensim project with netbeans then close it first before running this script"
REM #netbeans %CMAKE_CURRENT_SOURCE_DIR

REM #-----------------------------------------------------
REM #   CopyOpenSimCore
REM #-----------------------------------------------------
%Ant_EXECUTABLE% "copy-java-bindings" -f %CMAKE_CURRENT_SOURCE_DIR%\build.xml  -DapiJava.dir=%OpenSim_JAVA_FILES_DIR%
REM xcopy %OpenSim_JAVA_FILES_DIR% %CMAKE_CURRENT_SOURCE_DIR%\modeling\src\org

REM #-----------------------------------------------------
REM #   PrepareInstaller
REM #-----------------------------------------------------
REM %Ant_EXECUTABLE% "copy-installer-files" -f %CMAKE_CURRENT_SOURCE_DIR%\build.xml  -Dapi.dir=%oSimI% -Dapp.version=%OPENSIMGUI_BUILD_VERSION%

REM #-----------------------------------------------------
REM #    CopyJRE
REM #-----------------------------------------------------
%Ant_EXECUTABLE% "copy-jre" -f %CMAKE_CURRENT_SOURCE_DIR%\build.xml  

REM #-----------------------------------------------------
REM #   CopyVisualizer 
REM #-----------------------------------------------------
%Ant_EXECUTABLE% "copy-visualizer" -f %CMAKE_CURRENT_SOURCE_DIR%\build.xml  

REM #-----------------------------------------------------
REM REM #    Modells installation
REM REM #-----------------------------------------------------
REM REM #mkdir %MODELS_INSTALL_DIR%
xcopy  %MODELS_DIR% %CMAKE_CURRENT_SOURCE_DIR%\%MODELS_INSTALL_DIR%
xcopy  %GEOMETRY_DIR\% %CMAKE_CURRENT_SOURCE_DIR%\%MODELS_INSTALL_DIR%
xcopy  %Doc_DIR% %CMAKE_CURRENT_SOURCE_DIR%\%MODELS_INSTALL_DIR%
jar -cMf %CMAKE_CURRENT_SOURCE_DIR%\Resources.zip   %CMAKE_CURRENT_SOURCE_DIR%\%MODELS_INSTALL_DIR%

REM REM #-----------------------------------------------------
REM REM #    CopyModels
REM REM #-----------------------------------------------------
%Ant_EXECUTABLE% "copy-models" -f %CMAKE_CURRENT_SOURCE_DIR%\build.xml  -Dmodels.dir=%MODELS_INSTALL_DIR%

REM REM #-----------------------------------------------------
REM REM #    rename threejs build
REM REM #-----------------------------------------------------
Rename %THREEJS_Src% %THREEJS_Dst%

echo " ====================================================================== "
echo ALL operations are completed!!!
echo " ====================================================================== "

echo "In case of error, have you oppened opensim project in netbeans before using this script???"
