
package arrays_2d;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Arrays_2D {

    public static void main(String[] args) {
        // TODO code application logic here
        /*int[][] twoDee = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i = 0; i < twoDee.length;i++){
            for(int j = 0; j < twoDee[i].length; j++){
            System.out.print(twoDee[i][j]+" "+" ");}
            System.out.println("");}*/
        /*int [][] twoDee = new int [3][4];
        
        twoDee[0][0] = 55;
        twoDee[0][1] = 33;
        twoDee[0][2] = 13;
        twoDee[0][3] = 14;
        
        twoDee[1][0] = 16;
        twoDee[1][1] = 17;
        twoDee[1][2] = 18;
        twoDee[1][3] = 44;
        
        twoDee[2][0] = 66;
        twoDee[2][1] = 67;
        twoDee[2][2] = 68;
        twoDee[2][3] = 69;
        
        for(int i = 0; i<twoDee.length;i++ ){
            for(int j = 0; j<twoDee[i].length;j++){
               System.out.print(twoDee[i][j]+" "+" ");}
            System.out.println("");
        } System.out.println();
        //Creates a message output that displays the index value [3] from the specific index [1]
        JOptionPane.showMessageDialog(null, "This is a specific value from the array: " + twoDee[1][3]);*/
        
        String[][]alphaNum = new String[7][10];
        
        alphaNum[0][0] = "A1";
        alphaNum[0][1] = "A2";
        alphaNum[0][2] = "A3";
        alphaNum[0][3] = "A4";
        alphaNum[0][4] = "A5";
        alphaNum[0][5] = "A6";
        alphaNum[0][6] = "A7";
        alphaNum[0][7] = "A8";
        alphaNum[0][8] = "A9";
        alphaNum[0][9] = "A10";
        
        alphaNum[1][0] = "B1";
        alphaNum[1][1] = "B2";
        alphaNum[1][2] = "B3";
        alphaNum[1][3] = "B4";
        alphaNum[1][4] = "B5";
        alphaNum[1][5] = "B6";
        alphaNum[1][6] = "B7";
        alphaNum[1][7] = "B8";
        alphaNum[1][8] = "B9";
        alphaNum[1][9] = "B10";
        
        alphaNum[2][0] = "C1";
        alphaNum[2][1] = "C2";
        alphaNum[2][2] = "C3";
        alphaNum[2][3] = "C4";
        alphaNum[2][4] = "C5";
        alphaNum[2][5] = "C6";
        alphaNum[2][6] = "C7";
        alphaNum[2][7] = "C8";
        alphaNum[2][8] = "C9";
        alphaNum[2][9] = "C10";
        
        alphaNum[3][0] = "D1";
        alphaNum[3][1] = "D2";
        alphaNum[3][2] = "D3";
        alphaNum[3][3] = "D4";
        alphaNum[3][4] = "D5";
        alphaNum[3][5] = "D6";
        alphaNum[3][6] = "D7";
        alphaNum[3][7] = "D8";
        alphaNum[3][8] = "D9";
        alphaNum[3][9] = "D10";
        
        alphaNum[4][0] = "E1";
        alphaNum[4][1] = "E2";
        alphaNum[4][2] = "E3";
        alphaNum[4][3] = "E4";
        alphaNum[4][4] = "E5";
        alphaNum[4][5] = "E6";
        alphaNum[4][6] = "E7";
        alphaNum[4][7] = "E8";
        alphaNum[4][8] = "E9";
        alphaNum[4][9] = "E10";
        
        alphaNum[5][0] = "F1";
        alphaNum[5][1] = "F2";
        alphaNum[5][2] = "F3";
        alphaNum[5][3] = "F4";
        alphaNum[5][4] = "F5";
        alphaNum[5][5] = "F6";
        alphaNum[5][6] = "F7";
        alphaNum[5][7] = "F8";
        alphaNum[5][8] = "F9";
        alphaNum[5][9] = "F10";
        
        alphaNum[6][0] = "G1";
        alphaNum[6][1] = "G2";
        alphaNum[6][2] = "G3";
        alphaNum[6][3] = "G4";
        alphaNum[6][4] = "G5";
        alphaNum[6][5] = "G6";
        alphaNum[6][6] = "G7";
        alphaNum[6][7] = "G8";
        alphaNum[6][8] = "G9";
        alphaNum[6][9] = "G10";
        
        for(int i = 0; i<alphaNum.length;i++ ){
            
            for(int j = 0; j<alphaNum[i].length;j++){
                
               System.out.print(alphaNum[i][j]+" "+" ");
            }
            System.out.println("");
        } System.out.println();
        System.out.println("This is a specific value from the array: " + alphaNum[4][6]);
        
        
        
        
        String[][]Anum = new String[2][3];
        
        Anum[0][0] = "A";
        Anum[0][1] = "B";
        Anum[0][2] = "C";
        
        Anum[1][0] = "D";
        Anum[1][1] = "E";
        Anum[1][2] = "F";
       
        int n = Anum.length;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<Anum[i].length;j++){
                System.out.print(Anum[i][j] + " " + " ");
                
            }
            System.out.println("");
        }
        
        
        
        
    }
}

    

