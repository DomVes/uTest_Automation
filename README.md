# uTest_Automatización

A continuación realizaremos un Registro de usuario nuevo en la siguiente Página: https://www.utest.com/

![image](https://user-images.githubusercontent.com/95547617/194246565-06288013-2c60-4af7-8030-98f738d99e67.png)



Para este caso contaremos con la siguiente estructura en patrón Screenplay sobre IntelliJIDEA

![image](https://user-images.githubusercontent.com/95547617/194247704-519d4315-5c91-4212-adc6-560766f5709c.png)

De la clase ChromeDriver configuramos todos los parametros de ejución del navegador, tales como: Iniciar en pantalla grande,
en modo incógnito (para evitar caché), certificados, etc.

![image](https://user-images.githubusercontent.com/95547617/194248034-414df7e6-4f40-4486-a7eb-44786ef95c56.png)

Es esta clase del Package Util vamos a importar los métodos para leer desde Excel, ya que toda la información que vamos a requerir 
se tomará de un árchivo Excel previamente creado y guardado en la Raiz del proyecto. Para poder hacer uso de este solo necesitaremos el Nombre del archivo, hoja, y posición de la Celda que vamos a leer, tal como se muestra en el método. 

![image](https://user-images.githubusercontent.com/95547617/194248712-e8ac6dad-0879-44b3-8d5e-bf3a04679db6.png)

Posterior a esto creamos el Feature, el cual tendrá la descripción del proceso a seguir.

Given: Abrirá la página
When: Irá al módulo de registro para iniciar el proceso
Then: Valida que el login se haga efectivo

![image](https://user-images.githubusercontent.com/95547617/194249272-4d548c3c-0774-4bcf-af49-922192eb126b.png)

A continuación creamos la Clase Register.Runner la cual nos llamara el Feature con su respectivo StepDefinitions tal como se muestra en la captura

![image](https://user-images.githubusercontent.com/95547617/194249888-f0a0af0d-0b20-42f3-848f-ccda6dd899f5.png)

En este mismo Orden nos dirigimos la clase llamada RegisterStepDefinitions, en la cual llamaremos el método creado en la clase Tasks, para esto debemos como primero instanciar el objetp tipo Excel para poder leer los datos del archivo, y segundo preparar "@Before" el Actor(del modelo Screenplay) en método  setStage, se continúa con el @Given definido en el Scenario de nuestro Feature. Allí abrimos el navegador y llamaremos el archivo Excel para leer la URL que tenemos en la hoja mostrada en la imágen la cual será la utilizada en este Scenario. 

![image](https://user-images.githubusercontent.com/95547617/194250535-22e7b733-3e11-4033-a031-f6eff3d014e4.png)

Continuando con el StepDefinitions, nos dirigimos al @When, en el cual invocamos(o llamamos) el método onuTest de la clase Register alojada en el Package Tasks, allí es donde estarán toda la "Magia", es decir, las acciones propias de nuestra Automatización.
En el @Then encontramos la validación posterior al llenado de el formulario, aqui podremos ver que compara(con equalTo) el texto de un localizador con el guardado en el Excel para la validación. (Se explica un poco más abajo la segunda parte de la validación, la cual)

![image](https://user-images.githubusercontent.com/95547617/194254322-e5e6978f-8fc6-482e-8a0d-1c734a6d231a.png)

En este apartado vemos el Task Register, donde tenemos todas las acciones, como primera parte creamos el objeto tipo Excel para poder utilizar nuevamente el archivo y sacar la información para el llenado de los datos. 

![image](https://user-images.githubusercontent.com/95547617/194257159-e3b26ffd-88a2-4943-a5ad-a7565ece1ac2.png)

Todas las acciones las ejecutamos con actor.attemptsTo, dentro de un Try-Catch para añadir la Excepción al método "leerDatoExcel" y asi posteriormente las acciones, Clicks y Enter propias del flujo automatizado

![image](https://user-images.githubusercontent.com/95547617/194257897-78acd163-b00d-4be2-b3f7-d5692ce8b203.png)

Aquí la otra parte con el catch y su IOException, y el método llamado desde el StepDefinitions para ejecutar las acciones

![image](https://user-images.githubusercontent.com/95547617/194258438-028cda57-7410-4d21-a50c-c8bde3bcb63e.png)

En la Clase IsLogged traemos el texto (getText) del localizador que elegimos, este texto es el que enviaremos <String> hacia el @Then para compararlo con el texto del Excel y verificar que si el Login fue exitoso.

![image](https://user-images.githubusercontent.com/95547617/194258915-e6234467-ca27-4cfa-b400-f7125b4934ce.png)
  
Aqui es dónde definimos los localizadores de tipo Target(patrón Screenplay) el cual definimos con el método "locatedBy" y éste nos permite traer los Xpath o Selectores CSS. 
  Para ver los demás selectores puedes dirigirte a la ruta de la imágen en este mismo repositorio.

![image](https://user-images.githubusercontent.com/95547617/194259512-29396702-1bbd-4a43-82e2-cd45e3e7cd60.png)


 
Añadimos al .gitignore lo solicitado 
  ![image](https://user-images.githubusercontent.com/95547617/194260224-b8c4aa38-ba5a-4cce-8775-6644c061c680.png)

Aqui definimos las dependencias que usaremos, por ejemplo, Excel. Tambien las versiones de cada uno.
  
![image](https://user-images.githubusercontent.com/95547617/194260403-50dfc6de-807b-42f8-a7e3-803e3f1b6cca.png)

  Una vez ejecutado desde el Runner vemos que funciona correctamente.
  ![image](https://user-images.githubusercontent.com/95547617/194260878-81e57459-b42d-40cc-963d-78bbd6224d71.png)

  
  
Ahora bien, para realizar un nuevo test solo debemos seguir estos pasos.
  
  1. Abrir el archivo Data.xlsx
  2. Cambiar el correo de la Casilla "Email" en la hoja "Credenciales"
  3. Guardar cambios y cerrar el Excel
  4. Ejecutar desde el Runner.

  ![image](https://user-images.githubusercontent.com/95547617/194261527-7acb75fd-0706-40cd-add0-ba542e0132bd.png)

  ![image](https://user-images.githubusercontent.com/95547617/194261660-c9b47787-c19b-4bd3-a8b7-d336fe7589e4.png)

  
#FIN
  
