static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  /* zeros */
  int n = 0 ;
  /* db the string */
  if ( debug ) {
    System . out . println ( input ) ;
  }
  debug = false ;
  n = getInt ( ) ;
  char [ ] [ ] Str = new char [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Str [ i ] = new char [ n ] ;
    for ( char c : input . nextLine ( ) . toCharArray ( ) ) {
    }
    Arrays . sort ( Str ) ;
    Str [ i ] = new String ( Str [ i ] ) ;
  }
  db ( ( char [ ] [ ] ) Str ) ;
  int [ ] idx = new int [ n ] ;
  int [ ] widx = new int [ n ] ;
  String dub = "" ;
  for ( int i = 0 ;
  i < idx . length ;
  i ++ ) {
    boolean allFound = true ;
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      widx [ j ] = widx [ j ] + 1 ;
    }
  }
  return dub ;
}
