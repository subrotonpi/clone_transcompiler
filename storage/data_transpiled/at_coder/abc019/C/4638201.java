public static int N = Integer . parseInt ( input ) {
  String [ ] A = input . split ( " " ) ;
  /* OddsProduction */
  while ( ( n % 2 ) == 0 ) {
    n = n / 2 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( A [ i ] ) ;
  }
  return A . length ;
}
