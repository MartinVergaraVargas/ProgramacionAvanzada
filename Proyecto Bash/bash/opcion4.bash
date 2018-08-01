#!/bin/bash
#!/bin/bash
echo "........."
cd Escritorio
mkdir informes
cd informes
find $HOME -mtime 0 > usuario-fecha-hora.txt.
echo "Archivos que han sido modificados durante las ultimas 24 horas : "
find $HOME -mtime 0
echo "-----------------------------------------------------------------------"
echo "------------------------------------------------------------------------"
echo "numero de conexiones :" 
who | cut -f1 -d ' ' | uniq -c | sort | sed 's/^ *//g'
echo "--------------------"
echo "Tiempo total de conexion en 1 semana : " 
echo "----------------------------------"
echo "Script que se ejecutara "
echo "..................................."

