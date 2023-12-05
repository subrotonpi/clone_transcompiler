public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = Integer . MAX_VALUE ;
  for ( int i = 1 ;
  i < 11 ;
  i ++ ) {
    for ( int j = 1 ;
    j < 11 ;
    j ++ ) {
      if ( i == j ) continue ;
      ans = Math . min ( N - A [ 0 ] . indexOf ( i ) - A [ 1 ] . indexOf ( j ) , ans ) ;
    }
  }
  System . out . println ( ans * C ) ;
  return C ;
}
