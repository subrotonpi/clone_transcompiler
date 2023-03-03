public static void main ( String [ ] args ) {
  try {
    Scanner fin = new Scanner ( new File ( "A-large.in" ) ) ;
    PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "output.txt" ) ) ) ;
    int numcases = Integer . parseInt ( fin . nextLine ( ) ) ;
    for ( int i = 1 ;
    i <= numcases ;
    i ++ ) {
      int [ ] line = new int [ 2 ] ;
      for ( int j = 0 ;
      j < line . length ;
      j ++ ) line [ j ] = Integer . parseInt ( fin . nextLine ( ) ) ;
      int charstyped = line [ 0 ] ;
      int numchars = line [ 1 ] ;
      line = new int [ 2 ] ;
      for ( int j = 0 ;
      j < line . length ;
      j ++ ) line [ j ] = Double . parseDouble ( fin . nextLine ( ) ) ;
      int bestcost = numchars + 2 ;
      double correctprob = 1 ;
      for ( int idx = 0 ;
      idx < charstyped ;
      idx ++ ) {
        correctprob = correctprob * line [ idx ] ;
        int currcost = ( numchars + 1 ) * ( 1 - correctprob ) + ( charstyped - idx - 1 ) + ( numchars - idx - 1 ) + 1 ;
        if ( currcost < bestcost ) bestcost = currcost ;
      }
      fout . print ( "Case #" ) ;
      fout . print ( Integer . toString ( i ) ) ;
      fout . print ( ": " ) ;
      fout . print ( Integer . toString ( bestcost ) ) ;
      fout . println ( ) ;
      System . out . println ( i ) ;
    }
    fin . close ( ) ;
    fout . close ( ) ;
  }
  catch ( FileNotFoundException e ) {
    e . printStackTrace ( ) ;
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
}
