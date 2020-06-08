package at.codersbay.gerhofer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.Scanner;

public class Pokedex {

    public static void main(String[] args) throws SQLException, IOException {

        System.out.println("Enter a Poke-Index number to see the stats of the pokemon");
        Scanner scanner = new Scanner(System.in);
        int pokeIndexNumber = scanner.nextInt();

        PokedexDAO pokedexDAO = new PokedexDAO();
        Pokemon pokemon = pokedexDAO.fetchPokemonByIndex(
                pokeIndexNumber
        );

        PrintStream out = new PrintStream(System.out,
                true, "UTF-8");
        out.println(pokemon);

        // load picture
        String fileName = String.format("src/main/resources/ascii-art/%03d.txt",
                pokeIndexNumber);

        File file = new File(fileName);

        FileInputStream fileInputStream = new FileInputStream(file);
        String img = new String(fileInputStream.readAllBytes());
        System.out.println(img);

    }

}
