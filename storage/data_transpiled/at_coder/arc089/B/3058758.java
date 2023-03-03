@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int K2 = 2 * K ;
  int [ ] [ ] Gss = new int [ K2 ] [ K2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x , y , c ;
    x = input . nextLine ( ) ;
    y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( c == 'W' ) x -= K ;
    x = x % K2 ;
    y = y % K2 ;
    if ( y >= K ) x = ( x - K ) % K2 ;
    y = y - K ;
    Gss [ x ] [ y ] ++ ;
    Gss [ x ] [ y - K ] ++ ;
    if ( x != K ) {
      Gss [ x ] [ y ] ++ ;
      Gss [ x ] [ y ] ++ ;
    }
  }
  return Gss ;
}
