#!/bin/bash
clear; 
echo " Estado y salud del sistema operativo" 
echo " Nombre de la maquina:" $USER
echo
echo "La hora y fecha actual:" `date`
echo
echo "Estado de memoria :" 
cat /proc/meminfo |grep "Mem*"
cat /proc/meminfo |grep "Buffers" 
cat /proc/meminfo |grep "Cached"
echo "Estado de la cpu:"
cat /proc/stat |grep "cpu"
echo 
echo "Estado de los discos: "
df -h
echo "Usuarios conectados:"
w | cut -d " " -f 1 - | grep -v USER | sort -u
echo "El sistema esta encendido desde hace: "
uptime | awk '{print $3}'
echo "Mb del usuario en su home: " 
ls -l /home/felipe  |awk '{ sum += $5 } END { print sum }'
echo "Cantidad de archivos del usuario en su home : " 
ls -l $HOME | wc -l



