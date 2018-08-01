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
echo "Ficheros y directorios ordenados por tamaño: "
cd /home/
cd felipe 
ls -l
echo " ficheros mayores que 1024 Kbytes"
cd /home/
find . -size +1024k
echo " tres primeros procesos que ocupan mas cpu "	
ps -e -o pcpu,cpu,nice,state,cputime,args --sort pcpu | sed '/^ 0.0 /d' | awk '{ for ( x =1; x <=7; x ++) { printf " %s ", $x } printf "\n" }' | tail -n 3
echo "Tres primeros procesos que ocupan mas memoria: "
ps aux | awk '{print $2, $4, $11}' | sort -k2r | head -




