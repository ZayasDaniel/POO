public class Juego3enraya {
    public static void main(String[] args) 
    {
        // Crear un array de 3x3 para representar el tablero del juego
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        
        // Colocar X y O en posiciones específicas del tablero
        board[0][2] = 'X';
        board[1][1] = 'O';
        board[2][0] = 'X';

        // Imprimir el tablero con X y O
        System.out.println("  1 2 3");
        System.out.println(" -------");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print(i+1 + "|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println(" -------");
        }
    }
}
