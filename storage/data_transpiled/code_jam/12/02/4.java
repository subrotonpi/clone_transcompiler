public static void main ( String [ ] args ) {
  try {
    BufferedReader fin = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
    BufferedWriter fout = new BufferedWriter ( new FileWriter ( "output.txt" ) ) ;
    int numcases = Integer . parseInt ( fin . readLine ( ) ) ;
    for ( int i = 1 ;
    i <= numcases ;
    i ++ ) {
      int [ ] line = Arrays . stream ( fin . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
      int surprising = line [ 1 ] ;
      int minscore = line [ 2 ] ;
      int oknum = 0 ;
      int needsSurprising = 0 ;
      for ( int j = 3 ;
      j < line . length ;
      j ++ ) {
        int d = line [ j ] / 3 ;
        int m = line [ j ] % 3 ;
        switch ( m ) {
          case 0 : if ( d >= minscore ) {
            oknum ++ ;
          }
          else if ( d >= minscore - 1 && d > 0 ) {
            needsSurprising ++ ;
          }
          break ;
          case 1 : if ( d >= minscore - 1 ) {
            oknum ++ ;
          }
          break ;
          case 2 : if ( d >= minscore - 1 ) {
            oknum ++ ;
          }
          else if ( d >= minscore - 2 ) {
            needsSurprising ++ ;
          }
          break ;
        }
      }
      fout . write ( "Case #" ) ;
      fout . write ( Integer . toString ( i ) ) ;
      fout . write ( ": " ) ;
      fout . write ( Integer . toString ( oknum + Math . min ( surprising , needsSurprising ) ) ) ;
      fout . newLine ( ) ;
    }
    fin . close ( ) ;
    fout . close ( ) ;
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
}
