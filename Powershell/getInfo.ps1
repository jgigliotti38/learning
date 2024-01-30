##getInfo.ps1
##Author: Josh Gigliotti
##Creation Date: 02/07/2022
# Script reveals OS, hardware, and networking configuration.

#Begin Program
Clear-Host

Write-Host "Please wait... Checking system information."
# Section 1: OS Information.
Write-Host "============================"
Write-Host "OS INFO"
Write-Host "============================"
systeminfo | findstr /c:"OS Name"
systeminfo | findstr /c:"OS Version" 
systeminfo | findstr /c:"System Type"

# Section 2: Hardware information.
Write-Host "============================"
Write-Host "HARDWARE INFO"
Write-Host "============================"
systeminfo | findstr /c:"Host Name"
systeminfo | findstr /c:"Total Physical Memory"
wmic cpu get name

# Section 3: Networking information.
Write-Host "============================"
Write-Host "NETWORK INFO"
Write-Host "============================"
systeminfo | findstr /c:"Domain"
ipconfig | findstr IPv4
ipconfig | findstr IPv6
ipconfig | findstr Gateway

PAUSE
Clear-Host
#End Program