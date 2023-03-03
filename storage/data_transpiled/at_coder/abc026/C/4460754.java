public static int integrate ( int idn ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] child = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) child [ i ] = child [ i ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) child [ i ] = child [ i ] ;
  return 0 ;
}
