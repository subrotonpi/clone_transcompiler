static private void process ( int num , Scanner fin , PrintWriter fout ) throws IOException {
  int n = Integer . parseInt ( fin . nextLine ( ) ) ;
  int [ ] data = Arrays . stream ( fin . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int unmatched = 0 ;
  for ( int i : xrange ( data ) ) {
    if ( data [ i ] != i + 1 ) {
      unmatched ++ ;
    }
  }
  fout . println ( Integer . toString ( unmatched ) ) ;
  if ( Class . isAnnotationPresent ( Test . class ) ) {
    if ( args . length != 3 ) {
      System . err . println ( "Please indicate input and output" ) ;
      exit ( 0 ) ;
    }
    fin = new Scanner ( args [ 0 ] ) ;
    fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( args [ 1 ] ) ) ) ;
    int times = Integer . parseInt ( fin . nextLine ( ) ) ;
    for ( int i : xrange ( times ) ) {
      fout . print ( "Case #" + ( i + 1 ) + ": " ) ;
      process ( i , fin , fout ) ;
      fout . println ( ) ;
    }
    fin . close ( ) ;
    fout . close ( ) ;
  }
}
