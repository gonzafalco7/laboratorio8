# Laboratorio8

## Juan Pablo Poveda Cañon
## Gonzalo Falco

* Sobre el proyecto web realizado en el laboratorio 5, se trabajará para integrar el desarrollo realizado con el uso de SPRING.
* El primer paso será, poder desplegar el proyecto web con toda la configuración de SPRING que se indica en el siguiente tutorial.

![imagen 1](https://github.com/juancanon1725/Laboratorio8/blob/main/1.png)

Despues, para lograr desplegar el juego del laboratorio 5 debemos importar los archivos de bean.java y guess.xhtml al proyecto generado. Para que esto funcione
correctamente se traen las dependencias del *pom* del laboratorio 5 que fueran necesarias para el funcionamiento del juego.


Dentro de la clase bean.java se debe añadir la etiqueta @Component. Esto para que al momento de ejecutar el main del proyecto pueda cargar esta clase en spring-boot.

![image](https://github.com/juancanon1725/Laboratorio8/assets/98672541/57439de0-e052-470f-9db8-eeb349508b8f)

Al ejecutar el main con el comando `mvn spring-boot:run` e ingresando a *localhost:8080/guess.xhtml* podremos jugar al GuessBean del laboratorio 5


Finalmente, para la página de bienvenida, creamos la clase *UserBean* donde podremos almacenar el nombre de la persona que quiera jugar

![image](https://github.com/juancanon1725/Laboratorio8/assets/98672541/b18e980f-1a47-48ad-9a18-47991720512a)

Creamos un *start.xhtml* que reciba el nombre de la persona

Accedemos a *localhost:8080/start-xhtml*

Y si le damos al botón, nos redirije al juego.
