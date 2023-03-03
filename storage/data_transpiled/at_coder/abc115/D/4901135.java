public static int n ( int x ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n + 1 ] ;
  a [ 0 ] = 1 ;
  int [ ] p = new int [ n + 1 ] ;
  p [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i + 1 ] = 2 * a [ i ] + 3 ;
    p [ i + 1 ] = 2 * p [ i ] + 1 ;
  }
  return n ;
}
