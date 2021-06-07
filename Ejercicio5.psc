Algoritmo Ejercicio5
	Definir total Como Entero
	Definir mujeresMayores Como Entero
	Definir hombresMenores Como Entero
	Escribir 'Escriba el numero total de edades que desea ingresar'
	Leer total
	Para i <- 1 Hasta total Con Paso 1 Hacer
		Escribir 'Ingrese el sexo de la persona para tener su edad ( ' i ' )'
		Escribir '1. Masculino'
		Escribir '2. Femenino'
		Leer sexo
		Si sexo = 1 Entonces
			Escribir 'Ingrese la edad (masculino)'
			Leer edad
			si edad < 18 Entonces
				hombresMenores = hombresMenores + 1
			FinSi
		SiNo
			Escribir 'Ingrese la edad (Femenino)'
			Leer edad
			si edad >= 18 Entonces
				mujeresMayores = mujeresMayores + 1
			FinSi
		FinSi
	Fin Para
	Escribir 'El total de mujeres mayores de Edad son ' mujeresMayores
	Escribir 'El total de hombres menores de Edad son ' hombresMenores
FinAlgoritmo
