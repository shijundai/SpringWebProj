@echo off&setlocal enabledelayedexpansion
set class_path=
for /F %%a in ('dir lib /b /s') do (
set class_path=%%a;!class_path!
)
java -classpath !class_path! com.daisj.Main
