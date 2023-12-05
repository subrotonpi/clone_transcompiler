public static int [ ] convert ( String input ) {
  int [ ] D = list ( Integer . parseInt ( input ) ) ;
  int [ ] J = list ( Integer . parseInt ( input ) ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    if ( D [ i ] >= J [ i ] ) res += D [ i ] ;
    else res += J [ i ] ;
  }
  System . out . println ( res ) ;
  return D ;
}
