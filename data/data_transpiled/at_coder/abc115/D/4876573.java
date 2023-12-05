public static int N = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N + 1 ] ;
  int [ ] p = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = 2 * ( i + 2 ) - 3 ;
  }
  return p [ N - 1 ] + 1 + a [ N - 1 ] ;
}
