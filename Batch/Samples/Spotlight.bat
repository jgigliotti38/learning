
:begin
@echo off
echo ======================
echo **********************
echo  WELCOME TO SPOTLIGHT!
echo **********************
echo ======================
pause
mkdir %USERPROFILE%\Desktop\Spotlight
start %USERPROFILE%\Desktop\Spotlight

:choice
set /P c=IS THIS JG [Y/N]?
if /I "%c%" EQU "Y" copy C:\Users\jgigliotti\AppData\Local\Packages\Microsoft.Windows.ContentDeliveryManager_cw5n1h2txyewy\LocalState\Assets\* %USERPROFILE%\Desktop\Spotlight

copy %USERPROFILE%\AppData\Local\Packages\Microsoft.Windows.ContentDeliveryManager_cw5n1h2txyewy\LocalState\Assets\* %USERPROFILE%\Desktop\Spotlight

ren %USERPROFILE%\Desktop\Spotlight\* *.jpg
@echo off
echo ==============================
echo       ***************
echo       RENDER COMPLETE!
echo       ***************
echo ******		     ******
echo Choose Which Files to Transfer
echo ******		     ******
echo ==============================
pause
robocopy %USERPROFILE%\Desktop\Spotlight %USERPROFILE%\Pictures\Test *.jpg /min:400000 
echo ===============
echo ***************
echo  END SPOTLIGHT
echo ***************
echo ===============
pause
rmdir /s /Q %USERPROFILE%\Desktop\Spotlight
cls

