public static int [ ] getDistance ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int [ ] d = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d [ i ] = input . nextInt ( ) ;
  }
  if ( d . length == 1 ) {
    System . out . println ( d [ 0 ] + " " + d [ 0 ] ) ;
  }
  else {
    int [ ] e = new int [ d . length ] ;
    for ( int i = 0 ;
    i < e . length ;
    i ++ ) {
      e [ i ] = input . nextInt ( ) ;
    }
    if ( e [ 0 ] <= Integer . MAX_VALUE ) {
      System . out . println ( Arrays . toString ( d ) ) ;
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( Arrays . toString ( d ) ) ;
      System . out . println ( e [ 0 ] - Integer . MAX_VALUE ) ;
    }
  }
  return d ;
}
