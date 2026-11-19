/*
Dadas as táboas e o ficheiro mod, escribe un programa que execute a seguinte secuencia:
>   Mostre o texto “Iniciando secuencia”

>   Inserte as seguintes entradas na táboa xogadores:
    ('Alexander Mostovoi', 'Mediocentro', 34)
    ('Valeri Karpin', 'Interior dereito', 33)
    ('Gustavo Lopez', 'Extremo esquerdo', 29)
    ('Haim Revivo', 'Mediapunta', 30)
    ('Claude Makelele', 'Pivote', 26)
    ('Michel Salgado', 'Lateral dereito', 23)
    ('Patxi Salinas', 'Central', 34)
    ('Catanha', 'Delantero', 28)

>   Mostre o texto “Lendo a táboa!”

>Lea tóda-las entradas da táboa xogadores e liste as propiedades id e nome
(System.out.println("id - nome"))

>Mostre o texto “Formando equipo!”

>Obteña as entradas da táboa xogadores que teñan un campo nome que apareza en mod
(pra isto terás que ler mod.txt)

>Rechea a táboa celta cós xogadores obtidos no paso anterior, calcula o soldo usando a
fórmula (id do xogador) * 4257

>Mostre o texto “Valores inseridos \n” + “Exportando equipo para a federación!”

>Lea tóda-las entradas da táboa celta e liste os campos id, nome e soldo

>Exporte nun ficheiro serializado o contido de celta (pódese facer en varios ficheiros)

>Mostre o texto “Actualizando soldos”

>Duplique o soldo de tódo-los xogadores

>Mostre o texto “Diñeiro insuficiente, debemos baixarlle o soldos a alguén :( !!”

>Obteña a 1a entrada do ficheiro serializado (ou o primeiro ficheiro que serializaches)

>Mostre o texto “o xogador nomeDoXogadorObtido debería cobrar soldoObtido, xerando
informe...”

>Exporte en XML o contido da entrada restaurada

>Borre todo o contido das táboas ao final do exercicio.
*/

import Connector.DBconnector;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando secuencia");
        resetearTaboas();

        inserirXogador("Alexander Mostovoi", "Mediocentro", 34);
        inserirXogador("Valeri Karpin", "Interior dereito", 33);
        inserirXogador("Gustavo Lopez", "Extremo esquerdo", 29);
        inserirXogador("Haim Revivo", "Mediapunta", 30);
        inserirXogador("Claude Makelele", "Pivote", 26);
        inserirXogador("Michel Salgado", "Lateral dereito", 23);
        inserirXogador("Patxi Salinas", "Central", 34);
        inserirXogador("Catanha", "Delantero", 28);

        System.out.println("Lendo a táboa!");
    }
    public static void resetearTaboas() {
        try (Connection conn = DBconnector.conexion();
             Statement st = conn.createStatement()) {
            String sql = Files.readString(Path.of("src/Util/schema.sql"));
            st.execute(sql);
            System.out.println("Taboas reiniciadas correctamente.");
        } catch (Exception e) {
            System.out.println("Erro ao reiniciar as táboas: " + e.getMessage());
        }
    }

    public static void inserirXogador(String nome, String posicion, int idade) {
        String sql = "INSERT INTO xogadores (nome, posicion, idade) VALUES (?, ?, ?)";
        try (Connection conn = DBconnector.conexion();
             var ps = conn.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setString(2, posicion);
            ps.setInt(3, idade);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao inserir xogador: " + e.getMessage());
        }
    }
    // Calculate the average of a list of integers, ignoring null or negative values
    public double calculatePositiveAverage(List<Integer> numbers) {

    }

    }