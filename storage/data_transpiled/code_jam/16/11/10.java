private static int solve ( int [ ] S ) {
  int rst = S [ 0 ] ;
  for ( int i = 1 ;
  i < S . length ;
  i ++ ) {
    int a = rst + S [ i ] ;
    int b = S [ i ] + rst ;
    rst = Math . max ( a , b ) ;
  }
  {
    int nr_case = Integer . parseInt ( input ( ) ) ;
    for ( int i = 0 ;
    i < nr_case ;
    i ++ ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( input ( ) ) ) ;
    }
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    return - 1 ;
  }
  return rst ;
}
