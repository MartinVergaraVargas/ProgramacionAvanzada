#!/bin/bash
$1
cd /home/felipe
cat /etc/passwd | sort | awk -F':' '{print $1}' | grep -1 ^$1
echo "-----------------------------------------------------------"
echo "usuarios reales del sistema: "
who | cut -f1 -d ' ' 




