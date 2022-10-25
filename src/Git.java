public class Git {
    public static void main(String[] args) {
        System.out.println("[ Comandos git utilizados ]");
        System.out.print("1. Public static void main : ");
        System.out.println("Detecta si el archivo se está ejecutando directamente, en ese caso se ejecutará la sentencia if");
        System.out.print("2. System.out.print : ");
        System.out.println("Imprime el texto especificado dentro de los paréntesis en la pantalla.");
        System.out.print("3. git init : ");
        System.out.println("Crea un nuevo repositorio de Git.");
        System.out.print("4. Git Status : ");
        System.out.println("Muestra el estado del directorio de trabajo y ayuda a verificar qué vamos a subir.");
        System.out.print("5. git add . : ");
        System.out.println("Indica a Git que quieres subir todos los archivos.");
        System.out.print("5. git commit -m 'first commit' : ");
        System.out.println("Indicamos cuál es el commit que estamos haciendo. Para subir los cambios al repositorio.");
        System.out.print("6. git config --global user.email : ");
        System.out.println("Configuramos el git para poderlo subir colocando nuestro correo.");
        System.out.print("7. git config --global user.name : ");
        System.out.println("Configuramos el git para poderlo subir colocando nuestro nombre.");
        System.out.print("8. git branch -M main : ");
        System.out.println("Permite poderlo subir a la rama principal");
        System.out.print("9. git remote add origin https://... : ");
        System.out.println("Alojamos nuestro proyecto en la ruta específica colocada");
        System.out.print("10. git push -u origin main : ");
        System.out.println("Permite cargar la sincronización de mi local con mi repositorio remoto");

    }
}
