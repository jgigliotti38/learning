$app = Get-WmiObject -Class Win32_Product | Where-Object {
    $_.Name -match "Zoom"
}

Write-Host Complete
Pause

$app.Uninstall()
