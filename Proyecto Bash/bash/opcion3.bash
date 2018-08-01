#!/bin/bash
echo "Cantidad de archivos del usuario en su home : " 
ls -l $HOME | wc -l
echo "----------------------------------------------------------------"
echo"------------------------------------------------------------------"
echo "Ficheros y directorios ordenados por tamaño: "
cd /home/
cd felipe 
ls -l
echo "------------------------------------------------------"
echo "-------------------------------------------------------"
echo " ficheros mayores que 1024 Kbytes"
find . -size +1024k
echo "---------------------------------------------------------"
echo "--------------------------------------------------------"
echo " tres primeros procesos que ocupan mas cpu "	
ps -e -o pcpu,cpu,nice,state,cputime,args --sort pcpu | sed '/^ 0.0 /d' | awk '{ for ( x =1; x <=7; x ++) { printf " %s ", $x } printf "\n" }' | tail -n 3
echo "-------------------------------"
echo "--------------------------------------"
echo "Tres primeros procesos que ocupan mas memoria: "
ps aux | awk '{print $2, $4, $11}' | sort -k2r | head -n 4


