# Screenlock Script

scrot /tmp/screenshot.png

convert /tmp/screenshot.png -blur 0x5 /tmp/screenshotblur.png

i3lock -u -i /tmp/screenshotblur.png

rm /tmp/screenshot*
