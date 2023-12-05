public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  /*cnt = */
  List < Integer > N = Arrays . asList ( Integer . toString ( a ) ) ;
  int digit = N . size ( ) ;
  int [ ] [ ] DP = new int [ digit + 1 ] [ 2 ] ;
  DP [ 0 ] [ 0 ] = 1 ;
  for ( int d = 0 ;
  d < digit ;
  d ++ ) {
    for ( int i = 0 ;
    i < 2 ;
    i ++ ) {
      int limit ;
      if ( i > 0 ) limit = 9 ;
      else limit = N . get ( d ) ;
      for ( int l = 0 ;
      l < limit + 1 ;
      l ++ ) {
        if ( l != 4 && l != 9 ) DP [ d + 1 ] [ i ] = i || l < limit ;
      }
    }
  }
  return b + 1 - DP [ DP . length - 1 ] [ 0 ] - DP [ DP . length - 1 ] [ 1 ] ;
}
