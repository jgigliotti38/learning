$computername = $env:COMPUTERNAME

$UninstallKey="SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Uninstall"

$reg=[microsoft.win32.registrykey]::OpenRemoteBaseKey('LocalMachine',$computername)

$regkey=$reg.OpenSubKey($UninstallKey)

$subkeys=$regkey.GetSubKeyNames()

foreach($key in $subkeys) {
    $thiskey=$UninstallKey+"\\"+$key
    $thisSubKey=$reg.OpenSubkey($thiskey)
    $DisplayName=$thisSubKey.GetValue("DisplayName")
    Write-Host $computername, $DisplayName
}
