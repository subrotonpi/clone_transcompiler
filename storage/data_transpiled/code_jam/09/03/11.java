@ GwtIncompatible ( "System.out" ) public static void main ( String [ ] args ) {
  String phrase = "welcome to code jam" ;
  /* solve case */
  int [ ] [ ] ans = new int [ phrase . length ( ) + 1 ] [ phrase . length ( ) + 1 ] ;
  for ( int i = 0 ;
  i < text . length ( ) + 1 ;
  i ++ ) ans [ ans . length - 1 ] [ i ] = 1 ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    char c = phrase . charAt ( i ) ;
    for ( int j = 0 ;
    j < ans . length ;
    j ++ ) {
      char d = text . charAt ( j ) ;
      if ( d == c ) ans [ i ] [ j ] = ans [ i ] [ j + 1 ] + ans [ i + 1 ] [ j + 1 ] ;
      else ans [ i ] [ j ] = ans [ i ] [ j + 1 ] ;
    }
  }
  /* read case */
  input . read ( ) ;
  /* print case */
  String s = "Case #" + i + ": " + ( ( ans % 10000 ) + " " ) . replace ( " " , "0" ) ;
  System . out . println ( s ) ;
  /* main */
  for ( int i = 1 ;
  i <= Integer . MAX_VALUE ;
  i ++ ) {
    /* print case */
    s = "Case #" + i + ": " + ( ( ans % 10000 ) + " " ) . replace ( " " , "0" ) ;
    /* print case */
  }
  /* main */
  for ( int i = 1 ;
  i <= Integer . MAX_VALUE ;
  i ++ ) {
    /* print case */
    printCase ( i , solveCase ( input . nextInt ( ) ) ) ;
  }
}
