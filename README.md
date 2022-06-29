# PBII2022SegundoParcialGonzalezKaren
Segundo Parcial PB2. 1er Cuat 2022.

Consignas para la resolución del parcial

    1. Conectarse a Teams.
    2. Descargar el proyecto desde el link compartido por los docentes.
    3. Renombrar el proyecto como “PBII2022SegundoParcialApellidoNombre” (reemplazando ApellidoNombre por su apellido y su nombre).
    4. Subir el proyecto a un repositorio público de git.
    5. Entregar por prácticas de Miel un PDF o archivo txt con la URL del repositorio público creado en el punto 4.
    6. Actualizar el proyecto, logrando que las pruebas den verde.
    7. Actualizar el repositorio público con los cambios realizados (no se aceptarán cambios realizados por fuera del horario comunicado por los docentes).



Enunciado
Se solicita desarrollar un software que replique en parte el funcionamiento de las billeteras de pago.
Estas billeteras, permiten unificar en un único lugar la gestión de las cuentas bancarias de distintos bancos (CBU), cuentas virtuales (CVU) y también administrar distintas tarjetas de crédito o débito para realizar compras.
En este caso para poder operar se necesita tener registrados a los distintos participantes de la operación en la billetera. Esto es comercios y consumidores finales.
Los comercios tienen la posibilidad de generar los códigos QR con toda la información de una compra determinada. Una vez generado el código QR, se puede realizar el pago con alguna de las tarjetas que un consumidor tenga asociada (Las compras se pueden realizar con tarjetas de débito o tarjetas de crédito). Es importante resaltar que si bien al momento de realizar la compra se realiza el débito (si se paga con débito) de la tarjeta, pero el dinero no se acreditará en el comercio hasta tanto se cumpla el plazo correspondiente. Por tal motivo se debe tener un registro de las compras realizadas para que a posterior el proceso correspondiente (NO SE DEBE DESARROLLAR) realice los créditos a los comercios o envíe los movimientos a las procesadoras (VISA, MASTERCARD, etc.).
Al mismo tiempo, se pueden realizar transferencias entre las distintas cuentas que los usuarios tienen asociadas (pueden ser cuentas bancarias o cuentas virtuales). Sin importar el tipo de cuenta del que se trate no será posible realizar una transferencia cuando el saldo de la cuenta origen sea inferior al monto que se desea transferir.
El software debe lanzar las siguientes excepciones para los casos que detecte un comportamiento inesperado:
NumeroDeTarjetaInvalidoException: El número de la tarjeta no tiene 16 dígitos.



CBUInvalidoException: Se lanza cuando se intenta generar un CBU con un largo distinto a 20 dígitos.
CVUInvalidoException: Se lanza cuando se intenta generar un CVU con un largo distinto a 23 digitos.
CuitInvalidoException: Se lanza cuando se intenta generar un CUIT que no comienza en 30 y no posee 11 dígitos.
NoCoincideTitularException: Cuando se intenta asociar un medio de pago a un consumidor y no coincide el nombre del titular del medio con el nombre del consumidor.
SaldoInsuficienteException: Cuando se intenta realizar una compra con tarjeta de débito o transferencia a una cuenta, pero no se dispone el saldo necesario para completar la transacción.
ExcedeLimiteDeCompraException: Cuando se desea realizar una compra con tarjeta de crédito, pero se excede el límite disponible en esa tarjeta.
