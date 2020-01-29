@echo off

md build-opensim-deps
md install-opensim-deps
md build-opensim-core
md install-opensim-core

cd build-opensim-deps

cmake -G"Visual Studio 14 2015 Win64" -DCMAKE_BUILD_TYPE=Release ..\opensim-core\dependencies -DCMAKE_INSTALL_PREFIX="..\install-opensim-deps"
cmake --build --config Release

call "C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\bin\vcvars32.bat"
devenv OpenSimDependencies.sln /build Release

cd ..\build-opensim-deps\simbody\build\doc

call "C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\bin\vcvars32.bat"
devenv doxygen.vcxproj /build Release

call "C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\bin\vcvars32.bat"
devenv INSTALL.vcxproj /build Release

rem pause


cd ..\..\..\..\build-opensim-core

cmake -G"Visual Studio 14 2015 Win64" -DCMAKE_BUILD_TYPE=Release ..\opensim-core -DCMAKE_INSTALL_PREFIX="..\install-opensim-core" -DOPENSIM_DEPENDENCIES_DIR="..\install-opensim-deps" -DDOXYGEN_EXECUTABLE="D:\sw\doxygen-1.8.14.windows.x64.bin\doxygen.exe" -DSWIG_EXECUTABLE="D:\sw\swigwin-3.0.12\swig.exe" -DBUILD_JAVA_WRAPPING=ON -DBUILD_PYTHON_WRAPPING=ON -DWITH_BTK=ON
cmake --build --config Release

call "C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\bin\vcvars32.bat"
devenv OpenSim.sln /build Release




rem pause

@echo off

call "C:\Program Files (x86)\MSBuild\14.0\Bin\MSBuild.exe"  "..\build-opensim-core\INSTALL.vcxproj"   /p:Configuration=Release /p:Platform=x64 /p:BuildInParallel=true

pause

exit
