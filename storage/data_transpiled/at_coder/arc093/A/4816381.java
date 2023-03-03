public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  A [ N ] = 0 ;
  A [ N + 1 ] = 0 ;
  int sum_all = 0 ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    if ( ( i != 0 ) && ( i != N + 1 ) ) {
      sum_all += Math . abs ( A [ i ] - A [ i - 1 ] ) ;
    }
  }
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    if ( ( ( i != 0 ) && ( i != N + 1 ) ) && ( i != N + 1 ) ) {
      int cost_prev = Math . abs ( A [ i - 1 ] - A [ i ] ) + Math . abs ( A [ i ] - A [ i + 1 ] ) ;
      int cost_after = Math . abs ( A [ i - 1 ] - A [ i + 1 ] ) ;
      int ans = sum_all - cost_prev + cost_after ;
      System . out . println ( ans ) ;
    }
  }
  return sum_all ;
}
