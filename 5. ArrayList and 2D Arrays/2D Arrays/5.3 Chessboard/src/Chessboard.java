public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int j = 0; j < 8; j++) {
         //System.out.println(row);
         for (int i = 0; i < 8; i++){
            if (j%2==0) {
               if (i % 2 == 0) {
                  System.out.print('\u25A1');
               } else {
                  System.out.print('\u25A0');
               }
            }else{
               if (i % 2 == 0) {
                  System.out.print('\u25A0');
               } else {
                  System.out.print('\u25A1');
               }
            }
         }
         System.out.println();
      }
   }
}